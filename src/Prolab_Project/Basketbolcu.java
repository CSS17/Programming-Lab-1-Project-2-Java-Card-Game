package Prolab_Project;

import processing.core.PImage;

public class Basketbolcu extends Sporcu {
    private int zaaa=0;
    private int ikilik;

    public int getZaaa() {
        return zaaa;
    }

    public void setZaaa(int zaaa) {
        this.zaaa = zaaa;
    }

    private int ucluk;
    private int serbest_atis;
    private String Basketbolcu_adi;
    private String Basketbolcu_Takim;
    private  boolean kartKullanildiMi;
    private  String Dosyayolu;
    private PImage Resim;

    public String getDosyayolu() {
        return Dosyayolu;
    }

    public void setDosyayolu(String dosyayolu) {
        Dosyayolu = dosyayolu;
    }

    public PImage getResim() {
        return Resim;
    }

    public void setResim(PImage resim) {
        Resim = resim;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public Basketbolcu(String Basketbolcu_adi, String Baketbolcu_Takim, int ikilik, int ucluk, int serbest_atis,String Dosyayolu) {
        super(Basketbolcu_adi, Baketbolcu_Takim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbest_atis = serbest_atis;
        this.kartKullanildiMi=false;
        this.Dosyayolu=Dosyayolu;

    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbest_atis() {
        return serbest_atis;
    }

    public void setSerbest_atis(int serbest_atis) {
        this.serbest_atis = serbest_atis;
    }

    public String getBasketbolcu_adi() {
        return Basketbolcu_adi;
    }

    public void setBasketbolcu_adi(String Basketbolcu_adi) {
        this.Basketbolcu_adi = Basketbolcu_adi;
    }

    public String getBasketbolcu_Takim() {
        return Basketbolcu_Takim;
    }

    public void setBasketbolcu_Takim(String Basketbolcu_Takim) {
        this.Basketbolcu_Takim = Basketbolcu_Takim;
    }
    private  String s;

    @Override
    public String sporcuPuaniGoster(int random) {

            if (random==0) {
                s = "İkilik:" + ikilik;
                return s;
            }

            if (random==1) {
                s = "Üçlük:" + ucluk;
                return s;
            }

            if (random==2) {
                s = "Serbest Atış: " + serbest_atis;
                return s;
            }
            return "";


        }

    }
