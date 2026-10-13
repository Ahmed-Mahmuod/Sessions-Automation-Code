package dropdown;

import org.example.DropdownPage;
import org.testng.annotations.Test;
import base.BaseTest;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTest {
    @Test
    public void testDropdown() {
        var dropdownPage = homePage.clickDropdownLink();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"The number of elements is not correct");
        assertTrue(selectedOptions.contains(option),"The option is not correct");

    }
}
