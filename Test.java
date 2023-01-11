
public class Test {

	public static void main(String[] args) {
		TDAList<Integer> lint = new LinkedList<Integer>();
		//LinkedList<Integer> lint = new LinkedList<Integer>();

		// LLENANDO LA LISTA
		lint.insertFirst(10);
		System.out.println(lint);
		lint.insertFirst(14);
		System.out.println(lint);
		lint.insertFirst(7);
		System.out.println(lint);
		lint.insertFirst(23);
		System.out.println(lint);
		lint.insertFirst(18);
		System.out.println(lint);
		lint.insertFirst(6);
		System.out.println(lint);
		lint.insertFirst(19);
		System.out.println(lint);
		lint.insertFirst(25);
		System.out.println(lint);
		
		//BORRANDO EL PRIMERO
		System.out.println("\nELIMINANDO EL PRIMERO");
		lint.remove(25);
		System.out.println(lint);
		
		//BORRANDO ÚLTIMO
		System.out.println("\nELIMINANDO EL ÚLTIMO");
		lint.remove(10);
		System.out.println(lint);
		
		//BORRANDO UN ELEMENTO QUE NO ESTÁ
		System.out.println("\nELIMINANDO ELEMENTO INEXISTENTE");
		lint.remove(500);
		System.out.println(lint);
		
		//INSERTANDO
		System.out.println("\nINSERTANDO EN MEDIO");
		lint.insert(55, 3);
		System.out.println(lint);
		
		System.out.println("\nINSERTANDO EL PRIMERO");
		lint.insert(1, 0);
		System.out.println(lint);
		
		System.out.println("\nINSERTANDO EL ÚLTIMO");
		lint.insert(100, 19);
		System.out.println(lint);
	
		
		
//		LinkedList<Integer> lint2 = new LinkedList<Integer>();
//		System.out.println("\nLINT2");
//		lint2.remove(2513);
//		System.out.println(lint2);


//		System.out.println();
//		System.out.println(lint2);
//		lint.insert(16, 1);
//		System.out.println(lint);

//		System.out.println("Está 18? : " + lint.search(18));
//		System.out.println("Está 180? : " + lint.search(180));

//		lint.insertLast(10);
//		System.out.println(lint);
//		lint.insertLast(14);
//		System.out.println(lint);
//		lint.insertLast(7);
//		System.out.println(lint);
//		lint.insertFirst(23);
//		System.out.println(lint);
//		lint.insertFirst(18);
//		System.out.println(lint);
//		lint.insertFirst(6);
//		System.out.println(lint);
//		lint.insertFirst(19);
//		System.out.println(lint);
//		lint.insertFirst(25);
//		System.out.println(lint);
//
//		System.out.println("Está 18? : " + lint.search(18));
//		System.out.println("Está 180? : " + lint.search(180));
	}
}
