/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Student {
    String name;
    int old;
    int grade;

    public Student() {
    }
    
    public Student(String name, int old, int grade) {
        this.name = name;
        this.old = old;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public void output(){
        System.out.println("Name: "+name+"; Old: "+old+"; Grade:"+grade);
    }

    @Override
    public String toString() {
        return "(Name: " + name + ", old: " + old + ", grade: " + grade + ')';
    }
}
