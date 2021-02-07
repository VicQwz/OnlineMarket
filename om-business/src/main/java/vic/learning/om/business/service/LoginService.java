package vic.learning.om.business.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

//    @HystrixCommand
    public String getUserLogin(){
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        return "userName: admin";
    }
}
