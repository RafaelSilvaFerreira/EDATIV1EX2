package Temperaturas;

public class Lista{

private Item head;
public static int tamanho;

	public Lista(){
		head = null;
		tamanho=0;
	}
	
public boolean Vazia(){
	return tamanho==0;
}
	
public void AdicionarInicio(float input){
	Item novo = new Item(input);
	novo.next=head;
	head = novo;
	tamanho++;
	System.out.println("item adicionado ao início da lista");
}

public void AdicionarFinal(float input){
	if (Vazia()){
		AdicionarInicio(input);
	}
	else{
		Item aux=head;
		while(aux.next!=null){
			aux=aux.next;
		}
		Item novo=new Item(input);
		aux.next=novo;
		tamanho++;
		System.out.println("item adicionado ao fim da lista");
	}
}

public void AdicionarIndice(float input, int pos){
	if (pos>1 && pos<=tamanho){
		Item atual = head;
		int i=1;
		while(i<pos-1){
			atual= atual.next;
			i++;
		}
		Item novo = new Item(input);
		
		novo.next=atual.next;
		atual.next=novo;
		
		tamanho++;
		System.out.println("item adicionado ao índice: "+ i+1);
		
	}
	else if (pos==1){
		AdicionarInicio(input);
	} 
	else if (pos==tamanho+1){
		AdicionarFinal(input);
	} 
	else {
		System.out.println("Posição inválida!");
		return;
	}
}

public float RemoverInicio(){
	float removido=head.valor;
	head=head.next;
	tamanho--;
	return removido;
}


public float RemoverFinal(){
	float removido=0;
	if (head.next==null){
		removido=head.valor;
		head=null;
	}
	else{
		Item atual=head;
		Item aux=head;
		while(atual.next!=null){
			aux=atual;
			atual=atual.next;
		}
		removido =atual.valor;
		aux.next=null;
	}
	tamanho--;
	return removido;
}

public float RemoverIndice(int pos){
	
	float removido=head.valor;
	if(pos==1){
		return RemoverInicio();
	}
	else 
	if (pos==tamanho){
		return RemoverFinal();
	}
	else{
		Item atual= head;
		int i=1;
		while (i<pos){
			atual=atual.next;
			i++;
		}
		removido = atual.next.valor;
		atual.next=null;
		if(atual.next.next!=null){
			atual.next= atual.next.next;
		}
		tamanho--;
		return removido;
	}
	
}



public String Percorre(){
	Item atual=head;
	String concat=" ";
	while(atual!=null){
		concat=concat+"\n"+atual.valor;
		atual=atual.next;
	}
	;
	return concat;
}

}
