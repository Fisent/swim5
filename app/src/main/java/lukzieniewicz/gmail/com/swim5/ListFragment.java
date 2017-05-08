package lukzieniewicz.gmail.com.swim5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        FrameLayout fl  = (FrameLayout)inflater.inflate(R.layout.fragment_list, container, false) ;

        ListView lv = (ListView) fl.findViewById(R.id.list);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast t = Toast.makeText(getContext(), MainActivity.base.get(position).toShortString(), Toast.LENGTH_SHORT);
                t.show();
            }
        });
        lv.setAdapter(new ArrayAdapter<Word>(fl.getContext(), android.R.layout.simple_list_item_1, MainActivity.base));

        return fl;
    }



}
