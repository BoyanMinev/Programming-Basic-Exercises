package Lecture_06_Defining_Classes.Exersices.FamilyTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FamilyTreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String callName = scanner.nextLine();
        List<Person> persons = new ArrayList<>();
        List<Person> allInfoPersons = new ArrayList<>();
        String inputData = scanner.nextLine();


        while (!inputData.equals("End")){

         if (inputData.contains("-")){

             String[] personData = inputData.split(" - ");
             if (personData[0].contains("/") && !personData[1].contains("/")){
                 String dataPerson1 = personData[0];
                 String namePerson2 = personData[1];

                 Person person1 = new Person(new ArrayList<>());
                 Person person2 = new Person(namePerson2);
                 person1.getBirthdayDate().add(dataPerson1);

                 addPersons(persons, person1, person2);

             }else if (personData[0].contains("/") && personData[1].contains("/")){
                 String dataPerson1 = personData[0];
                 String dataPerson2 = personData[1];

                 Person person1 = new Person(new ArrayList<>());
                 Person person2 = new Person(new ArrayList<>());

                 person1.getBirthdayDate().add(dataPerson1);
                 person2.getBirthdayDate().add(dataPerson2);

                 addPersons(persons, person1, person2);

             } else if (!personData[0].contains("/") && personData[1].contains("/")){
                        String namePerson1 = personData[0];
                        String dataPerson2 = personData[1];

                        Person person1 = new Person(namePerson1);
                        Person person2 = new Person(new ArrayList<>());
                        person2.getBirthdayDate().add(dataPerson2);

                        addPersons(persons, person1, person2);
             }else {


                 String namePerson1 = personData[0];
                 String namePerson2 = personData[1];

                 Person person1 = new Person(namePerson1);
                 Person person2 = new Person(namePerson2);

                 addPersons(persons, person1, person2);


             }

         }else {
            String[] personData = inputData.split("\\s+");
            String namePerson = String.format("%s %s", personData[0], personData[1]);
            String dataPerson = personData[2];
            Person person = new Person(namePerson, new ArrayList<>());
            person.getBirthdayDate().add(dataPerson);
            allInfoPersons.add(person);



         }
            inputData = scanner.nextLine();
         }
        for (Person allPerson : allInfoPersons) {
            for (Person person : persons) {
              try {
                  if (person.getName().equals(allPerson.getName())){
                      person.setBirthdayDate(new ArrayList<>());
                      person.getBirthdayDate().add(allPerson.getBirthdayDate().get(0));
                  }
              }catch (Exception NullPointerException){
                  if (person.getBirthdayDate().get(0).equals(allPerson.getBirthdayDate().get(0))){
                      person.setName(allPerson.getName());
                  }
              }
            }
        }
        }

    private static void addPersons(List<Person> persons, Person person1, Person person2) {
        if(!isExist(persons, person1)){
            persons.add(person1);
            person1.getChildren().add(person2);
        }
        if (!isExist(persons, person2)){
            persons.add(person2);
            person2.getParents().add(person1);

        }
    }

    private static boolean isExist(List<Person> persons, Person person) {
        boolean isFound = false;
        for (Person p : persons) {
           try {

               if (person.getName().equals(p.getName())) {
                           isFound = true;
               }
           }catch (Exception NullPointerException){
               if (person.getBirthdayDate().get(0).equals(p.getBirthdayDate().get(0))){
                 isFound = true;
               }
           }
        }
        return isFound;
    }
}

