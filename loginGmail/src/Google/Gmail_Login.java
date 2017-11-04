package Google;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Login {

	WebDriver driver; 
	@Before
	public void SetUp(){
		driver = new FirefoxDriver();
		driver.get("https://www.google.com.br/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteEmail() throws InterruptedException{
		driver.findElement(By.className("gb_P")).click();
		
		String tituloEsperado = "Gmail";
		String atualTitulo = driver.getTitle();
		
		if(tituloEsperado.equals(atualTitulo))
		{
			System.out.println("Título da página está correto");
		}
		
		WebElement username = driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("TestSelenium");
		
		WebElement clicknext = driver.findElement(By.className("CwaK9"));
		clicknext.click();
		

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));		
		WebElement senha = driver.findElement(By.name("password"));
		//senha.clear();
		senha.sendKeys("adafs@@afasfa");
		
		WebElement clicknext2 = driver.findElement(By.className("CwaK9"));
		clicknext2.click();
		
		 try{
			 assertEquals("Senha incorreta. Tente novamente.", driver.findElement(By.cssSelector("div.dEOOab.RxsGPe")).getText());
		 }catch(AssertionError e){
			 e.printStackTrace();
		 } 
		
	}

	@After
	public void fecharNavegador(){
		driver.quit();
	}
		
}
