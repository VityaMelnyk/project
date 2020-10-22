package edu.mve.prj.controllers.rest;

import edu.mve.prj.model.Item;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
    @RequestMapping("/api/item")
    public class ItemRestController {
       List<Item> list = Stream.of(
               new Item("1", "Coca-Cola","Drink", LocalDateTime.now(), LocalDateTime.now()),
               new Item("2","Pepsi", "Drink",LocalDateTime.now(),LocalDateTime.now()),
               new Item("3","Sprite","Drink", LocalDateTime.now(),LocalDateTime.now())
       ).collect(Collectors.toList());

    @RequestMapping("/all")
    List<Item> getAll() {

        return list;
    }
    @RequestMapping("/delete/{id}")
    String deleteById(@PathVariable("id") String id) {
        Item item = list.stream().filter(element -> element.getId().equals(id))
                .findFirst().orElse(null);
        list.remove(item);

        return "redirect:/api/item/all";
    }
}
