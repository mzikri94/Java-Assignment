/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.record.system;
import java.util.*;
import java.lang.*;
/**
 *
 * @author zikri.z
 */
public class Library {

    Scanner sc = new Scanner(System.in);
    Library li = new Library();
    
    int mainMenu;
    int bookMenu;

    /**
     *
     */
    public void addBook()
    {
        Book b = new Book();
        ArrayList book = new ArrayList();
        
    }
    
     public void bookMenu()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Book Menu" + "\n");
        System.out.println("Enter 1 to Add new Book");
        System.out.println("Enter 2 to Book Description");
        System.out.println("Enter 3 to Delete Book");
        System.out.println("Enter 0 to Main Menu");
        int bookMenu = sc.nextInt();
        
        if(bookMenu == 1)
        {
            
        } 
        else if(bookMenu == 2) 
        {
            
        }
        
        else if(bookMenu == 3) 
        {
            
        }
        else if (bookMenu == 0)
        {
            mainMenu();
        }
        
        else
        {
            System.out.println("Sorry,you have Enter wrong key" + "\n" + "\n");
            System.out.println("Welcome to Book Menu" + "\n");
            System.out.println("Enter 1 to Add new Book");
            System.out.println("Enter 2 to Book Description");
            System.out.println("Enter 3 to Delete Book");
            System.out.println("Enter 0 to Main Menu");
            bookMenu();
        } 
    }
     
     public void mainMenu()
     {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Welcome to OKBC Library Record" + "\n" + "\n" + "\n");
        System.out.println("Press 1 to Book Menu");
        System.out.println("Press 2 to Member Menu");
        System.out.println("Press 3 to Borrow Book Menu");
        System.out.println("Press 4 to Return Book Menu");
        
        int mainMenu = sc.nextInt();
        
        if(mainMenu == 1)
        {
            bookMenu();
        } 
        else if(mainMenu == 2) 
        {
            
        }
        
        else if(mainMenu == 3) 
        {
            
        }
        
        else if(mainMenu == 4) 
        {
            
        }
        
        else
        {
            System.out.println("Sorry,you have Enter wrong key" + "\n" + "\n");
            System.out.println("Press 1 to Book Menu");
            System.out.println("Press 2 to Member Menu");
            System.out.println("Press 3 to Borrow Book Menu");
            System.out.println("Press 4 to Return Book Menu");
            mainMenu();
            
        }
     }
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book b = new Book();
        Library lr = new Library();
        
        lr.mainMenu();
        
       
    }
    
}
