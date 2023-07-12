import java.util.Scanner;

class Libraryitem{
    int id;
    String title;
    int year;
    
}
class Book extends Libraryitem{
    String author;
}
class Magazine extends Libraryitem{
    int issue;
}
public class librarymanagment{
  
    public  static void main(String [] args){
        Magazine obj= new Magazine();
        Book ob= new Book();
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter id- ");
        int id= sc.nextInt();  
        obj.id = id;
        System.out.println("Enter title- "); 
        String title= sc.next(); 
        obj.title = title;   
        System.out.println("Enter year- ");
        int year= sc.nextInt();
        obj.year = year;  
        System.out.println("Enter author- ");  
        String author= sc.next(); 
        ob.author = author; 
        System.out.println("Enter issue- ");  
        int issue= sc.nextInt();
        obj.issue = issue;  
        System.out.println(obj.id);
        System.out.println(obj.title);
        System.out.println(obj.year);
        System.out.println(ob.author);
        System.out.println(obj.issue);
        }
 }
