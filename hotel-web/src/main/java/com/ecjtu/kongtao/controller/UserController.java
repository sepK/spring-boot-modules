package com.ecjtu.kongtao.controller;

import com.ecjtu.kongtao.bean.User;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;

/**
 * @author t.k
 * @date 2018/12/11 11:42
 */
@Controller
@RequestMapping(value = "/userC")
public class UserController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/info")
    public String info(HttpServletRequest request, Model model) {
        User user = userService.getUserById(1);
        model.addAttribute("user",user);
        return "hello";
    }
}
