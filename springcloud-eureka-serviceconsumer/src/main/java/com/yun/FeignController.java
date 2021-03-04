package com.yun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/testFeign")
public class FeignController {
    @Autowired
    TestClient client;
//    @GetMapping(value = "/getStr")
//    public String getStringByFeign(){
//        return client.testFeign("test feign");
//    }
    @GetMapping(value = "/getStr")
    public String getStringByFeign(HttpServletRequest request,HttpServletResponse response)throws Exception{
//        String remark = (String)request.getParameter("remark");
//        response.sendRedirect("test");
        return "test";
    }

    @GetMapping(value = "/submit")
    public String getStringByFeign(HttpServletRequest request){
        String remark = (String)request.getParameter("remark");
        request.setAttribute("remarkValue",remark);
        return "test";
    }


//    @RequestMapping(value = "/getStr")
//    public String getStringByFeign(){
//        return client.testFeign2();
//    }
}
