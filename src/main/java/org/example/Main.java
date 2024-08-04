package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
		final var gabriel = Cliente.builder().nome("Gabriel").build();
		final var gustavo = Cliente.builder().nome("Gustavo").build();

		Conta cc1 = new ContaCorrente(gabriel);
		Conta cp1 = new ContaPoupanca(gabriel);

		Conta cc2 = new ContaCorrente(gustavo);
		Conta cp2 = new ContaPoupanca(gustavo);

		var bancoSantader = Banco.builder().nome("Santander").contas(List.of(cc1, cp2)).build();
		var bancoBradesco = Banco.builder().nome("Bradesco").contas(List.of(cc2, cp1)).build();

		bancoSantader.listarContas();
		bancoBradesco.listarContas();

//		cc1.depositar(100);
//		cc1.transferir(100, cp1);
//
//		cc1.imprimirExtrato();
//		cp1.imprimirExtrato();
        }
    }