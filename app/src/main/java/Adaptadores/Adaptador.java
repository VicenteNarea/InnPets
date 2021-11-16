package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.innpets.R;

import java.util.ArrayList;

import Modelo.Personas;

public class Adaptador extends BaseAdapter {


    private Context contexto;
    private ArrayList<Personas> listItems;

    public Adaptador(Context contexto, ArrayList<Personas> listItems) {
        this.contexto = contexto;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = LayoutInflater.from(contexto).inflate(R.layout.lista_personas, null);
        ImageView ivFoto = (ImageView) view.findViewById(R.id.ivFoto);
        TextView tvNombre = (TextView) view.findViewById(R.id.tvNombre);
        Personas p = (Personas) getItem(i);
        Glide.with(contexto)
                .load(p.getNombre())
                .centerCrop()
                .fitCenter()
                .into(ivFoto);
        tvNombre.setText(p.getRuta());
        return view;
    }

}
