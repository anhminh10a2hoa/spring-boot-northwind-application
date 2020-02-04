package e1800956.vamk.fi.northwind.Report;

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
public class SalesReportsController {
    @Autowired
    private SalesReportsRepository repository;

    @RequestMapping(value = "/salesreports", method = RequestMethod.POST)
    public @ResponseBody SalesReports create(@RequestBody final SalesReports item) {
        return repository.save(item);
    }

    @RequestMapping(value = "/salesreports", produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Iterable<SalesReports> orderDetails(@RequestParam(value = "name", defaultValue = "World") final String name) {
        return repository.findAll();
    }

    @RequestMapping(value = "/salesreports/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public Optional<SalesReports> get(@PathVariable("id") final int id) {
        return repository.findById(id);
    }  
}