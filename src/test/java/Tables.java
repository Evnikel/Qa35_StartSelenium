import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {
    WebDriver wd;

    @Test
    public void wschoolTables() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        // print count rows in table

        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Count of rows    " + listRows.size());
        Assert.assertEquals(listRows.size(), 7);

        // print last rows
        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastRow.getText());

        // print count of columns   ===3

        //#customers tr:first-child th
        List<WebElement> listColumns = wd.findElements(By.cssSelector("#customers th"));
        Assert.assertEquals(listColumns.size(), 3);

        // print text Canada

        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(canada.getText());
        Assert.assertEquals(canada.getText(), "Canada");


    }

    @Test
    public void homeWorkTable() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/evnik/Desktop/Auto%20Testing%20Israel/%D0%A3%D1%80%D0%BE%D0%BA%2005.09/index.html");// url to index.html


        // print count rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("tr"));
        List<WebElement> rows = wd.findElements(By.xpath("//tr"));

        wd.findElement(By.xpath( "//table[@id='country-table']/tbody/tr"));
        wd.findElement(By.cssSelector( "table#country-table>tbody>tr"));


        wd.findElement(By.xpath("//table[@id='country-table']//tr"));
        wd.findElement(By.cssSelector( "table#country-table tr"));

        wd.findElement(By.xpath("//*[@id='country-table']//tr"));
        wd.findElement(By.cssSelector("#country-table tr"));
        System.out.println("Count of rows    " + listRows.size());
        Assert.assertEquals(listRows.size(), 4);

        // print last rows
        WebElement lastRow = wd.findElement(By.xpath("//tr[last()]"));
        WebElement last1Row = wd.findElement(By.cssSelector("tr:last-child"));
        System.out.println(lastRow.getText());
        Assert.assertEquals(lastRow.getText(),"Poland Chine Mexico");

        // print count of columns
        List<WebElement> columns = wd.findElements(By.xpath("//tr[1]/td"));
        List<WebElement> listColumns = wd.findElements(By.cssSelector("tr:first-child td"));
        Assert.assertEquals(listColumns.size(), 3);

        // print text
        WebElement israelText= wd.findElement(By.xpath("//tr[2]/td[2]"));
        WebElement israel = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        System.out.println(israel.getText());
        Assert.assertEquals(israel.getText(), "Israel");
    }
}
