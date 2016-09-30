/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users.dao;
import users.model.User;
import java.util.List;


/**
 *
 * @author raul
 */

    public interface UserDAO {
    void agregarUser(User user);
    void borrarUser(int dbUserId);
    void cambiarUser(User user);
    List<User> desplegarUsers();
    User elegirUser(int dbUserId);
}