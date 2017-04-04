package domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhaoke on 2017/4/4.
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 8668523702321530975L;

    private long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int salaryLevel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(int salaryLevel) {
        this.salaryLevel = salaryLevel;
    }
}
