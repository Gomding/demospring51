package com.example.demospring51;

import java.lang.annotation.*;


// RetentionPolicy 이 애너테이션 정보를 얼마나 유지할 것인가
@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface PerfLogging {
}
