
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.dao;

import com.abyssinia.model.CreditCard;
import com.abyssinia.model.User;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private static Map<String, User> users = new HashMap<>();

   static {
        User u1 = new User("Dagm", "dagm", "123",
                "dagm@abys.com", LocalDate.now().minusYears(25),
                new CreditCard(
                        "1232122311123","534", "1000 N St", "3332",
                        LocalDate.of(2022, 1, 3)));
        User u2 = new User("Yacob", "yacob", "123",
                "yacob@abys.com", LocalDate.now().minusYears(25),
                new CreditCard(
                        "546122311123","534", "1000 N St", "3332",
                        LocalDate.of(2022, 1, 3)));
        User u3 = new User("aradom", "aradom", "123",
                "arado@abys.com", LocalDate.now().minusYears(25));

        users.put(u1.getUsernName(), u1);
        users.put(u2.getUsernName(), u2);
        users.put(u3.getUsernName(), u3);
    }

    public static boolean isRegistered(String username, String password) {
        User u = users.get(username);
        if(u != null) {
            if (u.getPassword().equals(password))
                return true;
            return false;
        }else{
            return false;
        }
    }
    public static boolean isgetCreditCard(String userName){
       if(users.get(userName).getCreditCard() != null){
               return true;
       }else{
           return false;
       }
    }

    public static void insertCard(String userName, CreditCard cc){
        User u = users.get(userName);
        u.setCreditCard(cc);
    }

    public static void addUser(User newUser){
       users.put(newUser.getUsernName(), newUser);
    }

    public static User getUserById(String userName){
        return users.get(userName);
    }
}

