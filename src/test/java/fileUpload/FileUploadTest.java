package fileUpload;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {
    @Test
    public void testFileUpload(){
        var fileUploadPage=homePage.clickFileUploadLink();
        String fileName ="test.txt";
        String filePath ="C:\\Users\\ahmed\\Desktop\\";
        fileUploadPage.uploadFile(filePath+fileName);
        assertEquals(fileUploadPage.getFileUploadText(),fileName,"The file is Not Uploaded");

    }
}
