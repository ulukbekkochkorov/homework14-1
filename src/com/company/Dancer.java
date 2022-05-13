package com.company;

public class Dancer extends Person {
    String groupName;

    public Dancer(String name, String disignatione, String groupName) {
        super(name, disignatione);
        this.name = name;
        this.designatione = disignatione;
        this.groupName = groupName;
    }
        @Override
    String eat(){
         return (name + " is a vegetarian");
       }
    @Override
    String learn () {
        return (name + " is learning lezginka");
    }
    @Override
    String walk () {
        return (name + " walks every morning");
    }
        public String dancing () {
        return (name + " is dansing in " + groupName);
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designatione='" + designatione + '\'' +
                '}';
    }
}
