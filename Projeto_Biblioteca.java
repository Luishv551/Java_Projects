public class Autor {
    String nome;
    String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
}

public class Livro {
    String titulo;
    Autor autor;
    int anoPublicacao;

    public Livro(String titulo, Autor autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
}

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.titulo + ", Autor: " + livro.autor.nome + ", Ano de Publicação: " + livro.anoPublicacao);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("George Orwell", "Britânico");
        Livro livro = new Livro("1984", autor, 1949);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro);
        biblioteca.listarLivros();
    }
}