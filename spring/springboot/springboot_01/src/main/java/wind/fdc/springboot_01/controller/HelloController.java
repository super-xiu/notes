package wind.fdc.springboot_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xlx
 * @Date: 2021/7/24
 * @Description:Wind.FDC.springboot_01.controller
 * @version:1.0
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    String sayHello(){
        return "hello world";
    }

    @RequestMapping("")
    String user(){
        return "123";
    }
}
