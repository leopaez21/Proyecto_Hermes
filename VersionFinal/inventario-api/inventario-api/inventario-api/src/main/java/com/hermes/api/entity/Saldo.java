package com.hermes.api.entity;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Saldos")

public class Saldo {
    
    @Id
    private Integer idproducto;
    private Integer saldo;

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

	@Override
	public String toString() {
		return "Saldo [idproducto=" + idproducto + ", saldo=" + saldo + ", getIdproducto()=" + getIdproducto()
				+ ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

   
    
}
