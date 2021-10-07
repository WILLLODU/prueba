package Acciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click {
	
	public static void sobre (WebDriver driver , By Localizador) {
		driver.findElement(Localizador).click();
	}

}

