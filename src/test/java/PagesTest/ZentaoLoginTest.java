package PagesTest;

import Configs.SubmitBugConfig;
import Pages.ZentaoLogin;
import org.testng.annotations.Test;

public class ZentaoLoginTest {

    ZentaoLogin logins = new ZentaoLogin();
    @Test
    public void login () {
        logins.before();
    }

}
