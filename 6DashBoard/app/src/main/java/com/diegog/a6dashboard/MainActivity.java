package com.diegog.a6dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.diegog.a6dashboard.activity.Amigos_Activity;
import com.diegog.a6dashboard.activity.Calculadora_Activity;
import com.diegog.a6dashboard.activity.EdadCanina_Activity;
import com.diegog.a6dashboard.activity.Galeria_Activity;
import com.diegog.a6dashboard.activity.Mapas_Activity;
import com.diegog.a6dashboard.activity.Quizzes_Activity;
import com.diegog.a6dashboard.activity.Restaurantes_Activity;
import com.diegog.a6dashboard.activity.Settings_Activity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay_calculadora, rellay_amigos, rellay_embaperro, rellay_quizzes, rellay_galeria, rellay_mapas, rellay_restaurantes, rellay_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay_calculadora = findViewById(R.id.rellay_calculadora);
        rellay_amigos = findViewById(R.id.rellay_amigos);
        rellay_embaperro = findViewById(R.id.rellay_embaperro);
        rellay_quizzes = findViewById(R.id.rellay_quizz);
        rellay_galeria = findViewById(R.id.rellay_galeria);
        rellay_mapas = findViewById(R.id.relly_mapas);
        rellay_restaurantes = findViewById(R.id.rellay_restaurantes);
        rellay_settings = findViewById(R.id.rellay_settings);

        rellay_calculadora.setOnClickListener(v -> {
            Intent calculadora = new Intent(this, Calculadora_Activity.class);
            startActivity(calculadora);
        });

        rellay_amigos.setOnClickListener(v -> {
            Intent amigos = new Intent(this, Amigos_Activity.class);
            startActivity(amigos);
        });

        rellay_embaperro.setOnClickListener(v -> {
            Intent calculadora = new Intent(this, EdadCanina_Activity.class);
            startActivity(calculadora);
        });

        rellay_quizzes.setOnClickListener(v -> {
            Intent calculadora = new Intent(this, Quizzes_Activity.class);
            startActivity(calculadora);
        });

        rellay_galeria.setOnClickListener(v -> {
            Intent calculadora = new Intent(this, Galeria_Activity.class);
            startActivity(calculadora);
        });

        rellay_mapas.setOnClickListener(v -> {
            Intent calculadora = new Intent(this, Mapas_Activity.class);
            startActivity(calculadora);
        });

        rellay_restaurantes.setOnClickListener(v -> {
            Intent calculadora = new Intent(this, Restaurantes_Activity.class);
            startActivity(calculadora);
        });

        rellay_settings.setOnClickListener(v -> {
            Intent calculadora = new Intent(this, Settings_Activity.class);
            startActivity(calculadora);
        });
    }
}