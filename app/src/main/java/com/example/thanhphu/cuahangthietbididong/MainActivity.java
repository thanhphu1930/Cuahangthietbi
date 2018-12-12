package com.example.thanhphu.cuahangthietbididong;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerViewmanhinhchinh;
    NavigationView navigationView;
    ListView  listViewmanghinhchinh;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
    }
    private void Anhxa(){
        toolbar  = (Toolbar)findViewById(R.id.toolbarmanhinhchinh);
        viewFlipper =  (ViewFlipper)findViewById(R.id.viewlipper);
        recyclerViewmanhinhchinh = (RecyclerView)findViewById(R.id.recyclerview);
        navigationView =  (NavigationView) findViewById(R.id.navigationview);
        listViewmanghinhchinh =  (ListView) findViewById(R.id.listviewmanhinhchinh);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);

    }
}
