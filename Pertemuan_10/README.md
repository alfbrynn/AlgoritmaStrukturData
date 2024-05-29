Muhammad Alif Febriansyah
2341720025

Percobaan 1
Queue.java
```java
package Pertemuan_10.Percobaan_1;

public class Queue {
    int[] data;
    int front, rear, size, max;

    Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
```
Queue_Main.java
```java
package Pertemuan_10.Percobaan_1;

import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc19.nextInt();

        Queue Q = new Queue(n);

        int pilih = 0;
        do {
            menu();
            pilih = sc19.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc19.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2 :
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3 : 
                    Q.print();
                    break;
                case 4 : 
                    Q.peek();
                    break;
                case 5 : 
                    Q.clear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
```
contoh output
```java
Masukkan kapasitas queue : 4
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
6. Keluar
----------------------------------
1
Masukkan data baru : 15
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
6. Keluar
----------------------------------
1
Masukkan data baru : 31
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
6. Keluar
----------------------------------
4
Elemen terdepan : 15
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
6. Keluar
----------------------------------
```

Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
Jawab : Karena data dalam queue masih kosong, -1 digunakan sebagai penanda tidak ada indeks dalam queue kosong dengan size 0.

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (rear == max - 1) {
    rear = 0;
```
Jawab : Baris kode if (rear == max - 1) { rear = 0; } dalam method enqueue memiliki fungsi untuk mengecek apakah sudah mencapai batas maksimum dari antrian atau queue yang dimiliki. Jika sudah mencapai batas itu, yang berarti tidak ada tempat lagi untuk menambahkan elemen baru di bagian belakang antrian, maka kode ini akan membantu kita untuk kembali lagi ke bagian awal dari antrian. Dan jika bagian awal tersebut masih kosong, kita bisa menambah data baru di tempat rear atau di bagian awal.

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (front == max - 1) {
    front = 0;
```
Jawab : ketika telah mencapai ujung antrian (kondisi front == max - 1), artinya front berada di akhir array. Dengan kode front = 0; front akan kembali ke awal array, sehingga kita dapat terus menggunakan ruang kosong di awal antrian setelah menghapus elemen-elemen.

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
Jawab : Karena dalam konsep queue, data yang masuk terlebih dahulu akan dikeluarkan terlebih dahulu, dan front merupakan indikasi data awal. Sedangkan data awal tidak selalu berada pada indeks ke 0

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
```java
i = (i + 1) % max;
```
Jawab : mencetak semua elemen antrian dalam urutan yang benar bahkan jika antrian tersebut menggunakan struktur data queue. Jika seumpama kita ingin mencetak indeks ke 0 setelah indeks terakhir, increment tersebut berguna untuk kasus itu.

6. Tunjukkan potongan kode program yang merupakan queue overflow!
Pada saat akan menambahkan elemen baru dilakukan terlebih dahulu apakah queue sudah penuh atau belum menggunakan isFull()
```java
void enqueue(int dt) {
    if (isFull()) {
        System.out.println("Queue sudah penuh");
    }
```

7 . Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
```java
void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
```

Percobaan 2
Nasabah19.java
```java
package Pertemuan_10.Percobaan_2;

public class Nasabah19 {
    String norek, nama, alamat;
    int umur;
    double saldo;

    Nasabah19(){
        
    }

    Nasabah19(String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
}
```
Queue.java
```java
package Pertemuan_10.Percobaan_2;

public class Queue {
    Nasabah19[] data;
    int front, rear, size, max;

    Queue(int n) {
        max = n;
        data = new Nasabah19[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(Nasabah19 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah19 dequeue() {
        Nasabah19 dt = new Nasabah19();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " "
                        + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " "
                    + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
```
Queue_Main.java
```java
package Pertemuan_10.Percobaan_2;

import java.util.Scanner;

public class Queue_Main {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua atrian");
        System.out.println("5. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc19.nextInt();

        Queue Q = new Queue(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc19.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sa.nextLine();
                    System.out.print("Nama : ");
                    String nama = sa.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sa.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc19.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc19.nextDouble();
                    Nasabah19 nb = new Nasabah19(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Nasabah19 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
```
contoh output
```java
Masukkan kapasitas queue : 8
Pilih menu : 
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua atrian
5. Keluar
----------------------------------
1
No rekening : 12345
Nama : Dewi
Alamat : Malang
Umur : 23
Saldo : 1300000
Pilih menu :
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua atrian
5. Keluar
----------------------------------
1
No rekening : 32940
Nama : Susan
Alamat : Surabaya
Umur : 39
Saldo : 420000000
Pilih menu :
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua atrian
5. Keluar
----------------------------------
4
12345 Dewi Malang 23 1300000.0
32940 Susan Surabaya 39 4.2E8
Jumlah elemen = 2
Pilih menu :
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua atrian
5. Keluar
----------------------------------
```

Pertanyaan

1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
    System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
    }
    break;
```
Jawab : Memastikan bahwa data yang dikeluarkan dari queue setelah operasi dequeue adalah data yang valid dan tidak kosong, dan jika valid, data tersebut akan dicetak ke layar.

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear dapat dipanggil!
Class Queue :
```java
void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang : " + data[rear].norek + " " + data[rear].nama + " "
                    + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
```
Class Main :
```java
package Pertemuan10.Praktikum2;

import java.util.Scanner;

import Pertemuan10.Praktikum1.Queue15;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua atrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc15.nextInt();

        Queue Q = new Queue(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc15.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sa.nextLine();
                    System.out.print("Nama : ");
                    String nama = sa.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sa.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc15.nextInt();
                    System.out.print("Saldo : ");
                    int saldo = sc15.nextInt();
                    Nasabah15 nb = new Nasabah15(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Nasabah15 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.peekRear();
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
```

Tugas
Pembeli19.java
```java
package Pertemuan_10.Tugas;

public class Pembeli19 {
    String nama;
    int noHP;

    Pembeli19() {

    }

    Pembeli19(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }
}
```
Queue.java
```java
package Pertemuan_10.Tugas;

public class Queue {
    Pembeli19[] antrean;
    int front, rear, size, max;

    Queue(int n) {
        max = n;
        antrean = new Pembeli19[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(Pembeli19 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrean[rear] = dt;
            size++;
        }
    }

    public Pembeli19 dequeue() {
        Pembeli19 dt = new Pembeli19();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = antrean[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + antrean[front].nama + " "
                    + antrean[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang : " + antrean[rear].nama + " "
                    + antrean[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrean[i].nama + " "
                        + antrean[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrean[i].nama + " "
                    + antrean[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekPosition(String nama) {
        int pos = -1;
        int i = front;
        while (i != rear) {
            if (antrean[i].nama.equals(nama)) {
                pos = i;
            }
            i = (i + 1) % max;
        }
        if (pos > 0) {
            System.out.println("Pelanggan yang anda cari berada pada posisi ke " + (pos + 1));
        } else {
            System.out.println("Pelanggan yang anda cari tidak ada");
        }
    }
}
```
Queue_Main.java
```java
package Pertemuan_10.Tugas;

import java.util.Scanner;

public class Queue_Main {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua atrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari posisi pembeli");
        System.out.println("7. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc19.nextInt();

        Queue Q = new Queue(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc19.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sa.nextLine();
                    System.out.print("No HP : ");
                    int noHP = sc19.nextInt();
                    Pembeli19 nb = new Pembeli19(nama, noHP);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Pembeli19 data = Q.dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.daftarPembeli();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pembeli yang ingin dicari : ");
                    String cariNama = sa.nextLine();
                    Q.peekPosition(cariNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
```