package CourseExerciseSet.program;

import CourseExerciseSet.entites.Students;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Students> students = new HashSet<>();

        char[] courses = new char[3];
        courses[0] = 'A';
        courses[1] = 'B';
        courses[2] = 'C';

        for (char course : courses) {
            System.out.print("How many students for course " +  course + "? ");
            int courseStudents = sc.nextInt();
            for (int i = 1; i <= courseStudents; i++) {
                int n = sc.nextInt();
                students.add(new Students(n, course));
            }
        }
        System.out.println();
        System.out.println("Total students: " + students.size());

        sc.close();
    }
}
