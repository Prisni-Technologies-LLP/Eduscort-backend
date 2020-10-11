package com.example.core.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student_attendance")
public class StudentAttendance {
	@Id
	private Long student_id;
	private Integer roll_no;
	private String class_name;
	private String section;
	private Date date;
	private Boolean is_present;
	/**
	 * @return the student_id
	 */
	public Long getStudent_id() {
		return student_id;
	}
	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
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
	 * @return the class_name
	 */
	public String getClass_name() {
		return class_name;
	}
	/**
	 * @param class_name the class_name to set
	 */
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the is_present
	 */
	public Boolean getIs_present() {
		return is_present;
	}
	/**
	 * @param is_present the is_present to set
	 */
	public void setIs_present(Boolean is_present) {
		this.is_present = is_present;
	}

}
