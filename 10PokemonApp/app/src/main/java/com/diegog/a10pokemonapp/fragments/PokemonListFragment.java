package com.diegog.a10pokemonapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.diegog.a10pokemonapp.Adapter.PokemonListAdapter;
import com.diegog.a10pokemonapp.MainActivity;
import com.diegog.a10pokemonapp.R;
import com.diegog.a10pokemonapp.model.Pokemon;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PokemonListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PokemonListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private ListView lvPokemons;
    private PokemonListAdapter adaptador;
    private ArrayList<Pokemon> pokemonList = new ArrayList<>();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PokemonListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PokemonListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PokemonListFragment newInstance(String param1, String param2) {
        PokemonListFragment fragment = new PokemonListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 1 - Creamos un vista que es la que vamos a devolver
        View view = inflater.inflate(R.layout.fragment_pokemon_list, container, false);
        // 2 - A partir de este view vamos a obtener todos los views del fragment
        lvPokemons = view.findViewById(R.id.pokemon_listView);
        // 3 - Traemos el resto de l codigo de mainActivity
        pokemonList.add(new Pokemon("1", "bulbasaur", Pokemon.Type.PLANT));
        pokemonList.add(new Pokemon("2", "Ivysaur", Pokemon.Type.PLANT));
        pokemonList.add(new Pokemon("3", "Venusaur", Pokemon.Type.PLANT));
        pokemonList.add(new Pokemon("4", "Charmander", Pokemon.Type.FIRE));
        pokemonList.add(new Pokemon("5", "Charmeleon", Pokemon.Type.FIRE));
        pokemonList.add(new Pokemon("6", "Charizard", Pokemon.Type.FIRE));
        pokemonList.add(new Pokemon("7", "Squirtle", Pokemon.Type.WATER));
        pokemonList.add(new Pokemon("8", "Blastoise", Pokemon.Type.WATER));
        pokemonList.add(new Pokemon("25", "Pikachu", Pokemon.Type.ELECTRIC));
        pokemonList.add(new Pokemon("26", "Raichu", Pokemon.Type.ELECTRIC));
        // 4 - Un contexto SIEMPRE va a depender de un Activity
        // Cuando nos pida un contexto desde un fragment podemos obtenerlo con getActivity()
        adaptador = new PokemonListAdapter(getActivity(), pokemonList,R.id.item);
        lvPokemons.setAdapter(adaptador);
        lvPokemons.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pokemon selectedPokemon = (Pokemon) adaptador.getItem(position);
                if (selectedPokemon != null){
                    Toast.makeText(getActivity(), selectedPokemon.getNombre(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}