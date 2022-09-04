/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package package1;

/**
 *
 * @author LENOVO
 */
public class ProjectBangunDatar {

    public static void main(String[] args) {
        // Persegi Panjang A
        PersegiPanjang A = new PersegiPanjang();
        
        A.panjang = 10;
        A.lebar = 7;
        
        A.hitungLuas();
        A.hitungKeliling();
        
        // Persegi Panjang B
        PersegiPanjang B = new PersegiPanjang();
        
        B.panjang = 14;
        B.lebar = 9;
        
        B.hitungLuas();
        B.hitungKeliling();
        
        // Persegi Panjang C
        PersegiPanjang C = new PersegiPanjang();
        
        C.panjang = 17;
        C.lebar = 8;
        
        C.hitungLuas();
        C.hitungKeliling();
        
        // Persegi Panjang D
        PersegiPanjang D = new PersegiPanjang();
        
        D.panjang = 26;
        D.lebar = 14;
        
        D.hitungLuas();
        D.hitungKeliling();
        
        //Lingkaran L1
        Lingkaran L1 = new Lingkaran();
        
        L1.jejari = 6;
        
        L1.hitungLuas();
        L1.hitungKeliling();
        
        //Lingkaran L2
        Lingkaran L2 = new Lingkaran();
        
        L2.jejari = 12;
        
        L2.hitungLuas();
        L2.hitungKeliling();
    }
}
