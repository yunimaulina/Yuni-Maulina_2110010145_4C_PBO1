# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama prajurit dan NRP Prajurit, dan memberikan output berupa informasi detail dari NRP tersebut seperti Pangkat, kesatuan, dan tahun lahir.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Prajurit`, `PrajuritDetail`, dan `PrajuritBeraksi` adalah contoh dari class.

```bash
public class Prajurit {
    ...
}

public class PrajuritDetail extends Prajurit {
    ...
}

public class PrajuritBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `prj[i] = new PrajuritDetail(nama, nrp);` adalah contoh pembuatan object.

```bash
prj[i] = new PrajuritDetail (nama, nrp);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nrp` adalah contoh atribut.

```bash
String nama;
String nrp;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Prajurit` dan `PrajuritDetail`.

```bash
public Prajurit(String nama, String nrp) {
    this.nama = nama;
    this.npm = nrp;
}

public PrajuritDetail(String nama, String nrp) {
    super(nama, nrp);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNrp` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNrp(String nrp) {
    this.nrp = nrp;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNrp`,  `getPangkat`, `getKesatuan`, dan `getTahunLahir` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getNrp() {
    return nrp;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nrp` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nrp;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PrajuritDetail` mewarisi `Prajurit` dengan sintaks `extends`.

```bash
public class PrajuritDetail extends Prajurit {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Prajurit` merupakan overloading method `displayInfo` dan `displayInfo` di `PrajuritDetail` merupakan override dari method `displayInfo` di `Prajurit`.

```bash
public String displayInfo(String data) {
    return displayInfo() + "\nData: " + data;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPangkat` dan seleksi `switch` dalam method `getKesatuan`.

```bash
public String getPangkat(){
        String kodePangkat = getNrp().substring(0, 2);
//        seleksi switch
        switch (kodePangkat){
            case "31":
                return "TAMTAMA";
            case "21":
                return "BINTARA";
            case "11":
                return "PERWIRA";
            default:
                return "PANGKAT TIDAK TERDETEKSI";
        }
    }
    
    
     public String getKesatuan(){
        String kodeKesatuan = getNrp().substring(2, 5);
//        seleksi switch
        switch (kodeKesatuan){
            case "411":
                return "INFANTERI";
            case "522":
                return "ARTILERI";
            case "633":
                return "KAVALERI";
            default:
                return "KESATUAN TIDAK TERDETEKSI";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<prj.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner (System.in);
System.out.print("Nama Prajurit "+(i+1)+" ");
String nama = scanner.nextLine();

System.out.println("Data Prajurit: ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PrajuritDetail[] prj = new PrajuritDetail[2];` adalah contoh penggunaan array.

```bash
PrajuritDetail[] prj = new PrajuritDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // kode
 } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor: "+e.getMessage());
 } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format NRP: "+e.getMessage());
 } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: YUNI MAULINA
NPM : 2110010145
