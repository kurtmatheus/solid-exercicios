package rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public String getNome() {
		return this.dadosPessoais.getNome();
	}

	public void setNome(String nome) {
		this.dadosPessoais.setNome(nome);;
	}

	public String getCpf() {
		return this.dadosPessoais.getCpf();
	}

	public void setCpf(String cpf) {
		this.dadosPessoais.setCpf(cpf);
	}

	public Cargo getCargo() {
		return this.dadosPessoais.getCargo();
	}

	public void setCargo(Cargo cargo) {
		this.dadosPessoais.setCargo(cargo);
	}

	public BigDecimal getSalario() {
		return this.dadosPessoais.getSalario();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promoverFuncionario(Cargo cargo) {
		this.dadosPessoais.setCargo(cargo);
	}

}
