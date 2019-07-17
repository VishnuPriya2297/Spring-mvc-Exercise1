package main.com.stackroute.spring;

import main.com.stackroute.spring.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController extends AbstractController
{

    @RequestMapping("/")
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
    {
        ModelAndView mv=new ModelAndView();
        User user=new User("vishnu Priya");
        mv.setViewName("display");
        mv.addObject("result",user.getName());
        return mv;
    }
}
