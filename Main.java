package generics;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		1) ----------------------------------------------------------- 
		Uva u = new Uva("Branca");
		ClasseGenerica<Uva> uva = new ClasseGenerica<Uva>(u);
		Uva u2 = uva.getAtributo();
		ClasseGenerica<Integer> inteiro = new ClasseGenerica<Integer>(10);
		int inteiro2 = inteiro.getAtributo();
		ClasseGenerica<String> str = new ClasseGenerica<String>("String");
		String str2 = str.getAtributo();
		
		
//		2) ----------------------------------------------------------- 
		Produto<Integer> produtoInt = new Produto<Integer>(1, 89.9);
		Produto<String> produtoStr = new Produto<String>("2", 45.5);
		
		System.out.println(produtoInt.toString());
		System.out.println(produtoStr.toString());
		
//		3) ----------------------------------------------------------- 
		Livro livro = new Livro(1);
		Celular cel = new Celular(2);
		Pedido pedido = new Pedido();
		
		pedido.add(livro);
		pedido.add(cel);
		
		System.out.println(pedido.mostrar());
		
//		4) ----------------------------------------------------------- 
		ElementoGenerico<Integer> el = new ElementoGenerico<>("key1", 10);
		ElementoGenerico<Uva> el1 = new ElementoGenerico<>("key2", u);
		ElementoGenerico<Integer> el2 = new ElementoGenerico<>("key1", 10);
		ListaGenerica lista = new ListaGenerica();
		
		System.out.println(lista.add(el));
		System.out.println(lista.add(el1));
		System.out.println(lista.add(el2));
		
		System.out.println(lista.findByKey("key1").toString());
		
//		5) ----------------------------------------------------------- 
//		c) 1, 2, 4, 5.                                

//		6) ----------------------------------------------------------- 
//		c) List<Discente> lstDiscente = new ArrayList<>().

		
		
	}

}
