package com.example.android.p5_final;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Entertainment extends Fragment {


    public Entertainment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ent =  inflater.inflate(R.layout.fragment_entertainment, container, false);
        AddListView(container.getContext(), ent);
        return ent;
    }


    public void AddListView(Context context, View view) {

        ArrayList<Resources> ent_list = new ArrayList<>();

        for (int i = 0; i < MainActivity.resourcesClassArray.size(); i++) {
            if (MainActivity.resourcesClassArray.get(i).getResourceType().equals("Entertainment")) {
                ent_list.add(MainActivity.resourcesClassArray.get(i));
            }
        }
        ListViewAdapter adapter = new ListViewAdapter(context, ent_list);

        ListView listView = view.findViewById(R.id.ResourceListview);

        listView.setAdapter(adapter);


    }

}
