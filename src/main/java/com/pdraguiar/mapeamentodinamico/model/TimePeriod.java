package com.pdraguiar.mapeamentodinamico.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimePeriod {
    private String from;
    private String to;
}
