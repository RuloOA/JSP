/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users.model;

/**
 *
 * @author raul
 */
public class User {
    private int dbUserId;
    private String name;
    private String creationDate;
    private String modificationDate;
    private String userName;

    
    public User(int dbUserId, String name, String creationDate, String modificationDate,String userName) {
        this.dbUserId = dbUserId;
        this.name = name;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.userName=userName;
    }
    
    public User(){
        this(0, "", "", "", "");
    }
    
    public void setDbUserId(int dbUserId) {
        this.dbUserId = dbUserId;
    }

    public int getDbUserId() {
        return dbUserId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
 

    public String getName() {
        return name;
    }
    
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" + "dbUserId=" + dbUserId + ", name=" + name + ", creationDate=" + creationDate + ", modificationDate=" + modificationDate + ", userName=" + userName + '}';
    }
    
    
}
