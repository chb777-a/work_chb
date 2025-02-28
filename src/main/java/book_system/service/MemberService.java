package book_system.service;

import book_system.model.dto.MemberDto;
import book_system.model.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired private MemberMapper memberMapper;

    // 1 회원 등록
    public boolean regiMember(MemberDto memberDto){
        return memberMapper.regiMember(memberDto);
    }

    // 2 회원 수정
    public boolean modiMember(MemberDto memberDto){
        return memberMapper.modiMember(memberDto);
    }

    // 3 회원 삭제
    public boolean delMember(int memberId){
        return memberMapper.delMember(memberId);
    }

    // 4 회원 전체 조회
    public List<MemberDto> allMembers(){
        return memberMapper.allMembers();
    }

    // 5 회원 개별 조회
    public MemberDto searchMember(int memberId){
        return memberMapper.searchMember(memberId);
    }
}
