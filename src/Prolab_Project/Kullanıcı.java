package Prolab_Project;
import java.util.ArrayList;

public class Kullanıcı extends Oyuncu{
    private String x;
    private int skor;

    @Override
    public int getSkor() {
        return skor;
    }

    @Override
    public void setSkor(int skor) {
        this.skor = skor;
    }


    @Override
    public void Kartseç(int mouseX, int mouseY, ArrayList<Basketbolcu> B, ArrayList<Futbolcu> F, int j) {
        if ( mouseX > 145 && mouseX < 270 && mouseY > 590 && mouseY < 765   && j%2==0 && F.get (0).getKartKullanildiMi ()==false){
            F.get (0).setKartKullanildiMi (true);
            F.get (0).setZaaa (1);
            F.get (1).setZaaa (0);
            F.get (2).setZaaa (0);
            F.get (3).setZaaa (0);
            B.get (0).setZaaa (0);
            B.get (1).setZaaa (0);
            B.get (2).setZaaa (0);
            B.get (3).setZaaa (0);

        }

        if (mouseX > 415&& mouseX < 540 && mouseY > 590 && mouseY < 765   && j%2==0){
            F.get (1).setKartKullanildiMi (true);
            F.get (1).setZaaa (1);
            F.get (0).setZaaa (0);
            F.get (2).setZaaa (0);
            F.get (3).setZaaa (0);
            B.get (0).setZaaa (0);
            B.get (1).setZaaa (0);
            B.get (2).setZaaa (0);
            B.get (3).setZaaa (0);
        }

        if (mouseX > 685 && mouseX < 810 && mouseY > 590 && mouseY < 765   && j%2==0){
            F.get (2).setKartKullanildiMi (true);
            F.get (2).setZaaa (1);
            F.get (1).setZaaa (0);
            F.get (0).setZaaa (0);
            F.get (3).setZaaa (0);
            B.get (0).setZaaa (0);
            B.get (1).setZaaa (0);
            B.get (2).setZaaa (0);
            B.get (3).setZaaa (0);
        }

        if (mouseX > 955 && mouseX < 1080 && mouseY > 590 && mouseY < 765   && j%2==0){
            F.get (3).setKartKullanildiMi (true);
            F.get (3).setZaaa (1);
            F.get (2).setZaaa (0);
            F.get (1).setZaaa (0);
            F.get (0).setZaaa (0);
            B.get (0).setZaaa (0);
            B.get (1).setZaaa (0);
            B.get (2).setZaaa (0);
            B.get (3).setZaaa (0);
        }
        // BASKET

        if (mouseX > 280 && mouseX <405  && mouseY > 590 && mouseY < 765   && j%2==1){
            B.get (0).setKartKullanildiMi (true);
            B.get (3).setZaaa (0);
            B.get (2).setZaaa (0);
            B.get (1).setZaaa (0);
            B.get (0).setZaaa (1);
            F.get (0).setZaaa (0);
            F.get (1).setZaaa (0);
            F.get (2).setZaaa (0);
            F.get (3).setZaaa (0);
        }

        if (mouseX >    550 && mouseX < 675 && mouseY > 590 && mouseY < 765  && j%2==1){
            B.get (1).setKartKullanildiMi (true);
            B.get (3).setZaaa (0);
            B.get (2).setZaaa (0);
            B.get (1).setZaaa (1);
            B.get (0).setZaaa (0);
            F.get (0).setZaaa (0);
            F.get (1).setZaaa (0);
            F.get (2).setZaaa (0);
            F.get (3).setZaaa (0);


        }

        if (mouseX > 820 && mouseX < 945 && mouseY > 590 && mouseY < 765   && j%2==1){
            B.get (2).setKartKullanildiMi (true);
            B.get (3).setZaaa (0);
            B.get (2).setZaaa (1);
            B.get (1).setZaaa (0);
            B.get (0).setZaaa (0);
            F.get (0).setZaaa (0);
            F.get (1).setZaaa (0);
            F.get (2).setZaaa (0);
            F.get (3).setZaaa (0);
        }

        if (mouseX > 1090 && mouseX < 1215 && mouseY > 590 && mouseY < 765  && j%2==1){
            B.get (3).setKartKullanildiMi (true);
            B.get (3).setZaaa (1);
            B.get (2).setZaaa (0);
            B.get (1).setZaaa (0);
            B.get (0).setZaaa (0);
            F.get (0).setZaaa (0);
            F.get (1).setZaaa (0);
            F.get (2).setZaaa (0);
            F.get (3).setZaaa (0);

        }

    }
}

