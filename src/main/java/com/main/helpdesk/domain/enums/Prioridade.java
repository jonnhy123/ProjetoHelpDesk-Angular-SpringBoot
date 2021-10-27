package com.main.helpdesk.domain.enums;

public enum Prioridade {
	/**
	 * Create enum by: @author Jhonatan
	 *
	 *  26 de out. de 2021 23:33:56 
	 */
	
	BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA"); 
	
	private Integer codigo;
	
	private String descricao;

	private Prioridade(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Prioridade toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (Prioridade element : Prioridade.values()) {
			if (cod.equals(element.getCodigo())) {
				return element;
			}
		}
		
		throw new IllegalArgumentException("Prioridade inválido !!!");
	}
}
