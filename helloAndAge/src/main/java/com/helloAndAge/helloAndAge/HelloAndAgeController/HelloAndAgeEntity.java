package com.helloAndAge.helloAndAge.HelloAndAgeController;

import java.io.Serializable;

/**
 * Created by LuisCO on 21/01/2018.
 */
public class HelloAndAgeEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dateBorn;

    public HelloAndAgeEntity(String dateBorn) {
        this.dateBorn = dateBorn;
    }


    public String getDateBorn() {
        return dateBorn;
    }
}
