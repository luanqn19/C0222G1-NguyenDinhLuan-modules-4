package com.example.user.model;

import com.example.user.utils.annotation.EmailConstraint;
import com.example.user.utils.annotation.NameConstraint;
import com.example.user.utils.annotation.PhoneConstraint;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NameConstraint(message = "FirstName không đúng định dạng")
    @Length(min = 5, max = 45, message = "Tối thiểu 5 và nhiều nhất 45 ký tự")
    @NotEmpty(message = "FirstName không được để trống")
    private String firstName;

    @NameConstraint(message = "LastName không đúng định dạng")
    @Length(min = 5, max = 45, message = "Tối thiểu 5 và nhiều nhất 45 ký tự")
    @NotEmpty(message = "LastName không được để trống")
    private String lastName;

    @PhoneConstraint
    @NotEmpty(message = "Phone không được để trống")
    private String phone;

    @Min(value = 18, message = "Tuổi không được nhỏ hơn 18")
    @Max(value = 100, message = "Tuổi không được lớn hơn 100")
    private int age;

    @EmailConstraint
    @NotEmpty(message = "Email không được để trống")
    private String email;

    public User () {
    }

    public User (Long id , String firstName , String lastName , String phone , int age , String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }
}
