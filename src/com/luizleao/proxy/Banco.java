package com.luizleao.proxy;
import java.text.DecimalFormat;

public class Banco {
	private int totalClientes;
	private double saldoClientes;

	public Banco() {
		totalClientes = (int) (Math.random() * 100);
		saldoClientes = (double) (Math.random() * 100000);
	}

	public String getTotalClientes() {
		return new String("Total de clientes: " + totalClientes);
	}

	public String getSaldoClientes() {
		DecimalFormat format = new DecimalFormat("#.##");
		return new String("Saldo Total dos Clientes: R$ " + format.format(saldoClientes));
	}
}
