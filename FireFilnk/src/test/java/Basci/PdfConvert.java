package Basci;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.common.function.type4.Parser;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

public class PdfConvert {
	@Test

	public  void work(String[] args) throws IOException, SAXException, TikaException {
		BodyContentHandler Conte= new BodyContentHandler();
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData/Adithya_TY(ELF-43) (2).pdf");
		Metadata meta= new Metadata();
		ParseContext parse= new ParseContext();
		PDFParser pdf= new PDFParser();
		pdf.parse(fis, Conte, meta,parse);
		System.out.println(Conte.toString());

	}

}
