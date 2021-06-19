package com.example.cafe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyCafeController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello()
    {
        return "<h1>Hey How are you fucking idiot?</h1>";
    }

    @RequestMapping("/cafe")
    public String showWelcomePage(Model model)
    {
//        model.addAttribute("myNameValue", myName);
        return "welcome-page";
    }

    @RequestMapping("/processOrder")
    public String processOrder(HttpServletRequest request, Model model)
    {
        // handle the data return from the user
        String userInputValue = request.getParameter("foodType");

        // set the user data with the model object and send it to view
        model.addAttribute("userInput", userInputValue);
        return "process-order";
    }

}
