package com.pdraguiar.mapeamentodinamico.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private String id;
    private String jsonrpc;
    private HashMap<String, List<Appointment>> result;
}
