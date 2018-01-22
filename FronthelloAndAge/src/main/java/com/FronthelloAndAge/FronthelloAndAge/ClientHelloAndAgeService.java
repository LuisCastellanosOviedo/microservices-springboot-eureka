package com.FronthelloAndAge.FronthelloAndAge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by LuisCO on 21/01/2018.
 */

@Service
public class ClientHelloAndAgeService {

    @Autowired
    protected RestTemplate restTemplate;
    protected String serviceUrl;

    public ClientHelloAndAgeService(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl: "http://" + serviceUrl;
    }

    //invoke to greeting-service and return a Greeting object
    public String greeting (String name) {
        String greeting =  restTemplate.getForObject(serviceUrl + "/greeting/{name}",String.class, name);

        return greeting;
    }
}
