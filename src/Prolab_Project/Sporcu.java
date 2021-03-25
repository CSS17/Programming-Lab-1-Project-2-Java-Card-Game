package Prolab_Project;
/*
         Yapıcı (constuctor) metotları (parametreli ve parametresiz olarak en az iki) yazılacak.
        Parametreler sporcuIsim ve sporcuTakim olmalı.
         Sporcuların kart puanını göstermek için sporcuPuaniGoster() metotu yazılmalıdır.
*/
public class Sporcu {
    private int ilk;

    public int getIlk() {
        return ilk;
    }

    public void setIlk(int ilk) {
        this.ilk = ilk;
    }

    public int getOrta() {
        return orta;
    }

    public void setOrta(int orta) {
        this.orta = orta;
    }

    public int getSon() {
        return son;
    }

    public void setSon(int son) {
        this.son = son;
    }

    public String getSporcuTakim() {
        return SporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        SporcuTakim = sporcuTakim;
    }

    public String getSporcuIsim() {
        return SporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        SporcuIsim = sporcuIsim;
    }




    private int orta;
    private int son;
    private String SporcuTakim;
    private String SporcuIsim;

    public Sporcu(String SporcuIsim,String SporcuTakim){
        this.SporcuTakim=SporcuTakim;
        this.SporcuIsim=SporcuIsim;
    }

    public String sporcuPuaniGoster(int random){
        return "Bilgi Girilmedi";

    }





}