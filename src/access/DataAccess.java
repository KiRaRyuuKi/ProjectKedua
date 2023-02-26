package access;

import java.util.Scanner;

public class DataAccess {
    
    private int Awal, Akhir;
    private String Pilih;
    
    private DataAccess() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Pilih Bilangan Genap / Ganjil : ");
        Pilih = scan.next();
        
        System.out.print("Masukkan niali awal  : ");
        Awal = scan.nextInt();
        System.out.print("Masukkan niali akhir : ");
        Akhir = scan.nextInt();
    }

    public static void main(String[] args) {
        DataAccess Access = new DataAccess();
        
        System.out.println("");
        System.out.print("Urutan Bilangan " + Access.Pilih + " : ");
        
        for(int Bilangan = Access.Awal; Bilangan <= Access.Akhir; Bilangan++) {
            if(Access.Pilih.equals("Genap")) {
                if(Bilangan %2 == 0) {
                  System.out.print(Bilangan + " ");  
                }
            } else if(Access.Pilih.equals("Ganjil")) {
                if(Bilangan %2 == 1) {
                  System.out.print(Bilangan + " ");  
                }
            }
        }
    }  
}
