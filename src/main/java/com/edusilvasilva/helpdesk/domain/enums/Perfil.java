package com.edusilvasilva.helpdesk.domain.enums;

public enum Perfil {
	
	ADMIN(0, "ROLER_ADMIN"), CLIENTE(1, "ROLER_CLIENTE"), TECNICO(2, "ROLER_TECNICO");
	
	private Integer codigo;
	private String descricao;
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	private Perfil(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Perfil x : Perfil.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Perfil inválido!");
	}
	
	

}
