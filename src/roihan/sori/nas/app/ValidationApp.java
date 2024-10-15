package roihan.sori.nas.app;

import roihan.sori.nas.data.LoginRequest;
import roihan.sori.nas.error.ValidationException;
import roihan.sori.nas.utils.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("test", null);


//    try {
//        ValidationUtil.validate(loginRequest);
//        System.out.println("Data valid");
//    } catch (ValidationException |  e) {
//        System.out.println("Data tidak valid : " + e.getMessage());
//    } catch (NullPointerException e) {
//        System.out.println("Data null : " + e.getMessage());
//    }
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException  e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        } finally {
            System.out.println("Akan selalu di eksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest(null , null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("sukses");

    }
}
