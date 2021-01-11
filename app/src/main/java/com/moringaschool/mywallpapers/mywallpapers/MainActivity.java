package com.moringaschool.mywallpapers.mywallpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private Button findWallpapersButton;
   private EditText wallpaperNameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findWallpapersButton = findViewById(R.id.findWallpapersButton);
        wallpaperNameEditText = findViewById(R.id.wallpaperTopicEditText);

        findWallpapersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wallpaperName = wallpaperNameEditText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), WallpapersActivity.class);
                intent.putExtra("Wallpaper name", wallpaperName);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Fetching Wallpapers", Toast.LENGTH_SHORT).show();
            }
        });

    }
}