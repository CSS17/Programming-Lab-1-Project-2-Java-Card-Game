package Prolab_Project;

import org.omg.CORBA.ObjectHelper;
import org.omg.CORBA.ServerRequest;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import sun.net.www.protocol.file.FileURLConnection;

import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  class Test  extends PApplet {

    public static PApplet processing;
    public static void main(String[] args) {
        int x=5;
        int y=2;
        double sonuç=(double)5/2;




        System.out.println (sonuç);

        double    sonuç1=(double)(5/2);
        System.out.println (sonuç1);

        PApplet.main ("Prolab_Project.Test", args);
    }
    public String benim="";
    public String senin="";

    PImage img;  // Declare variable "a" of type PImage

    Random rnd = new Random ();


    ArrayList<Futbolcu> F = new ArrayList ();
    ArrayList<Basketbolcu> B = new ArrayList ();
    ArrayList<Basketbolcu> ABI = new ArrayList ();
    ArrayList<Futbolcu> KARDES = new ArrayList ();

    Futbolcu Sergen = new Futbolcu ("Sergen", "Besiktas", 95, 85, 100, "Sergen Yalçın.png");
    Futbolcu Sabri = new Futbolcu ("Sabri", "Galatasaray", 90, 75, 85, "Sabri.png");
    Futbolcu Alex = new Futbolcu ("Alex", "Fenerbahçe", 100, 90, 95, "Alex.png");
    Futbolcu Drogba = new Futbolcu ("Drogba", "Galatasaray", 95, 90, 95, "dorgba.png");
    Futbolcu Ronaldo = new Futbolcu ("C.Ronaldo", "Juventus", 95, 100, 100, "C.Ronaldo.png");
    Futbolcu Messi = new Futbolcu ("L.Messi", "Barcelona", 100, 90, 100, "Messi.png");
    Futbolcu Ozan = new Futbolcu ("Ozan Tufan", "Fenerbahçe", 90, 80, 85, "Ozan Tufan.png");
    Futbolcu Neymar = new Futbolcu ("Neymar JR", "PSG", 90, 90, 95, "Neymar.png");

    Basketbolcu LeBron = new Basketbolcu ("LeBron", "Los Angeles Lakers", 100, 95, 100, "LeBron.png");
    Basketbolcu Mehmet_Okur = new Basketbolcu ("Mehmet", "Utah Jazz", 90, 90, 100, "Mehmet.png");
    Basketbolcu Cedi = new Basketbolcu ("Cedi", "Clevand Cavalliers", 85, 85, 95, "Cedi.png");
    Basketbolcu Anthony = new Basketbolcu ("C.Anthony", "Portland Trail Blazers", 90, 90, 100, "Carmelo.png");
    Basketbolcu Kobe = new Basketbolcu ("Kobe", "Los Angeles Lakers", 100, 95, 100, "Kobe.png");
    Basketbolcu Nowitzki = new Basketbolcu ("Dirk Nowitzki", "Dallas Mavericks", 90, 95, 90, "Nowitzki.png");
    Basketbolcu Ersan = new Basketbolcu ("Ersan Ilyasova", "Milwaukee Bucks", 90, 95, 100, "Ersan.png");
    Basketbolcu Hidayet = new Basketbolcu ("Hidayet Turkoglu", "Orlando Magic", 85, 85, 90, "Hidayet.png");

    PImage bg;
    int xaxa = -1;
    Kullanıcı x = new Kullanıcı ();

    Bilgisayar y=new Bilgisayar ();


    PFont f;
    Oyuncu oyuncu=new Oyuncu();
    PImage imlecf;
    PImage imlecb;
    PImage arkaplan;
    public void setup() {
        imlecf=loadImage("Football.png");
        imlecb=loadImage("Basketball.png");
        arkaplan=loadImage("arka plan.png");
        f = createFont("Yazi.ttf", 30);
        textFont(f);

        bg = loadImage (Sergen.getDosyayolu ());
        Sergen.setResim (bg);

        bg = loadImage (Anthony.getDosyayolu ());
        Anthony.setResim (bg);

        bg = loadImage (Sabri.getDosyayolu ());
        Sabri.setResim (bg);

        bg = loadImage (Alex.getDosyayolu ());
        Alex.setResim (bg);

        bg = loadImage (Drogba.getDosyayolu ());
        Drogba.setResim (bg);
        bg = loadImage (Ronaldo.getDosyayolu ());
        Ronaldo.setResim (bg);

        bg = loadImage (Messi.getDosyayolu ());
        Messi.setResim (bg);

        bg = loadImage (Ozan.getDosyayolu ());
        Ozan.setResim (bg);

        bg = loadImage (Neymar.getDosyayolu ());
        Neymar.setResim (bg);

        bg = loadImage (LeBron.getDosyayolu ());
        LeBron.setResim (bg);


        bg = loadImage (Mehmet_Okur.getDosyayolu ());
        Mehmet_Okur.setResim (bg);

        bg = loadImage (Cedi.getDosyayolu ());
        Cedi.setResim (bg);

        bg = loadImage (Kobe.getDosyayolu ());
        Kobe.setResim (bg);

        bg = loadImage (Nowitzki.getDosyayolu ());
        Nowitzki.setResim (bg);
        bg = loadImage (Ersan.getDosyayolu ());
        Ersan.setResim (bg);

        bg = loadImage (Hidayet.getDosyayolu ());
        Hidayet.setResim (bg);


        Random rnd = new Random ();


        B.add (Hidayet);
        B.add (LeBron);
        B.add (Ersan);
        B.add (Nowitzki);
        B.add (Mehmet_Okur);
        B.add (Cedi);
        B.add (Anthony);
        B.add (Kobe);

        F.add (Sergen);
        F.add (Sabri);
        F.add (Alex);
        F.add (Ronaldo);
        F.add (Drogba);
        F.add (Messi);
        F.add (Ozan);
        F.add (Neymar);


        Random au = new Random ();
        int hihihi;
        for (int i=0;i<10;i++) {
            Random alibaba=new Random ();
            hihihi=alibaba.nextInt (8);
            F.add (  F.get (hihihi)  );
            F.remove (    hihihi   );


        }
        for (int i=0;i<10;i++) {
            Random alibaba=new Random ();
            hihihi=alibaba.nextInt (8);
            B.add (  B.get (hihihi)  );
            B.remove (    hihihi   );
        }
//KARTLAR RANDOM ATILIR.
        int sayaç = 0;
        for (int i = 0; i < 4; i++) {
            int sayi = au.nextInt (8 - sayaç);
            ABI.add (B.get (sayi));
            B.remove (sayi);
            KARDES.add (F.get (sayi));
            F.remove (sayi);

            sayaç++;
        }

        Oyuncu koyuncu = new Oyuncu ();
        koyuncu.KartListe (F, KARDES, B, ABI);
        int sıra = 0;
    }


    public void settings() {
        fullScreen ();
    }


    int dizi[] = {0, 0, 0, 0, 0, 0, 0, 0};
    int dizi2[] = {0, 0, 0, 0, 0, 0, 0, 0};
    int dizi3[]={0,0,0,0,0,0,0,0,0,0,0,0};
    int dizi4[]={0,0,0,0,0,0,0,0,0,0,0,0};
    int a = 145;
    int b = 590;
    int ekle = 135;
    int sayac = 0;


    int j=0;
    public void sorgu() {


        if (mouseX > 145 && mouseX < 270 && mouseY > 590 && mouseY < 765 && F.get (0).getKartKullanildiMi () == false) {
            dizi2[0] = 1;
            image (F.get(0) .getResim (), 145, 540, 405 - 270, 170);

        } else
            dizi2[0] = 0;

        if (mouseX > 280 && mouseX < 405 && mouseY > 590 && mouseY < 765 && B.get (0).isKartKullanildiMi () == false) {
            dizi2[1] = 1;
            image (B.get ( 0).getResim (), 280, 540, 125, 175);

        } else
            dizi2[1] = 0;

        if (mouseX > 415 && mouseX < 540 && mouseY > 590 && mouseY < 765 && F.get (1).getKartKullanildiMi () == false) {
            dizi2[2] = 1;
            image (F.get (1).getResim (), 415, 540, 125, 175);

        } else

            dizi2[2] = 0;

        if (mouseX > 550 && mouseX < 675 && mouseY > 590 && mouseY < 765   && B.get (1).isKartKullanildiMi () == false) {
            dizi2[3] = 1;

            image (B.get (1).getResim (), 550, 540, 125, 175);

        } else
            dizi2[3] = 0;
        if (mouseX > 685 && mouseX < 810 && mouseY > 590 && mouseY < 765 && F.get (2).getKartKullanildiMi () == false) {
            dizi2[4] = 1;

            image (F.get (2).getResim (), 685, 540, 125, 175);

        } else
            dizi2[4] = 0;
        if (mouseX > 820 && mouseX < 945 && mouseY > 590 && mouseY < 765  && B.get (2).isKartKullanildiMi () == false) {
            dizi2[5] = 1;

            image (B.get (2).getResim (), 820, 540, 125, 175);

        } else
            dizi2[5] = 0;
        if (mouseX > 955 && mouseX < 1080 && mouseY > 590 && mouseY < 765 && F.get (3).getKartKullanildiMi () == false) {
            dizi2[6] = 1;

            image (F.get (3).getResim (), 955, 540, 125, 175);

        } else
            dizi2[6] = 0;
        if (mouseX > 1090 && mouseX < 1215 && mouseY > 590 && mouseY < 765  && B.get (3).isKartKullanildiMi () == false) {
            dizi2[7] = 1;

            image (B.get (3).getResim (), 1090, 540, 125, 175);

        } else
            dizi2[7] = 0;


    }




    Random random1=new Random ();
    int sıra=1;
    int meow=random1.nextInt (3);
    int meow1=random1.nextInt (3);
    int meow2=random1.nextInt (3);
    int meow3=random1.nextInt (3);
    int aga=0;
    public void draw() {

        int sayac=0;


        background (255);
        sorgu ();
        if (dizi[0] == 0 && B.get (0).isKartKullanildiMi ()==false) {

            rect (145, 0, 125, 175);
        }
        if (dizi[1] == 0 && F.get (0).getKartKullanildiMi ()==false) {
            fill (255, 0, 150, 255);
            strokeWeight (4);
            rect (145 + ekle, 0, 125, 175);
        }
        if (dizi[2] == 0 && B.get (1).isKartKullanildiMi ()==false) {
            fill (255, 0, 150, 255);
            strokeWeight (4);
            rect (145 + 2 * ekle, 0, 125, 175);
        }
        if (dizi[3] == 0 &&  F.get (1).getKartKullanildiMi ()==false ) {
            fill (255, 0, 150, 255);
            strokeWeight (4);
            rect (145 + 3 * ekle, 0, 125, 175);
        }
        if (dizi[4] == 0 && B.get (2).isKartKullanildiMi ()==false) {
            fill (255, 0, 150, 255);
            strokeWeight (4);
            rect (145 + 4 * ekle, 0, 125, 175);
        }
        if (dizi[5] == 0  && F.get (2).getKartKullanildiMi ()==false) {
            fill (255, 0, 150, 255);
            strokeWeight (4);
            rect (145 + 5 * ekle, 0, 125, 175);
        }
        if (dizi[6] == 0 && B.get (3).isKartKullanildiMi ()==false) {
            fill (255, 0, 150, 255);
            strokeWeight (4);
            rect (145 + 6 * ekle, 0, 125, 175);
        }
        if (dizi[7] == 0 && F.get (3).getKartKullanildiMi ()==false) {
            fill (255, 0, 150, 255);
            strokeWeight (4);
            rect (145 + 7 * ekle, 0, 125, 175);
        }




        if (dizi2[0] == 0 && F.get (0).getKartKullanildiMi () == false) {
            image (F.get (0).getResim (), a, b, 125, 175);

        }
        if (dizi2[1] == 0 && B.get (0).isKartKullanildiMi () == false) {
            image (B.get (0).getResim (), a + ekle, b, 125, 175);
        }
        if (dizi2[2] == 0 && F.get (1).getKartKullanildiMi () == false) {
            image (F.get (1).getResim (), a + 2 * ekle, b, 125, 175);

        }
        if (dizi2[3] == 0 && B.get (1).isKartKullanildiMi () == false) {
            image (B.get (1).getResim (), a + 3 * ekle, b, 125, 175);

        }
        if (dizi2[4] == 0 && F.get (2).getKartKullanildiMi () == false) {
            image (F.get (2).getResim (), a + 4 * ekle, b, 125, 175);

        }
        if (dizi2[5] == 0 && B.get (2).isKartKullanildiMi () == false) {
            image (B.get (2).getResim (), a + 5 * ekle, b, 125, 175);

        }
        if (dizi2[6] == 0 && F.get (3).getKartKullanildiMi () == false) {
            image (F.get (3).getResim (), a + 6 * ekle, b, 125, 175);

        }

        if (dizi2[7] == 0 && B.get (3).isKartKullanildiMi () == false) {
            image (B.get (3).getResim (), a + 7 * ekle, b, 125, 175);


        }

// Bastım abi


        if (mousePressed == true) {
            x.Kartseç (mouseX, mouseY,B, F, oyuncu.getSıra());






            y.Kartseç (mouseX,mouseY,ABI,KARDES,oyuncu.getSıra());

        }


//1.FUTOBOLCU

        if (F.get (0).getKartKullanildiMi ()==true ) {
            image (F.get (0).getResim (), 200, 200, 300, 300);
            image (KARDES.get (0).getResim (), 700, 200, 300, 300);
            if (meow==0){
                {
                    benim=F.get (0).sporcuPuaniGoster (0);
                    senin=KARDES.get (0).sporcuPuaniGoster (0);
                }
            }
            if (meow ==1) {
                benim=F.get (0).sporcuPuaniGoster (1);
                senin=KARDES.get (0).sporcuPuaniGoster (1);
            }
            if (meow==2) {
                benim=F.get (0).sporcuPuaniGoster (2);
                senin=KARDES.get (0).sporcuPuaniGoster (2);
            }

            if (meow==0 && (F.get (0).getPenalti () <KARDES.get (0).getPenalti ()    && dizi3[0]==0)){
                y.setSkor ( 10+y.getSkor ()  );
                dizi3[0]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);


            }
            if (meow==0 && (F.get (0).getPenalti () >KARDES.get (0).getPenalti () )  && dizi3[0]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[0]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow==0 && (F.get (0).getPenalti () ==KARDES.get (0).getPenalti () )  && dizi3[0]==0){
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi3[0]=1;

            }

            //serbest
            if (meow==1 && (F.get (0).getSerbest_vurus () <KARDES.get (0).getSerbest_vurus () ) && dizi3[1]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi3[1]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow==1 && (F.get (0).getSerbest_vurus() >KARDES.get (0).getSerbest_vurus () ) && dizi3[1]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[1]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);

            }
            if (meow==1 && (F.get (0).getSerbest_vurus () ==KARDES.get (0).getSerbest_vurus () ) && dizi3[1]==0){

                dizi3[1]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }


            //karsi karsiya
            if (meow==2 && (F.get (0).getKarsi_karsiya () <KARDES.get (0).getKarsi_karsiya ()  ) && dizi3[2]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi3[2]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow==2 && (F.get (0).getKarsi_karsiya () >KARDES.get (0).getKarsi_karsiya () && dizi3[2]==0 )){
                x.setSkor ( 10+x.getSkor ());
                dizi3[2]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow==2 && (F.get (0).getKarsi_karsiya () ==KARDES.get (0).getKarsi_karsiya () ) && dizi3[2]==0){

                dizi3[2]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }








        }




