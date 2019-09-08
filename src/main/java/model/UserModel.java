package model;

import static helper.Constants.PATH_TO_SIGN_IN_PAGE;

public class UserModel {
    private String login;
    private String password;

    public UserModel(String a, String b) {
        login = a;
        password = b;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return PATH_TO_SIGN_IN_PAGE;
    }
}