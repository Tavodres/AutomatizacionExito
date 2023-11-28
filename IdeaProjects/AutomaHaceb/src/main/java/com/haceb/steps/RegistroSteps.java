package com.haceb.steps;

import com.haceb.pageObject.RegistroPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistroSteps {

    RegistroPage registroPage = new RegistroPage();

    @Step
    public void ingresarCorreo(){
        registroPage.getDriver().findElement(registroPage.getTxtCorreo()).sendKeys(Data.extractTo().get(0).get("Correo"));
    }

    @Step
    public void ingresarNombre(){
        registroPage.getDriver().findElement(registroPage.getTxtNombre()).sendKeys(Data.extractTo().get(0).get("Nombre"));
    }

    @Step
    public void ingresarApellido(){
        registroPage.getDriver().findElement(registroPage.getTxtApellido()).sendKeys(Data.extractTo().get(0).get("Apellido"));
    }

    @Step
    public void ingresarContrasena(){
        registroPage.getDriver().findElement(registroPage.getTxtContrasena()).sendKeys(Data.extractTo().get(0).get("Contraseña"));
    }

    @Step
    public void ingresarContrasena2(){
        registroPage.getDriver().findElement(registroPage.getTxtContrasena2()).sendKeys(Data.extractTo().get(0).get("Contraseña2"));
    }

    @Step
    public void presionarcheck(){
        JavascriptExecutor js = (JavascriptExecutor) registroPage.getDriver();
        js.executeScript("arguments[0].click();", registroPage.getDriver().findElement(registroPage.getCheckBox1()));
    }


    @Step
    public void presionarcheck2(){
            registroPage.getDriver().findElement(registroPage.getCheckBox2()).click();
    }
    @Step
    public void presionaRegisto(){
        WebDriverWait wait = new WebDriverWait(registroPage.getDriver(),Duration.ofSeconds(30)); // Espera un máximo de 10 segundos
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("gigya-screen-loader")));

        registroPage.getDriver().findElement(registroPage.getBtnRegistro()).click();
    }


}
