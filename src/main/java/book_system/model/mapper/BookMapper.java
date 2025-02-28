package book_system.model.mapper;

import book_system.model.dto.BookDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    // 도서 등록
    @Insert("insert into book(bookName, writer, publisher, bookLocation)values(#{bookName}, #{writer}, #{publisher}, #{bookLocation})")
    public boolean regiBook(BookDto bookDto);

    // 도서 수정
    @Update("update book set bookName = #{bookName}, writer = #{writer}, publisher = #{publisher}, bookLocation = #{bookLocation} where bookId = #{bookId}")
    public boolean modiBook(BookDto bookDto);
    
    // 도서 삭제
    @Delete("delete from book where bookId = #{bookId}")
    public boolean delBook(int bookId);

    // 도서 전체 조회
    @Select("select * from book")
    public List<BookDto> allBooks();

    // 도서 개별 조회
    @Select("select * from book where bookId = #{bookId}")
    public BookDto searchBook(int bookId);
}
