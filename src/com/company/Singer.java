package com.company;

public class Singer extends Person {
    String bandName;

    public Singer(String name, String disignatione, String bandName) {
        super(name, disignatione);
        this.name = name;
        this.designatione = disignatione;
        this.bandName = bandName;
     }
     @Override
    String eat(){
        return (name + " likes eat a meat");
    }
    @Override
    String learn (){
        return (name + " is learning English");
    }
    @Override
    String walk () {
        return (name + " doesn't like walk");
    }
       public String singing () {
       return bandName + " singing diferent pop music";
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", designatione='" + designatione + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }

    public String playGitar () {
       return name + " plays solo gitar";
    }
}
