package com.example.mobilelab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDef#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDef extends Fragment {
    TextView tvConcept,tvDefinition;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentDef.
     */
    // TODO: Rename and change types and number of parameters

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //
        View view = inflater.inflate(R.layout.fragment_def, container, false);
        tvConcept= (TextView) view.findViewById(R.id.concepts);
        tvDefinition= (TextView)view.findViewById(R.id.definition);

        return view;

    }

    public void display(String concept, String definition){
        tvConcept.setText(concept);
        tvDefinition.setText(definition);

    }
}