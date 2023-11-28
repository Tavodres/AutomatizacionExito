package com.haceb.steps;

import com.haceb.pageObject.PaginaAdicionalPage;
import com.haceb.pageObject.PaginaInicialPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PaginaAdicionalSteps {

    PaginaAdicionalPage paginaAdicionalPage =new PaginaAdicionalPage();

    @Step
    public void ingresarDocumento(){

        WebDriverWait wait = new WebDriverWait(paginaAdicionalPage.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(paginaAdicionalPage.getTxtCedula()));

        paginaAdicionalPage.getDriver().findElement(paginaAdicionalPage.getTxtCedula()).sendKeys(Data.extractTo().get(0).get("Cedula"));
    }

    @Step
    public void seleccionarGenero(){

        Select select = new Select(paginaAdicionalPage.getDriver().findElement(paginaAdicionalPage.getLstGenero()));
        select.selectByValue(Data.extractTo().get(0).get("Genero"));
    }

    @Step
    public void ingresarFecha(){
        paginaAdicionalPage.getDriver().findElement(paginaAdicionalPage.getTxtNacimiento()).sendKeys(Data.extractTo().get(0).get("Fecha"));
    }

    @Step
    public void presionarEnviar(){
        paginaAdicionalPage.getDriver().findElement(paginaAdicionalPage.getBtnEnviar()).click();

        WebDriverWait wait = new WebDriverWait(paginaAdicionalPage.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(paginaAdicionalPage.getBtnEnviar()));

    }



}
