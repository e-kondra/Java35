package tasks.grocery;

import java.util.ArrayList;

//1. addGroceryItem
//2. printGroceryList
//3. removeGroceryItem
//4. modifyGroceryItem
//5. searchItem
public class GroceryList {

    //Field
    private ArrayList<String> groceryList = new ArrayList<>();

    //Methods
    //adding new item to the list
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    //print all list items
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //remove grocery item
    public void removeGroceryItem(String item){
        int position  = findItem(item);
        if (position >= 0){
            groceryList.remove(position);
            System.out.println(item + " was deleted");
        } else {
            System.out.println("Item is not in the list");
        }
    }

    //modify grocery list item
    public void modifyGroceryItem(int index, String newValue){
        if(index >= 0 && index < groceryList.size()){
            groceryList.set(index, newValue);
            System.out.println("Grocery item was modified");
        } else {
            System.out.println("Items position is not valid");
        }
    }

    //searching the item in the  list
    public boolean searchItem(String searchItem){
        return findItem(searchItem) >= 0;
    }

    //Delete all items
    public void deleteAllItems(){
        groceryList.clear();
        System.out.println("All items in the list are deleted");
    }

    //Returning items index
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }


}
