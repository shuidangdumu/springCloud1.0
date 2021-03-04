package com.yun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ajaxController")
public class AjaxController {
    @Autowired
    TestClient client;

    @PostMapping(value = "/submit")
    public String getStringByFeign(HttpServletRequest request){
        String remark = (String)request.getParameter("remark");
        return remark + " call back value";
    }
}
