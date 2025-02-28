package book_system.service;

import book_system.model.dto.BookDto;
import book_system.model.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookService {
    @Autowired private BookMapper bookMapper;

    // 1 도서 등록
    public boolean regiBook(BookDto bookDto){
        return bookMapper.regiBook(bookDto);
    }

    // 2 도서 수정
    public boolean modiBook(BookDto bookDto){
        return bookMapper.modiBook(bookDto);
    }

    // 3 도서 삭제
    public boolean delBook(int bookId){
        return bookMapper.delBook(bookId);
    }
    // 4 도서 전체 조회
    public List<BookDto> allBooks(){
        return bookMapper.allBooks();
    }

    // 5 도서 개별 조회
    public BookDto searchBook(int bookId){
        return bookMapper.searchBook(bookId);
    }
}
