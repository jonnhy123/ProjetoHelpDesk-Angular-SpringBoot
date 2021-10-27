package com.main.helpdesk.domain.enums;

public enum Status {
	/**
	 * Create enum by: @author Jhonatan
	 *
	 *  26 de out. de 2021 23:33:56 
	 */
	
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO"); 
	
	private Integer codigo;
	
	private String descricao;

	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (Status element : Status.values()) {
			if (cod.equals(element.getCodigo())) {
				return element;
			}
		}
		
		throw new IllegalArgumentException("Status inválido !!!");
	}
}
