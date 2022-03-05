package com.example.couch_mapping.service;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import com.example.couch_mapping.model.AddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    private Database db;

    public List<AddressDto> getAll() throws IOException {
        List<AddressDto> allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(AddressDto.class);
        return allDocs;
    }

    public AddressDto getAddressDto(String id) throws IOException {
        AddressDto address = db.find(AddressDto.class, id);
        return address;
    }

    public String add(AddressDto address) {
        Response response = db.post(address);
        String id = response.getId();
        return id;
    }
}
