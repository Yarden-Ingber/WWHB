package pageObject;

import org.openqa.selenium.By;

public class GoogleSearchPage {

    public static PageElement searchBar = new PageElement(By.cssSelector("[type=\"text\"]"), "Search bar");

}
