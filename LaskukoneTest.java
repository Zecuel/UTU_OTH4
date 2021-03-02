import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LaskukoneTest {

    @Test
    void LaskukoneTest() {

        Laskukone laskukone = new Laskukone();
        assertEquals(0, laskukone.tulos);

    }

    @Test
    void lisaaLukuTest() {

        int luku = 10;

        // Annetaan laskurille alkuarvo 20
        Laskukone laskukone = new Laskukone();
        int before = 20;
        laskukone.tulos = before;

        laskukone.lisaaLuku(luku);
        assertEquals(before + luku, laskukone.tulos);

    }

    @Test
    void vahennaLukuTest() {

        int luku = 10;

        // Annetaan laskurille alkuarvo 20
        Laskukone laskukone = new Laskukone();
        int before = 20;
        laskukone.tulos = before;

        laskukone.vahennaLuku(luku);
        assertEquals(before - luku, laskukone.tulos);

    }

    @Test
    void kerroLuvullaTest() {

        int luku = 10;

        // Annetaan laskurille alkuarvo 20
        Laskukone laskukone = new Laskukone();
        int before = 20;
        laskukone.tulos =  before;

        laskukone.kerroLuvulla(luku);
        assertEquals(before * luku, laskukone.tulos);

    }

    @Test
    void korotaPotenssiinTest() {

        int luku = 2;

        // Annetaan laskurille alkuarvo 20
        Laskukone laskukone = new Laskukone();
        int before = 20;
        laskukone.tulos =  before;

        laskukone.korotaPotenssiin(luku);
        assertEquals(Math.pow(before, luku), laskukone.tulos);

    }

    @Test
    void annaTulosTest() {

        // Annetaan laskurille alkuarvo 20
        Laskukone laskukone = new Laskukone();
        int before = 20;
        laskukone.tulos =  before;

        assertEquals(20, laskukone.annaTulos());

    }

    @Test
    void nollaaTest() {

        // Annetaan laskurille alkuarvo 20
        Laskukone laskukone = new Laskukone();
        int before = 20;
        laskukone.tulos =  before;

        laskukone.nollaa();

        assertEquals(0,  laskukone.tulos);

    }

}
