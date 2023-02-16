package org.green.seenema.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.green.seenema.vo.MemberVO;

@Mapper
public interface MemberMapper {

    public int loginCheck(MemberVO member);

    public int idCheck(String id);

    public void regMember(MemberVO member);
}