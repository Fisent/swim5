package lukzieniewicz.gmail.com.swim5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment2 extends Fragment {


    public ListFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        FrameLayout fl  = (FrameLayout)inflater.inflate(R.layout.fragment_list_fragment2, container, false) ;

        ListView lv = (ListView) fl.findViewById(R.id.list2);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast t = Toast.makeText(getContext(), MainActivity.basePast.get(position).toShortString(), Toast.LENGTH_SHORT);
                t.show();
            }
        });
        lv.setAdapter(new ArrayAdapter<WordPast>(fl.getContext(), android.R.layout.simple_list_item_1, MainActivity.basePast));

        return fl;
    }

}
