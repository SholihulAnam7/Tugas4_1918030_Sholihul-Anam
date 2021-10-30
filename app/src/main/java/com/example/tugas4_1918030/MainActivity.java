package com.example.tugas4_1918030;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private bukuAdapter adapter;
    private ArrayList<buku> bukuArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleView);
        adapter = new bukuAdapter(bukuArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        bukuArrayList = new ArrayList<>();
        bukuArrayList.add(new buku("Bank Soal Matematika", "Genre : Latihan Soal", "2021.",R.drawable.buku1));
        bukuArrayList.add((new buku("Kumpulan Resep Makanan","Genre : Aneka Masakan", "2021",R.drawable.buku2)));
        bukuArrayList.add((new buku("Sejarah Indonesia", "Genre : Sejarah", "2019.",R.drawable.buku3)));
        bukuArrayList.add((new buku("Brilian Ilmu Pengetahuan Alam","Genre : Ringkasan Dan latihan", "2021",R.drawable.buku4)));
        bukuArrayList.add((new buku("Tenggelamnya Kapal Van Der Wijck", "Genre : Novel", "2013", R.drawable.buku5)));
        bukuArrayList.add((new buku("Naruto", "genre : Komik Anime", "2009", R.drawable.buku6)));
        bukuArrayList.add((new buku("Menggerakkan Negeri", "Genre : Literasi", "2020", R.drawable.buku7)));
    }
}
