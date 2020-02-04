package e1800956.vamk.fi.northwind.Purchase;

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
public class PurchaseOrderDetailsController {
    @Autowired
    private PurchaseOrderDetailsRepository repository;

    @RequestMapping(value = "/purchaseorderdetails", method = RequestMethod.POST)
    public @ResponseBody PurchaseOrderDetails create(@RequestBody final PurchaseOrderDetails item) {
        return repository.save(item);
    }

    @RequestMapping(value = "/purchaseorderdetails", produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Iterable<PurchaseOrderDetails> orderDetails(@RequestParam(value = "name", defaultValue = "World") final String name) {
        return repository.findAll();
    }

    @RequestMapping(value = "/purchaseorderdetails/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Optional<PurchaseOrderDetails> get(@PathVariable("id") final int id) {
        return repository.findById(id);
    }  
}