package Tareas;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Acciones.Click;
import Objetos.PO_AtesterMateDescargaArchivo;

public class PaginaDescarga {
public static void como (WebDriver driver) {
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Click.sobre(driver, PO_AtesterMateDescargaArchivo.Seleccionarelemento4);
		
}
}

