package rh.service;

import java.math.BigDecimal;

import rh.model.Funcionario;

public interface ValidarReajuste {
	void validar(Funcionario funcionario, BigDecimal aumento);
}
