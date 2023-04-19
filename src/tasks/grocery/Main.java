package tasks.grocery;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    //print all options
                    printInstructions();
                    break;
                case 1:
                    //print grocery list
                    groceryList.printGroceryList();
                    break;
                case 2:
                    //add item
                    addItem();
                    break;
                case 3:
                    //modify item
                    modifyItem();
                    break;
                case 4:
                    //remove item
                    removeItem();
                    break;
                case 5:
                    //search item
                    searchItem();
                    break;
                case 6:
                    //delete all items
                    groceryList.deleteAllItems();
                    break;
                case 7:
                    quit = true;
                    System.out.println("See you, bue!");
                    break;
                default:
                    System.out.println("please try again");
                    continue;
            }

        }
    }

    private static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To delete all item in the list");
        System.out.println("\t 7 - To quit the application");
    }

    private static void addItem(){
        System.out.println("Please enter the grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem(){
        System.out.println("Enter item number");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber-1,newItem);
    }

    private static void removeItem(){
        System.out.println("Enter item name that you want to delete:");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    private static void searchItem(){
        System.out.println("Enter item to search for");
        String searchItem = scanner.nextLine();
        if(groceryList.searchItem(searchItem)){
            System.out.println("Found " + searchItem + " in your grocery list");
        } else {
            System.out.println(searchItem + " not found in the shopping list");
        }
    }

}
