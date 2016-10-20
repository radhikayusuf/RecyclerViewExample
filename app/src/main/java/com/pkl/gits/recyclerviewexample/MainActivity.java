package com.pkl.gits.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pkl.gits.recyclerviewexample.adapter.AdapterRecyclerSiswa;
import com.pkl.gits.recyclerviewexample.dao.SiswaDao;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<SiswaDao> siswaDaoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Menyiapkan Komponent Untuk RecyclerView
         */
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        AdapterRecyclerSiswa adapter = new AdapterRecyclerSiswa(siswaDaoList);


        /**
         * Setting Up RecyclerView
         */
        recyclerView = (RecyclerView) findViewById(R.id.rc_siswa);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);



        /**
         * Data Yang akan di tampilkan di RecyclerView
         */
        siswaDaoList.add(new SiswaDao("Radhika", "XII RPL 2"));
        siswaDaoList.add(new SiswaDao("Fikri", "XII RPL 2"));
        siswaDaoList.add(new SiswaDao("Angga", "XII RPL 2"));


        /**
         *
         * Kalo ada data baru pke fungsi di bawah ini
         * jadi data yg baru nya bakal tampil (RecyclerView ke update)
          */
        adapter.notifyDataSetChanged();

    }
}
