package com.diegog.a6dashboard.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.diegog.a6dashboard.R;

public class Calculadora_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        EditText primer_digito = findViewById(R.id.num1);
        EditText segundo_digito = findViewById(R.id.num2);
        TextView resultado = findViewById(R.id.resultado_calculadora);
        Button boton_suma = findViewById(R.id.button_suma);
        Button boton_resta = findViewById(R.id.button_resta);
        Button boton_multi = findViewById(R.id.button_multiplicacion);
        Button boton_division = findViewById(R.id.button_division);


        boton_suma.setOnClickListener(view -> {
            int num1 = Integer.parseInt(primer_digito.getText().toString());
            int num2 = Integer.parseInt(segundo_digito.getText().toString());
            if (!primer_digito.getText().toString().isEmpty()){
                if(!segundo_digito.getText().toString().isEmpty()){
                    int resultadoCalc = num1 + num2;
                    String resultadoString = getString(R.string.resultado) + " " + resultadoCalc;
                    resultado.setText(resultadoString);
                } else {
                    Log.d("MainActivity", "Has introducido un campo vacio");
                    Toast.makeText(this, getString(R.string.msg_toast), Toast.LENGTH_SHORT).show();
                };
            } else {
                Log.d("MainActivity", "Has introducido un campo vacio");
                Toast.makeText(this , getString(R.string.msg_toast), Toast.LENGTH_SHORT).show();
            }

        });

        boton_resta.setOnClickListener(view -> {
            int num1 = Integer.parseInt(primer_digito.getText().toString());
            int num2 = Integer.parseInt(segundo_digito.getText().toString());
            if (!primer_digito.getText().toString().isEmpty()){
                if(!segundo_digito.getText().toString().isEmpty()){
                    int resultadoCalc = num1 - num2;
                    String resultadoString = getString(R.string.resultado) + " " + resultadoCalc;
                    resultado.setText(resultadoString);
                } else {
                    Log.d("MainActivity", "Has introducido un campo vacio");
                    Toast.makeText(this, getString(R.string.msg_toast), Toast.LENGTH_SHORT).show();
                };
            } else {
                Log.d("MainActivity", "Has introducido un campo vacio");
                Toast.makeText(this , getString(R.string.msg_toast), Toast.LENGTH_SHORT).show();
            }

        });

        boton_multi.setOnClickListener(view -> {
            int num1 = Integer.parseInt(primer_digito.getText().toString());
            int num2 = Integer.parseInt(segundo_digito.getText().toString());
            if (!primer_digito.getText().toString().isEmpty()){
                if(!segundo_digito.getText().toString().isEmpty()){
                    int resultadoCalc = num1 * num2;
                    String resultadoString = getString(R.string.resultado) + " " + resultadoCalc;
                    resultado.setText(resultadoString);
                } else {
                    Log.d("MainActivity", "Has introducido un campo vacio");
                    Toast.makeText(this, getString(R.string.msg_toast), Toast.LENGTH_SHORT).show();
                };
            } else {
                Log.d("MainActivity", "Has introducido un campo vacio");
                Toast.makeText(this , getString(R.string.msg_toast), Toast.LENGTH_SHORT).show();
            }

        });

        boton_division.setOnClickListener(view -> {
            int num1 = Integer.parseInt(primer_digito.getText().toString());
            int num2 = Integer.parseInt(segundo_digito.getText().toString());
            if (!primer_digito.getText().toString().isEmpty()){
                if(!segundo_digito.getText().toString().isEmpty()){
                    int resultadoCalc = num1 / num2;
                    String resultadoString = getString(R.string.resultado) + " " + resultadoCalc;
                    resultado.setText(resultadoString);
                } else {
                    Log.d("MainActivity", "Has introducido un campo vacio");
                    Toast.makeText(this, getString(R.string.msg_toast), Toast.LENGTH_SHORT).show();
                };
            } else {
                Log.d("MainActivity", "Has introducido un campo vacio");
                Toast.makeText(this , getString(R.string.msg_toast), Toast.LENGTH_SHORT).show();
            }

        });
    }
}