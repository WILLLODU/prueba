package Tareas;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Acciones.Click;
import Objetos.PO_AtesterMateDescargaArchivo;

public class Pagina1 {
public static void como (WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 9000)");
		
		Click.sobre(driver, PO_AtesterMateDescargaArchivo.Seleccionarelemento);
		
}
}
