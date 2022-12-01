package Lecture_06_Defining_Classes.Exersices.FamilyTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private List<String> birthdayDate;
    private List<Person> parents = new ArrayList<>();
    private List<Person> children = new ArrayList<>();



    public Person(String name, List<String> birthdayDate){
        this.name = name;
        this.birthdayDate = birthdayDate;

    }
    public Person(String name){
        this.name = name;
    }
    public Person(List<String> birthdayDate){
        this.birthdayDate = birthdayDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(List<String> birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public List<Person> getParents() {
        return parents;
    }

    public void setParents(List<Person> parents) {
        this.parents = parents;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }
}
