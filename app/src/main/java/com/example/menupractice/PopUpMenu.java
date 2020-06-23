package com.example.menupractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopUpMenu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(PopUpMenu.this,view);
                popupMenu.inflate(R.menu.menu_lists);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(PopUpMenu.this);

            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.item1:
                Toast.makeText(PopUpMenu.this,"This is item 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(PopUpMenu.this,"This is item 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(PopUpMenu.this,"This is item 3",Toast.LENGTH_SHORT).show();
                break;
            default:
                return false;
        }
        return false;
    }
}