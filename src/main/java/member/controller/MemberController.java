package member.controller;

import member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000/", allowCredentials = "true")
@Controller
@RequestMapping(value = "member")
public class MemberController {
    @Autowired //오토와이어나 생성자 사용하삼
    private MemberService memberService;


    //@RequestMapping(value="login", method = RequestMethod.GET)
    @GetMapping(value = "login")
    @ResponseBody
    public String login(@RequestParam String id, @RequestParam String pwd) {
        return memberService.login(id, pwd);

    }
}
