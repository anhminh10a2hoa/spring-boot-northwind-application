package e1800956.vamk.fi.northwind.Shipper;

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
public class ShippersController {
    @Autowired
    private ShippersRepository repository;

    @RequestMapping(value = "/shippers", method = RequestMethod.POST)
    public @ResponseBody Shippers create(@RequestBody final Shippers item) {
        return repository.save(item);
    }

    @RequestMapping(value = "/shippers", produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Iterable<Shippers> orderDetails(@RequestParam(value = "name", defaultValue = "World") final String name) {
        return repository.findAll();
    }

    @RequestMapping(value = "/shippers/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Optional<Shippers> get(@PathVariable("id") final int id) {
        return repository.findById(id);
    }  
}