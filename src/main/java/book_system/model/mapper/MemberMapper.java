package book_system.model.mapper;

import book_system.model.dto.MemberDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {
    // 회원 등록
    @Insert("insert into members(memberName, memberPhone,  memberAddress)values(#{memberName}, #{memberPhone}, #{memberAddress})")
    public boolean regiMember(MemberDto memberDto);
    // 회원 수정
    @Update("update members set memberName = #{memberName}, memberPhone = #{memberPhone}, memberAddress = #{memberAddress} where memberId = #{memberId}")
    public boolean modiMember(MemberDto memberDto);
    // 회원 삭제
    @Delete("delete from members where memberId = #{memberId}")
    public boolean delMember(int memberId);
    // 회원 전체 조회
    @Select("select * from members")
    public List<MemberDto> allMembers();
    // 회원 개별 조회
    @Select("select * from members where memberId = #{memberId}")
    public MemberDto searchMember(int memberId);
}
