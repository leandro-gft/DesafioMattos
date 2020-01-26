package br.com.gft.factory;

public class TaxesFactory implements ITaxesFactory {

	@Override
	public Taxes calculateTax() {
		System.out.println("1 - IR");
		System.out.println("2 - INSS");
		System.out.println("3 - Sair");
		System.out.println("Qual imposto deseja calcular? ");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			return new IrCalculator();
		case 2:
			return new InssCalculator();
		default:
			System.out.println("Opção inválida.");
			break;
		}

		return null;

	}

}
