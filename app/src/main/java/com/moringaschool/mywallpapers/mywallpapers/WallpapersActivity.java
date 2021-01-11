package com.moringaschool.mywallpapers.mywallpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class WallpapersActivity extends AppCompatActivity {

    private ListView mWallpaperList;
    private String[] wallpapers = new String[] {"Rick & Morty", "Mercedes Benz",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpapers);
        mWallpaperList = (ListView) findViewById(R.id.listView);

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), R.layout.wallpaper_list, R.id.listView, wallpapers);
        mWallpaperList.setAdapter(arrayAdapter);

        mWallpaperList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String wallpaper = ((TextView)view).getText().toString();
                Toast.makeText(getApplicationContext(), wallpaper, Toast.LENGTH_LONG).show();
            }
        });
//        Intent intent = getIntent();
//        String wallpaperName = intent.getStringExtra("Wallpaper name");
    }
}