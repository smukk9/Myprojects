package org.services.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//User class has all the details of the user this whole details will be used to save .
@Entity

@NamedQuery(name="userByIdPwd", query="from User where user_Name=?")
@Table(name="userData")
public class User {
	
	public User(){
		//No-arg constructor
	}
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_Id;
	
	
	@Column
	private String user_Name;
	
	@Column
	private Long phone_Number;
	
	@Column
	private String E_mail;
	
	@Column
	private String country;
	
	@Column
	private String password;
	
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public Long getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(Long phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getE_mail() {
		return E_mail;
	}
	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void showUser(){
		
		System.out.println(user_Name);
		System.out.println(E_mail);
		System.out.println(phone_Number);
		System.out.println(country);
	
	}

	
	
}
