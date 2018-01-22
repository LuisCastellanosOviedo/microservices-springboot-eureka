package com.helloAndAge.helloAndAge.HelloAndAgeController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LuisCO on 21/01/2018.
 */


@RestController
public class HelloAndAgeController {

    @RequestMapping("/greeting/{dateBorn}")
    public String helloAndAgeService(@PathVariable("dateBorn") String dateBorn) {
        return getHiAndAge(new HelloAndAgeEntity(dateBorn).getDateBorn());
    }
    public String getHiAndAge(String dateBorn){
        return " hiiiiiiiiiiii  mr from "+dateBorn;
    }
}
