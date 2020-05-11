package com.pk.service.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.pk.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Component
public class ManagerJson {

    @Autowired
    private ObjectMapper objectMapper = null;

    private FilterProvider provider = null;

    @PostConstruct
    public void generateProvider() {

        PropertyFilter managerFilter1 = SimpleBeanPropertyFilter.filterOutAllExcept("mId", "mEmail", "mName", "mPassword");
        PropertyFilter branchFilter1 = SimpleBeanPropertyFilter.filterOutAllExcept("brId", "brAddress", "brName", "brNo");
        provider = new SimpleFilterProvider().addFilter("managerFilter", managerFilter1).addFilter("branchFilter", branchFilter1);
    }

    public String filterLoginManagerInfo(List<Manager> managerJson) throws JsonProcessingException {
        return objectMapper.setFilterProvider(provider).writeValueAsString(managerJson);
    }
}


/*

package com.tts.service.json;

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
public class ClientJson {

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
*/

