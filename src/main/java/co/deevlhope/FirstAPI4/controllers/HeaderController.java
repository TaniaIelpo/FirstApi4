package co.deevlhope.FirstAPI4.controllers;

import co.deevlhope.FirstAPI4.services.HeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tania Ielpo
 */

@RestController
public class HeaderController {


    private HeaderService headerService;
    @Autowired
    public HeaderController(HeaderService headerService){
        this.headerService=headerService;
    }
    @GetMapping
    public ResponseEntity<String> getInfo(@RequestHeader HttpHeaders headers){

            return new ResponseEntity<String>(this.headerService.getInfo(headers), HttpStatus.OK);
    }
}
