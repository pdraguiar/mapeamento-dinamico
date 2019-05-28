package com.pdraguiar.mapeamentodinamico.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private HashMap<String, List<Appointment>> appointments;
}
