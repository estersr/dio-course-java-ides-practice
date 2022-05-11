package br.com.dio;

import br.com.dio.model.Gato;

public class FirstProgram {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("the three bodies problem", 300);
        System.out.println(livro1);


        //ctrl k abrir area do commit
        // shft ctrl f10 atualizar td, shft f10 so atualizar
        // alt enter criar variavel
        // alt insert generate
        // ctrl shift altera a linha de lugar
        //ctrl y deletar linha, ctrl z recuperar o que apagou
        // ctrl d para duplicar linha
        // ctrl alt l para identar
        // ctrl alt o apaga os imports nao utilizados
        // int a = 5;
        //int b = 3
        //System.out.println("Hello World! " + (a+b));


    }
}

class Livro {
    private String nome;
    private Integer nPagina;

    public Livro(String nome, Integer nPagina) {
        this.nome = nome;
        this.nPagina = nPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getnPagina() {
        return nPagina;
    }

    public void setnPagina(Integer nPagina) {
        this.nPagina = nPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nPagina=" + nPagina +
                '}';
    }
}