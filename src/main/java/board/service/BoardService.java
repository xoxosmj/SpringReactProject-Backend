package board.service;

import board.bean.BoardDTO;

import java.util.List;

public interface BoardService {
    public void boardWrite(String subject, String content); // 앞에 public 붙이는 이유?

    public List<BoardDTO> boardList();
}
