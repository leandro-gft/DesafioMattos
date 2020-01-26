package br.com.gft.main;
import br.com.gft.factory.ITaxesFactory;
import br.com.gft.factory.TaxesFactory;


public class Main {
public static void main(String[] args) {
	
	ITaxesFactory factory = new TaxesFactory();
	factory.calculateTax().getTax();

	
}
}
