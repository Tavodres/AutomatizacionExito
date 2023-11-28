package com.haceb.steps;

import com.haceb.pageObject.ValidacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ValidacionSteps {


    ValidacionPage validacionPage =new ValidacionPage();

    @Step("Validacion ingreso")
    public void validacionIngreso(){

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(validacionPage.getDriver(),Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(validacionPage.getIcoPerfil()));

        Assert.assertTrue(
                validacionPage.getDriver().findElement(validacionPage.getIcoPerfil()).isDisplayed()
        );
    }


    @Step
    public void cambioVentana2(){

        WebDriverWait wait = new WebDriverWait(validacionPage.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfWindowsToBe(1));

        Set<String> handles = validacionPage.getDriver().getWindowHandles();
        validacionPage.getDriver().switchTo().window(handles.toArray(new String[0])[handles.size() - 1]);
    }

}
