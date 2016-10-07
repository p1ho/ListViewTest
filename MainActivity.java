package com.example.student.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> cities_list;
    ArrayList<Map<String, String>> fruit_list;
    String[] cities = {"New York", "Seattle", "Los Angeles","San Francisco"};
    String[] fruits = {"Apple", "Banana", "Papaya", "Guava"};
    String[] fruits_code = {"1","2","3","4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        cities_list = new ArrayList();
        for (int i = 0; i < cities.length; i++){
            cities_list.add(cities[i]);
        }
        fruit_list = new ArrayList<Map<String, String>>();
        Map<String, String> temp = new HashMap<String, String>();
        for (int i = 0; i < fruits.length; i++){
            temp.put("Code", fruits_code[i]);
            temp.put("Fruits", fruits[i]);
            fruit_list.add(temp);
        }
        SimpleAdapter adapter = new SimpleAdapter(
                MainActivity.this,
                fruit_list,
                android.R.layout.simple_list_item_2,
                new String[] {"Code", "Fruits"},
                new int[] {android.R.id.text1, android.R.id.text2}
        );
        listView.setAdapter(adapter);

    }

}
