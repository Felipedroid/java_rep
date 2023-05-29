package aula_poo;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private String editora;
    private int ano;
    private String dataCadastro;
    
    private static List<Livro> livros = new ArrayList<>();

    public Livro(String titulo, String autor, String categoria, String editora, int ano, String dataCadastro) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.editora = editora;
        this.ano = ano;
        this.dataCadastro = dataCadastro;
    }

	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    @Override
	public String toString() {
		return "Livro [titulo = " + titulo + ", autor = " + autor + ", categoria = " + categoria + ", editora = " + editora
				+ ", ano = " + ano + ", data de cadastro = " + dataCadastro + "]";
	}

    public void deletarLivro(Livro livro) {
        livros.remove(livro);
    }

}
