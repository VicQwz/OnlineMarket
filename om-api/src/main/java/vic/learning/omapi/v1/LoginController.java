package vic.learning.omapi.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vic.learning.om.business.service.LoginService;

/**
 * 登录控制层
 * @author qinweizhong 
 */
@RestController
@RequestMapping("/service/v1")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String loginSystem(){
        return loginService.getUserLogin();
    }
}
