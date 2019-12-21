package com.example.app_clases.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class productos {

    public String nombre;
    public String precio;
    public String image;

    public productos(String _nombre, String _precio, String _image) {
        this.nombre = _nombre;
        this.precio = _precio;
        this.image= _image;
    }


        public String getSmallImage(){
            return this.image;
        }


    public static ArrayList getCollection() {
        ArrayList<productos>collection=new ArrayList<>();
        collection.add(new productos("casaca", "9.00","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYFpxLVheQOWgH6NjqIVJZ5_qvN-kIT0ZZtlSuGvO4T1n8YcWE&s"));
        collection.add(new productos("polo", "50.00","https://i.ytimg.com/vi/ncL3sBlACuM/maxresdefault.jpg"));
        collection.add(new productos("vestido", "60.00","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRd_tiwX1kBxwJSziupQYEKpKhn_Ym5e4EfhF2UHP6Wd13x7fZxlg&s"));
        return collection;
    }
}


