package board.service.impl;

import board.bean.BoardDTO;
import board.dao.BoardDAO;
import board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {

    @Autowired
    private HttpSession session;
    @Autowired
    private BoardDAO boardDAO;

    @Override
    public void boardWrite(String subject, String content) {
        System.out.println("11132");
        String id = (String) session.getAttribute("memId");
        String name = (String) session.getAttribute("memName");
        String email = (String) session.getAttribute("memEmail");

        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("email", email);
        map.put("subject", subject);
        map.put("content", content);

        boardDAO.boardWrite(map);
        boardDAO.refUpdate();

    }

    @Override
    public List<BoardDTO> boardList() {

        return boardDAO.boardList();
    }
}
