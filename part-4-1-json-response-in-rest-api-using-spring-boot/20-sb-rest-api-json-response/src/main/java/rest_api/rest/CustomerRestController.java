package rest_api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rest_api.Customer;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerRestController
{

    // for save
    @PostMapping(value = "/customer", produces = "text/plain", consumes = "application/json")
    public ResponseEntity<String> addCustomer(@RequestBody Customer c)
    {
        System.out.println(c);
//        TODO : DB logic
        String body = "Customer added..";
        return new ResponseEntity<>(body, HttpStatus.CREATED);
    }



    //    DeleteMapping
    @DeleteMapping(value = "/customer/{cid}", produces = "text/plain")
    public String deleteCustomer(@PathVariable Integer cid)
    {
//        TODO : DB logic
        return "Customer deleted..";
    }

//    for update
    @PutMapping(value = "/customer", produces = "text/plain", consumes = "application/json")
    public String updateCustomer(@RequestBody Customer c)
    {
        System.out.println(c);
//        TODO : DB logic
        return "Customer updated...";
    }


    // for get
    @GetMapping(value = "/customer", produces = "application/json")
    public Customer getCustomer()
    {
        // get it from db
        Customer c = new Customer(1, "Aashu", "aashu@gmail.com");
        return c;
    }

    // get the list
    @GetMapping(value = "/customers", produces = "application/json")
    public List<Customer> getCustomers()
    {
        // get it from db
        Customer c1 = new Customer(1, "Aashu", "aashu@gmail.com");
        Customer c2 = new Customer(2, "Abhi", "abhi@gmail.com");
        Customer c3 = new Customer(3, "Ram", "ram@gmail.com");

        List<Customer> customers = Arrays.asList(c1, c2, c3);

        return customers;
    }

}
