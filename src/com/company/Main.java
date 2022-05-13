package com.company;

public class Main {
    public static void main(String[] args) {
	Person person = new Person("Human", "his disignatione");
        System.out.println(person);
        System.out.println(person.learn());
        System.out.println(person.eat());
        System.out.println(person.walk());
        System.out.println();

    Programmer programmer = new Programmer("Mike", "programmer", "SAT");
        System.out.println(programmer);
        System.out.println(programmer.learn());
        System.out.println(programmer.eat());
        System.out.println(programmer.walk());
        System.out.println(programmer.coding());
        System.out.println();

        Dancer dancer = new Dancer("Andrew","dancer", "\"Angels\"");
        System.out.println(dancer);
        System.out.println(dancer.learn());
        System.out.println(dancer.eat());
        System.out.println(dancer.walk());
        System.out.println(dancer.dancing());
        System.out.println();

        Singer singer = new Singer("Mat", "Singer","\"Sky\"");
        System.out.println(singer);
        System.out.println(singer.learn());
        System.out.println(singer.eat());
        System.out.println(singer.walk());
        System.out.println(singer.singing());
        System.out.println(singer.playGitar());

    }
        }
