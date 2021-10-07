package Tareas;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Acciones.Click;
import Objetos.PO_AtesterMateDescargaArchivo;

public class Pagina2 {
public static void como (WebDriver driver) {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		Click.sobre(driver, PO_AtesterMateDescargaArchivo.Seleccionarelemento2);
		
}
}

