package ua.hillel.burlaka.lesson6.task1;

import java.util.List;

public class Lesson {

    private Integer id;
    private List<Task> tasks;
    private String description;

    public Lesson() {
    }

    public Lesson(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", tasks=" + tasks +
                ", description='" + description + '\'' +
                '}';
    }
}
