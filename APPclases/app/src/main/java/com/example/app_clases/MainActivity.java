package com.example.app_clases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.app_clases.adapters.productoAdaptador;
import com.example.app_clases.helpers.QueueUtils;
import  com.example.app_clases.models.productos;

import java.util.Queue;

public class MainActivity extends AppCompatActivity {
    QueueUtils.QueueObject queue=null;
    ListView productosList;
    productoAdaptador productoAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue=QueueUtils.getInstance(this.getApplicationContext());


        productosList = findViewById(R.id.productosList);
        productoAdaptador = new productoAdaptador(this, productos.getCollection(),queue.getImageLoader());
        productosList.setAdapter(productoAdaptador);



        productoAdaptador = new productoAdaptador(this,productos.getCollection(),queue.getImageLoader());

    }
}

