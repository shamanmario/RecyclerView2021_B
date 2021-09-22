package com.example.recyclerview2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerContactos;
    AdaptadorContacto adaptador;
    ArrayList<Contacto> contactos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
    }

    private void inicializar(){
        recyclerContactos = findViewById(R.id.listaContactos);
        recyclerContactos.setLayoutManager(new LinearLayoutManager(this));

        llenarContactos();

        adaptador = new AdaptadorContacto(contactos);
        recyclerContactos.setAdapter(adaptador);

    }

    private void llenarContactos(){
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto(0, R.drawable.ic_launcher_background, "Pepe Pato", "+56 9 11223344"));
        contactos.add(new Contacto(1, R.drawable.ic_launcher_background, "Juanito", "+56 9 22334455"));
        contactos.add(new Contacto(2, R.drawable.ic_launcher_background, "Lunita", "+56 9 33445566"));
        contactos.add(new Contacto(3, R.drawable.ic_launcher_background, "Pepe Pato", "+56 9 11223344"));
        contactos.add(new Contacto(4, R.drawable.ic_launcher_background, "Juanito", "+56 9 22334455"));
        contactos.add(new Contacto(5, R.drawable.ic_launcher_background, "Lunita", "+56 9 33445566"));
        contactos.add(new Contacto(6, R.drawable.ic_launcher_background, "Pepe Pato", "+56 9 11223344"));
        contactos.add(new Contacto(7, R.drawable.ic_launcher_background, "Juanito", "+56 9 22334455"));
        contactos.add(new Contacto(8, R.drawable.ic_launcher_background, "Lunita", "+56 9 33445566"));
        contactos.add(new Contacto(9, R.drawable.ic_launcher_background, "Pepe Pato", "+56 9 11223344"));
        contactos.add(new Contacto(10, R.drawable.ic_launcher_background, "Juanito", "+56 9 22334455"));
        contactos.add(new Contacto(11, R.drawable.ic_launcher_background, "Lunita", "+56 9 33445566"));
    }
}