package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaAdicionalPage extends PageObject {

    private final By txtCedula = By.xpath("//input[@placeholder='Ingrese su documento de identidad *']");
    private final By lstGenero = By.xpath("(//select[@data-screenset-element-id='gigya-dropdown-153944062160082270'])[2]");
    private final By txtNacimiento =By.id("gigya-textbox-29430652596742216");
    private final By btnEnviar = By.xpath("(//input[@class='gigya-input-submit hc-c-register-screen-submit invi'])[2]");



    public By getTxtCedula() {
        return txtCedula;
    }

    public By getLstGenero() {
        return lstGenero;
    }

    public By getTxtNacimiento() {
        return txtNacimiento;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }

}
