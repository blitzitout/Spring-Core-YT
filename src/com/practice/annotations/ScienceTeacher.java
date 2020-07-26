package com.practice.annotations;

import org.springframework.stereotype.Component;

@Component("scienceTeacherObj")
public class ScienceTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("Science teacher has started teaching...");
    }
}
