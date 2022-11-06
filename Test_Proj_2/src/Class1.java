import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class1 {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\baps\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();


Actions ac=new Actions(driver);

driver.get("https://jqueryui.com/droppable/");

driver.manage().window().maximize(); //Maximize the window


driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //switching to iframe

WebElement src=driver.findElement(By.id("draggable"));

WebElement des=driver.findElement(By.id("droppable"));

ac.dragAndDrop(src, des).perform();

}

}