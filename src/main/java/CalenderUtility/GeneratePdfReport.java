package CalenderUtility;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.srinath.model.BookingDetails;

public class GeneratePdfReport {

    public static ByteArrayInputStream citiesReport(List<BookingDetails> bookingdetails)   {

        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        try {

            PdfPTable table = new PdfPTable(9);
            table.setWidthPercentage(80);
 //           table.setWidths(new int[]{1, 5, 5});
        	PdfPCell cell = new PdfPCell(new Phrase("Booked Ticket Summary"));


            Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

            PdfPCell hcell;
            hcell = new PdfPCell(new Phrase("Booking Id", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Movie Id", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Movie Name", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);
            
            hcell = new PdfPCell(new Phrase("No Of tickets", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Total Price", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);
            
            hcell = new PdfPCell(new Phrase("User Name", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);
            
            hcell = new PdfPCell(new Phrase("Show Time Opted", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);
            
           
            hcell = new PdfPCell(new Phrase("Movie City", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);
            
            hcell = new PdfPCell(new Phrase("Theater Name", headFont));
            hcell.setHorizontalAlignment(1);
            table.addCell(hcell);

            for (BookingDetails bookingdetails1 : bookingdetails) {



                cell = new PdfPCell(new Phrase(bookingdetails1.getBooking_id().toString()));
//                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(bookingdetails1.getMovie_id().toString()));
                cell.setPaddingBottom(5);
 //               cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(bookingdetails1.getMoviename()));
                cell.setPaddingLeft(5);
   //             cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(bookingdetails1.getNooftkts().toString()));
                cell.setPaddingLeft(5);
  //              cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(bookingdetails1.getTotalprice().toString()));
                cell.setPaddingLeft(5);
   //             cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(bookingdetails1.getUsername()));
                cell.setPaddingLeft(5);
    //            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(bookingdetails1.getMovietime()));
                cell.setPaddingLeft(5);
   //             cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(bookingdetails1.getMoviearea()));
                cell.setPaddingLeft(5);
    //            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(bookingdetails1.getTheatername()));
                cell.setPaddingLeft(5);
     //           cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(1);
                table.addCell(cell);

                
            }

            PdfWriter.getInstance(document, out);
            document.open();
            String filename = "C:\\Users\\Lenovo\\eclipse-workspace\\BookTickets\\src\\main\\webapp\\static\\images/movie-ticket-booking.jpg";
            Image img = Image.getInstance(filename);
            
            document.add(new Paragraph("Sample 1: This is simple image demo."));
            
            document.add(new Paragraph(""));
            
           document.add(img);


            document.add(table);
            
            document.close();
            
        } catch (DocumentException ex) {
        
            Logger.getLogger(GeneratePdfReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return new ByteArrayInputStream(out.toByteArray());
    }
}