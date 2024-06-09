<div style="text-align: center;">

# **Laporan Kuis 2**
# **Single Linked List**

<img src="https://spmb.polinema.ac.id/devel/asset/images/polinema_logo.png" alt="Logo Universitas" style="width: 200px;"/>

## Disusun oleh:
**Nama:** Muhammad Alif Febriansyah <br>
**NIM:** 2341720025 <br>
**Kelas:** TI-1B <br>

## Jurusan
Teknologi Informasi

## Politeknik Negeri Malang
2023/2024

</div>

## Percobaan 1
Deskripsi
### Class
Class Node
<img src="image\node p1.png" alt="Example Image"/>

Class double linked list
<img src="image\double linked list p1.png" alt="Example Image"/>

Class graph
<img src="image\graph p1.png" alt="Example Image"/>

Class main Percobaan 1
<img src="image\graph main p1.png" alt="Example Image"/>

### output
<img src="image\output p1.png" alt="Output percobaan 1"/>

### Pertanyaan
1.  Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!
2.  Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan 
variabel tersebut! <br>
Variabel list[] bertipe DoubleLinkedList digunakan untuk menyimpan list node yang berisi informasi tentang node-node yang terhubung pada graph.

3. elaskan alur kerja dari method removeEdge! <br> 
Alur kerja method removeEdge pada class graph sebagai berikut:
   - Method removeEdge akan mencari node dengan NIM yang sama dengan parameter NIM pada method removeEdge.
   - Jika node ditemukan, method akan mencari node terhubung pada list[] bertipe DoubleLinkedList.
   - Jika node terhubung ditemukan, method akan menghapus node terhubung pada list[] bertipe DoubleLinkedList.
   - Jika node terhubung tidak ditemukan, method akan mencetak pesan "Node not found!".

4.  Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph? <br>
Sebab pemanggilan method addFirst() pada method addEdge pada class graph, sebagai berikut:
   - Method addEdge pada class graph digunakan untuk menambahkan node baru pada graph.
   - Sebagai awal, method addEdge akan mencari node dengan NIM yang sama dengan node yang ingin ditambahkan.
   - Jika node ditemukan, method akan mencari node terhubung pada list[] bertipe DoubleLinkedList.
   - Jika node terhubung ditemukan, method akan menghubungkan node baru dengan node terhubung pada list[] bertipe DoubleLinkedList.
   - Jika node terhubung tidak ditemukan, method akan menambahkan node baru pada list[] bertipe DoubleLinkedList.

5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). <br>
```
-Masukkan gedung asal: 2
-Masukkan gedung tujuan: 3
-Gedung C dan D bertetangga 
-
-Masukkan gedung asal: 2
-Masukka gedung tujuan: 5
-Gedung C dan F tidak bertetangga
```
Pada pertanyaan ini, modifikasi pada class graph dan class main
clas graph <br>
pertama menambahkan inisialisasi String pada class Graph_19 setelah itu menambahkan method getBuildingName, method isConnected, method getBuildingName
<img  src="image\Pertanyaan 5 p1.png" alt="Class Graph"/>
class main <br>
<img src="image\Pertanyaan 5 p1 main.png" alt="Class Main"/>

## Percobaan 2

### class 
Class graph matriks
<img src="image\graph matriks p2.png" alt="Example Image"/>

Class main Percobaan 2
<img src="image\graph main p2.png" alt="Example Image"/>

### Output 
<img src="image\output p2.png" alt="Output percobaan 2"/>

### Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!
2. Apa jenis graph yang digunakan pada Percobaan 2?
3. Apa maksud dari dua baris kode berikut?
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk 
inDegree dan outDegree!
