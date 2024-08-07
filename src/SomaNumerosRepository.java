import java.util.ArrayList;
import java.util.List;

public class SomaNumerosRepository {

    private final List<Double> numList;

    public SomaNumerosRepository() {
        this.numList = new ArrayList<>();
    }

    public void adicionarNumero(double num) {
        this.numList.add(num);
    }

    public double calcularSoma() {
        double soma = 0;
        for ( double i: numList) {
            soma += i;
        }
        return soma;
    }

    public double encontraNumeroMaio() {
        if (numList.isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        double max = 0;
        for ( double i : numList) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public double encontrarMenorNumero() {
      double menor = numList.getFirst();
        for ( double i : numList) {
            if (i < menor) {
                menor = i;
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(numList);
    }


    public static void main(String[] args) {
        SomaNumerosRepository rep = new SomaNumerosRepository();

        rep.adicionarNumero(100.25);
        rep.adicionarNumero(81.5);
        rep.adicionarNumero(200);
        rep.adicionarNumero(66);
        rep.adicionarNumero(5.25);
        rep.adicionarNumero(10);
        rep.adicionarNumero(50);
        rep.adicionarNumero(47);
        System.out.println("Total: " +rep.calcularSoma());
        System.out.println("Maior número: " + rep.encontraNumeroMaio());
        System.out.println("Menor numero: " + rep.encontrarMenorNumero());
        rep.exibirNumeros();

    }



}
