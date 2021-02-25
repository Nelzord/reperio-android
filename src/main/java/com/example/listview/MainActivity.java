package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.SearchView;


public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    String[] nameList = {"Chicken Alfredo: Italian | High Protein | Chicken",
                            "Shrimp Scampi: Italian | High Protein | Shrimp",
                            "Tofu Spring Rolls: Vietnamese | Vegetarian | Tofu"};

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_item);
        searchView = findViewById(R.id.search_bar);



        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,nameList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), Activity_Apple.class);
                    startActivity(intent);
                }
                Toast.makeText(MainActivity.this, "You Click -"+adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });





        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                MainActivity.this.arrayAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                MainActivity.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });


    }




}