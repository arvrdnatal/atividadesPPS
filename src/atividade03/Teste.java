package atividade03;

public class Teste {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem(new Machado()); // possui um machado
        Personagem personagem2 = new Personagem(); // está desarmado

        personagem1.golpear(personagem2);
        personagem2.golpear(personagem1);

        System.out.println(personagem1.getVida()); // resultado = 99
        System.out.println(personagem2.getVida()); // resultado = 80
        System.out.println();

        personagem1.setArma(new Espada()); // agora possui uma espada
        personagem2.setArma(new ArcoFlecha()); // agora possui um arco e flecha

        personagem1.golpear(personagem2);
        personagem2.golpear(personagem1);

        System.out.println(personagem1.getVida()); // resultado = 89
        System.out.println(personagem2.getVida()); // resultado = 65
    }
}
