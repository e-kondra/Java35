package db;

import java.sql.*;
import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/java35";
        String username = "root";
        String password = "rooter";
        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        try (Connection conn = DriverManager.getConnection(dbURL,username,password)){
            System.out.println("Connected to db");
            while(again == 'y'){

                System.out.println("Choose one option (r,i,d)");
                System.out.println("r - reading data");
                System.out.println("i - inserting data");
                System.out.println("d - deleting data");

                char action = scanner.nextLine().charAt(0);

                if(action == 'i'){
                    System.out.println("Enter username");
                    String newUserName = scanner.nextLine();

                    System.out.println("Enter password");
                    String newPassword = scanner.nextLine();

                    System.out.println("Enter full name");
                    String newFullName = scanner.nextLine();

                    System.out.println("Enter your email");
                    String newEmail = scanner.nextLine();

                    insertData(conn, newUserName, newPassword ,newFullName, newEmail);

                } else if (action == 'r') {
                    readData(conn);

                } else if (action == 'd') {
                    System.out.println("Enter username you want to delete");
                    String deleteUser = scanner.nextLine();
                    deleteData(conn, deleteUser);

                } else {
                    System.out.println("Invalid input");
                }

                System.out.println("Do you want to do something else? y/n");
                again = scanner.nextLine().charAt(0);
            }


        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void readData(Connection conn) throws SQLException {

        String sql = "SELECT * FROM users";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            String fullName = resultSet.getString("fullname");
            String email = resultSet.getString("email");

            String output = "User : %s - %s - %s - %s";
            System.out.println(String.format(output, username, password, fullName, email));
        }

    }

    public static void insertData(
            Connection conn,
            String username,
            String password,
            String fullName,
            String email) throws SQLException{

        String sql = "INSERT INTO users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        preparedStatement.setString(3, fullName);
        preparedStatement.setString(4, email);

        int rowInserted = preparedStatement.executeUpdate();

        if (rowInserted > 0){
            System.out.println("A new user was inserted successfully");
        } else {
            System.out.println("Something went wrong");
        }
    }

    public static void deleteData(Connection conn, String username) throws SQLException{
        String sql = "DELETE FROM users WHERE username=?";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, username);

        if (preparedStatement.executeUpdate(sql) > 0){
            System.out.println("User was deleted successfully");
        } else {
            System.out.println("Something went wrong");
        };
    }
}
