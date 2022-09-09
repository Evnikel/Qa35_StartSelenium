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
        WebElement item1_1 = wd.findElement(By.linkText("Item 1"));
        WebElement item1_2 = wd.findElement(By.cssSelector("[href $='m1']"));
        WebElement element = wd.findElement(By.tagName("a")); //Item1
        element.click();
        List<WebElement> list =wd.findElements(By.tagName("a"));
        WebElement el =list.get(0);;

        WebElement item =(wd.findElements(By.tagName("a"))).get(0);
        WebElement item1_3 = wd.findElement(By.className("nav-item"));


        WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
        WebElement item2_5 = wd.findElement(By.linkText("Item 2")); // error
        WebElement item2_1 = wd.findElement(By.cssSelector("[href $='m2']"));
        WebElement element2 = wd.findElements(By.tagName("a")).get(1); ///item2
        element2.click();

        WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
        WebElement item3_1 = wd.findElement(By.cssSelector("[href $='m3']"));
        List<WebElement> list1 =wd.findElements(By.tagName("a"));
        WebElement element3 = list1.get(2); ///item3
        element3.click();

        WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));
        WebElement item4_1 = wd.findElement(By.cssSelector("[href $='m4']"));
        List<WebElement> list2 =wd.findElements(By.tagName("a"));
        WebElement element4 = list2.get(3); ///item4
        element4.click();


        //find element of form
        WebElement name = wd.findElement(By.name("name"));
        WebElement name1 = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement surename = wd.findElement(By.name("surename"));
        WebElement surename1 = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement send = wd.findElement(By.className("btn"));
        WebElement send2 = wd.findElement(By.cssSelector(".btn"));


        // ****** find from table
        List<WebElement> list4 = wd.findElements(By.tagName("td"));
        WebElement element1 = list4.get(9); ///Poland
        String text = element1.getText();
        System.out.println(text);

        wd.quit();
    }
}
