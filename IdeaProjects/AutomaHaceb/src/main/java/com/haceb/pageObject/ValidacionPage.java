package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionPage extends PageObject {

        private final By icoPerfil=By.xpath("//input[@value='ACTUALIZAR DATOS']");


    public By getIcoPerfil() {
        return icoPerfil;
    }
}
