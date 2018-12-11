package uk.ac.belfastmet.titanicconsumer.domain;

public class Passenger {
	
	private Integer passengerId;
	private Integer survived;
	private Integer pClass;
	private String name;
	private String sex;
	private Integer age;
	private Integer sibSp;
	private Integer parch;
	private String ticket;
	private String fare;
	private String cabin;
	private String embarked;
	
	//Constructors
	public Passenger() {
		super();
	}

	public Passenger(Integer survived, Integer pClass, String name, String sex, Integer age, Integer sibSp,
			Integer parch, String ticket, String fare, String cabin, String embarked) {
		super();
		this.survived = survived;
		this.pClass = pClass;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.sibSp = sibSp;
		this.parch = parch;
		this.ticket = ticket;
		this.fare = fare;
		this.cabin = cabin;
		this.embarked = embarked;
	}

	//Getters and setters
	public Integer getPassengerId() {
		return passengerId;
	}
	
	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	} //We can't set the PassengerId anyway

	public Integer getSurvived() {
		return survived;
	}

	public void setSurvived(Integer survived) {
		this.survived = survived;
	}

	public Integer getpClass() {
		return pClass;
	}

	public void setpClass(Integer pClass) {
		this.pClass = pClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSibSp() {
		return sibSp;
	}

	public void setSibSp(Integer sibSp) {
		this.sibSp = sibSp;
	}

	public Integer getParch() {
		return parch;
	}

	public void setParch(Integer parch) {
		this.parch = parch;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getEmbarked() {
		return embarked;
	}

	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}




}
