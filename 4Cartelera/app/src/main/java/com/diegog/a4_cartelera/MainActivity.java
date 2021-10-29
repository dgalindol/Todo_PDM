package com.diegog.a4_cartelera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView movieImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieImageView = findViewById(R.id.imagenPelicula);

        Button buttonGravity = findViewById(R.id.btnGravity);
        Button buttonJumanji = findViewById(R.id.btnJumanji);
        Button buttonKing = findViewById(R.id.btnKing);
        Button buttonStarWars = findViewById(R.id.btnStarwars);
        Button buttonOrigen = findViewById(R.id.btnOrigen);
        Button buttonToyStory = findViewById(R.id.btnToyStory);

        buttonGravity.setOnClickListener(this);
        buttonJumanji.setOnClickListener(this);
        buttonKing.setOnClickListener(this);
        buttonStarWars.setOnClickListener(this);
        buttonOrigen.setOnClickListener(this);
        buttonToyStory.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int buttonId = view.getId();
        int imageId;
        switch (buttonId){
            case R.id.btnGravity:
                imageId = R.drawable.gravity;
                break;
            case R.id.btnJumanji:
                imageId = R.drawable.jumanju;
                break;
            case R.id.btnKing:
                imageId = R.drawable.reyleon;
                break;
            case R.id.btnStarwars:
                imageId = R.drawable.starwars;
                break;
            case R.id.btnOrigen:
                imageId = R.drawable.origen;
                break;
            case R.id.btnToyStory:
                imageId = R.drawable.toystory;
                break;
            default:
                imageId = 0;
        }

        if ( imageId != 0){
            movieImageView.setImageDrawable(ContextCompat.getDrawable(this, imageId));
        }
    }
}