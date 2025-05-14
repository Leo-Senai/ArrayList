package ExemploArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo2 {
public static void main(String[] args) {
	
	String[] disciplinas = {"Matemática" , "Filosofia" , "História" , "Física" };
	
	
	ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
	novaLista.add("Geografia ");
	novaLista.add("Língua Inglesa ");
	
	for(String i:novaLista) {
		System.out.println(" Disciplinas: "  + i);
		
	    }	
  
   }
}
