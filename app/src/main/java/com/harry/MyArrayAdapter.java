package com.harry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by hsingh on 8/26/15.
 */
public class MyArrayAdapter extends ArrayAdapter<PersonComparable> {
    Context context;
    ArrayList<PersonComparable> list;
    public MyArrayAdapter(Context context, ArrayList<PersonComparable> list) {
        super(context, android.R.layout.simple_list_item_1,list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);

        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        textView.setText(list.get(position).getName()+"   **   "+list.get(position).getCity()+"   **   "+list.get(position).getAge());
        return view;
    }
}
