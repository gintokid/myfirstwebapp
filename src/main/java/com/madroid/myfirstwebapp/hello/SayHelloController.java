package com.madroid.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //"say-hello" => "Hello Guy!"
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello Guy! How are you ?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        return "<html>" +
               "<head>" +
               "<title>My fitst HTML Page </title>" +
               "</head>" +
               "<body>" +
               "My first HTML page with body" +
               "</body>" +
               "</html>";
    }

    // src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    // ne pas mettre response body
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

}
