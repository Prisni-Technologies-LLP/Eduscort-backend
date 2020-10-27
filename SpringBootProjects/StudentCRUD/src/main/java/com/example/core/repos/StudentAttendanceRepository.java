/**
 * copyright Prisni Technologies LLP.
 * Author: Debabrata Mukherjee
 */
package com.example.core.repos;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.core.demo.StudentAttendance;


public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, Long> {
	@Transactional
	@Modifying
	@Query(value="UPDATE student_attendance sa SET sa.IS_PRESENT=?1 WHERE sa.student_id=?2 and sa.date=?3", nativeQuery=true)
	public void updateStudentAttendance(String attendance, Long student_id, Date date);

}
