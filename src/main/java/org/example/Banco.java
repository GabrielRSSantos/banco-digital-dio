package org.example;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Banco {
	private String nome;
	private List<Conta> contas;

	public void listarContas()
	{
		for(Conta conta : this.getContas()) {
			System.out.println("-----" + this.getNome() + "-----");
			conta.imprimirInfosComuns();
		}
	}
}
