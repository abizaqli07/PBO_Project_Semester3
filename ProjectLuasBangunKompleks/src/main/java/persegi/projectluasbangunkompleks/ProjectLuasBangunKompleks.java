/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package persegi.projectluasbangunkompleks;

/**
 *
 * @author LENOVO
 */
public class ProjectLuasBangunKompleks {

    public static void main(String[] args) {
        //Project 1
        Lingkaran LingkaranA = new Lingkaran();
        LingkaranA.jejari = 42 / 2;
        double luasLingkaranA = LingkaranA.hitungLuas();
        
        SegiEmpat SegiEmpatA = new SegiEmpat();
        SegiEmpatA.panjang = 42;
        SegiEmpatA.lebar = 42;
        int luasSegiEmpatA = SegiEmpatA.hitungLuas();
        
        double LuasBangunA = (luasLingkaranA * 2) + luasSegiEmpatA;
        
        System.out.println("Luas dari bangun datar A adalah : " + LuasBangunA);
        
        
        //Project 2
        Lingkaran LingkaranB = new Lingkaran();
        LingkaranB.jejari = 28 / 2;
        double luasLingkaranB = LingkaranB.hitungLuas();
        
        Lingkaran LingkaranC = new Lingkaran();
        LingkaranC.jejari = 14 / 2;
        double luasLingkaranC = LingkaranC.hitungLuas();
        
        double LuasBangunB = (luasLingkaranB / 2) - luasLingkaranC;
        
        System.out.println("Luas dari bangun datar B adalah : " + LuasBangunB);
    }
}
