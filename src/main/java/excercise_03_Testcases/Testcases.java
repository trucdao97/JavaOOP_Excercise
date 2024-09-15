package excercise_03_Testcases;

import excercise_03_Common.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Type;

public class Testcases extends BaseTest {

    @Override
    public void createDriver() {
        super.createDriver();
    }

    @Override
    public void closeDriver() {
        super.closeDriver();
    }

    public void loginInfo() {
        System.out.println("*** TESTCASE LOGIN");
        createDriver();
        System.out.println("Open the url: https://cms.anhtester.com/");
        System.out.println("Step 1: Input " + Constants.email + " and " + Constants.password);
        System.out.println("Step 2: Click " + Buttons.LOG_IN_BUTTON);
        System.out.println("-> Login successfully!");
        closeDriver();
        System.out.println();
    }

    public void clickProductMenu() {
        System.out.println("Step 1: Click to open the product menu");
    }

    public void openProductMenu(ProductsMenu selectProduct) {
        System.out.println("Step 2: Click " + selectProduct);
    }

    public void createCategory() {
        System.out.println("Step 3: Click " + Buttons.ADD_NEW_CATEGORY_BUTTON);
    }

    public void inputCategoryNameInformation(String categoryName,
                                             ParentCategory parentCategory,
                                             int orderingNumber,
                                             CategoryType categoryType,
                                             String metaTitle,
                                             String metaDescription,
                                             FilteringAttributes filteringAttributes){
        System.out.println("-> Input the information to create category successfully");
    }

    public void uploadBanner() {
        System.out.println("Step 4: Click " + Buttons.BANNER_BROWSER_BUTTON);
        System.out.println("Step 5: Select photo to upload");
        System.out.println("Step 6: Click " + Buttons.BANNER_ADD_FILES_BUTTON);
        System.out.println("-> Upload Banner photo successfully!");
    }

    public void uploadIcon() {
        System.out.println("Step 7: Click " + Buttons.ICON_BROWSER_BUTTON);
        System.out.println("Step 8: Select photo to upload");
        System.out.println("Step 9: Click " + Buttons.ICON_ADD_FILES_BUTTON);
        System.out.println("-> Upload Icon photo successfully!");
    }

    public void addCategory(){
        System.out.println("*** TESTCASE ADD CATEGORY");
        createDriver();
        clickProductMenu();
        openProductMenu(ProductsMenu.CATEGORY);
        createCategory();
        inputCategoryNameInformation("T-Shirt",
                ParentCategory.MAY_FASHION,
                123,
                CategoryType.PHYSICAL,
                "Clothing",
                "T-Shirt for both men and women",
                FilteringAttributes.SIZE);
        uploadBanner();
        uploadIcon();
        System.out.println("Step 10: Click " + Buttons.SAVE_BUTTON);
        closeDriver();
    }
    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        testcases.loginInfo();
        testcases.addCategory();

    }
}
