package com.goodwill.hdr.clinical_common.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RestApi {
    @PostMapping("/rest-server/echo")
    String echo(@RequestBody String s);
}
