# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh aplikasi manajemen data item gudang sederhana yang dibuat menggunakan Java. Proyek ini merupakan tugas akhir dari mata kuliah **Pemrograman Berbasis Objek 1**.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk menambahkan item baru ke dalam gudang, menambah dan mengurangi stok item, serta melihat semua data item yang telah disimpan.

Aplikasi ini mengimplementasikan berbagai konsep **Object-Oriented Programming (OOP)** seperti Class, Object, Atribut, Method Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, Input Output sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah implementasi konsep-konsep OOP yang digunakan dalam program:

1. **Class**
   Class adalah blueprint dari object. Pada kode ini terdapat class `Entity`, `Item`, dan `ManajemenItem`.

```java
public abstract class Entity { ... }

public class Item extends Entity { ... }

public class ManajemenItem { ... }
```

2. **Object**
   Object merupakan instance dari class. Contoh: `new Item(...)`, `new ManajemenItem()`.

```java
Item itemBaru = new Item(id, nama, kategori, stok);
```

3. **Atribut**
   Atribut adalah variabel yang terdapat dalam class, misalnya `id`, `nama`, `kategori`, dan `stok`.

```java
private String kategori;
private int stok;
```

4. **Constructor**
   Constructor dipanggil saat object dibuat. Pada kode ini terdapat constructor di class `Entity` dan `Item`.

```java
public Entity(String id, String nama) { ... }

public Item(String id, String nama, String kategori, int stok) {
    super(id, nama);
    ...
}
```

5. **Mutator (Setter)**
   Method untuk mengubah nilai atribut, misalnya `setNama`, `setKategori`.

```java
public void setNama(String nama) { ... }
public void setKategori(String kategori) { ... }
```

6. **Accessor (Getter)**
   Method untuk mengambil nilai atribut seperti `getId`, `getNama`, `getStok`.

```java
public String getId() { ... }
public int getStok() { ... }
```

7. **Encapsulation**
   Atribut diatur `private` dan hanya bisa diakses lewat getter/setter.

```java
private String id;
private String nama;
```

8. **Inheritance**
   Class `Item` mewarisi class `Entity` dengan kata kunci `extends`.

```java
public class Item extends Entity { ... }
```

9. **Polymorphism (Overriding)**
   Method `getInfo()` di-override pada class `Item` dari class abstrak `Entity`.

```java
@Override
public String getInfo() { ... }
```

10. **Seleksi (Percabangan)**
    Digunakan `switch` dan `if` dalam pemilihan menu dan validasi data.

```java
switch (pilihan) {
    case 1 -> ...
    case 2 -> ...
}
```

11. **Perulangan**
    Loop `while` digunakan untuk menampilkan menu terus menerus selama program berjalan.

```java
while (true) {
    ...
}
```

12. **Input Output Sederhana**
    Menggunakan `Scanner` untuk input dan `System.out.println()` untuk output.

```java
Scanner input = new Scanner(System.in);
System.out.println("Pilih menu:");
```

13. **Array**
    Digunakan untuk menyimpan beberapa item.

```java
protected Item[] daftarItem = new Item[5];
```

14. **Error Handling**
    Digunakan `try-catch` untuk menangani error saat runtime, seperti input invalid dan stok kurang.

```java
try {
    ...
} catch (Exception e) {
    System.out.println(e.getMessage());
}
```

## Usulan Nilai

|  No | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    5    |
|  10 | Seleksi        |    5    |
|  11 | Perulangan     |    5    |
|  12 | IO Sederhana   |    10   |
|  13 | Array          |    10   |
|  14 | Error Handling |    15   |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Maulana Zidane
NPM: 2310010235
