package roihan.sori.nas.app;

import roihan.sori.nas.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("roihan", "test");

        System.out.println(loginRequest);
        System.out.println(loginRequest.password());
        System.out.println(loginRequest.username());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Roihan1"));
        System.out.println(new LoginRequest("Roihan", "test1"));
        loginRequest.sayHello();
    }
}
