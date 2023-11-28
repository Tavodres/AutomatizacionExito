package com.haceb.stepDefinitions;

import com.haceb.pageObject.PaginaInicialPage;
import com.haceb.pageObject.ValidacionPage;
import com.haceb.steps.PaginaAdicionalSteps;
import com.haceb.steps.PaginaInicialSteps;
import com.haceb.steps.RegistroSteps;
import com.haceb.steps.ValidacionSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistroHacebStepDef {


    @Steps
    PaginaInicialSteps paginaInicialSteps;

    @Steps
    RegistroSteps registroSteps;

    @Steps
    PaginaAdicionalSteps paginaAdicionalSteps;

    @Steps
    ValidacionSteps validacionSteps;

    @Dado("que el usuario abre el navegador e ingresa a la pagina de Haceb.com")
    public void queElUsuarioAbreElNavegadorEIngresaALaPaginaDeHacebCom() {

        paginaInicialSteps.abrirNavegador();
    }


    @Cuando("El usuario seleciona mi perfil y presiona el boton de registrarse")
    public void elUsuarioSelecionaMiPerfilYPresionaElBotonDeRegistrarse() {

        paginaInicialSteps.seleccionarPerfil();
        paginaInicialSteps.IngresarRegistrar();
        paginaInicialSteps.presionarIngreso();
        paginaInicialSteps.cerrarPop();
        paginaInicialSteps.cambioVentana();

    }
    @Cuando("Diligenicia los datos de registro aceptando condiciones")
    public void diligeniciaLosDatosDeRegistroAceptandoCondiciones() {
        registroSteps.ingresarCorreo();
        registroSteps.ingresarNombre();
        registroSteps.ingresarApellido();
        registroSteps.ingresarContrasena();
        registroSteps.ingresarContrasena2();
        registroSteps.presionarcheck();
        registroSteps.presionarcheck2();
        registroSteps.presionaRegisto();
        paginaAdicionalSteps.ingresarDocumento();
        paginaAdicionalSteps.seleccionarGenero();
        paginaAdicionalSteps.ingresarFecha();
        paginaAdicionalSteps.presionarEnviar();
        validacionSteps.cambioVentana2();


    }
    @Entonces("el usuario podra ver que se ha registrado")
    public void elUsuarioPodraVerQueSeHaRegistrado() {

        validacionSteps.validacionIngreso();
    }


}
