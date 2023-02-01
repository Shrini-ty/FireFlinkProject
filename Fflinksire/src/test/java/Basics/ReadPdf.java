package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.PDF;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ReadPdf {

	public static void main(String[] args) throws IOException, SAXException, TikaException {
	BodyContentHandler contexthndler=new BodyContentHandler();
	FileInputStream fis=new FileInputStream("./src/test/resources/testdata/SVD RESUME 1.pdf");
			Metadata data=new Metadata();
			ParseContext context=new ParseContext();
			
	org.apache.tika.parser.pdf.PDFParser parser=new org.apache.tika.parser.pdf.PDFParser();
	parser.parse(fis, contexthndler, data, context);
	
		System.out.println(contexthndler.toString());		
	 
	}

}
