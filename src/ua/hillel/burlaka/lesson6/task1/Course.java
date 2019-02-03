package ua.hillel.burlaka.lesson6.task1;

import java.time.LocalDate;
import java.util.List;

public class Course {

    private Integer id;
    private String description;
    private List<Lesson> lessons;
    private Teacher teacher;
    private List<Student> students;
    private LocalDate startDate;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", lessons=" + lessons +
                ", teacher=" + teacher +
                ", students=" + students +
                ", startDate=" + startDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Course(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Course(Integer id, String description, List<Lesson> lessons, Teacher teacher, List<Student> students, LocalDate startDate) {
        this.id = id;
        this.description = description;
        this.lessons = lessons;
        this.teacher = teacher;
        this.students = students;
        this.startDate = startDate;
    }

    public Course(String description, Teacher teacher, LocalDate startDate) {
        this.description = description;
        this.teacher = teacher;
        this.startDate = startDate;
    }

    public Course() {
    }


}
