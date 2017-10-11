/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Surat;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author asemJr
 */
public class SuratKeteranganNikah {
class MyFooter extends PdfPageEventHelper {
        Font ffont = new Font(Font.FontFamily.UNDEFINED, 5, Font.BOLD);
        Font fJudul = new Font(Font.FontFamily.HELVETICA,20, Font.UNDERLINE);
        Font fSubJudul = new Font(Font.FontFamily.HELVETICA,10, Font.NORMAL);
        Font fAlamat = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        Font fLampiran = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
        Font fModel = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font fNamaKepalaDesa = new Font(Font.FontFamily.HELVETICA, 12, Font.UNDERLINE);
        
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte cb = writer.getDirectContent();
            //Phrase header = new Phrase("Sample InfoDes Header", ffont);
            //Phrase footer = new Phrase("Sample InfoDes Footer", ffont);
            String Kota = "Medan";
            
            Paragraph Judul = new Paragraph("SURAT KETERANGAN UNTUK NIKAH ",fJudul);
            Paragraph subJudul = new Paragraph("Nomor:474.2/1/Pemdes",fSubJudul);
            Paragraph Desa = new Paragraph("KANTOR DESA / KELURAHAN :");
            Paragraph Kecamatan = new Paragraph("KECAMATAN       :");
            Paragraph Kabupaten = new Paragraph("KABUPATEN       :");
            Paragraph Lampiran = new Paragraph("Lampiran 7 KMA No.477 Tahun 2004",fLampiran);
            Paragraph Model = new Paragraph("Model : N1",fModel);
            Paragraph KalimatPembuka = new Paragraph("Yang bertanda tangan dibawah ini menerangkan dengan sesungguhnya bahwa :  ");
            Paragraph Nama = new Paragraph      ("Nama                                 :");
            Paragraph TTL = new Paragraph       ("Tempat dan Tanggal lahir  :");
            Paragraph Usia = new Paragraph      ("Usia                                 :");
            Paragraph Warga = new Paragraph     ("Kewarganegaraan              :");
            Paragraph Kelamin = new Paragraph   ("Jenis Kelamin                     :");
            Paragraph Agama = new Paragraph     ("Agama                                :");
            Paragraph Pekerjaan = new Paragraph ("Pekerjaan                           :");
            Paragraph binti = new Paragraph     ("Binti                                    :");
            Paragraph KalimatPenutup = new Paragraph("Demikian surat keterangan ini untuk dipergunakan sebagaimana mestinya.");
            
            Paragraph NamaDesa = new Paragraph("Nama Desa,");
            Paragraph Tanggal = new Paragraph ("24 September 2018");
            Paragraph tKepalaDesa = new Paragraph("Kepala Desa");
            Paragraph namaKepalaDesa = new Paragraph("Andrey Sembiring,STh",fNamaKepalaDesa);
            
//  Paragraph Alamat = new Paragraph("Jalan Suka suka nomornya bebas",fAlamat);
//            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
//                    header,
//                    (document.right() - document.left()) / 2 + document.leftMargin(),
//                    document.top() + 10, 0);
//            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
//                    footer,
//                    (document.right() - document.left()) / 2 + document.leftMargin(),
//                    document.bottom() - 10, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    Model, (document.right() - 20 ),
                    document.top() - 25, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    Lampiran,
                    (document.right() - 70 ),
                    document.top() - 5, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Desa,
                    (document.left() - 10 ),
                    document.top() - 20, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Kecamatan,
                    (document.left() - 10 ),
                    document.top() - 40, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Kabupaten,
                    (document.left() - 10 ),
                    document.top() - 60, 0);
         
            
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    Judul,
                    (document.right() - document.left()) / 2 + document.leftMargin(),
                    document.top() - 110, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    subJudul,
                    (document.right() - document.left()) / 2 + document.leftMargin(),
                    document.top() - 130, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    KalimatPembuka,
                    (document.left() - 10 ),
                    document.top() - 180, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Nama,
                    (document.left() - 10 ),
                    document.top() - 220, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    TTL,
                    (document.left() - 10 ),
                    document.top() - 237, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Warga,
                    (document.left() - 10 ),
                    document.top() - 254, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Kelamin,
                    (document.left() - 10 ),
                    document.top() - 271, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Agama,
                    (document.left() - 10 ),
                    document.top() - 288, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Pekerjaan,
                    (document.left() - 10 ),
                    document.top() - 305, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    binti,
                    (document.left() - 10 ),
                    document.top() - 322, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    KalimatPenutup,
                    (document.left() - 10 ),
                    document.top() - 345, 0);
            
            
            
            //Tanda Tangan
            
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                   NamaDesa,
                    (document.right() - 150 ),
                    document.top() - 600, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    Tanggal,
                    (document.right() - 60 ),
                    document.top() - 600, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    tKepalaDesa,
                    (document.right() - 130 ),
                    document.top() - 620, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                   NamaDesa,
                    (document.right() - 60 ),
                    document.top() - 620, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    namaKepalaDesa,
                    (document.right() - 100 ),
                    document.top() - 700, 0);   
