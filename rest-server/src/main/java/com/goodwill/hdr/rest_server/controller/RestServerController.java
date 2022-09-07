package com.goodwill.hdr.rest_server.controller;

import com.goodwill.hdr.clinical_common.api.rest_server.RestApi;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestServerController implements RestApi {

    public String echo(String s){
        return s;
    }
}
