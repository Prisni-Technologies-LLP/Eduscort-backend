package com.example.core.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long student_id;
	private String first_name;
	private Integer roll_no;
	private String is_active;
    /**
	 * @return the roll_no
	 */
	public Integer getRoll_no() {
		return roll_no;
	}
	/**
	 * @param roll_no the roll_no to set
	 */
	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}
	/**
	 * @return the student_id
	 */
	public Long getstudent_id() {
		return student_id;
	}
	/**
	 * @param student_id the student_id to set
	 */
	public void setstudent_id(Long student_id) {
		this.student_id = student_id;
	}
	/**
	 * @return the first_name
	 */
	public String getfirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}
	private String middle_name;
    private String last_name;
    private Date date_of_admission;
    private Date date_of_birth;
    private String class_name;
    
	/*public Student(String first_name, String middle_name, String last_name, Date date_of_admission, Date date_of_birth,
			String class_name) {
		super();
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.date_of_admission = date_of_admission;
		this.date_of_birth = date_of_birth;
		this.class_name = class_name;
	}*/
	/**
	 * @return the middle_name
	 */
	public String getmiddle_name() {
		return middle_name;
	}
	/**
	 * @param middle_name the middle_name to set
	 */
	public void setmiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	/**
	 * @return the last_name
	 */
	public String getlast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the date_of_admission
	 */
	public Date getdate_of_admission() {
		return date_of_admission;
	}
	/**
	 * @param date_of_admission the date_of_admission to set
	 */
	public void setdate_of_admission(Date date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	/**
	 * @return the date_of_birth
	 */
	public Date getdate_of_birth() {
		return date_of_birth;
	}
	/**
	 * @param date_of_birth the date_of_birth to set
	 */
	public void setdate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	/**
	 * @return the class_name
	 */
	public String getclass_name() {
		return class_name;
	}
	/**
	 * @param class_name the class_name to set
	 */
	public void setclass_name(String class_name) {
		this.class_name = class_name;
	}
	/**
	 * @return the is_active
	 */
	public String getIs_active() {
		return is_active;
	}
	/**
	 * @param is_active the is_active to set
	 */
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
	
}
