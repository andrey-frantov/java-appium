package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidSearchPageObject extends SearchPageObject
{
     static {
         SEARCH_INIT_ELEMENT = "xpath://*[contains(@text, 'Search Wikipedia')]";
                 SEARCH_INPUT = "xpath://*[contains(@text, 'Search…')]";
                 SEARCH_LINE = "id:org.wikipedia:id/search_src_text";
                 SEARCH_CANCEL_BUTTON = "id:org.wikipedia:id/search_close_btn";
                 SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://*[@resource-id='org.wikipedia:id/page_list_item_container']//*[contains(@text,'{SUBSTRING}')]";
                 SEARCH_RESULT_ELEMENT = "xpath://*[@resource-id='org.wikipedia:id/search_results_list']/*[@resource-id='org.wikipedia:id/page_list_item_container']";
                 SEARCH_RESULT_TITTLE = "id:org.wikipedia:id/page_list_item_title";
                 SEARCH_EMPTY_RESULTS_ELEMENT = "xpath://*[@text='No results found']";
     }

    public AndroidSearchPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
