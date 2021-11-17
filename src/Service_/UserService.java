/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service_;

import Entity_.User;
import Repository_.UserRepository;

/**
 *
 * @author Shehan Tharaka
 */
public class UserService {

    private UserRepository ur = new UserRepository();

    public void login(User u) {
        ur.login(u);
    }

    public boolean checkuser(String value) {
        if (ur.checkuser(value)) {
            return true;
        } else {
            return false;
        }
    }

    public void searchUser(User u, String value) {
        ur.searchUser(u, value);
    }

    public void addUser(User u) {
        ur.addUser(u);
    }
    
    public void nextAdmin(User u){
        ur.nextAdmin(u);
    }
    
    public boolean checkuserbyUname(String value){
        if (ur.checkuserbyUname(value)) {
            return true;
        } else {
            return false;
        }
    }
}
