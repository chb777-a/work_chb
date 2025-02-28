package book_system.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDto {
    // 회원 고유 번호
    private int memberId;
    // 회원 이름
    private String memberName;
    // 회원 전화번호
    private String memberPhone;
    // 회원 주소
    private String memberAddress;

}
