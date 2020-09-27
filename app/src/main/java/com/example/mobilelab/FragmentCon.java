package com.example.mobilelab;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCon#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCon extends ListFragment {

    String[] concepts = new String[]
            {

                    "AIActivity",
                    "VRActivity",
            };

    String[] definition = new String[]
            {       "AIActivity",
                    "VRActivity",
            };



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCon.
     */
    // TODO: Rename and change types and number of parameters


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view =inflater.inflate(R.layout.fragment_con, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, concepts);
        setListAdapter(adapter);
        return view;


    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        FragmentDef fragment = (FragmentDef) getFragmentManager().findFragmentById(R.id.def_fragment);
        fragment.display(concepts[position],""+definition[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}