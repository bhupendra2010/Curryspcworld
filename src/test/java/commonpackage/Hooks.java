package commonpackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory=new DriverFactory();

    @Before
    public void open(){
        driverFactory.openbrowser();
    }
    //@After
    public void close(){
        driverFactory.closebrowser();
    }
}
