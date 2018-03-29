package com.home.poc.ileague.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER")
public class Player implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private int age;

	@Column(name = "POSITION")
	private String position;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "PLACE_OF_BIRTH")
	private String placeOfBirth;

	@Column(name = "EXPERIENCE")
	private int iLeagueExp;

	@Column(name = "INIT_POINT")
	private int points;

	public Player() {
		super();
	}

	public Player(String name, int age, String position, String country,
			String placeOfBirth, int iLeagueExp, int points) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.country = country;
		this.placeOfBirth = placeOfBirth;
		this.iLeagueExp = iLeagueExp;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public int getiLeagueExp() {
		return iLeagueExp;
	}

	public void setiLeagueExp(int iLeagueExp) {
		this.iLeagueExp = iLeagueExp;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", position="
				+ position + ", country=" + country + ", placeOfBirth="
				+ placeOfBirth + ", iLeagueExp=" + iLeagueExp + ", points="
				+ points + "]";
	}

}
