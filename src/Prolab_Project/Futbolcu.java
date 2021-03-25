package Prolab_Project;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShapeSVG;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

public class Futbolcu extends Sporcu{

    PImage resim;
    private int zaaa=0;

    public int getZaaa() {
        return zaaa;
    }

    public void setZaaa(int zaaa) {
        this.zaaa = zaaa;
    }

    public PImage getResim() {
        return resim;
    }

    public void setResim(PImage resim) {
        this.resim = resim;
    }

    private int Penalti;
    private  String s;

    private int Serbest_vurus;

    public String getDosyayolu() {
        return Dosyayolu;
    }



    public void setDosyayolu(String dosyayolu) {
        Dosyayolu = dosyayolu;
    }

    private int Karsi_karsiya;
    private Boolean kartKullanildiMi=false;
    private  String Dosyayolu;
    // Hidayet. set dosya yolu
    public Boolean getKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(Boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public Futbolcu(String sporcuIsim, String sporcuTakim, int Penalti, int Serbest_vurus, int Karsi_karsiya,String Dosyayolu){
        super(sporcuIsim,sporcuTakim);
        this.Penalti=Penalti;
        this.Serbest_vurus=Serbest_vurus;
        this.Karsi_karsiya=Karsi_karsiya;
        this.kartKullanildiMi=false;
        this.Dosyayolu=Dosyayolu;

    }





    public int getPenalti() {
        return Penalti;
    }

    public int getSerbest_vurus() {
        return Serbest_vurus;
    }

    public void setSerbest_vurus(int Serbest_vurus) {
        this.Serbest_vurus = Serbest_vurus;
    }




    public int getKarsi_karsiya() {
        return Karsi_karsiya;
    }

    public void setKarsi_karsiya(int Karsi_karsiya) {
        this.Karsi_karsiya = Karsi_karsiya;
    }

    public void setPenalti(int Penalti) {
        this.Penalti = Penalti;
    }

    @Override
    public String sporcuPuaniGoster(int random) {
        if (random==0) {
            s = "Penaltı:" + Penalti;
            return s;
        }

        if (random==1) {
            s = "Serbest Vuruş:" + Serbest_vurus;
            return s;
        }

        if (random==2) {
            s = "Kaleci İle Karşı Karşıya:" + Karsi_karsiya;
            return s;
        }
        return "";
    }
}





