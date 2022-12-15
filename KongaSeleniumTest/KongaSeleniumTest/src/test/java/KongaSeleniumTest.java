import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class KongaSeleniumTest {


    private WebDriver driver;
    @Test
    public void start() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Launch Browser
        driver = new ChromeDriver();
        //Load Website Link
        driver.get("https://www.konga.com/");

        // Allow Website Load Fully
        Thread.sleep(5000);
        //Maximise the page
        driver.manage().window().maximize();
        //Page Title
        Thread.sleep(5000);
        driver.getTitle();
        Thread.sleep(5000);
        // Click on Login/Sign Up Page
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div/div[1]/div/div/div[4]/a")).click();
        // Verify that user cannot login with valid username and invalid password
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[1]/input")).sendKeys("macdavideje@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[2]/input")).sendKeys("hali");
        //click on login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
       Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(9000);


        //Click on Login/Sign Up Page
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div/div[1]/div/div/div[4]/a")).click();
        // Verify that user cannot login with invalid username and valid password
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[1]/input")).sendKeys("macdavideje@g.");
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[2]/input")).sendKeys("halidon15");
        //click on login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(9000);


        //click on login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div/div[1]/div/div/div[4]/a")).click();
        // Verify that user cannot login with invalid username and invalid password
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[1]/input")).sendKeys("macdavideje@.");
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[2]/input")).sendKeys("hal");
        //click on login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(9000);



        //click on login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div/div[1]/div/div/div[4]/a")).click();
        // Verify that user cannot login with valid username and valid password
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[1]/input")).sendKeys("macdavideje@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[2]/input")).sendKeys("halidon15");
        //click on login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(9000);

    }

    @AfterTest
    public void CloseBrowser(){
    driver.quit();
    }
}