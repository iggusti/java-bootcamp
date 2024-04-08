package com.tugasdua.demo;

import java.math.BigInteger;

public class Biodata {
    private Long id;
    private String nama;
    private String alamat;
    private BigInteger nohp;

    @Override
    public String toString() {
        return String.format("Nama : %s | Alamat : %s | No. HP : %d", this.nama, this.alamat, this.nohp);
    }

    public Biodata() {
    }

    public Biodata(String nama, String alamat, BigInteger nohp) {
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public BigInteger getNohp() {
        return nohp;
    }

    public void setNohp(BigInteger nohp) {
        this.nohp = nohp;
    }
}
