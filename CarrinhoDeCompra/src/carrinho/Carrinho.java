package carrinho;
import java.util.ArrayList;
import java.util.List;

import itens.item;
public class Carrinho {
		private List<item> itens;
		
			public Carrinho() {
				this.itens = new ArrayList<item>();
			}
			
			public void adicionarItemCarrinho(String nomeProduto, double preco, int qtd) {
						
						itens.add(new item(nomeProduto, preco, qtd));
				
				
			}
			
			public void removerItemCarrinho(String nomeProduto) {
				List<item> itensParaRemover = new ArrayList<item>();
				for (item produto : itens) {
					if(produto.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
						itensParaRemover.add(produto);
					}			
				}
				
				itens.removeAll(itensParaRemover);	
			}
			
			public String calcularValorTotal() {
				double vlSubTotal = 0;
				double vlTotal = 0;
				for(item produto : itens) {
					 vlSubTotal =  (produto.getPrecoProduto() * produto.getQtdProduto());
					 vlTotal += vlSubTotal;
				}
				
				return String.format("%.2f", vlTotal);
			}
			
			public void exibirItens() {
				System.out.println(itens);
			}
			
			public static void main(String[] args) {
					Carrinho itensCarrinho = new Carrinho();
					itensCarrinho.adicionarItemCarrinho("Laptop Levono", 1599.90, 2);
					itensCarrinho.adicionarItemCarrinho("Smartphone Apple", 3599.90, 1);
					itensCarrinho.adicionarItemCarrinho("Tablet Samsung", 2599.90, 1);
					
					itensCarrinho.exibirItens();
					
					itensCarrinho.removerItemCarrinho("Laptop Levono");
					
					itensCarrinho.exibirItens();
					System.out.println("Total Carrinho: R$ " + itensCarrinho.calcularValorTotal());
			}
			
			

}
