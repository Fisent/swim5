package lukzieniewicz.gmail.com.swim5;

/**
 * Created by Fisent on 08.05.2017.
 */

public class Word {
    private String eng;
    private String pol;
    private String category;
    private Boolean known;

    public Word(String eng, String pol, String category, Boolean known) {
        this.eng = eng;
        this.pol = pol;
        this.known = known;
        this.category = category;
    }

    @Override
    public String toString(){
        return eng;
    }

    public String toShortString(){
        return eng + " - " + pol + "  <Znane: " + known + ", Kategoria: " + category + ">";
    }
}
