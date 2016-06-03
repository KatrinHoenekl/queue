package at.fhj.itm.abgabe08b;

import java.util.NoSuchElementException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TestQueue {

	public static void main(String[] args) {
		StringQueue queue = new StringQueue();
		
	String q1=	queue.poll();
	System.out.println(" " +q1);
	
	try{
		queue.remove();
	}catch(NoSuchElementException e){
		System.out.println("NoSuchElementException-Meldung");
		
	}
	queue.offer("x1");
	queue.offer("x2");
	queue.offer("x3");
	
	String q2 = queue.remove();
	System.out.println("Wert " + q2);
	
	String q3 = queue.peek();
	
	System.out.println("Wert " + q3);
	
	String q4 = queue.remove();
	System.out.println("Wert " + q4);
	
	queue.remove();
	
	try{
		queue.element();
	}catch(NoSuchElementException e){
		System.out.println("NoSuchElementException-Meldung");
		
	}
	

	}

}
