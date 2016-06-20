package com.example.mobileappdevelop.samplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView sampleListView;
    ArrayList<String>name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleListView = (ListView) findViewById(R.id.sampleListView);
        name = new ArrayList<>();

        name.add("Abdul");
        name.add("Babul");
        name.add("Choudhury");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,name);
        sampleListView.setAdapter(arrayAdapter);

    }
}
