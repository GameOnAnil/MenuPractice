package com.example.menupractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ContextMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        TextView textView = (TextView) findViewById(R.id.ContextText);
        registerForContextMenu(textView);


    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_lists,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(ContextMenu.this,"This is item 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(ContextMenu.this,"This is item 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(ContextMenu.this,"This is item 3",Toast.LENGTH_SHORT).show();
                break;
            default:
                return false;
        }
        return super.onContextItemSelected(item);
    }
}