//            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
//                    Alamat,
//                    (document.right() - document.left()) / 2 + document.leftMargin(),
//                    document.top() - 65, 0);
            
            
                
        }
    }
 
    public static final String DEST = "D:/Kerjaan/Project/Sistem Informasi InfoDes App (Desktop Application)/Hasil/SuratKeteranganNikah.pdf";
 
    public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new SuratKeteranganNikah().createPdf(DEST);
    }
 
    public void createPdf(String filename) throws IOException, DocumentException {
        // step 1
        Document document = new Document();
        // step 2
        String imagePath = "C:/Users/asemJr/Desktop/logo.png" ; 
        Image image = Image.getInstance(imagePath);
        image.setAbsolutePosition(10, 730);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
        MyFooter event = new MyFooter();
        writer.setPageEvent(event);
        
// step 3
        document.open();
         PdfPTable table = new PdfPTable(8);
         
//          PdfContentByte canvas = writer.getDirectContent();
//        CMYKColor magentaColor = new CMYKColor(0.f, 1.f, 0.f, 0.f);
//        canvas.setColorStroke(magentaColor);
//        canvas.moveTo(36, 20);
//        canvas.lineTo(36, 806);
//        canvas.lineTo(0, 0);
        
//        canvas.closePathStroke();
//          
//         
//        table.addCell("No");
//        
//        table.addCell("Nama Lengkap");
//        table.addCell("NIK");
//        table.addCell("Jenis Kelamin");
//        table.addCell("Tempat Lahir");
//        table.addCell("Agama");
//        table.addCell("Pendidikan");
//        table.addCell("Jenis Pekerjaan");
//        
//        table.addCell("1");
//        table.addCell("2");
//        table.addCell("3");
//        table.addCell("4");
//        table.addCell("5");
//        table.addCell("6");
//        table.addCell("7");
//        table.addCell("8");
//        
//        
//        table.setHeaderRows(2);
//        for(int aw = 0; aw < 5; aw++){
//            
//            table.addCell("Andrey");
//            table.addCell("Test");
//            table.addCell("Ada");
//            table.addCell("tidak");
//            table.addCell("9");
//            table.addCell("0");
//            table.addCell("3");
//            table.addCell("2");
//            table.addCell("5");
//            table.addCell("6");
//            
//        }        // step 5
//        table.setWidthPercentage(110);
////      
//        table.setHorizontalAlignment(Element.ALIGN_CENTER);
       for(int x = 0; x<9;){
           x++;
           document.add(new Paragraph("  " ));
       }
       //document.add(image); 
       document.add(new Paragraph("  " ));
        
   //
   //document.add(table);
        
        for (int i = 0; i < 3; ) {
            i++;
            document.add(new Paragraph("  " ));
            document.newPage();
        }
       
        document.close();
    }

}