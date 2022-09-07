package com.goodwill.hdr.civ.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.goodwill.hdr.civ.entity.Config;
import com.goodwill.hdr.civ.mapper.ConfigDao;
import com.goodwill.hdr.clinical_common.feign.RestServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/civ")
public class CivController {
    @Resource
    private RestServerFeign restServer;
    @Autowired
    private ConfigDao configDao;

    @GetMapping("/hello")
    public String hello(String s) {
        String echo = restServer.echo(s);
        return echo;
    }

    @GetMapping("/getConfig")
    public List<com.goodwill.hdr.civ.entity.Config> getConfig(String oid) {
      QueryWrapper<Config> queryWrapper=new QueryWrapper<Config>();
       return configDao.selectList(queryWrapper);
    }


}
