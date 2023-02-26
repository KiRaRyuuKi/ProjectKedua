package main;

import java.util.Scanner;

public class MainRandomAccess {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        int baris = 0;
    
        System.out.print("MASUKKAN JUMLAH DERET : ");
        jumlah=input.nextInt();
        System.out.print("MASUKKAN JUMLAH BARIS : ");
        baris=input.nextInt();
        
        System.out.println("");
    
        int [][] deretarray = new int [jumlah][baris];
    
        for(int  b = 0; b < baris; b++){
            for(int  i = 0; i < jumlah; i++){
                deretarray[i][b]=(int) (Math.random()*10);
            }
        }
        
        for(int a=0 ; a<baris ; a++){
            for(int j=0 ; j<jumlah ; j++){
                System.out.print(deretarray[j][a]+"  ");
            }
        System.out.println("");
        }     
    }  
}
