package Objekti;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Studenti {
    private String ime;
    private  String prezime;
    private int  brojIndeksa;
    private ArrayList<String >prijavljeniIspiti=new ArrayList<>();


    public  Studenti(String ime ,String prezime ,int brojIndeksa){
              this.ime=ime;
              this.prezime=prezime;
              this.brojIndeksa=brojIndeksa;

    }

    public void setPrijavljeniIspiti(String ispit) {
            prijavljeniIspiti.add(ispit);
        this.prijavljeniIspiti = prijavljeniIspiti;
    }

    public Studenti(String prezime, String ime) {
        this(ime,prezime,5);
    }


    @Override
    public String toString() {
        return "Student:" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndeksa=" + brojIndeksa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public ArrayList<String> getPrijavljeniIspiti() {
        return prijavljeniIspiti;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

}
