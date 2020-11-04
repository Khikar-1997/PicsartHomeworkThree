package com.company;

import com.company.Student.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kate");
        System.out.print(student.getName() + " ");
        student.setSurname("Middleton");
        System.out.print(student.getSurname() + ",");
        student.setAge(22);
        System.out.print(student.getAge() + " years old,");
        student.setUniversityName("Oxford");
        System.out.println(student.getUniversityName());

        Student student2 = new Student();
        student2.setName("Mikael");
        System.out.print(student2.getName() + " ");
        student2.setSurname("Trump");
        System.out.print(student2.getSurname() + ",");
        student2.setAge(25);
        System.out.print(student2.getAge() + " years old,");
        student2.setUniversityName("Cambridge");
        System.out.print(student2.getUniversityName());
    }
}
