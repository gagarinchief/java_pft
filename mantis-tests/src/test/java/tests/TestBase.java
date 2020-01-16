package tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.mantis.appmanager.ApplicationManager;

public class TestBase {


    protected static ApplicationManager app;

    static {
        app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));
    }

    @BeforeSuite(alwaysRun = true) //Аннотация. Подсказка для тестового framework
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }


}