//İKİNCİ futbolcu kart

        if (F.get (1).getKartKullanildiMi ()==true && F.get (1).getZaaa ()==1) {
            image (F.get (1).getResim (), 200, 200, 300, 300);
            image (KARDES.get (1).getResim (),700,200,300,300);

            if (meow1==0){
                benim=F.get (1).sporcuPuaniGoster (0);
                senin=KARDES.get (1).sporcuPuaniGoster (0);
            }
            if(meow1 ==1) {
                benim=F.get (1).sporcuPuaniGoster (1);
                senin=KARDES.get (1).sporcuPuaniGoster (1);
            }
            if(meow1 ==2) {
                benim=F.get (1).sporcuPuaniGoster (2);
                senin=KARDES.get (1).sporcuPuaniGoster (2);
            }
            if (meow1==0 && (F.get (1).getPenalti () <KARDES.get(1).getPenalti ()  ) && dizi3[3]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi3[3]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);

            }
            if (meow1==0 && (F.get(1).getPenalti () >KARDES.get(1).getPenalti () )  && dizi3[3]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[3]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow1==0 && (F.get(1).getPenalti () ==KARDES.get(1).getPenalti () )  && dizi3[3]==0){

                dizi3[3]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }

            //serbest
            if (meow1==1 && (F.get(1).getSerbest_vurus () <KARDES.get(1).getSerbest_vurus () )  && dizi3[4]==0){
                y.setSkor ( 10+y.getSkor ()  );

                dizi3[4]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow1==1 && (F.get(1).getSerbest_vurus() >KARDES.get(1).getSerbest_vurus () )  && dizi3[4]==0 ){
                x.setSkor ( 10+x.getSkor ());
                dizi3[4]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow1==1 && (F.get(1).getSerbest_vurus () ==KARDES.get(1).getSerbest_vurus () )  && dizi3[4]==0){

                dizi3[4]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }


            //Kaleciyle Karsi Karsiya
            if (meow1==2 && (F.get(1).getKarsi_karsiya () <KARDES.get(1).getKarsi_karsiya ()  )  && dizi3[5]==0){
                y.setSkor ( 10+y.getSkor ()  );

                dizi3[5]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow1==2 && (F.get(1).getKarsi_karsiya () >KARDES.get(1).getKarsi_karsiya () )  && dizi3[5]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[5]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow1==2 && (F.get(1).getKarsi_karsiya () ==KARDES.get(1).getKarsi_karsiya ()  )  && dizi3[5]==0){

                dizi3[5]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }













        }





        //ucuncu futbolcu
        if (F.get (2).getKartKullanildiMi ()==true && F.get (2).getZaaa ()==1  ) {
            image (F.get (2).getResim (),200, 200, 300, 300);
            image (KARDES.get (2).getResim (),700,200,300,300);
            if (meow2==0){
                benim=F.get (2).sporcuPuaniGoster (0);
                senin=KARDES.get (2).sporcuPuaniGoster (0);
            }
            else if (meow2 ==1) {
                benim = F.get (2).sporcuPuaniGoster (1);
                senin = KARDES.get (2).sporcuPuaniGoster (1);
            }
            else {
                benim=F.get (2).sporcuPuaniGoster (2);
                senin=KARDES.get (2).sporcuPuaniGoster (2);
            }

            //Penalti

            if (meow2==0 && (F.get (2).getPenalti () <KARDES.get (2).getPenalti () )  && dizi3[6]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi3[6]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow2==0 && (F.get (2).getPenalti () >KARDES.get (2).getPenalti () )  && dizi3[6]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[6]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow2==0 && (F.get (2).getPenalti () ==KARDES.get (2).getPenalti () )  && dizi3[6]==0){

                dizi3[6]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }

            //serbest
            if (meow2==1 && (F.get(2).getSerbest_vurus () <KARDES.get(2).getSerbest_vurus () )  && dizi3[7]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi3[7]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);

            }
            if (meow2==1 && (F.get(2).getSerbest_vurus() >KARDES.get(2).getSerbest_vurus () )  && dizi3[7]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[7]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow2==1 && (F.get(2).getSerbest_vurus () ==KARDES.get(2).getSerbest_vurus () )  && dizi3[7]==0){

                dizi3[7]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }


            //frikik
            if (meow2==2 && (F.get(2).getKarsi_karsiya () <KARDES.get(2).getKarsi_karsiya () ) && dizi3[8]==0){
                y.setSkor ( 10+y.getSkor ()  );
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi3[8]=1;

            }
            if (meow2==2 && (F.get(2).getKarsi_karsiya () >KARDES.get(2).getKarsi_karsiya () ) && dizi3[8]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[8]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow2==2 && (F.get(2).getKarsi_karsiya () ==KARDES.get(2).getKarsi_karsiya () ) && dizi3[8]==0){

                dizi3[8]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }




        }



