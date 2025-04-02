package Controlers;

import View.Login;

public class ControlLogin {
    public static void main(String[] args) {
        try {
            Login login = new Login();
            login.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         //login.setLocationRelativeTo(null);
         
    }
}
