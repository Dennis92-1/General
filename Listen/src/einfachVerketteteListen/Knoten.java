package einfachVerketteteListen;

public class Knoten {
	
	Integer i;
	Knoten next;
	
	public Knoten(Integer i) {
		this.i = i;
		this.next = null;
	}
	
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	public Knoten getNext() {
		return next;
	}
	public void setNext(Knoten next) {
		this.next = next;
	}
}
