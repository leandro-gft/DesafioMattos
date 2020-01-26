package br.com.gft.factory;

import java.text.DecimalFormat;
import java.util.Scanner;

public interface Taxes {
	Scanner sc2 = new Scanner (System.in);
	DecimalFormat i = new DecimalFormat("#,###.00");
	
public double calculate();

public void getTax();

}