package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Student_list {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("\nPlease enter amount of students:");
            int studentAmount = user.nextInt();

            String[] student_list = new String[studentAmount];
            System.out.println("\nPlease enter names of students to fill the array:");

            for (int i = 0; i < studentAmount; i++) {
                student_list[i] = user.next();
            }

            boolean continueExistArray = true;
            while (continueExistArray) {

                boolean choosingOption = true;
                while (choosingOption) {
                    System.out.println("\nWhat would You like to do?");
                    System.out.println("\nShow the array - press 1\nSearch the elements - press 2 \nEdit the elements - press 3 \nDelete the elements - press 4\n");
                    int userChoice = user.nextInt();

                    switch (userChoice) {
                        case 1: { //wyświetlanie
                            for (int i = 0; i <1 ; i++) { //for jedna iteracja
                                System.out.println("\n" + Arrays.toString(student_list));
                            }
                                choosingOption = false;
                            break;
                        }
                        case 2: { //wyszukiwanie
                            boolean searchingProcess = true;
                            while (searchingProcess) {
                                System.out.println("\nPlease enter searched key word:");
                                String keyWord = user.next();

                                int found = 0;
                                for (int i = 0; i < studentAmount; i++) {
                                    if (student_list[i].equals(keyWord)) {
                                        System.out.println("\nThis element is in the array and has an index " + i + ".");
                                        found++;
                                    }
                                }
                                if (found > 0) { // poprawić w boolean
                                } else {
                                    System.out.println("\nThis elements is not in the array.");
                                }
                                System.out.println("\nDo you like to search again?");
                                String searchingCommand;
                                searchingCommand = user.next();

                                while (!searchingCommand.equals("Yes") && !searchingCommand.equals("No")) {
                                    System.out.println("\nPlease enter Yes or No:\nDo you like to search again?\n");
                                    searchingCommand = user.next();
                                }
                                if (searchingCommand.equals("No")) {
                                    searchingProcess = false;
                                }
                            }
                            choosingOption = false;
                            break;
                        }
                        case 3: { //edytowanie
                            boolean editingProcess = true;
                            while (editingProcess) {
                                System.out.println("\nEnter the element which you want to edit:");
                                String editWord = user.next();

                                int found = 0;
                                for (int i = 0; i < studentAmount; i++) {
                                    if (student_list[i].equals(editWord)) {
                                        System.out.println("\nPlease enter new element:");
                                        String newWord = user.next();
                                        student_list[i] = newWord;

                                        System.out.println("\n" + Arrays.toString(student_list));
                                        found++;
                                    }
                                }
                                if (found > 0) {
                                } else {
                                    System.out.println("\nThis element is not exist in this array.");
                                }
                                System.out.println("\nDo you like to edit again?");
                                String searchingCommand;
                                searchingCommand = user.next();

                                while (!searchingCommand.equals("Yes") && !searchingCommand.equals("No")) {
                                    System.out.println("\nPlease enter Yes or No:\nDo you like to edit again?\n");
                                    searchingCommand = user.next();
                                }
                                if (searchingCommand.equals("No")) {
                                    editingProcess = false;
                                }
                            }
                            choosingOption = false;
                            break;
                        }
                        case 4: { //usuwanie
                            boolean deletingProcess = true;
                            while (deletingProcess) {
                                System.out.println("\nEnter the element which you want to delete:");
                                String editWord = user.next();

                                int found = 0;
                                for (int i = 0; i < studentAmount; i++) {
                                    if (student_list[i].equals(editWord)) {
                                        String emptyElement = " --  ";
                                        student_list[i] = new String(emptyElement);
                                        System.out.println("\n" + Arrays.toString(student_list));
                                        found++;
                                    }
                                }
                                if (found > 0) {
                                } else {
                                    System.out.println("\nThis element is not exist in this array.");
                                }

                                System.out.println("\nDo you like to delete something else?");
                                String searchingCommand;
                                searchingCommand = user.next();

                                while (!searchingCommand.equals("Yes") && !searchingCommand.equals("No")) {
                                    System.out.println("\nPlease enter Yes or No:\nDo you like to delete something else?\n");
                                    searchingCommand = user.next();
                                }
                                if (searchingCommand.equals("No")) {
                                    deletingProcess = false;
                                }
                            }
                            choosingOption = false;
                            break;
                        }
                        default: {
                            System.out.println("\nPlease make your choice correctly.");
                        }
                    }
                }

                System.out.println("\nDo you like to continue the exist array? \nEnter Yes or No:");
                String continueExistArrayCommand;
                continueExistArrayCommand = user.next();

                while (!continueExistArrayCommand.equals("Yes") && !continueExistArrayCommand.equals("No")) {
                    System.out.println("\nPlease enter Yes or No.\nDo you like to continue the exist array?");
                    continueExistArrayCommand = user.next();
                }
                if (continueExistArrayCommand.equals("No")) {
                    continueExistArray = false;
                }
            }

            System.out.println("\nDo you like to continue the program? \nEnter Yes or No:");
            String endingCommand;
            endingCommand = user.next();

            while (!endingCommand.equals("Yes") && !endingCommand.equals("No")) {
                System.out.println("\nPlease enter Yes or No.\nDo you like to continue the program?");
                endingCommand = user.next();
            }
            if (endingCommand.equals("No")) {
                continueProgram = false;
                System.out.println("\nThanks for using my program :)");
            }

        }
    }
}