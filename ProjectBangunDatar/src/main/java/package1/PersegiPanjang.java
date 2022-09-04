/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    void hitungLuas() {
        int luas = this.panjang * this.lebar;
        System.out.println("Luas : " + luas + " Satuan");
    }
    
    void hitungKeliling() {
        int keliling = (this.panjang + this.lebar) * 2;
        System.out.println("Keliling : " + keliling + " Satuan");
    }
}
