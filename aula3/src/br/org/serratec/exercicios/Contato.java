package br.org.serratec.exercicios;

//import java.util.*;

public class Contato {
    private String nome;
    private Telefone[] listaTelefonica;
    private Endereco endereco;

    
    public Contato(String nome, Endereco endereco, Telefone[] listaTelefonica) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaTelefonica = listaTelefonica;
    }


    public String getNome() {
        return nome;
    }
    

    public Telefone[] getListaTelefonica() {
        return listaTelefonica;
    }
    

    public void adicionarTelefone(Telefone number) {
    	for (int i = 0; i < listaTelefonica.length; i++) {
    		if (listaTelefonica[i] == null) {
    			listaTelefonica[i] = number;
    		}
    	}
    }
    

    public void getTelefones() {
    	for (Telefone telefones: listaTelefonica) {
    		System.out.println("\nTelefone:\t" + telefones.numero);
    	}
    }
  
    public Endereco getEndereco() {
        return endereco;
    }


	@Override
	public String toString() {
		return "Nome = " + nome + "\n" + endereco.toString();
	}
        
    
}
