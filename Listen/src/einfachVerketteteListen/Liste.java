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
	public void add(Knoten einf�gen) {
		if(this.start == null) {
			start = einf�gen;
			return;
		}
		Knoten temp = start;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(einf�gen);
		
	}
	
	//Aufgabe b)			klappt nicht
	public void addAbsteigend(Knoten einf�gen) {
		if(this.start == null) {
			start = einf�gen;
			return;
		}
		
		//ersten Tauschen
		Knoten temp = start;
		if(temp.getI() < einf�gen.getI()) {
			einf�gen.setNext(start);
			start = einf�gen;
			return;							// nicht vergessen
		}
		
		//einf�gen in Mitte
		temp = start;
		Knoten n�chster = start.getNext();
		while(n�chster.getNext() != null) {
			if(n�chster.getI() < einf�gen.getI()) {
				System.out.println("Hallo");
				temp = temp.getNext();
				n�chster = n�chster.getNext();
			}		
		}
		//System.out.println("Werte : " + temp.getI()    + " "   + n�chster.getI());
		temp.setNext(einf�gen);
		einf�gen.setNext(n�chster);
		
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
