package com.pk.service.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

@Component
public class TransferJson {

    @Autowired
    private ObjectMapper objectMapper = null;

    private FilterProvider provider = null;

    @PostConstruct
    public void generateProvider() {

        PropertyFilter clientFilter1 = SimpleBeanPropertyFilter.filterOutAllExcept("encClientId", "clientName", "clientEmail", "status");
        provider = new SimpleFilterProvider().addFilter("clientFilter", clientFilter1);
    }

    public String filterLoginClientInfo(Map<String, Object> clientJson) throws JsonProcessingException {
        return objectMapper.setFilterProvider(provider).writeValueAsString(clientJson);
    }
}
