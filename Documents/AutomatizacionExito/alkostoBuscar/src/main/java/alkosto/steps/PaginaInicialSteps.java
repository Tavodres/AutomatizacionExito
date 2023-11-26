package alkosto.steps;

import alkosto.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {

    @Page
    PaginaInicialPage paginaInicialPage;


    @Step("Abrir navegador")
    public void abrirNavegador(){

        paginaInicialPage.openUrl("https://www.alkosto.com/");
    }


}
