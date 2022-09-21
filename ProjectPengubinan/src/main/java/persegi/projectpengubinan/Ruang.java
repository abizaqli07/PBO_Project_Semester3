/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persegi.projectpengubinan;

/**
 *
 * @author LENOVO
 */
public class Ruang {
    int panjang;
    int lebar;
    
    int hitungLuas() {
        PersegiPanjang p = new PersegiPanjang();
        
        return p.hitungLuas(this.panjang, this.lebar);
    }
}
