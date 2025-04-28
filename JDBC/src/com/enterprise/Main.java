package com.enterprise;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DbFunctions db = new DbFunctions();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu login: ");
		String usuario = sc.nextLine();
		System.out.println("Insira sua senha: ");
		String senha = sc.nextLine();
		
		System.out.println("Insira o nome da tabela a ser criada: ");
		String table = sc.nextLine();
		System.out.println("Insira o nome do funcionario: ");
		String name = sc.nextLine();
		System.out.println("Insira o endereço do funcionario: ");
		String address = sc.nextLine();
		
		Connection connection = db.connect_to_db("enterprise", usuario, senha);
		db.createTable(connection , table);
		
		
		db.insertRow(connection, table, name, address);
		
		db.updateName(connection, table, "alexa", "Alexia");
		
		db.readData(connection, table);
		db.serachByName(connection, table, "Duda");
		db.serachById(connection, table, 1);
		db.deleteRowByName(connection, table, "Pedro" );
		db.deleteRowById(connection, table, 3 );
		db.deleteTable(connection, "employee");
		sc.close();
	}

}
