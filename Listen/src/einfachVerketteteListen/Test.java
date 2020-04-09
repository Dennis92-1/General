package einfachVerketteteListen;

public class Test {

	public static void main(String[]args) {
		Liste l = new Liste();
		Knoten eins = new Knoten(1);
		Knoten zwei = new Knoten(2);
		Knoten drei = new Knoten(3);
		
		l.addAbsteigend(eins);
		l.print();
		l.addAbsteigend(drei);
		l.print();
		l.addAbsteigend(zwei);
		l.print();
		
		Knoten k = l.last();
		System.out.println(k.getI());
		
		l.addAtX(0, new Knoten(4));
		l.print();
		
		Knoten vier = new Knoten(5);
		l.add(vier);
		l.print();
		System.out.println(l.last().getI());
	}
}

