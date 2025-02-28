package book_system.controller;

import book_system.model.dto.MemberDto;
import book_system.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    // 1 회원 등록
    @PostMapping("")
    public boolean regiMember(@RequestBody MemberDto memberDto) {
        System.out.println("MemberCotntroller.regiMember()");
        System.out.println("MemberDto: " + memberDto);
        return memberService.regiMember(memberDto);

    }

    // 2 회원 수정
    @PutMapping("")
    public boolean modiMember(@RequestBody MemberDto memberDto) {
        System.out.println("MemberCotntroller.modifyMember()");
        System.out.println("MemberDto: " + memberDto);
        return memberService.modiMember(memberDto);
    }

    // 3 회원 삭제
    @DeleteMapping("")
    public boolean delMember(@RequestParam int memberId) {
        System.out.println("MemberCotntroller.delMember()");
        System.out.println("memberId: " + memberId);
        return memberService.delMember(memberId);
    }

    // 4 회원 전체 조회
    @GetMapping("")
    public List<MemberDto> allMembers(){
        System.out.println("MemberCotntroller.allMembers()");
        return memberService.allMembers();
    }

    // 5 회원 개별 조회
    @GetMapping("/searchmember")
    public MemberDto searchMember(@RequestParam int memberId){
        System.out.println("MemberCotntroller.searchMember()");
        System.out.println("memberId: " + memberId);
        return memberService.searchMember(memberId);
    }
} // c end
