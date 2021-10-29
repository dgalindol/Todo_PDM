package com.diegog.iniciosesion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PantallaAccedida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_accedida);

        TextView nombre = findViewById(R.id.tvNombre);

        Bundle extras = getIntent().getExtras();
        nombre.setText(extras.getString("nombre"));
    }
}