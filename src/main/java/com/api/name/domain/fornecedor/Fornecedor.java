package com.api.name.domain.fornecedor;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "FORNECEDOR")
@SequenceGenerator(name = "for_SQ", sequenceName = "FOR_SQ", allocationSize = 1)
@Data
@NoArgsConstructor
public class Fornecedor {

    @Id
    @Column(name = "FOR_COD_FORN")
    //@GeneratedValue(generator = "FOR_SQ", strategy =  GenerationType.SEQUENCE)
    private long cod;

    @Column(name = "FOR_NOME_FORN")
    private String nome_forn;

    @Column(name = "FOR_RAMO_FORN")
    private String ramo_forn;

    @Column(name = "FOR_CNPJ_FORN")
    private long cnpj_forn;

    @OneToOne
    @JoinColumn(name = "CON_COD_CONT")
    private Contato con_cod;

    /*public Fornecedor(long cod, String nome_forn, String ramo_forn, long cnpj_forn, long con_cod){
        this.cod = cod;
        this.nome_forn = nome_forn;
        this.ramo_forn = ramo_forn;
        this.cnpj_forn = cnpj_forn;
        this.con_cod = con_cod;
    }*/

}
