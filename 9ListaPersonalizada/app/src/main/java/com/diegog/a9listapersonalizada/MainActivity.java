package com.diegog.a9listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.diegog.a9listapersonalizada.Model.Entidad;
import com.diegog.a9listapersonalizada.adaptadores.Adaptador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<Entidad> arrayEntidad = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.lvItems);

        llenarItems();

        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                intent.putExtra("item", arrayEntidad.get(position));
                startActivity(intent);
            }
        });
    }

    private void llenarItems() {
        arrayEntidad.add(new Entidad(R.drawable.dbs_1, "SS Blues", "Goku y Vegeta"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_2, "SS Blues y SS Rose", "Goku y Black"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_3, "DB HEROES 1", "Personajes nuevos"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_4, "DB HEROES 2", "Otros personajes, Majin Boo"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_5, "VEGETA", "Sacrificio de Vegeta"));

        adaptador = new Adaptador(arrayEntidad, this);
        lvItems.setAdapter(adaptador);

    }
}