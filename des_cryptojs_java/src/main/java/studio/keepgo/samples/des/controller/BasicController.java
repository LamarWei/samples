package studio.keepgo.samples.des.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import studio.keepgo.samples.des.tool.DesCrypt;

/**
 * <p>
 * </p>
 *
 * @author KeepGo Lamar
 * @email lamar_7950@hotmail.com
 * @date 2017/4/13
 */
@Controller
public class BasicController {

    @RequestMapping("/des")
    public String viewIndex(){
        return "index";
    }

    @RequestMapping(value = "/decrypt",method = RequestMethod.POST)
    @ResponseBody
    public String decrypt(@RequestParam("text") String text,@RequestParam("key") String key) throws Exception {
        DesCrypt crypt = new DesCrypt();
        crypt.setKEY(key);
        return crypt.decode(text);
    }
}
