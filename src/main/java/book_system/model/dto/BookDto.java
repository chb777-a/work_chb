package book_system.model.dto;

import lombok.*;

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter@ToString
public class BookDto {
    // 책 고유 번호
    private int bookId;
    // 책 이름
    private String bookName;
    // 저자
    private String writer;
    // 출판사
    private String publisher;
    // 책 위치
    private int bookLocation;

}
