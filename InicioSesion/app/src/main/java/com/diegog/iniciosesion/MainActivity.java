package com.diegog.iniciosesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario = findViewById(R.id.Usuario);
        EditText contraseña = findViewById(R.id.Constraseña);
        Button InicioSesion = findViewById(R.id.BotonInicioSesion);

        InicioSesion.setOnClickListener(v -> {
            if (!usuario.getText().toString().isEmpty()){
                if (!contraseña.getText().toString().isEmpty()){
                    Intent intent = new Intent(this,  PantallaAccedida.class);
                    intent.putExtra( "nombre", usuario.getText().toString());
                    startActivity(intent);


                } else {
                    Toast.makeText(this , "No has introducido la contraseña correcta", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this , "No has introducido un usuario valido", Toast.LENGTH_SHORT).show();
            }
        });



    }
}