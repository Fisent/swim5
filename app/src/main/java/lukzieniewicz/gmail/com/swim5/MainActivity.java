package lukzieniewicz.gmail.com.swim5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    public static String[] categories = new String[]{"ogólne", "temat1", "temat2"};
    public static List<Word> base = new LinkedList<>();
    public static List<WordPast> basePast = new LinkedList<>();

    public static boolean past = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Info");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Info");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Dodaj Słowo");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Dodaj Słowo");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Lista Słów");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Lista Słów");
        host.addTab(spec);

        //Tab 4
        spec = host.newTabSpec("Lista Odmian");
        spec.setContent(R.id.tab4);
        spec.setIndicator("Lista Odmian");
        host.addTab(spec);

        base.add(new Word("chair", "krzesło", categories[0], true));
        base.add(new Word("table", "stół", categories[1], false));

        basePast.add(new WordPast("think", "thought", true));
        basePast.add(new WordPast("fight", "fought", false));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }


}
