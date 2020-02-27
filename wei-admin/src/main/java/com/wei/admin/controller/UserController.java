package com.wei.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei
 * @date 2019/12/27
 */
@Slf4j
@Api("获取用户信息")
@RestController
@RequestMapping("/v2")
public class UserController {

    @Value("${name}")
    private String name;

    @ApiOperation(value = "", notes = "姓名")
    @GetMapping("/get-user-name")
    public String getName(){
        log.info("用户名为：{}", name);
        return name;
    }

}
