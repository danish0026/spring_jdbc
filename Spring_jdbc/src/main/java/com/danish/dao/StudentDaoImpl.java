package com.danish.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.danish.model.Student;

public class StudentDaoImpl implements StudentDao {

	private String INSERT = "insert into student values(?,?,?)";

	private String UPDATE = "update student set first_name=? last_name=? where stu_id=?";

	private String DELETE = "delete from student where stu_id=?";

	private String GET_ONE = "select * from student where stu_id=?";

	private String GET_ALL = "select * from student";

	private JdbcTemplate jdbcTemplate;

	private RowMapper<Student> rowMapper;

	public void setRowMapper(RowMapper<Student> rowMapper) {

		this.rowMapper = rowMapper;
	}

	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveStudent(Student st) {
		jdbcTemplate.update(INSERT, st.getStuId(), st.getFirstName(), st.getLastName());
	}

	@Override
	public void updateStudent(Student st) {
		jdbcTemplate.update(INSERT, st.getStuId(), st.getFirstName(), st.getLastName());
	}

	@Override
	public void deleteStudent(Integer stuId) {
		jdbcTemplate.update(DELETE, stuId);
	}

	@Override
	public Student getStudent(Integer stuId) {
		@SuppressWarnings("deprecation")
		List<Student> students = jdbcTemplate.query(GET_ONE, new Object[] { stuId }, rowMapper);

		return students.get(0);
	}

	@Override

	public List<Student> getAllStudents() {
		List<Student> students = jdbcTemplate.query(GET_ALL, rowMapper);

		return students;

	}

	@Override
	public String toString() {
		return "StudentDaoImpl [INSERT=" + INSERT + ", UPDATE=" + UPDATE + ", DELETE=" + DELETE + ", GET_ONE=" + GET_ONE
				+ ", GET_ALL=" + GET_ALL + ", jdbcTemplate=" + jdbcTemplate + ", rowMapper=" + rowMapper + "]";
	}
	
	
}
