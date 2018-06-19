package net.yang.core.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Account {

	public static final class STATUS {
		/** 無効:0 */
		public static final Character INVALID = '0';
		/** 有効:1 */
		public static final Character VALID = '1';
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountId;
	
	private String id;
	
	private String password;
	
	private String email;
	
	private Character status;
	
	private Calendar createDatetime;
	
	private Long creator = 0L;
	
	private Calendar updateDatetime;
	
	private Long updater = 0L;
}
