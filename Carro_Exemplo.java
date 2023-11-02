// Criando a classe Carro
public class Carro {
    // Atributos da classe Carro
    String marca;
    String cor;
    int ano;

    // Método da classe Carro
    void buzinar() {
        System.out.println("Beep! Beep!");
    }
}

// Criando a classe principal
public class Main {
    public static void main(String[] args) {
        // Criando um objeto meuCarro da classe Carro
        Carro meuCarro = new Carro();

        // Acessando atributos e métodos do objeto meuCarro
        meuCarro.marca = "Toyota";
        meuCarro.cor = "Vermelho";
        meuCarro.ano = 2020;

        System.out.println(meuCarro.marca);  // Imprime: Toyota
        System.out.println(meuCarro.cor);  // Imprime: Vermelho
        System.out.println(meuCarro.ano);  // Imprime: 2020

        meuCarro.buzinar();  // Imprime: Beep! Beep!
    }
}
