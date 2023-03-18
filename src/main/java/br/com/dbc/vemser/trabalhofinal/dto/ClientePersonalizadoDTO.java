package br.com.dbc.vemser.trabalhofinal.dto;

import br.com.dbc.vemser.trabalhofinal.entity.TipoUsuario;
import lombok.Data;

import java.util.List;

@Data
public class ClientePersonalizadoDTO {

    private Integer idCliente;
    private Integer idConvenio;
    private Integer idUsuario;
    private String cadastroOrgaoRegulador;
    private Integer taxaAbatimento;
    private Integer cpf;
    private String email;
    private String nome;
    private TipoUsuario tipoUsuario;
    private String contatos;
    private String cep;
    private Integer numero;
    private List<AgendamentoDTO> agendamentoDTOList;
}
