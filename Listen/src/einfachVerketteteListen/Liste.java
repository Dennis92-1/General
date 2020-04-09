package einfachVerketteteListen;

public class Liste {
	
	Knoten start;
	
	public Liste() {
		
	}

	public Knoten getStart() {
		return start;
	}

	public void setStart(Knoten start) {
		this.start = start;
	}
	
	
	//Aufgabe a)
	public void add(Knoten einfügen) {
		if(this.start == null) {
			start = einfügen;
			return;
		}
		Knoten temp = start;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(einfügen);
		
	}
	
	//Aufgabe b)			klappt nicht
	public void addAbsteigend(Knoten einfügen) {
		if(this.start == null) {
			start = einfügen;
			return;
		}
		
		//ersten Tauschen
		Knoten temp = start;
		if(temp.getI() < einfügen.getI()) {
			einfügen.setNext(start);
			start = einfügen;
			return;							// nicht vergessen
		}
		
		//einfügen in Mitte
		temp = start;
		Knoten nächster = start.getNext();
		while(nächster.getNext() != null) {
			if(nächster.getI() < einfügen.getI()) {
				System.out.println("Hallo");
				temp = temp.getNext();
				nächster = nächster.getNext();
			}		
		}
		//System.out.println("Werte : " + temp.getI()    + " "   + nächster.getI());
		temp.setNext(einfügen);
		einfügen.setNext(nächster);
		
	}
	
	//Aufgabe c)
	public void print() {
		Knoten temp = start;
		while(temp != null) {
			System.out.print(temp.getI() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	//Aufgabe d)
	public Knoten last() {
		Knoten temp = this.start;
	
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	//Aufgabe e)
	
	public void addAtX(int x, Knoten k) {
		
		if(x == 0) {
			k.setNext(start);
			start = k;
		}else {
			
			Knoten temp = start;
			for (int i = 1; i < x; i++) {
				temp = temp.getNext();
			}
			Knoten temp2 = temp.getNext();
			k.setNext(temp2);
			temp.setNext(k);
		}

	}
}
