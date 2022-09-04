/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author LENOVO
 */
public class Lingkaran {
    int jejari;
    
    void hitungLuas() {
        double luas = 3.14 * this.jejari * this.jejari;
        System.out.println("Luas lingkaran : " + luas + " Satuan");
    }
    
    void hitungKeliling() {
        double keliling = 3.14 * this.jejari / 2;
        System.out.println("Keliling lingkaran : " + keliling + " Satuan");
    }
}
