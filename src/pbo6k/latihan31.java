/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 * Nama         : Agung Hidayatul A
 * Nim          : 10116579
 * Kelas        : PBO6k
 * Keterangan   : Menampilakan program perkenalkandiri
 */
public class latihan31 {
     public static void main(String[] args){

        Mahasiswa mhs1 = new Mahasiswa("10116579", "Agung Hidayatul A");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa("10110270", "Indra Tiola");
        mhs2.perkenalkanDiri();
        
        Mahasiswa mhs3 = new Mahasiswa("10110271", "Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa("10110269", "Muhammad Nur Awaludin");
        mhs4.perkenalkanDiri();

    }
}
