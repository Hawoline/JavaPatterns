package com.hawoline.patterns.behavioural.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware mMiddleware;

    public void setMiddleware(Middleware middleware) {
        this.mMiddleware = middleware;
    }

    public boolean login(String email, String password) {
        if (mMiddleware.check(email, password)) {
            System.out.println("Authorization has been successful!");

            return true;
        }

        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
