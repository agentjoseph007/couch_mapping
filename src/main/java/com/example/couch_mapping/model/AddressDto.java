package com.example.couch_mapping.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class AddressDto {
    @JsonProperty("_id")
    String id;

    @JsonProperty("_rev")
    String revision;

    @JsonProperty("street_number")
    String streetNumber;

    @JsonProperty("street_name")
    String streetName;

    @JsonProperty("city_name")
    String cityName;

    @JsonProperty("zip_code")
    String zipCode;

    String status;
}
