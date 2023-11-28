package com.haceb.pageObject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;



public class PaginaInicialPage extends PageObject {

    private final By btnPerfil = By.xpath("//div[@class='link-account-item link-account-user']");
    private final By btnRegistrar = By.xpath("//a[@class='cdc-fire cdc-register']");
    private final By btnIngresar = By.id("vtexIdUI-custom-oauth");

    private final By btnCerrarPop = By.xpath("//a[@aria-label='close window']");



    public By getBtnPerfil() {
        return btnPerfil;
    }

    public By getBtnRegistrar() {
        return btnRegistrar;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }


    public By getBtnCerrarPop() {
        return btnCerrarPop;
    }
}
