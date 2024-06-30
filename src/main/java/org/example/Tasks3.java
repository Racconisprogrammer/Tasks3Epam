package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tasks3 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ivanov", "Ivan", "Ivanovich", getDate(2000, Calendar.JANUARY, 1), "123 Main St", 101, "Computer Science", 3, "CS-21"));
        students.add(new Student(2, "Petrov", "Petr", "Petrovich", getDate(2001, Calendar.FEBRUARY, 10), "456 Elm St", 102, "Mathematics", 2, "M-22"));
        students.add(new Student(3, "Sidorov", "Sidr", "Sidorovich", getDate(2002, Calendar.MARCH, 15), "789 Oak St", 103, "Physics", 1, "P-23"));
        students.add(new Student(4, "Smirnov", "Sergey", "Sergeevich", getDate(2000, Calendar.APRIL, 20), "321 Pine St", 104, "Chemistry", 4, "C-24"));
        students.add(new Student(5, "Kuznetsov", "Nikolay", "Nikolaevich", getDate(2001, Calendar.MAY, 25), "654 Cedar St", 105, "Biology", 3, "B-25"));
        for (Student student : students) {
            if (student.studentsFacultet("Computer Science")){
                
            }
        }
    }

    private static Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }
}
