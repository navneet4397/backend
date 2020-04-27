package com.fpl.covid.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Questionaire")
public class Questionaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q1;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q2;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q3;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q4;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q5;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q6;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q7;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q8;

	@NotBlank(message = "Enter YES/NO")
	@Pattern(regexp = "(?i)(YES|NO)")
	private String q9;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@PrimaryKeyJoinColumn
	private ContactInfo coi;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQ1() {
		return q1;
	}

	public void setQ1(String q1) {
		this.q1 = q1;
	}

	public String getQ2() {
		return q2;
	}

	public void setQ2(String q2) {
		this.q2 = q2;
	}

	public String getQ3() {
		return q3;
	}

	public void setQ3(String q3) {
		this.q3 = q3;
	}

	public String getQ4() {
		return q4;
	}

	public void setQ4(String q4) {
		this.q4 = q4;
	}

	public String getQ5() {
		return q5;
	}

	public void setQ5(String q5) {
		this.q5 = q5;
	}

	public String getQ6() {
		return q6;
	}

	public void setQ6(String q6) {
		this.q6 = q6;
	}

	public String getQ7() {
		return q7;
	}

	public void setQ7(String q7) {
		this.q7 = q7;
	}

	public String getQ8() {
		return q8;
	}

	public void setQ8(String q8) {
		this.q8 = q8;
	}

	public String getQ9() {
		return q9;
	}

	public void setQ9(String q9) {
		this.q9 = q9;
	}
}
