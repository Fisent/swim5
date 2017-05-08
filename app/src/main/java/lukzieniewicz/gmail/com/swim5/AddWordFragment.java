package lukzieniewicz.gmail.com.swim5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddWordFragment extends Fragment {

    private View rootView;


    public AddWordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_add_word, container, false);

        Spinner s = (Spinner) rootView.findViewById(R.id.spinner);
        s.setAdapter(new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_spinner_item, MainActivity.categories));

        Button b = (Button) rootView.findViewById(R.id.addButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddButonClick();
            }
        });

        return rootView;
    }

    public void onAddButonClick(){

        EditText eng = ((EditText) rootView.findViewById(R.id.editEng));
        EditText pol = ((EditText)rootView.findViewById(R.id.editPast));
        Spinner spinner = ((Spinner)rootView.findViewById(R.id.spinner));
        Switch s = ((Switch)rootView.findViewById(R.id.switch1));

        Word newWord = new Word( eng.getText().toString(), pol.getText().toString(), MainActivity.categories[spinner.getSelectedItemPosition()], s.isChecked()  );
        MainActivity.base.add(newWord);

        eng.setText("");
        pol.setText("");
        s.setChecked(false);

        Toast.makeText(rootView.getContext(), "Dodano", Toast.LENGTH_SHORT).show();
    }

}
