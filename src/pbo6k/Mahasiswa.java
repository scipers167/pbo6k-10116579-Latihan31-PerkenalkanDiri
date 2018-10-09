/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    public String nim;
    public String nama; 
    
    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    /**
     * @param args the command line arguments
     */
    public void perkenalkanDiri(){
        System.out.println("Hello Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name ".concat(nama));
        System.out.println();
    }
    
}
