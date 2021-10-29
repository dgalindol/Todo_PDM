package com.diegog.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = findViewById(R.id.rgGrupo);
        RadioButton rbHombre = findViewById(R.id.rbHombre);
        RadioButton rbMujer = findViewById(R.id.rbMujer);
        RadioButton rbNoBiN4r1O = findViewById(R.id.rbNoBiN4r1O);
    }

    public void sexoSeleccionado(View view) {

        switch(view.getId()) {
            case R.id.rbHombre:
                Toast.makeText(this, "Ha seleccionado Hombre", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rbMujer:
                Toast.makeText(this, "Ha seleccionado Mujer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbNoBiN4r1O:
                Toast.makeText(this, "Ha seleccionado kidjfisj", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}