package com.Aviana.test.Avianca.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Aviana.test.Avianca.BasePOM.BasePOM;

public class Comprar extends BasePOM{

	
	By desde =  By.xpath("//span[text()='Explora destinos']");
	By hacia = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[3]/div[2]/label/div/input[1]");
	By destino = By.xpath("//div[text()='África']");
	By destino2 = By.xpath("//div[text()='Marruecos']");
	By destino3 = By.xpath("//div[@data-id='CMN']");
	By ida = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/input[1]");
	By soloIDa = By.xpath("//a[text()='Solo ida']");
	By buscar = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[4]/button");
	
	
	public Comprar(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void diligenciar() {
		wait(7, soloIDa);
		click(soloIDa);
		click(hacia);
		wait(7, desde);
		click(desde);
		wait(7, destino);
		click(destino);
		wait(7, destino2);
		click(destino2);
		wait(7, destino3);
		click(destino3);
		wait(7, ida);
		write("Jue, 1 abr.", ida);
		wait(7, buscar);
		click(buscar);		
	}

}
