package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import configs.webmanagerdriver;

public class hook {

    @Before
    public void SetUp() {
        webmanagerdriver.setUp();
    }

    @After
    public void TearDown(){
        webmanagerdriver.tearDown();
    }

}
