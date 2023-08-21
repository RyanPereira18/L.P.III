package Impostos;

import java.util.List;
import java.util.Map;

public class Produto{
	
	private String nome;
    private double precoCusto;
    private List<Imposto> impostos;
    private double margemLucro;

    public Produto(String nome, double precoCusto, List<Imposto> impostos, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.impostos = impostos;
        this.margemLucro = margemLucro;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPrecoVenda() {
        double impostosTotal = impostos.stream().mapToDouble(imposto -> precoCusto * imposto.getTaxa()).sum();
        double precoVenda = precoCusto + impostosTotal + (precoCusto * margemLucro);
        return precoVenda;
    }
    
}
