package member.service.impl;

import member.bean.MemberDTO;
import member.dao.MemberDAO;
import member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    @Autowired
    private HttpSession session; //세션 요청

    @Override
    public String login(String id, String pwd) {
        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        map.put("pwd", pwd);

        MemberDTO memberDTO = memberDAO.login(map);
        if (memberDTO == null) {
            return "fail";
        } else {
//            HttpSession session1 = request.getSession();
            session.setAttribute("memId", memberDTO.getId());
            session.setAttribute("memName", memberDTO.getName());
            session.setAttribute("memEmail", memberDTO.getEmail1() + "@" + memberDTO.getEmail2());
            return "success";
        }
    }
}
