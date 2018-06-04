package com.example.android.p5_final;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Restaurants extends Fragment {


    public Restaurants() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View res = inflater.inflate(R.layout.fragment_restaurants, container, false);
        AddListView(container.getContext(), res);
        return res;
    }

    public void AddListView(Context context, View view) {

        ArrayList<Resources> res_list = new ArrayList<>();
        for (int i = 0; i < MainActivity.resourcesClassArray.size(); i++) {
            if (MainActivity.resourcesClassArray.get(i).getResourceType().equals(getString(R.string.restaurants))) {
                res_list.add(MainActivity.resourcesClassArray.get(i));
            }
        }
        ListViewAdapter adapter = new ListViewAdapter(context, res_list);

        ListView listView = view.findViewById(R.id.ResourceListview);

        listView.setAdapter(adapter);


    }

}
