package net.yang.core.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Example {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String comment;
	
	private Calendar createDatetime;
	
	private Long creator = 0L;
	
	private Calendar updateDatetime;
	
	private Long updater = 0L;
}
