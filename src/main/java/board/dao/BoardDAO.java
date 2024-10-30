package board.dao;

import board.bean.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardDAO {


    public void boardWrite(Map<String, String> map);

    public void refUpdate();

    List<BoardDTO> boardList();
}
