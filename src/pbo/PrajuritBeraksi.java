package pbo;

import java.util.Scanner;

public class PrajuritBeraksi {
     public static void main(String[] args) {
         System.out.println("DIVISI ADMINISTRASI DATA PRAJURIT");
         System.out.println("-SILAHKAN INPUT-");
//Error handling
try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        PrajuritDetail[] prj = new PrajuritDetail[2];
        for(int i=0; i<prj.length; i++) {
                System.out.print("Nama Prajurit "+(i+1)+" ");
                String nama = scanner.nextLine();
                System.out.print("NRP Prajurit "+(i+1)+" ");
                String nrp = scanner.nextLine();

    //        objek
                prj[i] = new PrajuritDetail (nama, nrp);
                System.out.println("......................");
    }

        for(PrajuritDetail data: prj) {
            System.out.println("==================");
            System.out.println("Data Prajurit: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format NRP: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  }
}
