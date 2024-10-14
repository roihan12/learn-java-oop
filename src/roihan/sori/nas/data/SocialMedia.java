package roihan.sori.nas.data;

public class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class FakeFacebook extends Facebook {
    void login(String username, String password) {

    }
}
