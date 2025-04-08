package br.org.serratec;

public class Imovel {
    private String tipo;
    private Double valor;
    private Proprietario proprietario;  //Relacionamento
    
    public Imovel(String tipo, Double valor, Proprietario proprietario) {
        this.tipo = tipo;
        this.valor = valor;
        this.proprietario = proprietario;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    @Override
    public String toString() {
        return "Tipo = " + tipo + ", \nValor = " + valor + ", \nProprietario = " + proprietario;
    }

    
    
}
