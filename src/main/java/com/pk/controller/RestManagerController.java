package com.pk.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pk.model.Manager;
import com.pk.repository.ManagerRepository;
import com.pk.service.business.ManagerService;
import com.pk.service.json.ManagerJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(value = "/rest/manager", produces = APPLICATION_JSON_UTF8_VALUE)
public class RestManagerController {

    @Autowired
    private ManagerService managerService;

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private ManagerJson managerJson;


    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "/insert-manager", method = RequestMethod.POST)
    public Map<String, String> insertManager(@RequestBody Manager manager, HttpServletRequest httpServletRequest) {
        Map<String, String> response = new HashMap<String, String>();
        Manager mr = managerService.insertManager(manager);
//            clientService.insertClient(client);
//            response.put("message", messageResourceUtil.getMessage("message.client.insert"));
//            response.put("statusCode", "INSERT_SUCCESSFULLY");
        return response;
    }


    @Transactional(readOnly = true)
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAllManagers() throws JsonProcessingException {
//        return managerRepository.findAll();
        return managerJson.filterLoginManagerInfo(managerRepository.findAll());

    }

}
