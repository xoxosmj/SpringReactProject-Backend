package board.controller;

import board.bean.BoardDTO;
import board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins =  "http://localhost:3000/", allowCredentials = "true")
@Controller
@RequestMapping(value = "board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    //@RequestMapping(value = "boardWrite",method= RequestMethod.POST) // 무슨뜻
    @PostMapping(value = "boardWrite") // 윗줄과의 차이?
    @ResponseBody // 무슨뜻
    public void boardWrite(@RequestParam String subject, @RequestParam String content) {
        System.out.println("11131");
        boardService.boardWrite(subject, content);

    }

    @GetMapping(value="boardList")
    @ResponseBody
    public List<BoardDTO> boardList(){ //객체로 돌아오는 것을 배열로 반환한다.//[BoardDTO(~~~),[BoardDTO(~~~),[BoardDTO(~~~),
        List<BoardDTO> list = boardService.boardList();
        System.out.println("boardList = " + list); // 로그 추가
        return boardService.boardList();
    }

}
