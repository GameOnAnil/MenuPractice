package com.example.menupractice;

import android.R.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

      BottomNavigationView bottomNavigationView = findViewById(R.id.b_nav);
      bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              switch (item.getItemId()){
                  case R.id.item1:
                      Toast.makeText(BottomNavigation.this,"This is item 1",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.item2:
                      Toast.makeText(BottomNavigation.this,"This is item 2",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.item3:
                      Toast.makeText(BottomNavigation.this,"This is item 3",Toast.LENGTH_SHORT).show();
                      break;
                  default:
                      return false;}
              return false;
          }
      });


      }


}