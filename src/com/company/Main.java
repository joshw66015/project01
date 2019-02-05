package com.company;

import java.util.*;


public class Main {

    static List<String> task = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List all tasks.\n" +
                "(0) Exit.");
        choice = input.nextInt();


        while (choice != 0) {
            if (choice == 1) {
                add();
            } else if (choice == 2) {
                remove();
            } else if (choice == 3) {
                update();
            } else {
                list();
            }
            break;
        }
    }

    static void add() {
        System.out.println("Which task would you like to add");
        Scanner sc = new Scanner(System.in);
        task.add(sc.next());



    }

    static void remove() {
        System.out.println("Which task would you like to remove");
        Scanner sc = new Scanner(System.in);
        task.remove(sc.next());

    }

    static void update() {
        System.out.println("Which task would you like to update");
        Scanner sc = new Scanner(System.in);


    }

    static void list() {
        System.out.println(task);
    }

}


