package FailedOrPass.entities;

public class alunos {

    private String name;

    private double note1, note2, note3;

    double missing;

    public alunos(String name, double note1, double note2, double note3) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    public double FinalGrade () {
        return note1 + note2 + note3;
    }

    public String PassOrFailed () {
        if (FinalGrade() >= 60) {
            return "PASS";
        } else {
            missing = 60 - FinalGrade();

            return "FAILED";
        }
    }

    public String toString() {

        if (PassOrFailed() == "PASS") {


            return "FINAL GRADE = "
                    + String.format("%.2f",FinalGrade())
                    + " \nPASS";
        } else {
            return "FINAL GRADE = "
                    + String.format("%.2f",FinalGrade())
                    + " \nFAILED"
                    + " \nMISSING "
                    + missing
                    + " POINTS";

        }

    }

}
