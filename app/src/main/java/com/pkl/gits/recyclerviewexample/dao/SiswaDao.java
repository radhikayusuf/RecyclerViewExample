package com.pkl.gits.recyclerviewexample.dao;

/**
 * Created by root on 20/10/16.
 * INI DATA OBJECT BUAT RECYCLERVIEW
 */



public class SiswaDao {
    String nama, kelas;

    public SiswaDao(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
