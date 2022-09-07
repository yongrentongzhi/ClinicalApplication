package com.goodwill.hdr.clinical_common.api.rest_server;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rest-server")
public interface RestApi {
    @PostMapping("/echo")
    String echo(@RequestBody String s);
}
