package org.serratec.exemplos;

import java.util.Map;
import java.util.TreeMap;

public class Mapinha {
// Criar uma classe para inserir em um mapa de sigla e nome de estados e percorrer para imprimir a chave o valor.
	public static void main(String[] args) {
		
		Map<String, String> mapinha = new TreeMap<>();
		
        // Região Norte
        mapinha.put("AC", "Acre");
        mapinha.put("AP", "Amapá");
        mapinha.put("AM", "Amazonas");
        mapinha.put("PA", "Pará");
        mapinha.put("RO", "Rondônia");
        mapinha.put("RR", "Roraima");
        mapinha.put("TO", "Tocantins");
        
        // Região Nordeste
        mapinha.put("AL", "Alagoas");
        mapinha.put("BA", "Bahia");
        mapinha.put("CE", "Ceará");
        mapinha.put("MA", "Maranhão");
        mapinha.put("PB", "Paraíba");
        mapinha.put("PE", "Pernambuco");
        mapinha.put("PI", "Piauí");
        mapinha.put("RN", "Rio Grande do Norte");
        mapinha.put("SE", "Sergipe");
        
        // Região Centro-Oeste
        mapinha.put("DF", "Distrito Federal");
        mapinha.put("GO", "Goiás");
        mapinha.put("MT", "Mato Grosso");
        mapinha.put("MS", "Mato Grosso do Sul");
        
        // Região Sudeste
        mapinha.put("ES", "Espírito Santo");
        mapinha.put("MG", "Minas Gerais");
        mapinha.put("RJ", "Rio de Janeiro");
        mapinha.put("SP", "São Paulo");
        
        // Região Sul
        mapinha.put("PR", "Paraná");
        mapinha.put("RS", "Rio Grande do Sul");
        mapinha.put("SC", "Santa Catarina");
    
        
        for (String sigla: mapinha.keySet()) {
            System.out.println(sigla);
        }
        
        
        for (String estados : mapinha.values()) {
        	System.out.println(estados);
		}
        
        
        for (Map.Entry<String, String> dados : mapinha.entrySet()) {
//        	System.out.println(dados);
			System.out.println(dados.getKey());
			System.out.println(dados.getValue());
		}
	}

}
