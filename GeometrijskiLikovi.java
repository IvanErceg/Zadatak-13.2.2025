package Ucilica;

import java.util.Arrays;
import java.util.Scanner;

public class GeometrijskiLikovi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double povrsinaTrokut=0;
        double opsegTrokut=0;

        double povrsinaKrug=0;
        double opsegKrug=0;

        double povrsinaPravokutnik=0;
        double opsegPravokutnik=0;

 while(true) {
     String unos = sc.nextLine();
     if (unos.equals("izlaz")) {
         // Exit the loop and program if user types "exit"
         System.out.println("Izlazak iz programa.");
         break;
     }
     switch (unos) {
         case "trokut":
             Trokut trokut = new Trokut(3.0, 3.0, 4.0);
              povrsinaTrokut = trokut.izracunajPovrsinu();
              opsegTrokut = trokut.opseg();
             System.out.println("Površina trokuta: " + povrsinaTrokut);
             System.out.println("Opseg trokuta: " + opsegTrokut);
             break;
         case "krug":
             Krug krug = new Krug(5.0);
              povrsinaKrug = krug.povrsinaKrug();
              opsegKrug = krug.opsegKrug();
             System.out.println("Površina kruga: " + povrsinaKrug);
             System.out.println("Opseg kruga: " + opsegKrug);
             break;
         case "pravokutnik":
             Pravokutnik pravokutnik = new Pravokutnik(3.0, 4.0);
              povrsinaPravokutnik = pravokutnik.povrsinaPravokutnik();
              opsegPravokutnik = pravokutnik.opsegPravokutnik();
             System.out.println("Površina pravokutnika: " + povrsinaPravokutnik);
             System.out.println("Opseg pravokutnika: " + opsegPravokutnik);
             break;
         default:
             System.out.println(" geometrijski lik nije prepoznat");
             break;
     }
 }
        double []povrsine={povrsinaTrokut,povrsinaKrug,povrsinaPravokutnik};
        String[] imena = {"Površina trokut", "Površina krug", "Površina pravokutnika"};
        int n = povrsine.length;
        boolean zamjena;
        do {
            zamjena= false;
            int i = 0;
            while (i < n - 1) {
                if (povrsine[i] > povrsine[i + 1]) {

                    double tempValue = povrsine[i];
                    povrsine[i] = povrsine[i + 1];
                    povrsine[i + 1] = tempValue;


                    String tempName = imena[i];
                    imena[i] = imena[i + 1];
                    imena[i + 1] = tempName;

                    zamjena = true;
                }
                i++;
            }
            n--;
        } while (zamjena);


        System.out.println("\nPovršine geometrijskih likova (sortirane):");
        for (int i = 0; i < povrsine.length; i++) {
            if (povrsine[i] != 0) {
                System.out.println(imena[i] + ": " + povrsine[i]);
            }
        }

        sc.close();




    }
}
