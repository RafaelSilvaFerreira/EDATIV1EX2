package Temperaturas;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

	Lista ex =new Lista();
	Scanner input = new Scanner(System.in);
	
	System.out.println("Lista de temperaturas"+
		"\n\t1-Checar se a lista está Vazia"+
		"\n\t2-Adicionar item ao início da lista"+
		"\n\t3-Adicionar item ao final da lista"+
		"\n\t4-Adicionar item a um índice"+
		"\n\t5-Remover item do início da lista"+
		"\n\t6-Remover item do final da lista"+
		"\n\t7-Remover item em um índice"+
		"\n\t8-Exibir lista");
		
	int opt=0;
	boolean ainda = true;
	while (ainda){
	opt = input.nextInt();
	
	switch (opt){
		case 1: 
	if(ex.Vazia()){
		System.out.println("sim");
	}
	else {
		System.out.println("não");
	}
		break;
		
		case 2:
	System.out.print("Insira o valor:");
	ex.AdicionarInicio(input.nextFloat());
	System.out.println("Tamanho da lista: "+
	ex.tamanho);
		break;
		
		case 3:
	System.out.print("Insira o valor:");
	ex.AdicionarFinal(input.nextFloat());
		break;
		
		case 4: 
	System.out.print("Insira o valor:");
	float valor = input.nextFloat();
	System.out.print("Insira o índice:");
	ex.AdicionarIndice(valor,input.nextInt());
		break;
		
		case 5:
			if(ex.Vazia()){
	System.out.println("Lista vazia!");}
			else {
	System.out.println(ex.RemoverInicio());}
		break;

		case 6:
			if(ex.Vazia()){
	System.out.println("Lista vazia");}
			else {
	System.out.println(ex.RemoverFinal());}
		break;
		
		case 7:
	if(ex.Vazia()){
		System.out.println("Lista vazia");
	}
	else {
		System.out.println("Insira o índice: ");
		int pos = input.nextInt();
		if(pos < 1||pos > Lista.tamanho){
			System.out.println("Posição"+
			" Invalida!");
		}
		else{
			System.out.println("removido:"+
			ex.RemoverIndice(pos)
			);
		}
	}
		break;
	
		case 8:
	System.out.println(ex.Percorre());
		break;
		case 9:
	ainda = false;
		break;
		
		default:
	System.out.println("Seleção inválida!");
		break;
		
		}
	}
	input.close();
}


}
