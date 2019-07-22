/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.record.system;

/**
 *
 * @author zikri.z
 */
public class Book {
    
    private String bTitle ,bAuthor ,bPublisher ,bISBN ,bShelf ,bPages ;
    private int bCopies = 0;
    
    public Book()
    {
        bTitle = "";
        bAuthor = "";
        bPublisher = "";
        bISBN = "";
        bShelf = "";
        bPages = "";
        bCopies = 0;
    }
    public Book(String t,String a,String pub,String i,String s,String pag, int c)
    {
        bTitle = t;
        bAuthor = a;
        bPublisher = pub;
        bISBN = i;
        bShelf = s;
        bPages = pag;
        bCopies = c;
    }
    
    //Getter
    public String getBTitle()
    {
        return bTitle;
    }
    
    public String getBAuthor()
    {
        return bAuthor;
    }
    
    public String getBPublisher()
    {
        return bPublisher;
    }
    
    public String getBISBN()
    {
        return bISBN;
    }
    
    public String getBPages()
    {
        return bPages;
    }
    
    public int getBCopies()
    {
        return bCopies;
    }
    
    //Setter
    
    public void setBTitle(String t)
    {
        bTitle = t;
    }
    
    public void setBAuthor(String a)
    {
        bAuthor = a;
    }
    
    public void setBPublisher(String pub)
    {
        bPublisher = pub;
    }
    
    public void setBISBN(String i)
    {
        bISBN = i;
    }
    
    public void setBPages(String pag)
    {
        bPages = pag;
    }
    
    public void setBTitle(int c)
    {
        bCopies = c;
    }
    
}
