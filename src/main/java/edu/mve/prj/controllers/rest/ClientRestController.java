package edu.mve.prj.controllers.rest;

import edu.mve.prj.model.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/client")
public class ClientRestController {
    List <Client> clients = Stream.of(
            new Client("1","Alex Sergeevich", "Chernivtsi","123445",
                    LocalDate.of(2003, Month.APRIL,2), "esche tot bomj"),
            new Client("2","Bomj Gena", "Chernivtsi pod mostom","16543241",
                    LocalDate.of(2001, Month.APRIL,8), "esche tot bomj"),
            new Client("3","Alex Sergeevich", "Chernivtsi","123445",
                    LocalDate.of(2003, Month.APRIL,2), "esche tot bomj"),
            new Client("1","Alex Sergeevich", "Chernivtsi","123445",
                    LocalDate.of(2003, Month.APRIL,2), "esche tot bomj"))
            .collect(Collectors.toList());

    @RequestMapping("/list")
    List<Client> getAll() {
        return clients;
    }
}
