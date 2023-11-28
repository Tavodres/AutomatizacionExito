package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistroPage extends PageObject {

        private final By txtCorreo = By.xpath("//input[@placeholder='Correo electrónico *']");
        private final By txtNombre = By.xpath("//input[@placeholder='Nombre *']");
        private final By txtApellido = By.xpath("//input[@placeholder='Apellido *']");
        private final By txtContrasena = By.xpath("//input[@placeholder='Contraseña *']");
        private final By txtContrasena2 = By.xpath("//input[@placeholder='Confirma la contraseña *']");
        private final By CheckBox1 = By.xpath("(//span[@data-translation-key='CHECKBOX_70031539084410860_LABEL'])[3]");
        private final By CheckBox2 = By.xpath("(//label[@data-translation-key='MULTICHOICE_109350074984747230_CHOICES_B326B5062B2F0E69046810717534CB09'])[2]");
        private final By btnRegistro =By.xpath("(//div[@class='gigya-composite-control gigya-composite-control-submit hc-submit-btn hc-paddingb-reduce invi'])[2]");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getTxtContrasena2() {
        return txtContrasena2;
    }

    public By getCheckBox1() {
        return CheckBox1;
    }

    public By getCheckBox2() {
        return CheckBox2;
    }
    public By getBtnRegistro() {
        return btnRegistro;
    }
}
