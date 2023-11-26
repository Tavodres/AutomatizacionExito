package alkosto.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPage extends PageObject {

    private final By lnkLogin = By.xpath(" //button[@data-testid='login-button']");

    public By getLnkLogin() {
        return lnkLogin;
    }

}