//futbolcu kart


        if (F.get (3).getKartKullanildiMi ()==true && F.get (3).getZaaa ()==1) {
            image (F.get (3).getResim (), 200, 200, 300, 300);
            image (KARDES.get (3).getResim (),700,200,300,300);
            if (meow3==0){
                benim=F.get (3).sporcuPuaniGoster (0);
                senin=KARDES.get (3).sporcuPuaniGoster (0);
            }
            else if (meow3 ==1) {
                benim=F.get (3).sporcuPuaniGoster (1);
                senin=KARDES.get (3).sporcuPuaniGoster (1);
            }
            else {
                benim=F.get (3).sporcuPuaniGoster (2);
                senin=KARDES.get (3).sporcuPuaniGoster (2);
            }
            if (meow3==0 && (F.get (3).getPenalti () <KARDES.get (3).getPenalti ()  ) && dizi3[9]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi3[9]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow3==0 && (F.get (3).getPenalti () >KARDES.get (3).getPenalti () ) && dizi3[9]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[9]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow3==0 && (F.get (3).getPenalti () ==KARDES.get (3).getPenalti () ) && dizi3[9]==0){

                dizi3[9]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }

            //serbest
            if (meow3==1 && (F.get(3).getSerbest_vurus () <KARDES.get(3).getSerbest_vurus () ) && dizi3[10]==0){
                y.setSkor ( 10+y.getSkor ()  );

                dizi3[10]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow3==1 && (F.get(3).getSerbest_vurus() >KARDES.get(3).getSerbest_vurus () ) && dizi3[10]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[10]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow3==1 && (F.get(3).getSerbest_vurus () ==KARDES.get(3).getSerbest_vurus () ) && dizi3[10]==0){

                dizi3[10]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }


            //frikik
            if (meow3==2 && (F.get(3).getKarsi_karsiya () <KARDES.get(3).getKarsi_karsiya () ) && dizi3[11]==0){
                y.setSkor ( 10+y.getSkor ()  );
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi3[11]=1;

            }
            if (meow3==2 && (F.get(3).getKarsi_karsiya () >KARDES.get(3).getKarsi_karsiya () )  && dizi3[11]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi3[11]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow3==2 && (F.get(3).getKarsi_karsiya () ==KARDES.get(3).getKarsi_karsiya () )  && dizi3[11]==0){
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi3[11]=1;

            }




        }




























