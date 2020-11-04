package com.company.Student;

public class Student {
    private String Name;
    private String Surname;
    private int age;
    private String universityName;

    //region Getters and Setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120){
            this.age = age;
        } else  {
            System.out.println("This is invalid age");
        }
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    //endregion
}
