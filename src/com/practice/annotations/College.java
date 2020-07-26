package com.practice.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeObj")
public class College {

    private String collegeName;

    @Value("${college.name}")
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Autowired
    private Director director;

    @Autowired
//    @Qualifier("scienceTeacherObj")
    private Teacher teacher;

    public void test(){
        System.out.println("College " + collegeName+ " has started");
        director.directorInfo();
        teacher.teach();
    }

}
