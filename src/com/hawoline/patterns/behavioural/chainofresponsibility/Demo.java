package com.hawoline.patterns.behavioural.chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.register("kdmbkmb@gmail.com", "password");
        server.register("kdmbkmbfff@gmail.com", "password");

        Middleware middleware = new ThrottingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());
    }
}
