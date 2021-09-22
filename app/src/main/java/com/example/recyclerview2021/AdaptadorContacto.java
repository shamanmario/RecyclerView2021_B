package com.example.recyclerview2021;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorContacto extends RecyclerView.Adapter<AdaptadorContacto.ViewHolder> {

    private ArrayList<Contacto> contactos;

    public AdaptadorContacto(ArrayList<Contacto> contactos){
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tarejta, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.foto.setImageResource(contactos.get(position).getFoto());
        holder.nombre.setText(contactos.get(position).getNombre());
        holder.numero.setText(contactos.get(position).getNumero());
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView nombre;
        private TextView numero;

        public ViewHolder(View itemView){
            super(itemView);

            foto = itemView.findViewById(R.id.fotitoContacto);
            nombre = itemView.findViewById(R.id.nombreContacto);
            numero = itemView.findViewById(R.id.numeroContacto);
        }
    }
}
