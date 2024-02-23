package com.example.pmdm_2324.PracticasAntesExamen.ConsumirAPIVB.RecyclePeliculas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_2324.PracticasAntesExamen.ConsumirAPIVB.CallAPI.Peliculas;
import com.example.pmdm_2324.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterPeliculas extends RecyclerView.Adapter<AdapterPeliculas.ViewHolder> {
    private ArrayList<Peliculas> datos;

    public AdapterPeliculas(List<Peliculas> listaPeliculas) {
        datos = new ArrayList<>(listaPeliculas);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nombrePeliculas;
        private final TextView descripcionPeliculas;
        private final TextView nombreActores;
        private final TextView urlActores;
        private final TextView urlPeliculas;

        private final TextView estrellasPeliculas;


        public ViewHolder(View view) {
            super(view);
            nombrePeliculas = (TextView) view.findViewById(R.id.nombrePeliculas);
            descripcionPeliculas = (TextView) view.findViewById(R.id.descripcionPeliculas);
            nombreActores = (TextView) view.findViewById(R.id.nombreActores);
            estrellasPeliculas = (TextView) view.findViewById(R.id.estrellasPeliculas);
            urlActores = (TextView) view.findViewById(R.id.urlActoresAPI);
            urlPeliculas = (TextView) view.findViewById(R.id.urlPeliculasAPI);
        }

        public TextView getNombrePeliculas() {
            return nombrePeliculas;
        }

        public TextView getDescripcionPeliculas() {
            return descripcionPeliculas;
        }

        public TextView getEstrellasPeliculas() {
            return estrellasPeliculas;
        }

        public TextView getNombreActores() {
            return nombreActores;
        }

        public TextView getUrlActores() {
            return urlActores;
        }

        public TextView getUrlPeliculas() {
            return urlPeliculas;
        }
    }

    public AdapterPeliculas.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_pelicula, viewGroup, false);

        return new AdapterPeliculas.ViewHolder(view);
    }


    public void onBindViewHolder(AdapterPeliculas.ViewHolder viewHolder, final int position) {
        Peliculas pelicula = datos.get(position);
        viewHolder.getNombrePeliculas().setText(pelicula.nombre);
        viewHolder.getDescripcionPeliculas().setText(pelicula.descripcion);
        viewHolder.getEstrellasPeliculas().setText(pelicula.estrellas);
        viewHolder.getNombreActores().setText(pelicula.actores.nombreActores.toString());
        viewHolder.getUrlPeliculas().setText(pelicula.actores.pelicula.toString());
        viewHolder.getUrlActores().setText(pelicula.actores.url.toString());
    }

    public int getItemCount() {
        return datos.size();
    }

}
