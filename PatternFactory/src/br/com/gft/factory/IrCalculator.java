package br.com.gft.factory;

public class IrCalculator extends InssCalculator implements Taxes {
	
	

	@Override
	public double calculate() {
		InssCalculator inss = new InssCalculator();
		double base;
		double inss2 = inss.calculate();
		System.out.println("Entre com o número de dependentes: ");
		int dep = sc2.nextInt();
		
		base = inss.getSalary() - inss2 - dep*189.59;
						
		if (base < 1903.98) {
			return 0;
		} else if (base < 2826.65) {
			return base* 0.075 - 142.80 ;
		} else if (base < 3751.05) {
			return base * 0.15 - 354.80;
		} else if (base < 4664.68) {
			return base * 0.225 - 636.13;
		} else {
			return base * 0.275 - 869.36;
		}

	}
	@Override
	public void getTax() {
		System.out.println("O valor a ser recolhido em IR é de R$" +i.format(calculate()));
	}
}
