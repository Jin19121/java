package ch03.exercise;

public class Q03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println("Pencils per Students : " + pencilsPerStudent);

        int pencilsLeft = pencils % students;
        System.out.println("Pencils Lefts : " + pencilsLeft);
    }
}
