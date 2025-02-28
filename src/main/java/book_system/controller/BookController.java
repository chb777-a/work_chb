package book_system.controller;

import book_system.model.dto.BookDto;
import book_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired private BookService bookService;

    // 1 도서 등록
    @PostMapping("")
    public boolean regiBook(@RequestBody BookDto bookDto){
        System.out.println("BookController.regiBook");
        System.out.println("bookDto = " + bookDto);
        return bookService.regiBook(bookDto);
    } // f end

    // 2 도서 수정
    @PutMapping("")
    public boolean modiBook(@RequestBody BookDto bookDto){
        System.out.println("BookController.modiBook");
        System.out.println("bookDto = " + bookDto);
        return bookService.modiBook(bookDto);
    }

    // 3 도서 삭제
    @DeleteMapping("")
    public boolean delBook(@RequestParam int bookId){
        System.out.println("BookController.delBook");
        System.out.println("bookId = " + bookId);
        return bookService.delBook(bookId);
    }

    // 4 도서 전체 조회
    @GetMapping("")
    public List<BookDto> allBooks(){
        System.out.println("BookController.AllBooks");
        return bookService.allBooks();
    }

    // 5 도서 개별 조회
    @GetMapping("/searchbook")
    public BookDto searchBook(@RequestParam int bookId) {
        System.out.println("BookController.searchBook");
        System.out.println("bookId = " + bookId);
        return bookService.searchBook(bookId);  // 이제 BookDto 객체를 반환
    }
} // c end
