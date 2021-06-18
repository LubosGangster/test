package sk.biblia;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BibleVerses {
    private List<String> verses = null;

    public BibleVerses(){
        this.verses = Arrays.asList("Tí však, čo dúfajú v Pána,\n" +
                "dostávajú novú silu,\n" +
                "získavajú krídla ako orly,\n" +
                "utekať budú a neustanú,\n" +
                "budú putovať a neomdlejú.",

                "Keď budeš brodiť vodami,\n" +
                "budem s tebou,\n" +
                "a keď riekami, nepotopia ťa,\n" +
                "keď pôjdeš cez oheň, nepopáliš sa\n" +
                "a plameň nebude horieť na tebe.");
    }

    public String getVers(){
        Random random = new Random();
        int i = random.nextInt(verses.size());
        return this.verses.get(i);
    }
}
