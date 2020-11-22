/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 */
public class Human extends LivingThing {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang Berjalan");
    }
}
