package com.hawoline.patterns.behavioural.chainofresponsibility;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("kdmbkmb@gmail.com")) {
            System.out.println("Hello admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
