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
public class SKTentangOrangTua {
class MyFooter extends PdfPageEventHelper {
        Font ffont = new Font(Font.FontFamily.UNDEFINED, 5, Font.BOLD);
        Font fJudul = new Font(Font.FontFamily.HELVETICA,20, Font.BOLD);
        Font fJudulB = new Font(Font.FontFamily.HELVETICA,20, Font.BOLD);
        Font fSubJudul = new Font(Font.FontFamily.HELVETICA,10, Font.NORMAL);
        Font fAlamat = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        Font fLampiran = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
        Font fModel = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font fNamaKepalaDesa = new Font(Font.FontFamily.HELVETICA, 10, Font.UNDERLINE);
        
        Font fPara = new Font(Font.FontFamily.HELVETICA,10, Font.NORMAL);
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte cb = writer.getDirectContent();
            //Phrase header = new Phrase("Sample InfoDes Header", ffont);
            //Phrase footer = new Phrase("Sample InfoDes Footer", ffont);
            String Kota = "Medan";
            
            Paragraph Judul = new Paragraph(" SURAT KETERANGAN TENTANG ORANG TUA",fJudul);
            Paragraph JudulB = new Paragraph("SURAT KETERANGAN ASAL USUL ",fJudulB);
            Paragraph subJudul = new Paragraph("Nomor:474.2/1/Pemdes",fSubJudul);
            Paragraph Desa = new Paragraph("KANTOR DESA / KELURAHAN :",fPara);
            Paragraph Kecamatan = new Paragraph("KECAMATAN       :",fPara);
            Paragraph Kabupaten = new Paragraph("KABUPATEN       :",fPara);
            Paragraph Lampiran = new Paragraph("Lampiran 7 KMA No.477 Tahun 2004",fLampiran);
            Paragraph Model = new Paragraph("Model : N4",fModel);
            Paragraph KalimatPembuka = new Paragraph("Yang bertanda tangan dibawah ini menerangkan dengan sesungguhnya bahwa :  ",fPara);
            Paragraph KalimatKedua  = new Paragraph("adalah benar anak kandung dari pernikahan seorang pria",fPara);
            Paragraph KalimatSKOT = new Paragraph("adalah benar ayah kandung dan ibu kandung dari :",fPara);
            Paragraph KalimatKetiga = new Paragraph("dengan seorang wanita  :",fPara);
            Paragraph Nama = new Paragraph      ("I.Nama                                 :",fPara);
            Paragraph TTL = new Paragraph       ("Tempat dan Tanggal lahir  :",fPara);
            Paragraph Usia = new Paragraph      ("Usia                                 :",fPara);
            Paragraph Warga = new Paragraph     ("Kewarganegaraan              :",fPara);
            Paragraph Kelamin = new Paragraph   ("Jenis Kelamin                     :",fPara);
                Paragraph Agama = new Paragraph     ("Agama                                :",fPara);
            Paragraph Pekerjaan = new Paragraph ("Pekerjaan                           :",fPara);
            Paragraph TempatTinggal = new Paragraph("Tempat Tinggal                    :  ",fPara);
            
            
            Paragraph NamaPria = new Paragraph      ("II.Nama                                 :",fPara);
            Paragraph TTLPria = new Paragraph       ("Tempat dan Tanggal lahir  :",fPara);
            Paragraph UsiaPria = new Paragraph      ("Usia                                 :",fPara);
            Paragraph WargaPria = new Paragraph     ("Kewarganegaraan              :",fPara);
            Paragraph KelaminPria = new Paragraph   ("Jenis Kelamin                     :",fPara);
            Paragraph AgamaPria = new Paragraph     ("Agama                                :",fPara);
            Paragraph PekerjaanPria = new Paragraph ("Pekerjaan                           :",fPara);
            Paragraph TempatTinggalPria = new Paragraph("Tempat Tinggal                    :  ",fPara);

            Paragraph NamaWanita = new Paragraph      ("Nama                                 :",fPara);
            Paragraph TTLWanita = new Paragraph       ("Tempat dan Tanggal lahir  :",fPara);
            Paragraph UsiaWanita = new Paragraph      ("Usia                                 :",fPara);
            Paragraph WargaWanita = new Paragraph     ("Kewarganegaraan              :",fPara);
            Paragraph KelaminWanita = new Paragraph   ("Jenis Kelamin                     :",fPara);
            Paragraph AgamaWanita = new Paragraph     ("Agama                                :",fPara);
            Paragraph PekerjaanWanita = new Paragraph ("Pekerjaan                           :",fPara);
            Paragraph TempatTinggalWanita = new Paragraph("Tempat Tinggal                    :  ",fPara);


//            Paragraph binti = new Paragraph     ("Binti                                    :");
            Paragraph KalimatPenutup = new Paragraph("Demikianlah, surat keterangan ini dibuat dengan mengingat sumpah jabatan dan untuk digunakan seperlunya.",fPara);
            
