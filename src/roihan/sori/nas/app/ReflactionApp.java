package roihan.sori.nas.app;

import roihan.sori.nas.data.CreateUserRequest;
import roihan.sori.nas.utils.ValidationUtil;

public class ReflactionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        ValidationUtil.validationReflaction(request);
    }
}
