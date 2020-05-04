package com.pk.controller;

import com.pk.model.Withdraw;
import com.pk.repository.WithdrawRepository;
import com.pk.service.business.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(value = "/rest/withdraw", produces = APPLICATION_JSON_UTF8_VALUE)
public class RestWithdrawController {

    @Autowired
    private WithdrawService withdrawService;

    @Autowired
    private WithdrawRepository withdrawRepository;


    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "/insert-withdraw", method = RequestMethod.POST)
    public Map<String, String> insertWithdraw(@RequestBody Withdraw withdraw, HttpServletRequest httpServletRequest) {
        Map<String, String> response = new HashMap<String, String>();
        Withdraw wd = withdrawService.insertWithdraw(withdraw);
//            clientService.insertClient(client);
//            response.put("message", messageResourceUtil.getMessage("message.client.insert"));
//            response.put("statusCode", "INSERT_SUCCESSFULLY");
        return response;
    }


}
