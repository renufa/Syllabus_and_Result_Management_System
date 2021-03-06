package com.renu.Syllabus_and_Result_Management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Faculty extends FacultyBaseEntity<Long>{
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="f_name")
	private String f_name;
	@Column(name="d_name")
	private String d_name;
	@Column(name="level")
	private String level;
	@Column(name="semester")
	private String semester;
	@Column(name="total_credit")
	private String total_credit;
	@OneToOne(mappedBy="faculty",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   private Courses courses;
	
	public Faculty() {
		
	}

	public Faculty( String f_name, String d_name, String level, String semester, String total_credit) {
		super();
		
		this.f_name = f_name;
		this.d_name = d_name;
		this.level = level;
		this.semester = semester;
		this.total_credit = total_credit;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getTotal_credit() {
		return total_credit;
	}

	public void setTotal_credit(String total_credit) {
		this.total_credit = total_credit;
	}

	

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", f_name=" + f_name + ", d_name=" + d_name + ", level=" + level + ", semester="
				+ semester + ", total_credit=" + total_credit + "]";
	}


	



	
	
	
	
}
