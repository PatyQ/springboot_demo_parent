package com.jm.controller;

import com.jm.pojo.UserEntity;
import com.jm.service.IMyBatisService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@RestController
//@Api(value = "用户controller",tags = {"用户操作接口"})
public class MybatisTestController {

    @Autowired
    private IMyBatisService iMyBatisService;

    @ApiOperation(value = "查询了用户", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = UserEntity.class),
            @ApiResponse(code = 201, message = "失败", response = UserEntity.class)
    })
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", example = "18")
    @RequestMapping("getUser/{id}")
    public UserEntity getUser(@PathVariable int id, HttpServletRequest request, ServletRequest servletRequest){

        System.out.println("re"+request.getRequestURL());
        System.out.println("re"+request.getContextPath()+"上下文路径");
        System.out.println("re"+request.getRemoteHost()+"remoteHost");
        System.out.println("=========================");
        System.out.println(servletRequest.getRemoteAddr());
        System.out.println(servletRequest.getRemoteHost());
        System.out.println(servletRequest.getRemotePort());
        UserEntity user = iMyBatisService.getUser(id);

        return user;
    }

    @RequestMapping("getJSON")
    public void jsonTest(){

    }
}
