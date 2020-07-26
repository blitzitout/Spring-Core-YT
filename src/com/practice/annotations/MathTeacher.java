package com.practice.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mathTeacherObj")
@Primary
public class MathTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("Math teacher has started teaching...");
    }
}
