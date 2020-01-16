package tests;

import org.testng.annotations.Test;
import ru.stqa.pft.mantis.appmanager.HttpSession;
import java.io.IOException;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends TestBase{

    @Test
    public void testLogin() throws IOException {
        HttpSession session = app.newSession();
        assertTrue(session.login("administrator", "root"));
        assertTrue(session.IsLoggedInAs("administrator"));
    }
}
