package com.sgp.api.dto;

import java.util.List;

import com.sgp.api.model.Tarefa;
import com.sgp.api.model.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Usuario responsavel;
    private List<Tarefa> tarefas;
    private int qtdTarefasPendentes;
    private int qtdTarefasEmAndamento;
    private int qtdTarefasFinalizadas;

}
