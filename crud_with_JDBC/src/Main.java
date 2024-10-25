import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_ps_db","postgres","root");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for insert , Enter 2 for fetch , Enter 3 for update , Enter 4 for delete , Enter 0 for exit");
        System.out.print("Enter your choice here : ");
        int choice = sc.nextInt();
        sc.nextLine();

        while (choice>0 && choice<5) {

            switch (choice){
                case 1:{
                    System.out.print("Enter name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter email : ");
                    String email = sc.nextLine();
                    System.out.print("Enter city : ");
                    String city = sc.nextLine();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO register(name,email,city) VALUES (?,?,?)");
                    ps.setString(1,name);
                    ps.setString(2,email);
                    ps.setString(3,city);
                    int i = ps.executeUpdate();

                    if (i>0)
                        System.out.println("Data inserted successfully");
                    else
                        System.out.println("something went wrong with insert");
                }
                break;

                case 2:{
                    PreparedStatement ps1 = con.prepareStatement("SELECT * FROM register");
                    ResultSet rs = ps1.executeQuery();

                    while (rs.next()){
                        System.out.println("Id = "+rs.getInt(1)+" , Name = "+rs.getString(2)+" , City = "+rs.getString(4)+" , email = "+rs.getString(3));
                    }
                }
                break;

                case 3:{
                    System.out.print("city : ");
                    String city = sc.nextLine();
                    System.out.print("Update through email : ");
                    String email = sc.nextLine();
                    PreparedStatement ps = con.prepareStatement("UPDATE register SET city = ? WHERE email = ?");
                    ps.setString(1,city);
                    ps.setString(2,email);
                    int i = ps.executeUpdate();

                    if (i>0)
                        System.out.println("Data updated successfully");
                    else
                        System.out.println("something went wrong update");
                }
                break;

                case 4:{
                    System.out.print("Delete through email : ");
                    String email = sc.nextLine();
                    PreparedStatement ps = con.prepareStatement("DELETE FROM register WHERE email = ?");
                    ps.setString(1,email);
                    int i = ps.executeUpdate();

                    if (i>0)
                        System.out.println("Data Deleted successfully");
                    else
                        System.out.println("something went wrong Delete");
                }
                break;

                default:{
                    throw new IllegalStateException("Unexpected value: " + choice);
                }
            }
            System.out.println("Enter 1 for insert , Enter 2 for fetch , Enter 3 for update , Enter 4 for delete , Enter 0 for exit");
            System.out.print("Enter your choice here : ");
            choice = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        con.close();
    }
}