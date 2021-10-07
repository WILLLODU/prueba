package Prueba;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Impresion.UtilizaFile;

import Tareas.Pagina1;
import Tareas.Pagina2;
import Tareas.Pagina3;
import Tareas.PaginaDescarga;


public class TestPrueba {
	public static void main(String[] args) throws InterruptedException, HeadlessException, InvalidFormatException, IOException, AWTException {
		// TODO Auto-generated method stub
		UtilizaFile imprimeEvidencia = new UtilizaFile();
		
		WebDriver driver ;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		imprimeEvidencia.InicializaFile();
		driver.get("https://www.banistmo.com/wps/portal/banistmo/personas/");
		imprimeEvidencia.PasoDelScript("1. Inicio de Pantalla");
		driver.manage().window().maximize();
		Pagina1.como(driver);
		imprimeEvidencia.PasoDelScript("2. Inicio de Pantalla");
		Pagina2.como(driver);
		imprimeEvidencia.PasoDelScript("3. Inicio de Pantalla");
		Pagina3.como(driver);
		imprimeEvidencia.PasoDelScript("4. Inicio de Pantalla");
		PaginaDescarga.como(driver);
		imprimeEvidencia.PasoDelScript("5. Inicio de Pantalla");
		
		Thread.sleep(8000);
		imprimeEvidencia.GeneraEvidencia("CasoDePrueba1.docx");
		
		
		
	}

}
