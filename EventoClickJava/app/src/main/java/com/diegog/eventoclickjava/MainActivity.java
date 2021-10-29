package com.diegog.eventoclickjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = findViewById(R.id.button);

        Button boton2 = findViewById(R.id.button2);

        boton1.setOnClickListener( v -> {
            Toast.makeText(this, "Has pulsado en el Boton 1", Toast.LENGTH_SHORT).show();
        });

        boton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Has pulsado el boton 2", Toast.LENGTH_SHORT).show();
    }
}