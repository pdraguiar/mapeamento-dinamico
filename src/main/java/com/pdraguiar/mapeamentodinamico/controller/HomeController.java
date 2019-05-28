package com.pdraguiar.mapeamentodinamico.controller;

import com.pdraguiar.mapeamentodinamico.model.Appointment;
import com.pdraguiar.mapeamentodinamico.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/v1/home")
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @PostMapping
    public void createTopic(@RequestBody Response response) {
        LOGGER.info("JSONRPC: {}", response.getJsonrpc());
        LOGGER.info("ID: {}", response.getId());
        LOGGER.info("--- Listando das datas ---\n");

        HashMap<String, List<Appointment>> result = response.getResult();

        result.forEach((date, appointments) -> {
            LOGGER.info("\tData: {}", date);

            appointments.forEach(appointment -> {
                LOGGER.info("\t\tType: {}", appointment.getType());

                appointment.getEvents().forEach(event -> {
                    LOGGER.info("\t\t\t{} - {}", event.getFrom(), event.getTo());
                });
            });
            LOGGER.info("\n\n");
        });
    }
}
