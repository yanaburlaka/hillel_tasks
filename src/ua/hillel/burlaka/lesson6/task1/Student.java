package ua.hillel.burlaka.lesson6.task1;

import java.time.LocalDate;
import java.util.HashMap;

public class Student {

    private Integer id;
    private String name;
    private String surname;
    private HashMap<Task, Marks> results;
    private String phone;
    private String email;
    private LocalDate birthday;

    public Student(Integer id, String name, String surname, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public Student() {
    }

    public Student(String name, String surname, String phone, String email, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public HashMap<Task, Marks> getResults() {
        return results;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setResults(HashMap<Task, Marks> results) {
        this.results = results;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", results=" + results +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

enum Marks {
    A, B, C, D;
}
