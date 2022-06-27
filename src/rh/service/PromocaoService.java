package rh.service;

import rh.ValidacaoException;
import rh.model.Cargo;
import rh.model.Funcionario;

public class PromocaoService {
	
	public void promover (Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if(Cargo.GERENTE == funcionario.getCargo()) {
			throw new ValidacaoException("Gerente n�o pode ser promovido!");
		}
		
		if (metaBatida) {
			Cargo cargo = cargoAtual.getProximoCargo();
			funcionario.promoverFuncionario(cargo);
		} else {
			throw new ValidacaoException("Funcionario n�o bateu a meta!");
		}
	}
}
