package Prolab_Project;

import java.util.ArrayList;

public class Oyuncu {
    private int skor;
    private String oyuncuad;

    public String getOyuncuad() {
        return oyuncuad;
    }

    public void setOyuncuad(String oyuncuad) {
        this.oyuncuad = oyuncuad;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    private  String oyuncuID;
    private int sıra=-1;

    public int getSıra() {
        return sıra;
    }

    public void setSıra(int sıra) {
        this.sıra = sıra;
    }

    public ArrayList getF2() {
        return F2;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public ArrayList getB2() {
        return B2;
    }

    public void setB2(ArrayList b2) {
        B2 = b2;
    }

    public ArrayList getB1() {
        return B1;
    }

    public void setB1(ArrayList b1) {
        B1 = b1;
    }

    public ArrayList getF1() {
        return F1;
    }

    public void setF1(ArrayList f1) {
        F1 = f1;
    }

    public void setF2(ArrayList f2) {
        F2 = f2;
    }

    private ArrayList<Futbolcu> F2= new ArrayList();
    private ArrayList <Futbolcu>F1=new ArrayList ();
    private ArrayList  <Basketbolcu>  B2=new ArrayList ();
    private ArrayList  <Basketbolcu>  B1=new ArrayList ();


    public Oyuncu(String oyuncuID,String oyuncuad,int skor) {
        this.skor=0;
        this.oyuncuad=oyuncuad;
        this.oyuncuID=oyuncuID;
    }

    public void KartListe(ArrayList<Futbolcu> Futbolcu1,ArrayList<Futbolcu> Futbolcu2,ArrayList<Basketbolcu> Basketbolcu1,ArrayList<Basketbolcu> Basketbolcu2) {
        F1.addAll(Futbolcu1);
        F2.addAll(Futbolcu2);
        B1.addAll (Basketbolcu1);
        B2.addAll (Basketbolcu2);
        System.out.println (F1);
        System.out.println (F2);
        System.out.println (B1);
        System.out.println (B2);
    }

    public void Kartseç(int mousex,int mousey,ArrayList<Basketbolcu>B,ArrayList<Futbolcu>F,int j){

    }




    public  Oyuncu(){
        this.skor=0;
        this.oyuncuad=" ";
        this.oyuncuID=" ";
    }
}