package main;

import java.util.Scanner;

public class MainIdentity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("First Name  : ");
        String FirstName = scan.nextLine();
        System.out.print("Middle Name : ");
        String MiddleName = scan.nextLine();
        System.out.print("Last Name   : ");
        String LastName = scan.nextLine();
        
        String[] identity = {FirstName, MiddleName, LastName};
        
        System.out.println("");
        System.out.print("Nama        : ");

        for(int keterangan = 0; keterangan  < identity.length; keterangan++){
            System.out.print(identity[keterangan]);
            System.out.print(" ");
        }
    }  
}
