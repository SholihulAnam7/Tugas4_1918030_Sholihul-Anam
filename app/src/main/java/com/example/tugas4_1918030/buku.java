package com.example.tugas4_1918030;

public class buku {
    private String judul,genre,tahun;
    private int foto;
    public buku(String judul, String genre, String tahun, int foto){
        this.judul = judul;
        this.genre = genre;
        this.tahun = tahun;
        this.foto = foto;
    }

    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getGenre(){ return genre; }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getTahun(){
        return tahun;
    }
    public void setTahun(String tahun){
        this.tahun = tahun;
    }

    public int getFoto() { return foto; }
    public void setFoto(int foto) { this.foto = foto; }
}
