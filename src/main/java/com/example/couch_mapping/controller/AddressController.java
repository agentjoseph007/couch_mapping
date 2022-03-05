package com.example.couch_mapping.controller;

import com.example.couch_mapping.model.AddressDto;
import com.example.couch_mapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService service;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<AddressDto> getAll() throws IOException {
        return service.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public @ResponseBody
    AddressDto getAddressDto(@PathVariable String id) throws IOException {
        return service.getAddressDto(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    String add(@RequestBody AddressDto address) {
        return service.add(address);
    }


}