package edu.hi.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"edu.hi.ex.mapper"})
@SpringBootApplication
public class SpringBootChbBoardMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootChbBoardMybatisApplication.class, args);
	}

}
