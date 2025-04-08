package com.sgp.api.dto;

import java.time.LocalDate;

import com.sgp.api.constants.Prioridade;
import com.sgp.api.constants.StatusTarefa;
import com.sgp.api.model.Projeto;
import com.sgp.api.model.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaDTO {

    private Long id;
    private String titulo;
    private Projeto projeto;
    private Usuario usuario;
    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
    private int qtdeDiasTrabalhados;
    private Prioridade prioridade;
    private StatusTarefa status;

}
