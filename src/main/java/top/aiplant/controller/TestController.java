package top.aiplant.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.aiplant.entity.UserModel;
import top.aiplant.service.UserService;

@Controller
public class TestController {

	@Autowired
    private UserService userService;
	
	@RequestMapping("/plant")
	public String getMain() {
		return "index";
	}
	
	@RequestMapping(value = "/json")
    @ResponseBody
    public Map<String, Object> json(HttpServletRequest request, HttpServletResponse response) {
		String temperature = request.getParameter("field1");
		String humidity = request.getParameter("field2");
		String heat = request.getParameter("field3");
		System.err.println("温度：" + temperature + "\t湿度：" + humidity + "\t热度：" + heat);
		
        Map<String, Object> map = new HashMap<>();
        List<UserModel> users = userService.getUserList();
        map.put("success", "返回成功");
        map.put("code", 200);
        map.put("data",users);
        return map;
    }

}
