package com.pkl.gits.recyclerviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvNama, tvKelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent i = getIntent();

        tvNama = (TextView) findViewById(R.id.Detail_etNama);
        tvKelas = (TextView) findViewById(R.id.Detail_etKelas);

        tvNama.setText(i.getStringExtra("nama"));
        tvKelas.setText(i.getStringExtra("kelas"));

    }

}
