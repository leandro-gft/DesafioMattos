package br.com.gft.factory;



public class InssCalculator implements Taxes {
	private double salary;
	
	@Override
	public double calculate() {
		System.out.println("Entre com o seu salário bruto: ");
		salary = sc2.nextDouble();
     	if (salary < 3050.52) {
			return salary* 0.09;
		} else if (salary < 6101.06) {
			return salary * 0.11;
		} else {
			return 6101.06 * 0.11;
		}
		
	}
	@Override
	public void getTax() {
		System.out.println("O valor a ser recolhido em INSS é de R$" +i.format(calculate()));
	}
	
	public double getSalary() {
		return salary;
	}

}
