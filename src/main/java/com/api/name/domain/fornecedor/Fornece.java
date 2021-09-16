package com.api.name.domain.fornecedor;

import com.api.name.domain.evento.Evento;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "FORNECE")
@SequenceGenerator(name = "Fon_SQ", sequenceName = "FON_SQ", allocationSize = 1)
@Data
public class Fornece {

    @JoinColumn(name = "FOR_COD_FORN")
    @OneToOne
    private Fornecedor forn_cod;

    @ManyToOne
    @JoinColumn(name = "EVE_COD_EVEN")
    private Evento cod_eve;

    @Id
    @Column(name = "FON_COD_FORN")
    private long id;
}
