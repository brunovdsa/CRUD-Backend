package br.com.feltex.clienteapi.controller.dto;

import lombok.Data;
import java.time.Instant;

@Data
public class IncluirClienteResponse {
    private Long id;
    private String nome;
    private String telefone;
    private String observacao;
    private String tipoFornecedor;
    private String email;
    private Instant dataCadastro;
    private Instant ultimaAtualizacao;
}
