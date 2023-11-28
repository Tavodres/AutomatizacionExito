package com.haceb.steps;

import com.haceb.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class PaginaInicialSteps {

    PaginaInicialPage paginaInicialPage= new PaginaInicialPage();

    @Step
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://www.haceb.com/");
    }

    @Step
    public void seleccionarPerfil(){

        WebDriverWait wait = new WebDriverWait(paginaInicialPage.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(paginaInicialPage.getBtnPerfil()));

        Actions actions = new Actions(paginaInicialPage.getDriver());
        actions.moveToElement(paginaInicialPage.getDriver().findElement(paginaInicialPage.getBtnPerfil())).perform();
    }

    @Step
    public void IngresarRegistrar(){
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getBtnRegistrar()).click();
    }


    @Step
    public void presionarIngreso(){
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getBtnIngresar()).click();
    }

    @Step
    public void cerrarPop(){

        WebDriverWait wait = new WebDriverWait(paginaInicialPage.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(paginaInicialPage.getBtnCerrarPop()));

        paginaInicialPage.getDriver().findElement(paginaInicialPage.getBtnCerrarPop()).click();
    }

    @Step
    public void cambioVentana(){

        WebDriverWait wait = new WebDriverWait(paginaInicialPage.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String windowHandle : paginaInicialPage.getDriver().getWindowHandles()) {
            if(!paginaInicialPage.getDriver().getWindowHandle().contentEquals(windowHandle)) {
                paginaInicialPage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }

    }


}
