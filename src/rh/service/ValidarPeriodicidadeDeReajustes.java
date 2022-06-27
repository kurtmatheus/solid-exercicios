package rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import rh.ValidacaoException;
import rh.model.Funcionario;

public class ValidarPeriodicidadeDeReajustes implements ValidarReajuste {
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		long dataDesdeUltimoReajuste = ChronoUnit.MONTHS.between(funcionario.getDataUltimoReajuste(), LocalDate.now());
		if(dataDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Data do último Reajuste não pode ser menor que 6 meses!");
		}
	}
}
