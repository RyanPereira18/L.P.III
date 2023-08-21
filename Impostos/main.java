package Impostos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		
		 List<Imposto> impostosPadrao = new ArrayList<>();
	        impostosPadrao.add(new Imposto("Confins", 0.12));
	        impostosPadrao.add(new Imposto("ICMS", 0.07));
	        impostosPadrao.add(new Imposto("ISS", 0.05));
	        impostosPadrao.add(new Imposto("IPI", 0.08));
	        impostosPadrao.add(new Imposto("Cide", 0.10));
	        impostosPadrao.add(new Imposto("CSLL", 0.04));

	        List<Produto> produtos = new ArrayList<>();
	        produtos.add(new Produto("Arroz", 7.00, impostosPadrao.subList(0, 3), 0.20));
	        produtos.add(new Produto("Feijão", 7.00, impostosPadrao.subList(0, 3), 0.25));
	        produtos.add(new Produto("Carne", 7.00, impostosPadrao.subList(0, 2), 0.35));
	        produtos.add(new Produto("Cerveja", 7.00, impostosPadrao.subList(0, 4), 0.30));
	        produtos.add(new Produto("Gás", 7.00, impostosPadrao.subList(0, 2), 0.15));
	        produtos.add(new Produto("Gasolina", 7.00, impostosPadrao.subList(0, 3), 0.15));

	        System.out.println("Lista de Preços de Venda:");
	        for (Produto produto : produtos) {
	            double precoVenda = produto.calcularPrecoVenda();
	            System.out.println(produto.getNome() + ": R$" + precoVenda);
	        }
    }
}
