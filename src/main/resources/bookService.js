console.log("bookService open");

// 1 도서 등록 함수
const regiBook = async () => {
    const bookName = document.querySelector(".bookname").value;
    const writer = document.querySelector(".writer").value;
    const publisher = document.querySelector(".publisher").value;
    const bookLocation = document.querySelector(".book_location").value;

    const obj = {bookName, writer, publisher, bookLocation};
    console.log(obj);
    const response = await axios.post('/books')
    if (response.data == true){ console.log("도서 등록 성공"); allBooks();}
    else { console.log("도서 등록 실패")}
}

// 2 도서 수정 함수
const modiBook = async () => {
}

// 3 도서 삭제 함수
const delBook = async () => {
}

// 4 도서 전체 조회 함수
const allBooks = async () => {
}

// 5 도서 개별 조회 함수
const searchBook = async () => {
}
