package aula;

import java.util.HashSet;
import java.util.Set;

public class TesteVeiculo {

	public static void main(String[] args) {
		  Set<Veiculo> veiculos = new HashSet<>();
	        
	        veiculos.add(new Veiculo("Toyota", "Corolla"));
	        veiculos.add(new Veiculo("Honda", "Civic"));
	        veiculos.add(new Veiculo("Ford", "Focus"));
	        veiculos.add(new Veiculo("Toyota", "Corolla")); 
	        veiculos.add(new Veiculo("Toyota", "Yaris")); 
	        
	        for (Veiculo v : veiculos) {
	            System.out.println(v);
	        }
	}

}
