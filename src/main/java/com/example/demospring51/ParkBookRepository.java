package com.example.demospring51;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/*
@Primary를 붙여주면 사용할 빈을 marking 할 수 있습니다.
 */
@Repository @Primary
public class ParkBookRepository implements BookRepository{
}
