package com.pdraguiar.mapeamentodinamico.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Appointment {
    private String type;
    private List<Object> dd;
    private List<TimePeriod> events;
}
