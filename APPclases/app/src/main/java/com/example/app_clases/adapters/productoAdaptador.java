package com.example.app_clases.adapters;


import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.app_clases.R;
import com.example.app_clases.models.productos;


import java.util.List;


public class productoAdaptador extends ArrayAdapter<productos>{
    Context context;
    ImageLoader queue;
    private class ViewHolder{
        NetworkImageView image;
        TextView nombre;
        TextView precio;

        private ViewHolder(){

        }
    }

    public productoAdaptador(Context context, List<productos> items, ImageLoader _queue) {

        super(context, 0, items);
        this.context = context;
        this.queue= _queue;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder holder;


        final productos rowItem = (productos) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.activity_productos, null);
            holder = new ViewHolder();
            holder.image=(NetworkImageView)convertView.findViewById(R.id.image);
            holder.nombre = (TextView) convertView.findViewById(R.id.nombre);
            holder.precio = (TextView) convertView.findViewById(R.id.precio);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.image.setImageUrl(rowItem.getSmallImage(), queue);
        holder.nombre.setText(rowItem.nombre);
        holder.precio.setText(rowItem.precio);
        return convertView;


        }
    }







