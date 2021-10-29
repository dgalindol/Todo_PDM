package com.diegog.a3_variosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segundaActivity extends AppCompatActivity implements View.OnClickListener {

    Button VolvAct1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        VolvAct1 = findViewById(R.id.btnReturn);

        VolvAct1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intentAxtivity1 = new Intent(segundaActivity.this, MainActivity.class);

        startActivity(intentAxtivity1);
    }
}