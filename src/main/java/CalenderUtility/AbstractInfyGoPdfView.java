package CalenderUtility;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.AbstractView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public abstract class AbstractInfyGoPdfView extends AbstractView {

    public AbstractInfyGoPdfView() {
        setContentType("application/pdf");
    }
    protected void createPdfMetadata(Map<String, Object> model, Document document, HttpServletRequest request) {}

    protected abstract void createPdfDoc(Map<String, Object> model,
                                             Document document,
                                             PdfWriter pdfwriter,
                                             HttpServletRequest request,
                                             HttpServletResponse response) throws Exception;

    /*@Override
    protected boolean generatesDownloadContent() {
        return true;
    }*/
}
