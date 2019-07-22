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
public class Member {
    
    private String mName = "",mID = "";
    
    public Member(String n,String i)
    {
        mName = n;
        mID = i;
    }
    
    public String getMName()
    {
        return mName;
    }
    
    public String getmID()
    {
        return mID;
    }
    
    public void setMName(String n)
    {
        mName = n;
    }
    
    public void setMID(String i)
    {
        mID = i;
    }
    
    
}
