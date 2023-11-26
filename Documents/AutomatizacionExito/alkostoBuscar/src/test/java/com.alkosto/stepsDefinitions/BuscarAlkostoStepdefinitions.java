package com.alkosto.stepsDefinitions;

import alkosto.steps.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class BuscarAlkostoStepdefinitions {

@Steps
    PaginaInicialSteps paginaInicialSteps;


    @Dado("que el usuario abre el navegador e ingresa a la pagina de Alkosto.com")
    public void queElUsuarioAbreElNavegadorEIngresaALaPaginaDeAlkostoCom() {

    paginaInicialSteps.abrirNavegador();

    }

    @Cuando("El usuario Busca un Producto")
    public void elUsuarioBuscaUnProducto() {

    }
    @Cuando("Selecciona un producto de manera alatoria")
    public void seleccionaUnProductoDeManeraAlatoria() {

    }
    @Entonces("el usuario podra ver el producto seleccionado dentro del carrito de compras")
    public void elUsuarioPodraVerElProductoSeleccionadoDentroDelCarritoDeCompras() {

    }

}
