package br.com.gft.factory;

import java.util.Scanner;

public interface ITaxesFactory {
	Scanner sc = new Scanner(System.in);
	
	public Taxes calculateTax();
	
}
