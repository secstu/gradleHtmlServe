package com.devops.servehtml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class serveHtml {

    @RequestMapping("/")
    public String serveFile() {
        return "index.html";
    }

}
