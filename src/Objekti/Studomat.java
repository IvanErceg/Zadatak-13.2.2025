package Objekti;

public class Studomat {
    public static void main(String[] args) {

              Studenti student1=new Studenti("Jurica","Dragić",3);
              Studenti student2=new Studenti("Barbara","Kolak",25);
              Studenti student3=new Studenti("Ivo","Ivić");


          System.out.println(student1);
          System.out.println(student1);
          System.out.println(student3);
          student2.setIme("Ružica");
          System.out.println(student2.getIme());
          student1.setPrezime("Runjić");
          System.out.println(student1);
          System.out.println(student2);
        student1.setPrijavljeniIspiti("matematika");
        student1.setPrijavljeniIspiti("hrvatski");

         System.out.println("Prijavljeni ispiti:"+student1.getPrijavljeniIspiti());

    }
}
