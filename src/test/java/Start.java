import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
    WebDriver wd;

    @Test
    public void goToPhoneBook(){
        // open browser
        wd=new ChromeDriver();
        //go to phonebook
        //  wd.get("https://contacts-app.tobbymarshall815.vercel.app/"); //whiout history

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        wd.navigate().to("https://www.google.com/");
        wd.quit();
        //with history

        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        //close browser
        //wd.close();
        //wd.quit();
    }

    @Test
    public void loginTest(){

        wd=new ChromeDriver();
        //wd=new FirefoxDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        // open loginPage :find loginTab + click
        //fill email  : find ElementEmail + type "email"
        //fill password :find ElementPassword + type "password"
        // login submit : find login button _ click
        // Assert (ex res=ac res)


        // [PHONEBOOK ;Home Component ]
        WebElement element = wd.findElement(By.tagName("h1"));  /// PHONEBOOK
        element.click();

        List<WebElement> list =wd.findElements(By.tagName("h1"));

        WebElement element1 = list.get(1); ///Home Component
        element1.click();

        // By id
        wd.findElement(By.id("root"));
        // By class
        wd.findElement(By.className("container"));
        // By linkText
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("AB"));
        // By.name
        wd.findElement(By.name("name"));
        wd.findElement(By.name("surename"));

        // By.ccsSelector
        //by tagname
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("a"));
        // by id
        wd.findElement(By.cssSelector("#root"));
        // by class
        wd.findElement(By.cssSelector(".container"));
        // by attribute
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href]"));

        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href ^='/ho']")); /// start with /ho
        wd.findElement(By.cssSelector("[href *='om']")); // containce - om
        wd.findElement(By.cssSelector("[href $='me']")); // end of me

        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href='/home']"));


        //By.xPath

        wd.quit();
    }

    @Test
    public void homework(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/evnik/Desktop/Auto%20Testing%20Israel/%D0%A3%D1%80%D0%BE%D0%BA%2005.09/index.html");

        // find items

        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
        //WebElement item1 = wd.findElement(By.name("Item 1"));
        //WebElement item1 = wd.findElement(By.cssSelector("[href $='m1']"));
        //WebElement element = wd.findElement(By.tagName("a"));
        //element.click();

        // Почему list полчеркивает? Или так как это булевая величина, тег а не может быть листом?
        //WebElement item1 = List<WebElement> list =wd.findElements(By.tagName("a"));
        //WebElement element1 = list.get(0); ///item1
        //WebElement item1 = wd.findElement(By.className("nav-item"));


        // Same for everyone

        WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
        //WebElement item2 = wd.findElement(By.name("Item 2"));
        //WebElement item2 = wd.findElement(By.cssSelector("[href $='m2']"));
        //WebElement item2 = List<WebElement> list =wd.findElements(By.tagName("a"));
        //WebElement element2 = list.get(1); ///item2
        //element2.click()

        WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
        //WebElement item3 = wd.findElement(By.name("Item 3"));
        //WebElement item3 = wd.findElement(By.cssSelector("[href $='m3']"));
        //WebElement item3 = List<WebElement> list =wd.findElements(By.tagName("a"));
        //WebElement element3 = list.get(2); ///item3
        //element3.click()

        WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));
        //WebElement item4 = wd.findElement(By.name("Item 4"));
        //WebElement item4 = wd.findElement(By.cssSelector("[href $='m4']"));
        //WebElement item4 = List<WebElement> list =wd.findElements(By.tagName("a"));
        //WebElement element4 = list.get(3); ///item4
        //element4.click()


        //find element of form
        WebElement name = wd.findElement(By.name("Type your name"));
        WebElement surename = wd.findElement(By.name("Type your surename"));
        WebElement send = wd.findElement(By.className("btn"));
        // WebElement send = wd.findElement(By.name("Send"));

        // ****** find from table
        WebElement poland = List<WebElement> list = wd.findElements(By.tagName("td"));
        //WebElement element1 = list.get(9); ///item1
    }
}
