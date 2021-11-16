package com.example.innpets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Inicio extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //referencia al toolbar
        androidx.appcompat.widget.Toolbar tb = findViewById(R.id.toolbar);
        //Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);



        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            //codificar cosas a ejecutar caundo le das tap a una tab
                int position = tab.getPosition();
                switch (position){
                    case 0:
                        //llamar al fragmento  principal
                        Chat c = new Chat();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,c).commit();

                        break;
                    case 1:
                        //llamar al fragmento chat
                        Principal p = new Principal();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,p).commit();
                        break;
                    case 2:
                        //llamar al fragmento favoritos
                        Favoritos f = new Favoritos();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,f).commit();
                        break;

                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        
        //menu lateral
        NavigationView nav =(NavigationView) findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //recuperar la opcion del menu
                return false;
            }
        });
        DrawerLayout dl = (DrawerLayout) findViewById(R.id.principal);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                dl,
                R.string.abrir_drawer,
                R.string.cerrar_drawer
        );
        dl.addDrawerListener(toggle);
        toggle.syncState();


        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dl.isDrawerOpen(GravityCompat.START)){
                    dl.closeDrawer(GravityCompat.START);
                }
                else {
                    dl.openDrawer((int) Gravity.START);
                }
            }
        });


    }

    private void setSupportActionBar(Toolbar tb) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //incorporar el menu dentro de la activity
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item .getItemId(); //recuperar el id de la opcion



        return super.onOptionsItemSelected(item);
    }


}