package com.goodwill.hdr.rest_client.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("/rest-server")
public class RestServerFeign {
}
