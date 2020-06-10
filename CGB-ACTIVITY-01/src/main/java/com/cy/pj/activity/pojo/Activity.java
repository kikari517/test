package com.cy.pj.activity.pojo;

import java.time.LocalDateTime;//JDK8
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * create table tb_activity(
     id bigint primary key auto_increment,
     title varchar(100) not null,
     category varchar(100) not null,
	 startTime datetime not null,
	 endTime datetime not null,
	 remark text,
	 state tinyint,
     createdTime datetime not null,
	 createdUser varchar(100)
    )engine=InnoDB;
 * @author qilei
 *
 */
@ToString
@Getter
@Setter
//@Data //set,get,toString
public class Activity {
	private Long id;
	private String title;
	private String category;
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private LocalDateTime startTime;//Date
	
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private LocalDateTime endTime;
	private String remark;
	private Integer state=1;
	private LocalDateTime createdTime;
	private String createdUser;
	
}


