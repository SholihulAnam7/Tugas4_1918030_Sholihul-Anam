package com.example.tugas4_1918030;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class bukuAdapter extends RecyclerView.Adapter<bukuAdapter.bukuViewHolder>{
    private ArrayList<buku> dataList;
    public bukuAdapter(ArrayList<buku> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public bukuAdapter.bukuViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_buku, parent, false);
        return new bukuViewHolder(view);
    }
    public void onBindViewHolder(bukuViewHolder holder, int position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.txtJudul.setText(dataList.get(position).getJudul());
        holder.txtGenre.setText(dataList.get(position).getGenre());
        holder.txtTahun.setText(dataList.get(position).getTahun());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class bukuViewHolder extends RecyclerView.ViewHolder{
        private TextView txtJudul, txtGenre, txtTahun;
        private ImageView Foto;
        public bukuViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtJudul = (TextView)itemView.findViewById(R.id.txt_judul);
            txtGenre = (TextView) itemView.findViewById(R.id.txt_genre);
            txtTahun = (TextView) itemView.findViewById(R.id.txt_tahun);
        }
    }
}

