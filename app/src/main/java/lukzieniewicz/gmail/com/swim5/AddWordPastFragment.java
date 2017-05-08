package lukzieniewicz.gmail.com.swim5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddWordPastFragment extends Fragment {

    private View rootView;

    public AddWordPastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_add_word_past, container, false);

        Button b = (Button) rootView.findViewById(R.id.addButton2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddButonClick();
            }
        });

        return rootView;
    }


    public void onAddButonClick(){

        EditText org = (EditText) rootView.findViewById(R.id.editEng);
        EditText past = (EditText) rootView.findViewById(R.id.editPast);
        Switch s = (Switch) rootView.findViewById(R.id.switchPast);

        WordPast wp = new WordPast(org.getText().toString(), past.getText().toString(), s.isChecked());

        org.setText("");
        past.setText("");
        s.setChecked(false);

        Toast.makeText(rootView.getContext(), "Dodano", Toast.LENGTH_SHORT).show();
    }

}
