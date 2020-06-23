package com.example.menupractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b_basic, b_Context, b_pop, b_drawer, b_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_basic = (Button) findViewById(R.id.btn_basic);
        b_Context = (Button) findViewById(R.id.btn_Context);
        b_pop = (Button) findViewById(R.id.btn_PopUP);
        b_drawer = (Button) findViewById(R.id.btn_drawerNav);
        b_bottom = (Button) findViewById(R.id.btn_bottom);

        b_basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BasicMenu.class);
                startActivity(intent);

            }
        });
        b_Context.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.menupractice.ContextMenu.class);
                startActivity(intent);

            }
        });
        b_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PopUpMenu.class);
                startActivity(intent);
            }
        });
        b_drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.menupractice.DrawerNavigation.class);
                startActivity(intent);
            }
        });
        b_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,com.example.menupractice.BottomNavigation.class);
                startActivity(intent);
            }
        });
    }
}