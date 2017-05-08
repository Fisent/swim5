package lukzieniewicz.gmail.com.swim5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TabHost;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChooseTypeAddedFragment extends Fragment {

    View rootView;


    public ChooseTypeAddedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_choose_type_added, container, false);


        TabHost host = (TabHost)rootView.findViewById(R.id.tabHost2);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Słówka");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Słówka");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Odmiany");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Odmiany");
        host.addTab(spec);


        return rootView;
    }

}
