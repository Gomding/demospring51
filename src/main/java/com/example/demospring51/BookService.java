package com.example.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    // @Qualifier("주입 받고 싶은 빈의 이름")  하지만 @Primary 가 더 타입 세이프함(추천)
    @Autowired
    BookRepository myBookRepository;

    public void printBookRepository() {
        System.out.println(myBookRepository.getClass());
    }

    /*@Autowired(required = false) // 만약 빈 주입을 Optional로 하려면 required 를 추가해서 사용
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }*/

    /*
    생성자로 빈을 주입받으면 빈이 없을 시 아예 BookService 의 빈이 만들어지지 않음
    필드나 setter를 이용해서 빈을 주입받으면 @Autowired(required = false)를 이용해서 빈 주입을 선택적으로 받을 수 있음
     */

}
