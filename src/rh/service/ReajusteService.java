package rh.service;

import java.math.BigDecimal;
import java.util.List;

import rh.model.Funcionario;

public class ReajusteService {
	
	List<ValidarReajuste> validacoes;
	
	public ReajusteService(List<ValidarReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		validacoes.forEach(v -> v.validar(funcionario, aumento));
		
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

}
