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

Percobaan 1
class node
<img src="image\node.png" alt="Example Image"/>
class double linked list
<img src="image\double linked list percobaan 1.png" alt="Example Image"/>
class graph
<img src="image\graph percobaan 1.png" alt="Example Image"/>
class graph matriks
<img src="image\graph matriks.png" alt="Example Image"/>
class main
<img src="image\graph main.png" alt="Example Image"/>


package Pertemuan_15;

/**
 * GraphMain_19
 */
public class GraphMain_19 {

    public static void main(String[] args) throws Exception {
        Graph_19 gedung = new Graph_19(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();
    }
}
```
contoh output
```
InDegree dari Gedung A: 0
OutDegree dari Gedung A: 2
Degree dari Gedung A: 2
Gedung A terhubung dengan
C (100 m), B (50 m), 
Gedung B terhubung dengan
D (70 m),
Gedung C terhubung dengan
D (40 m),
Gedung D terhubung dengan
E (60 m),
Gedung E terhubung dengan
F (80 m),

6
Gedung A terhubung dengan 
C (100 m), B (50 m),
Gedung C terhubung dengan
D (40 m),
Gedung D terhubung dengan
E (60 m),
Gedung E terhubung dengan
F (80 m),
```
