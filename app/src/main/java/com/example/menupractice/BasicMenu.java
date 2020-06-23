package com.example.menupractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class BasicMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_lists,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(BasicMenu.this,"This is item 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(BasicMenu.this,"This is item 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(BasicMenu.this,"This is item 3",Toast.LENGTH_SHORT).show();
                break;
            default:
                return false;
        }
        return super.onOptionsItemSelected(item);
    }
}