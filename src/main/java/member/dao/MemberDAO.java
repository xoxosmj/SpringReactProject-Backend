package member.dao;

import member.bean.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MemberDAO {

    MemberDTO login(Map<String, String> map);
}
