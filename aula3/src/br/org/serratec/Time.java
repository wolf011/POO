package br.org.serratec;

import java.util.Arrays;

public class Time {
    private String nome;
    private String tecnico;
    private Atleta[] elenco;
    
    
    public Time(String nome, String tecnico, Atleta[] elenco) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.elenco = elenco;
    }


    @Override
    public String toString() {
        return "Time = " + nome + "\nTecnico=" + tecnico + ",\nElenco = " + Arrays.toString(elenco);
    }


    public String getNome() {
        return nome;
    }


    public String getTecnico() {
        return tecnico;
    }


    public Atleta[] getElenco() {
        return elenco;
    }


    public void adicionarAtleta(Atleta atleta){
        for (int i = 0; i < elenco.length; i++ ){
            if (elenco[i] == null) {
                elenco[i] = atleta;
                break;
            }

        }
    } 


    public void imprimirElenco() {
        // ForEach -- utilizado para percorrer arrays.
        for (Atleta atleta : elenco) {
            System.out.println(atleta);
        }
    }
}
