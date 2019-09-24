package topica.linhnv5.spring.basic.model;

/**
 * POJO class defination data transfer from csv to db
 * @author ljnk975
 */
public final class Student {

	/**
	 * ID
	 */
	private int id;

	/**
	 * Name
	 */
	private String name;

	/**
	 * Date of birth
	 */
	private String birth;

	/**
	 * Gender 0-male 1-female other-other gender
	 */
	private byte gender;

	/**
	 * Default constructor
	 */
	public Student() {
	}

	/**
	 * Create a student
	 * @param id  id
	 * @param name name
	 * @param dateOfBirth date of birth
	 * @param gender gender 0-male 1-female other-other gender
	 */
	public Student(int id, String name, String dateOfBirth, byte gender) {
		this.id = id;
		this.name = name;
		this.birth = dateOfBirth;
		this.gender = gender;
	}

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @return the dateOfBirth
	 */
	public final String getBirth() {
		return birth;
	}

	/**
	 * @return the gender
	 */
	public final int getGender() {
		return gender;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @param birth the dateOfBirth to set
	 */
	public final void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * @param gender the gender to set
	 */
	public final void setGender(byte gender) {
		this.gender = gender;
	}

}
