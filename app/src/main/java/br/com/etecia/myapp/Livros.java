package br.com.etecia.myapp;

public class Livros {
    private String titulo;
    private String categoria;
    private int imglivro;
    private double preco;

    public Livros(String titulo, String categoria, int imglivro, double preco) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.imglivro = imglivro;
        this.preco = preco;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImglivro() {
        return imglivro;
    }

    public void setImglivro(int imglivro) {
        this.imglivro = imglivro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
