package com.company;

public class Person {
    String name;
    String designatione;

    public Person (){};

    public Person(String name1, String disignatione1) {
        name = name1;
        designatione = disignatione1;
           }

    String learn () {
       return("Human can learn");
    }
    String walk () {
        return("Human can wolk");
    }
    String eat () {
        return("Human eats");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designatione='" + designatione + '\'' +
                '}';
    }
}
