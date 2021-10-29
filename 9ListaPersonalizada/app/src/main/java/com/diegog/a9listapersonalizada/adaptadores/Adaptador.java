package com.diegog.a9listapersonalizada.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.diegog.a9listapersonalizada.DetalleActivity;
import com.diegog.a9listapersonalizada.Model.Entidad;
import com.diegog.a9listapersonalizada.R;

import java.util.ArrayList;

// 4 - extendemos de BaseAdapter y generamos los metodos
public class Adaptador extends BaseAdapter {



    // 1 - Creamos el arrayList de Entidad que serán los datos que
    // heredará el ListView
    private ArrayList<Entidad> listEntidad;
    private Context context;
    private LayoutInflater inflater;

    // Generamos el constructor
    public Adaptador(ArrayList<Entidad> listEntidad, Context context) {
        this.listEntidad = listEntidad;
        this.context = context;
    }

    // Este metodo indicara al listView cuantos datos van a cargar (el tamaño)
    @Override
    public int getCount() {
        return listEntidad.size();
    }

    // Esta metodo devolverá la posicion
    @Override
    public Object getItem(int position) {
        return listEntidad.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // Aqui se crearça cada item y se le asignará los valores para cada elemento de cada item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtenemos el objeto por cada item a mostrar
        final Entidad entidad = (Entidad) getItem(position);
        // Creamos e inicializamos los elementos del item de la lista
        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);

        ImageView imgFoto = convertView.findViewById(R.id.imgFoto);
        TextView titulo = convertView.findViewById(R.id.tvTitulo);
        TextView Contenido = convertView.findViewById(R.id.tvContenido);

        // Llenamos los elementos con los valores de cada item
        imgFoto.setImageResource(entidad.getImgFoto());
        titulo.setText(entidad.getTitulo());
        Contenido.setText(entidad.getContenido());

        convertView.setOnClickListener(v -> {
            Intent i = new Intent(context, DetalleActivity.class);
            i.putExtra("item", entidad);
            context.startActivity(i);
        });

        return convertView;
    }
}
