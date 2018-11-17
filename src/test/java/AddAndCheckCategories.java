import com.qatestlab.prestashopautomation.pages.CategoriesPage;
import com.qatestlab.prestashopautomation.pages.LoginPage;
import com.qatestlab.prestashopautomation.pages.MainPage;
import com.qatestlab.prestashopautomation.utils.WebDriverBase;
import org.testng.annotations.Test;

import static com.qatestlab.prestashopautomation.utils.TestData.Login.EMAIL;
import static com.qatestlab.prestashopautomation.utils.TestData.Login.PASSWORD;


public class AddAndCheckCategories extends WebDriverBase {
    String namesOfNewCategories = "New";

    @Test
    public void addAndCheckNewOfCategories() {
        LoginPage lp = new LoginPage(eventFiringWebDriver);
        lp.logIn(EMAIL, PASSWORD);
        MainPage mainPage = new MainPage(eventFiringWebDriver);
        mainPage.clickToCategories();
        CategoriesPage categoriesPage = new CategoriesPage(eventFiringWebDriver);
        categoriesPage.addAndCheckNewOfCategories(namesOfNewCategories);
    }
}
