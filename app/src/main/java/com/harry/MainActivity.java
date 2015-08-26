package com.harry;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends Activity {
    ArrayList<PersonComparable> persons;
    ListView list;
    ArrayAdapter<PersonComparable> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);

    }

    public void click(View view) {
        persons = new ArrayList<PersonComparable>();

        persons.add(new PersonComparable("zenry","jersey city",30));
        persons.add(new PersonComparable("richard","edison",31));
        persons.add(new PersonComparable("john","newport",32));
        persons.add(new PersonComparable("sam","hoboken",28));
        persons.add(new PersonComparable("richard","newyork",29));
        persons.add(new PersonComparable("richard","brooklyn",29));
        Collections.sort(persons); //with comparable
//        Collections.sort(persons,PersonComparatorInside.comparatorInside);//with comparator inside
//        Collections.sort(persons,new PersonComparatorOutside());//with comparator outside


        adapter = new MyArrayAdapter(this, persons);
//        adapter = new ArrayAdapter<Person>(this, android.R.layout.simple_list_item_1, persons);
        list.setAdapter(adapter);

    }

}
