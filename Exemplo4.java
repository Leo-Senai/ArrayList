package ExemploArrayList;

import java.util.ArrayList;

public class Exemplo4 {
public static void main(String[] args) {
	//CRIANDO UM ARRAYLIST DE NUMEROS INTEIROS

	ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	numeros.add(10);//ADICIONANDO ELEMENTOS AO ARRAYLIST
	numeros.add(20);
	
	System.out.println(numeros.get(0)); //SAIDA: 10 //ACESSANDO ELEMENTOS DO ARRAYLIST
	System.out.println(numeros.get(1)); //SAIDA: 20
	
	numeros.set(1,  25);
    System.out.println(numeros.get(1)); //SAIDA:25 //MODIFICANDO UM ELEMENTO DO ARRAYlIST
 
    numeros.remove(0);
    System.out.println(numeros.get(0)); //SAIDA: 25 //REMOVENDO UM ELEMENTO DO ARRAYLIST
    
    System.out.println(numeros.size()); //SAIDA: 1 //OBTENDO O TAMANHO DO ARRAYLIST
    
    System.out.println(numeros);

}
}
