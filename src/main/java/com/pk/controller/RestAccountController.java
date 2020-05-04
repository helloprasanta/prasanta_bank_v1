package com.pk.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.model.Account;
import com.pk.model.Branch;
import com.pk.repository.AccountRepository;
import com.pk.service.business.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(value = "/rest/account", produces = APPLICATION_JSON_UTF8_VALUE)
public class RestAccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountRepository accountRepository;


    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "/insert-branch", method = RequestMethod.POST)
    public Map<String, String> insertBranch(@RequestBody Account account, HttpServletRequest httpServletRequest) {
        Map<String, String> response = new HashMap<String, String>();
        Account ac = accountService.insertAccount(account);
//            clientService.insertClient(client);
//            response.put("message", messageResourceUtil.getMessage("message.client.insert"));
//            response.put("statusCode", "INSERT_SUCCESSFULLY");
        return response;
    }
}
