package com.pkl.gits.recyclerviewexample.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView.Adapter;
import android.widget.TextView;

import com.pkl.gits.recyclerviewexample.DetailActivity;
import com.pkl.gits.recyclerviewexample.R;
import com.pkl.gits.recyclerviewexample.dao.SiswaDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 20/10/16.
 */

public class AdapterRecyclerSiswa extends Adapter<AdapterRecyclerSiswa.ViewHolder> {
    List<SiswaDao> siswaDaos = new ArrayList<>();
    private static Context ctx;

    public AdapterRecyclerSiswa(List<SiswaDao> siswaDaos) {
        this.siswaDaos = siswaDaos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_data_siswa, parent, false);
        ctx = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final SiswaDao datasiswa = siswaDaos.get(position);

        holder.tvName.setText(datasiswa.getNama());
        holder.tvKelas.setText(datasiswa.getKelas());

         holder.card_siswa.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(ctx, DetailActivity.class);
                 i.putExtra("nama",datasiswa.getNama());
                 i.putExtra("kelas",datasiswa.getKelas());
                  ctx.startActivity(i);
             }
         });


    }

    @Override
    public int getItemCount() {
        /**
         * Banyak nya row yang ada di RecyclerView
         */
        return siswaDaos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        /**
         * View Holder Adalah Class untuk setiap layout yg di looping
         */

        TextView tvName, tvKelas;
        CardView card_siswa;
        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvKelas = (TextView) itemView.findViewById(R.id.tvKelas);
            card_siswa = (CardView) itemView.findViewById(R.id.card_siswa);
        }
    }
}
