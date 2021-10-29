package com.diegog.a8_versiones_de_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    // 1 - Declaramos el elemento ListView
    ListView lista;

    // 3 - Declaramos la lista de elementos que vamos a mostrar

    List<String> andoroidVersionesLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 - Conectamos lista con el elemento listView Real

        lista = findViewById(R.id.listViewVersiones);

        // 4 - Cargamos la lista de emlementos

        andoroidVersionesLista = new ArrayList<>();

        andoroidVersionesLista.add("Pie");
        andoroidVersionesLista.add("Oreo");
        andoroidVersionesLista.add("Nougat");
        andoroidVersionesLista.add("Marshmallow");
        andoroidVersionesLista.add("Lollipop");
        andoroidVersionesLista.add("KitKat");
        andoroidVersionesLista.add("...");

        // 5 - Nos definimos EL ADAPTADOR:
        // Este adaptador coge la lista de strings y las va pintando en el listView.Tantos como elementos visuales.
        ArrayAdapter adaptadorDeVersionesAndroid = new ArrayAdapter(
                this, // Donde nos ncontramos
                android.R.layout.simple_list_item_1, //template que usamos para mostrar los resultados (este lo lleva nativamente android)
                andoroidVersionesLista // la Lista de elementos que queremos mostrar en pantalla
        );

        // 6 - Vinculamos el ListView con la Lista definida en el adaptador

        lista.setAdapter(adaptadorDeVersionesAndroid);

        // 7 - Gestionamos el evento Click en cada elemento de la lista
        lista.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String version = andoroidVersionesLista.get(position);
        Toast.makeText(this, "La version seleccionada es " + version, Toast.LENGTH_SHORT).show();
    }
}