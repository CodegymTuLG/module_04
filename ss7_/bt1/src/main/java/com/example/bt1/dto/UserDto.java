package com.example.bt1.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDto implements Validator {
    private int id;
    @NotEmpty(message = "FirstName is not empty!")
    @Size(min = 5, max = 45,message = "Length have to 5 to 45 digits")
    private String firstName;
    @NotEmpty(message = "LastName is not empty!")
    @Size(min = 5, max = 45,message = "Length have to 5 to 45 digits")
    private String lastName;
    private String age;
    @Pattern(regexp = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$",message = "Please enter the correct phone number format!")
    private String phoneNumber;
    @Email(message = "Please enter the correct email format!")
    @NotEmpty(message = "Email is not empty!")
    private String email;

    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, String age, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        String age = userDto.getAge();
        if (age.isEmpty()){
            errors.rejectValue("age", "null","Age is not empty!");
        } else if (!age.matches("(^$|[0-9]*$)")){
            errors.rejectValue("age", "null", "Age have to number!");
        } else if (Integer.parseInt(age) <= 18){
            errors.rejectValue("age","null","User must be 18 years or older!");
        }
    }
}