//1.Basketbolcu Kart

        if (B.get (0).isKartKullanildiMi ()==true && B.get(0).getZaaa()==1) {
            image (B.get (0).getResim (), 200, 200, 300, 300);
            image (ABI.get (0).getResim (), 700, 200, 300, 300);
            if (meow==0){
                benim=B.get (0).sporcuPuaniGoster (0);
                senin=ABI.get (0).sporcuPuaniGoster (0);
            }
            if (meow ==1) {
                benim = B.get (0).sporcuPuaniGoster (1);
                senin = ABI.get (0).sporcuPuaniGoster (1);
            }
            if (meow==2) {

                benim = B.get (0).sporcuPuaniGoster (2);
                senin = ABI.get (0).sporcuPuaniGoster (2);
            }
            if (meow==0 && (B.get (0).getIkilik () <ABI.get (0).getIkilik ()    && dizi4[0]==0)){
                y.setSkor ( 10+y.getSkor ()  );
                dizi4[0]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);

            }
            if (meow==0 && (B.get (0).getIkilik () >ABI.get (0).getIkilik () )  && dizi4[0]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[0]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow==0 && (B.get (0).getIkilik () ==ABI.get (0).getIkilik () )  && dizi4[0]==0){

                dizi4[0]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }

            //Üçlük
            if (meow==1 && (B.get (0).getUcluk () <ABI.get (0).getUcluk () ) && dizi4[1]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi4[1]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow==1 && (B.get (0).getUcluk () >ABI.get (0).getUcluk () ) && dizi4[1]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[1]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);

            }
            if (meow==1 && (B.get(0).getUcluk () ==ABI.get (0).getUcluk () ) && dizi4[1]==0){

                dizi4[1]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }


            //Serbest Atış
            if (meow==2 && (B.get (0).getSerbest_atis () <ABI.get (0).getSerbest_atis ()  ) && dizi4[2]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi4[2]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow==2 && (B.get (0).getSerbest_atis () >ABI.get (0).getSerbest_atis () && dizi4[2]==0 )){
                x.setSkor ( 10+x.getSkor ());
                dizi4[2]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow==2 && (B.get (0).getSerbest_atis () ==ABI.get (0).getSerbest_atis () ) && dizi4[2]==0){
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi4[2]=1;
            }








        }




