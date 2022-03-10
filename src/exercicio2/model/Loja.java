package exercicio2.model;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if (livros.size() > 0) {
            for (Livro livro : livros) {
                System.out.println(
                    "Nome: " + livro.getNome() +
                    " | Autor: " + livro.getAutor() +
                    " | Tema: " + livro.getTema() +
                    " | Quantidade de paginas: " + livro.getQtdPag() +
                    " | Quantidade em Estoque: " + livro.getQtd() +
                    " | Preço: " + livro.getPreco()
    );
            }
        } else {
            System.out.println("A Loja não tem livros no seu estoque");
        }
    }

    public void listaVideoGames() {
        if (videoGames.size() > 0) {
            for (VideoGame games : videoGames) {
                System.out.println(
                    "Nome: " + games.getNome() +
                    " | Marca: " + games.getMarca() +
                    " | Modelo: " + games.getModelo() +
                    " | Quantidade em estoque: " + games.getQtd() +
                    " | Preço: " + games.getPreco()
                );
            }
        } else {
            System.out.println("A Loja não tem video-games no seu estoque");
        }
    }

    public double calculaPatrimonio() {
        double totalLivros = 0, totalgames = 0;
        for (VideoGame games : videoGames) {
            totalgames += games.getPreco() * games.getQtd();
        }
        for (Livro livro : livros) {
            totalLivros += livro.getPreco() * livro.getQtd();
        }
        return totalgames + totalLivros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }
}
