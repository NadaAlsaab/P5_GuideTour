package com.example.android.p5_final;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    Context Context;
    ArrayList<Resources> resourcesList;

    public ListViewAdapter(Context c, ArrayList<Resources> AttractionList) {
        Context = c;
        this.resourcesList = AttractionList;
    }

    @Override
    public int getCount() {
        return resourcesList.size();
    }

    @Override
    public Object getItem(int position) {
        return resourcesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(Context).inflate(R.layout.list_item, parent, false);
        }

        TextView name = view.findViewById(R.id.name);
        TextView type = view.findViewById(R.id.type);

        Resources currentR = (Resources) getItem(position);

        name.setText(currentR.getName());
        type.setText(currentR.getResourceType());


        ImageView imageView = view.findViewById(R.id.pic);
        if (currentR.hasImage()) {
            imageView.setImageResource(currentR.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return view;
    }
}
