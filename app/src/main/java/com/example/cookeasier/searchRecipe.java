package com.example.cookeasier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class searchRecipe extends AppCompatActivity {
    ListView listView;
    ArrayList<String> stringArrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_search_recipe));



        listView= findViewById(R.id.list_view);
        stringArrayList.add("Breakfast Hash");
        stringArrayList.add("Pancakes");
        stringArrayList.add("Caprese Salad");
        stringArrayList.add("Rigatoni");


        adapter = new ArrayAdapter<>(searchRecipe.this, android.R.layout.simple_list_item_1, stringArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    startActivity(new Intent(searchRecipe.this, breakfastHash.class));
                }else if(position==1) {
                    startActivity(new Intent(searchRecipe.this, pancakes.class));
                }else if(position==2) {
                    startActivity(new Intent(searchRecipe.this, caprese.class));
                }else if(position==3) {
                    startActivity(new Intent(searchRecipe.this, rigatoni.class));
                }

            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_search, menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}