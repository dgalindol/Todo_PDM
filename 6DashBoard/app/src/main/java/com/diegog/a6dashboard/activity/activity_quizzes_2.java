package com.diegog.a6dashboard.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.diegog.a6dashboard.R;

public class activity_quizzes_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes2);

        Button botonEmpezar = findViewById(R.id.buttonSe);
        TextView titulo = findViewById(R.id.tvTextoPrincipal);

        Bundle extras = getIntent().getExtras();

        int numero = extras.getInt("taBien");

        if (numero == 0){
            titulo.setText(getString(R.string.respuestaFallida));
            botonEmpezar.setText(getString(R.string.botonReintentar));
        } else if (numero == 1){
            titulo.setText(getString(R.string.respuestaCorrecta));
            botonEmpezar.setText(getString(R.string.botonSiguiente));
        } else if (numero == 2){
            titulo.setText(getString(R.string.respuestaFinal));
            botonEmpezar.setText(getString(R.string.botonAcabar));
            Quizzes_Activity.pregunta = 1;
        }
        botonEmpezar.setOnClickListener(v -> {
            finish();
        });
    }
}