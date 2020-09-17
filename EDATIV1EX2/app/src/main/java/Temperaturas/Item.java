package Temperaturas;

public class Item {
	public float valor;
	public Item next;
	public int index;

	public Item(float input){
		valor = input;
		next=null;
	}
}
