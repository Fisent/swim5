package lukzieniewicz.gmail.com.swim5;

/**
 * Created by Fisent on 08.05.2017.
 */

public class WordPast {

    private String eng;
    private String past;
    private Boolean known;

    public WordPast(String eng, String past, Boolean known) {
        this.eng = eng;
        this.past = past;
        this.known = known;
    }

    @Override
    public String toString(){
        return eng;
    }

    public String toShortString(){
        return eng + " - " + past + "  <Znane: " + known + ">";
    }
}
