package com.farani.mobile.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa física"), PESSOAJURIDICA(2, "Pessoa jurídica");

	private int cod;
	private String descricao;

	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoCliente cliente : TipoCliente.values()) {
			if (cod.equals(cliente.getCod())) {
				return cliente;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
