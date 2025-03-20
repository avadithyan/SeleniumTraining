package pdfboxExample;

import java.io.FileInputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class PDFTest {
	
	
	
	@Test
	public void verifyPDFExample() throws Exception {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		
		
		PDDocument pdfDocument = PDDocument.load(fis);
		
		System.out.println("Page Count: " + pdfDocument.getPages().getCount());
		Assert.assertEquals(3, 3);
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		String pdfContent = pdfText.getText(pdfDocument);
		
		
		System.out.println("==================================================");
		System.out.println(pdfContent);
		System.out.println("==================================================");
		
		
		
		Assert.assertTrue(pdfContent.contains("PIL has become a significant"));
	}

}