            Paragraph NamaDesa = new Paragraph("Nama Desa,",fPara);
            Paragraph Tanggal = new Paragraph ("24 September 2018",fPara);
            Paragraph tKepalaDesa = new Paragraph("Kepala Desa",fPara);
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
                    document.top() - 20, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    Lampiran,
                    (document.right() - 70 ),
                    document.top() + 10, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Desa,
                    (document.left() - 10 ),
                    document.top() - 50, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Kecamatan,
                    (document.left() - 10 ),
                    document.top() - 65, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Kabupaten,
                    (document.left() - 10 ),
                    document.top() - 80, 0);
         
            
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    Judul,
                    (document.right() - document.left()) / 2 + document.leftMargin(),
                    document.top() - 110, 0);
//            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
//                    JudulB,
//                    (document.right() - document.left()) / 2 + document.leftMargin(),
//                    document.top() - 110, 0);
//           
            
//            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
//                    subJudul,
//                    (document.right() - document.left()) / 2 + document.leftMargin(),
//                    document.top() - 130, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    KalimatPembuka,
                    (document.left() - 15 ),
                    document.top() - 150, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Nama,
                    (document.left() - 15 ),
                    document.top() - 180, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    TTL,
                    (document.left() - 10 ),
                    document.top() - 195, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Warga,
                    (document.left() - 10 ),
                    document.top() - 210, 0);
//            
//            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
//                    Kelamin,
//                    (document.left() - 10 ),
//                    document.top() - 225, 0);
//            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Agama,
                    (document.left() - 10 ),
                    document.top() - 225, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    Pekerjaan,
                    (document.left() - 10 ),
                    document.top() - 240, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    TempatTinggal,
                    (document.left() - 10 ),
                    document.top() - 255, 0);
//            
//            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
//                    KalimatKedua,
//                    (document.left() - 10 ),
//                    document.top() - 335, 0);
//            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    NamaPria,
                    (document.left() - 15 ),
                    document.top() - 285, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    TTLPria,
                    (document.left() - 10 ),
                    document.top() - 300, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    WargaPria,
                    (document.left() - 10 ),
                    document.top() - 315, 0);
//            
//            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
//                    KelaminPria,
//                    (document.left() - 10 ),
//                    document.top() - 416, 0);
//            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    AgamaPria,
                    (document.left() - 10 ),
                    document.top() - 330, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    PekerjaanPria,
                    (document.left() - 10 ),
                    document.top() - 345, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    TempatTinggalPria,
                    (document.left() - 10 ),
                    document.top() - 360, 0);
            
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    KalimatSKOT,
                    (document.left() - 10 ),
                    document.top() - 380, 0);
            
//            
//            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
//                    KalimatKetiga,
//                    (document.left() - 10 ),
//                    document.top() - 480, 0);
            
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    NamaWanita,
                    (document.left() - 15 ),
                    document.top() - 400, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    TTLWanita,
                    (document.left() - 10 ),
                    document.top() - 415, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    WargaWanita,
                    (document.left() - 10 ),
                    document.top() - 430, 0);
//            
//            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
//                    KelaminPria,
//                    (document.left() - 10 ),
//                    document.top() - 416, 0);
//            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    AgamaWanita,
                    (document.left() - 10 ),
                    document.top() - 445, 0);
         
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    PekerjaanWanita,
                    (document.left() - 10 ),
                    document.top() - 460, 0);
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    TempatTinggalWanita,
                    (document.left() - 10 ),
                    document.top() - 475, 0);
            
            
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    KalimatPenutup,
                    (document.left() - 10 ),
                    document.top() - 505, 0);
            
            
            
            //Tanda Tangan
            
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                   NamaDesa,
                    (document.right() - 150 ),
                    document.top() - 650, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    Tanggal,
                    (document.right() - 60 ),
                    document.top() - 650, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    tKepalaDesa,
                    (document.right() - 130 ),
                    document.top() - 670, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                   NamaDesa,
                    (document.right() - 60 ),
                    document.top() - 670, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    namaKepalaDesa,
                    (document.right() - 100 ),
                    document.top() - 750, 0);   
//            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
//                    Alamat,
//                    (document.right() - document.left()) / 2 + document.leftMargin(),
//                    document.top() - 65, 0);
            
            
                
        }
    }
 
    public static final String DEST = "D:/Kerjaan/Project/Sistem Informasi InfoDes App (Desktop Application)/Hasil/SKTentangOrangTua.pdf";
 
    public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new SKTentangOrangTua().createPdf(DEST);
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