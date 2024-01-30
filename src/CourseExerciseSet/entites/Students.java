package CourseExerciseSet.entites;

import java.util.Objects;

public class Students {

    private Integer id;
    private Character course;

    public Students(Integer id, Character course) {
        this.id = id;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getCourse() {
        return course;
    }

    public void setCourse(Character course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(id, students.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
