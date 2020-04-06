package com.jm.springboot_mybatis_demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jm.pojo.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringbootMybatisDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void jsonTest(){
        List<Object> list = new ArrayList<>();
        UserEntity userEntity = new UserEntity(001,"小美",18,233);
        UserEntity userEntity2 = new UserEntity(002,"李华",19,222);
        UserEntity userEntity3 = new UserEntity(003,"小名",21,333);
        list.add(userEntity);
        list.add(userEntity2);
        list.add(userEntity3);

        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(list));
//        System.out.println(jsonArray);
//        List<Object> o = Collections.singletonList(list);

        /*for (Object o : list) {
            JSONObject s = JSONObject.parseObject(JSON.toJSONString(o));
            System.err.println(s);
        }*/
        for (Object o : jsonArray) {
            Map map = JSON.parseObject(JSONObject.toJSONString(o), Map.class);
            System.out.println(map.get("sname"));
        }
    }

}
