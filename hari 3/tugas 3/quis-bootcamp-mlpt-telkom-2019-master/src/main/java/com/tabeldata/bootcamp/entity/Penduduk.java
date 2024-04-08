package com.tabeldata.bootcamp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "penduduk")
public class Penduduk {
    @Id
    @Column(name = "nip")
    private String nip;

    @Column(name = "nama_lengkap")
    private String namaLengkap;

    @Column(name = "tanggal_lahir")
    private Date tanggalLahir;

    @Column(name = "tempat_lahir")
    private String tempatLahir;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    @Override
    public String toString() {
        return String.format("Nama Lengkap : %s | Tanggal Lahir : %s | Tempat Lahir: %s",
                 this.namaLengkap, this.tanggalLahir, this.tempatLahir);
    }
}
