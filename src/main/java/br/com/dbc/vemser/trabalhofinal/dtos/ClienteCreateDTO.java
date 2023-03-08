package br.com.dbc.vemser.trabalhofinal.dtos;

import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class ClienteCreateDTO {

    @Min(value = 1)
    private Integer idUsuario;
    
    private Integer idConvenio;

}