//İKİNCİ Basketbolcu kart

        if (B.get (1).isKartKullanildiMi ()==true && B.get (1).getZaaa ()==1) {
            image (B.get (1).getResim (), 200, 200, 300, 300);
            image (ABI.get (1).getResim (),700,200,300,300);

            if (meow1==0){
                benim = B.get (1).sporcuPuaniGoster (0);
                senin = ABI.get (1).sporcuPuaniGoster (0);
            }
            if(meow1 ==1) {
                benim = B.get (1).sporcuPuaniGoster (1);
                senin = ABI.get (1).sporcuPuaniGoster (1);
            }

            if(meow1 ==2) {
                benim = B.get (1).sporcuPuaniGoster (2);
                senin = ABI.get (1).sporcuPuaniGoster (2);
            }
            //Ikilik
            if (meow1==0 && (B.get (1).getIkilik () <ABI.get(1).getIkilik ()  ) && dizi4[3]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi4[3]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);

            }
            if (meow1==0 && (B.get(1).getIkilik () >ABI.get(1).getIkilik () )  && dizi4[3]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[3]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow1==0 && (B.get(1).getIkilik () ==ABI.get(1).getIkilik () )  && dizi4[3]==0){

                dizi4[3]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }

            //ucluk
            if (meow1==1 && (B.get(1).getUcluk () <ABI.get(1).getUcluk () )  && dizi4[4]==0){
                y.setSkor ( 10+y.getSkor ()  );
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi4[4]=1;

            }
            if (meow1==1 && (B.get(1).getUcluk () >ABI.get(1).getUcluk () )  && dizi4[4]==0 ){
                x.setSkor ( 10+x.getSkor ());
                dizi4[4]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow1==1 && (B.get(1).getUcluk () ==ABI.get(1).getUcluk () )  && dizi4[4]==0){

                dizi4[4]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }


            //serbest atis
            if (meow1==2 && (B.get(1).getSerbest_atis () <ABI.get(1).getSerbest_atis ()  )  && dizi4[5]==0){
                y.setSkor ( 10+y.getSkor ()  );
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi4[5]=1;

            }
            if (meow1==2 && (B.get(1).getSerbest_atis () >ABI.get(1).getSerbest_atis () )  && dizi4[5]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[5]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow1==2 && (B.get(1).getSerbest_atis () ==ABI.get(1).getSerbest_atis ()  )  && dizi4[5]==0){

                dizi4[5]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
















        }





        //ucuncu basketbolcu
        if (B.get (2).isKartKullanildiMi ()==true && B.get (2).getZaaa ()==1  ) {
            image (B.get (2).getResim (), 200, 200, 300, 300);
            image (ABI.get (2).getResim (),700,200,300,300);
            if (meow2==0){
                benim = B.get (2).sporcuPuaniGoster (0);
                senin = ABI.get (2).sporcuPuaniGoster (0);
            }
            else if (meow2 ==1)
            {
                benim = B.get (2).sporcuPuaniGoster (1);
                senin = ABI.get (2).sporcuPuaniGoster (1);
            }
            else {
                benim = B.get (2).sporcuPuaniGoster (2);
                senin = ABI.get (2).sporcuPuaniGoster (2);
            }
            if (meow2==0 && (B.get (2).getIkilik () <ABI.get (2).getIkilik () )  && dizi4[6]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi4[6]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow2==0 && (B.get (2).getIkilik () >ABI.get (2).getIkilik () )  && dizi4[6]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[6]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow2==0 && (B.get (2).getIkilik () ==ABI.get (2).getIkilik () )  && dizi4[6]==0){
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi4[6]=1;

            }

            //ucluk
            if (meow2==1 && (B.get(2).getUcluk () <ABI.get(2).getUcluk () )  && dizi4[7]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi4[7]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);

            }
            if (meow2==1 && (B.get(2).getUcluk () >ABI.get(2).getUcluk () )  && dizi4[7]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[7]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow2==1 && (B.get(2).getUcluk () ==ABI.get(2).getUcluk () )  && dizi4[7]==0){

                dizi4[7]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }


            //serbest atis
            if (meow2==2 && (B.get(2).getSerbest_atis () <ABI.get(2).getSerbest_atis () ) && dizi4[8]==0){
                y.setSkor ( 10+y.getSkor ()  );
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi4[8]=1;

            }
            if (meow2==2 && (B.get(2).getSerbest_atis () >ABI.get(2).getSerbest_atis () ) && dizi4[8]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[8]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow2==2 && (B.get(2).getSerbest_atis () ==ABI.get(2).getSerbest_atis () ) && dizi4[8]==0){

                dizi4[8]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }




        }



