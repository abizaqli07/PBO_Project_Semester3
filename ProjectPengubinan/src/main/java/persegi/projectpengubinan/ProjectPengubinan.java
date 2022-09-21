/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package persegi.projectpengubinan;

/**
 *
 * @author LENOVO
 */
public class ProjectPengubinan {

    public static void main(String[] args) {
        Ruang A = new Ruang();
        A.panjang = 3;
        A.lebar = 3;
        
        Ruang B = new Ruang();
        B.panjang = 5;
        B.lebar = 2;
        
        Ruang C = new Ruang();
        C.panjang = 4;
        C.lebar = 3;
        
        int totalLuasRuang = A.hitungLuas() + B.hitungLuas() + C.hitungLuas();
        
        Ubin X = new Ubin();
        X.panjang = 40;
        X.lebar = 40;
        
        double luasUbin = X.hitungLuas()/100000.;
        
        double jumlahUbin = totalLuasRuang/luasUbin;
        System.out.println("Banyaknya ubin yang diperlukan : " + jumlahUbin);
    }
}
