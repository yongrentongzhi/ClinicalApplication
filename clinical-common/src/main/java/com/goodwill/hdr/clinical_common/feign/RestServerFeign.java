package com.goodwill.hdr.clinical_common.feign;

import com.goodwill.hdr.clinical_common.api.rest_server.RestApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("rest-server")
public interface RestServerFeign extends RestApi {

}