//futbolcu kart


        if (B.get (3).isKartKullanildiMi ()==true && B.get (3).getZaaa ()==1) {
            image (B.get (3).getResim (), 200, 200, 300, 300);
            image (ABI.get (3).getResim (),700,200,300,300);
            if (meow3==0){

                benim = B.get (3).sporcuPuaniGoster (0);
                senin = ABI.get (3).sporcuPuaniGoster (0);
            }
            else if (meow3 ==1) {
                benim = B.get (3).sporcuPuaniGoster (1);
                senin = ABI.get (3).sporcuPuaniGoster (1);
            }
            else
            {
                benim = B.get (3).sporcuPuaniGoster (2);
                senin = ABI.get (3).sporcuPuaniGoster (2);
            }
            //Ikilik
            if (meow3==0 && (B.get (3).getIkilik () <ABI.get (3).getIkilik ()  ) && dizi4[9]==0){
                y.setSkor ( 10+y.getSkor ()  );
                dizi4[9]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow3==0 && (B.get (3).getIkilik () >ABI.get (3).getIkilik () ) && dizi4[9]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[9]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow3==0 && (B.get (3).getIkilik () ==ABI.get (3).getIkilik () ) && dizi4[9]==0){

                dizi4[9]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }

            //ucluk
            if (meow3==1 && (B.get(3).getUcluk () <ABI.get(3).getUcluk () ) && dizi4[10]==0){
                y.setSkor ( 10+y.getSkor ()  );
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi4[10]=1;

            }
            if (meow3==1 && (B.get(3).getUcluk () >ABI.get(3).getUcluk () ) && dizi4[10]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[10]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (meow3==1 && (B.get(3).getUcluk () ==ABI.get(3).getUcluk () ) && dizi4[10]==0){

                dizi4[10]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }


            //serbest atis
            if (meow3==2 && (B.get(3).getSerbest_atis () <ABI.get(3).getSerbest_atis () ) && dizi4[11]==0){
                y.setSkor ( 10+y.getSkor ()  );
                oyuncu.setSıra(oyuncu.getSıra()+1);
                dizi4[11]=1;

            }
            if (meow3==2 && (B.get(3).getSerbest_atis () >ABI.get(3).getSerbest_atis () )  && dizi4[11]==0){
                x.setSkor ( 10+x.getSkor ());
                dizi4[11]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }

            if (meow3==2 && (B.get(3).getSerbest_atis () ==ABI.get(3).getSerbest_atis () )  && dizi4[11]==0){

                dizi4[11]=1;
                oyuncu.setSıra(oyuncu.getSıra()+1);
            }
            if (oyuncu.getSıra () >= 8) {
                fill(0);
                rect (1100, 500, 200, 100);
                fill(255);
                text("OYUNU BİTİR",1110,550);
                if (mousePressed==true && mouseX>1100 && mouseX<1300 && mouseY >500 && mouseY<600)
                    aga=1;

            }


        }
        fill (255, 0, 150, 255);
        text (benim,240,530);
        text (senin,740,530);
        text(oyuncu.getOyuncuad(),40,550);
        text(x.getSkor(),100,600);
        text("Bilgisayar:",1225,150);
        text(y.getSkor(),1275,180);
        text(mouseX+" "+mouseY,1200,300);
        text(oyuncu.getSıra(),1200,700);
        if(oyuncu.getSıra()%2==0 && oyuncu.getSıra()!=8)
        cursor(imlecf,20,20);

        if(oyuncu.getSıra()%2!=0 && oyuncu.getSıra()!=8)
        cursor(imlecb,20,20);

        if(oyuncu.getSıra()==8)
            cursor(HAND);
        if(oyuncu.getSıra()==8 && x.getSkor()>y.getSkor()&& aga==1){

            background (0,255,0,0);
            textSize(32);
            fill(0);
            text("KAZANDİNİZ!!",580,380);
            rect (580, 410, 200, 100);
            fill(255);
            text("OYUNDAN ÇIK",580,470);
            if(mousePressed==true && mouseX>580 && mouseX<780 && mouseY>410 && mouseY<510)
                exit();


        }
        if(oyuncu.getSıra()==8 && x.getSkor()<y.getSkor()&& aga==1)
        {
              background (255,0,0,0);
              textSize(32);
              fill(0);
              text("KAYBETTİNİZ!!",580,380);
              rect (580, 410, 200, 100);
                fill(255);
                text("OYUNDAN ÇIK",580,470);
            if(mousePressed==true && mouseX>580 && mouseX<780 && mouseY>410 && mouseY<510)
                exit();


        }
        if(oyuncu.getSıra()==8 && x.getSkor()==y.getSkor()&& aga==1){

            background (0,0,255,0);
            textSize(32);
            fill(0);
            text("BERABERE!",600,380);
            rect (580, 410, 200, 100);
            fill(255);
            text("OYUNDAN ÇIK",580,470);
            if(mousePressed==true && mouseX>580 && mouseX<780 && mouseY>410 && mouseY<510)
                exit();

        }
        if (oyuncu.getSıra () == -1) {
            text (oyuncu.getOyuncuad (), 700, 450);


            image (arkaplan, 0, 0, 1365, 767);

            rect (470, 450, 400, 75);
            fill (0,0,250);
            text ("Adınızı girin: ", 500, 500);
            text ("ID nizi girin: ", 500, 800);
            fill(0);
            text (oyuncu.getOyuncuad (), 660, 500);

            if (keyPressed == true) {

                if (key == ENTER)
                    oyuncu.setSıra (oyuncu.getSıra ()+1);

                 else{
                     fill(0);
                    oyuncu.setOyuncuad (oyuncu.getOyuncuad () + key);
                    text (oyuncu.getOyuncuad (), 660, 500);
                    sayac++;
                }


                System.out.println(sayac);
            }


        }
    }


}



