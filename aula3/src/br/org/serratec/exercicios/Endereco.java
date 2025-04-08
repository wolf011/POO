package br.org.serratec.exercicios;

public class Endereco {
    protected String rua;
    protected String bairro;
    protected String cep;
    protected Cidade cidade;
    
    
    public Endereco(String rua, String bairro, String cep, Cidade cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }


	public String getRua() {
		return rua;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCep() {
		return cep;
	}


	public Cidade getCidade() {
		return cidade;
	}

	
	@Override
	public String toString() {
		return rua + ", " + bairro + ", " + cep + ", " + cidade;
	}

    
}
