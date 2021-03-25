package Prolab_Project;
import jdk.nashorn.internal.objects.ArrayBufferView;

import javax.management.relation.RelationNotFoundException;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar extends Oyuncu{
    @Override
    public int getSkor() {
        return skor;
    }

    @Override
    public void setSkor(int skor) {
        this.skor = skor;
    }

    private int skor=0;
    private int xx=0;

    @Override
    public void Kartseç(int mousex, int mousey, ArrayList<Basketbolcu> ABI, ArrayList<Futbolcu> KARDES, int j) {
        if (j % 2 == 0 && KARDES.get (0).getKartKullanildiMi () == false  && xx==0 ) {
            KARDES.get (0).setKartKullanildiMi (true);
            KARDES.get (0).setZaaa (1);
            KARDES.get (1).setZaaa (0);
            KARDES.get (2).setZaaa (0);
            KARDES.get (3).setZaaa (0);
            ABI.get (0).setZaaa (0);
            ABI.get (1).setZaaa (0);
            ABI.get (2).setZaaa (0);
            ABI.get (3).setZaaa (0);
            xx++;
        }
        if (j % 2 == 0   && KARDES.get (1).getKartKullanildiMi () == false && xx==2  ) {
            KARDES.get (1).setKartKullanildiMi (true);
            KARDES.get (1).setZaaa (1);
            KARDES.get (0).setZaaa (0);
            KARDES.get (2).setZaaa (0);
            KARDES.get (3).setZaaa (0);
            ABI.get (0).setZaaa (0);
            ABI.get (1).setZaaa (0);
            ABI.get (2).setZaaa (0);
            ABI.get (3).setZaaa (0);
            xx++;
        }

        if (j % 2 == 0  && KARDES.get (2).getKartKullanildiMi () == false   && xx==4) {
            KARDES.get (2).setKartKullanildiMi (true);
            KARDES.get (2).setZaaa (1);
            KARDES.get (1).setZaaa (0);
            KARDES.get (0).setZaaa (0);
            KARDES.get (3).setZaaa (0);
            ABI.get (0).setZaaa (0);
            ABI.get (1).setZaaa (0);
            ABI.get (2).setZaaa (0);
            ABI.get (3).setZaaa (0);
            xx++;
        }

        if (  j % 2 == 0  && KARDES.get (3).getKartKullanildiMi () == false && xx==6 ) {
            KARDES.get (3).setKartKullanildiMi (true);
            KARDES.get (3).setZaaa (1);
            KARDES.get (2).setZaaa (0);
            KARDES.get (1).setZaaa (0);
            KARDES.get (0).setZaaa (0);
            ABI.get (0).setZaaa (0);
            ABI.get (1).setZaaa (0);
            ABI.get (2).setZaaa (0);
            ABI.get (3).setZaaa (0);
            xx++;
        }
        // BASKET
        if (ABI.get (0).isKartKullanildiMi() == false && j % 2 == 1 && xx==1) {
            ABI.get (0).setKartKullanildiMi (true);
            ABI.get (3).setZaaa (0);
            ABI.get (2).setZaaa (0);
            ABI.get (1).setZaaa (0);
            ABI.get (0).setZaaa (1);
            KARDES.get (0).setZaaa (0);
            KARDES.get (1).setZaaa (0);
            KARDES.get (2).setZaaa (0);
            KARDES.get (3).setZaaa (0);
            xx++;
        }
        if (ABI.get (1).isKartKullanildiMi() == false && j % 2 == 1 && xx==3) {
            ABI.get (1).setKartKullanildiMi (true);
            ABI.get (3).setZaaa (0);
            ABI.get (2).setZaaa (0);
            ABI.get (1).setZaaa (1);
            ABI.get (0).setZaaa (0);
            KARDES.get (0).setZaaa (0);
            KARDES.get (1).setZaaa (0);
            KARDES.get (2).setZaaa (0);
            KARDES.get (3).setZaaa (0);

            xx++;
        }
        if (ABI.get (2).isKartKullanildiMi() == false && j % 2 == 1 && xx==5) {
            ABI.get (2).setKartKullanildiMi (true);
            ABI.get (3).setZaaa (0);
            ABI.get (2).setZaaa (1);
            ABI.get (1).setZaaa (0);
            ABI.get (0).setZaaa (0);
            KARDES.get (0).setZaaa (0);
            KARDES.get (1).setZaaa (0);
            KARDES.get (2).setZaaa (0);
            KARDES.get (3).setZaaa (0);
            xx++;
        }

        if (ABI.get (3).isKartKullanildiMi() == false && j % 2 == 1 && xx==5) {
            ABI.get (0).setKartKullanildiMi (true);
            ABI.get (3).setZaaa (1);
            ABI.get (2).setZaaa (0);
            ABI.get (1).setZaaa (0);
            ABI.get (0).setZaaa (0);
            KARDES.get (0).setZaaa (0);
            KARDES.get (1).setZaaa (0);
            KARDES.get (2).setZaaa (0);
            KARDES.get (3).setZaaa (0);
            xx++;
        }
    }
}