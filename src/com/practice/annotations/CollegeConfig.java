// @Configuration makes this class a config class...

package com.practice.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.practice.annotations")
@PropertySource("classpath:/com/practice/annotations/college-info.properties")
public class CollegeConfig {

//    @Bean(name = "teacherObj")
//    public Teacher teacherObj(){
//        return new MathTeacher();
//    }
//
//    @Bean(name = "directorObj")
//    public Director directorObj(){
//        return new Director();
//    }
//
//    @Bean(name = "collegeObj")
//    public College collegeObj(){ // collegeObj is my bean ID
//        College c = new College();
//        c.setDirector(directorObj());
//        c.setTeacher(teacherObj());
//        return c;
//    }

}
