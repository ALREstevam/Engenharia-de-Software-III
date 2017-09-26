package model.notasFiscais;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class NotaFiscal implements Serializable{

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

        @Column
	private String prestadorNome;
        
        @Column
	private String prestadorEndereco;

        @Column
	private String prestadorCnpj;

        @Column
	private String tomadorNome;

        @Column
	private String tomadorEndereco;

        @Column
	private int tomadorCnpj;

        @Column
	private String prestadorOutrosDados;

        @Column
	private String tomadorOutrosDados;

        @Column
	private String servicosLista;

        @Column
	private float valorNota;

        @Column
	private float deducoes;

        @Column
	private float desconto;

        @Column
	private float base;

        @Column
	private float aliquota;

        @Column
	private float iss;

        @Column
	private float credito;

        @Column
	private String outros;

	/**
	 *  
	 */
	public void paraArquivo() {

	}

}
