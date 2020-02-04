package e1800956.vamk.fi.northwind.InventoryTransaction;

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
public class InventoryTransactionTypesController {
    @Autowired
    private InventoryTransactionTypesRepository repository;

    @RequestMapping(value = "/inventorytransactiontypes", method = RequestMethod.POST)
    public @ResponseBody InventoryTransactionTypes create(@RequestBody final InventoryTransactionTypes item) {
        return repository.save(item);
    }

    @RequestMapping(value = "/inventorytransactiontypes", produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Iterable<InventoryTransactionTypes> orderDetails(@RequestParam(value = "name", defaultValue = "World") final String name) {
        return repository.findAll();
    }

    @RequestMapping(value = "/inventorytransactiontypes/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Optional<InventoryTransactionTypes> get(@PathVariable("id") final int id) {
        return repository.findById(id);
    }  
}