package Impostos;

public class Imposto {
	private String nome;
    private double taxa;

    public Imposto(String nome, double taxa) {
        this.nome = nome;
        this.taxa = taxa;
    }

    public String getNome() {
        return nome;
    }

    public double getTaxa() {
        return taxa;
    }
}
