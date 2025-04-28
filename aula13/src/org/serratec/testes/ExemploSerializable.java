package org.serratec.testes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.serratec.entity.Fornecedor;

public class ExemploSerializable {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("ABC XPTO", "123");
		Fornecedor f2 = new Fornecedor("XYZ LTDA", "321");
		List<Fornecedor> fornecedores = new ArrayList<>();
		
		fornecedores.add(f1);
		fornecedores.add(f2);
		
		List<Fornecedor> fornecedoresLeitura = new ArrayList<>();
		
		
		try {
			FileOutputStream caminhoGravar = new FileOutputStream("C:/curso/fornecedor.dat");
			ObjectOutputStream gravarObjeto =  new ObjectOutputStream(caminhoGravar);
			gravarObjeto.writeObject(fornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			
		} catch (Exception e) {
			System.err.println("Problemas na gravação do objeto");
			e.printStackTrace();
		}
		
		System.out.println("----------------Recuperando Arquivo-----------------");
		try {
			FileInputStream caminhoLeitura = new FileInputStream("C:/curso/fornecedor.dat");
			ObjectInputStream lerObjeto = new ObjectInputStream(caminhoLeitura);
			fornecedoresLeitura = (List<Fornecedor>) lerObjeto.readObject();
			
		} catch (Exception e) {
			System.err.println("Problemas na leitura do arquivo");
			e.printStackTrace();
		}
		System.out.println("Dados da leitura do arquivo");
		System.out.println(fornecedoresLeitura);
	}

}
