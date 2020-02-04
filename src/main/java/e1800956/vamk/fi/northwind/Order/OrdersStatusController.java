package e1800956.vamk.fi.northwind.Order;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class OrdersStatusController {
    @Autowired
    private OrdersStatusRepository repository;

    @RequestMapping(value = "/ordersstatus", method = RequestMethod.POST)
    public @ResponseBody OrdersStatus create(@RequestBody final OrdersStatus item) {
        return repository.save(item);
    }

    @RequestMapping(value = "/ordersstatus", produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Iterable<OrdersStatus> orderDetails(@RequestParam(value = "name", defaultValue = "World") final String name) {
        return repository.findAll();
    }

    @RequestMapping(value = "/ordersstatus/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Optional<OrdersStatus> get(@PathVariable("id") final int id) {
        return repository.findById(id);
    }  
}