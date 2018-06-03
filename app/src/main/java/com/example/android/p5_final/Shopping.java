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
public class Shopping extends Fragment {


    public Shopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View shop = inflater.inflate(R.layout.fragment_shopping, container, false);
        AddListView(container.getContext(), shop);
        return shop;
    }

    public void AddListView(Context context, View view) {

        ArrayList<Resources> shop_list = new ArrayList<>();

        for (int i = 0; i < MainActivity.resourcesClassArray.size(); i++) {
            if (MainActivity.resourcesClassArray.get(i).getResourceType().equals("Shopping")) {
                shop_list.add(MainActivity.resourcesClassArray.get(i));
            }
        }
        ListViewAdapter adapter = new ListViewAdapter(context, shop_list);

        ListView listView = view.findViewById(R.id.ResourceListview);

        listView.setAdapter(adapter);

    }

}
