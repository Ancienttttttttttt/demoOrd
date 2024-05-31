package com.example.demoorder;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RaschetPrinterPdfClass {

    Date currentDate = new Date();
    public static void printorder(String CPUname, String Coolername, String HDDname, String MatPlataname, String RAMname, String Videocardname,
                                  String SSDname, String Corpusname, String Monitorname, String Volumecardname, String Microfonname, String Colonkiname,
                                  String Keyboardname, String Mousename, String Covrikname, String Printername, String Scanername, String BPname,
                                  String Pitaniename, String Networkcardname, String Modemname, String Dopcabeliname, String Softname, String DVDname,
                                  String Etcname, String Summrub, String Colvo, String Itogorub,Float CPUprice, Float Coolerprice, Float HDDprice,
                                  Float MatPlataprice, Float RAMprice, Float Videocardprice, Float SSDprice, Float Corpusprice, Float Monitorprice, Float Volumecardprice, Float Microfonprice,
                                  Float Colonkiprice, Float Keyboardprice, Float Mouseprice, Float Covrikprice, Float Printerprice, Float Scanerprice, Float BPprice, Float Pitanieprice, Float Networkcardprice,
                                  Float Modemprice, Float Dopcabeliprice, Float Softprice, Float DVDprice, Float Etcprice) {
        // Замените эти значения соответствующими данными
        String organizationName = "Компьютерная группа";
        String CompPhone = "8-910-188-88-57 с 11:00 до 18:30";

        String fileName = "OrderRaschet.pdf";

        try {
            generateRaschetDocument(organizationName, CompPhone,
                    CPUname, Coolername, HDDname,MatPlataname,RAMname,Videocardname,SSDname,Corpusname,Monitorname,Volumecardname,Microfonname,
                    Colonkiname,Keyboardname,Mousename,Covrikname,Printername,Scanername,BPname,Pitaniename,Networkcardname,Modemname,Dopcabeliname,
                    Softname,DVDname,Etcname,Summrub, Colvo, Itogorub, CPUprice,Coolerprice,HDDprice,MatPlataprice,RAMprice,Videocardprice,SSDprice,Corpusprice,
                    Monitorprice,Volumecardprice,Microfonprice,Colonkiprice,Keyboardprice,Mouseprice,Covrikprice,Printerprice,Scanerprice,BPprice,Pitanieprice,Networkcardprice,
                    Modemprice,Dopcabeliprice,Softprice,DVDprice,Etcprice);
            System.out.println("Бланк успешно создан в файле: " + fileName);
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

    private static void generateRaschetDocument(String organizationName, String CompPhone, String CPUname, String Coolername, String HDDname,
                                                String MatPlataname, String RAMname, String Videocardname, String SSDname, String Corpusname,
                                                String Monitorname, String Volumecardname, String Microfonname, String Colonkiname, String Keyboardname,
                                                String Mousename, String Covrikname, String Printername, String Scanername, String BPname, String Pitaniename,
                                                String Networkcardname, String Modemname, String Dopcabeliname, String Softname, String DVDname, String Etcname,
                                                String Summrub, String Colvo, String Itogorub, Float CPUprice, Float Coolerprice, Float HDDprice, Float MatPlataprice, Float RAMprice,
                                                Float Videocardprice, Float SSDprice, Float Corpusprice, Float Monitorprice, Float Volumecardprice, Float Microfonprice,
                                                Float Colonkiprice, Float Keyboardprice, Float Mouseprice, Float Covrikprice, Float Printerprice, Float Scanerprice, Float BPprice,
                                                Float Pitanieprice, Float Networkcardprice, Float Modemprice, Float Dopcabeliprice, Float Softprice, Float DVDprice,
                                                Float Etcprice)
            throws IOException, DocumentException {

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("OrderRaschet.pdf"));

        document.open();

        //PdfPTable table = new PdfPTable(2);
        float [] columnWidth = {250F, 50F};
        PdfPTable table = new PdfPTable(columnWidth);

        // Используем шрифт Times New Roman
        BaseFont baseFont = BaseFont.createFont("TimesNewRomanRegular.ttf", "CP1251", BaseFont.EMBEDDED);
        Font font = new Font(baseFont, 12, Font.NORMAL);



        // Добавляем информацию о предприятии
        addTextToDocument(document, organizationName, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, Font.BOLD));
        addTextToDocument(document, "Телефон: " + CompPhone, font);
        addTextToDocument(document, "\n", font);  // Пустая строка перед заголовком

        // Добавляем заголовок
        addTextToDocument(document, "Листок заказа", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, Font.BOLD));
        addTextToDocument(document, "\n", font);  // Пустая строка перед информацией

        // Добавляем информацию о заказе
        String[] tableHeader = {"Наименование", "Цена"};
        String[][] itemArray = {
                {"1.Процессор: " + CPUname, String.valueOf(CPUprice)},
                {"2.Кулер: " + Coolername, String.valueOf(Coolerprice)},
                {"3.Жесткий диск: " + HDDname, String.valueOf(HDDprice)},
                {"4.Мат.плата: " + MatPlataname, String.valueOf(MatPlataprice)},
                {"5.ОЗУ: " + RAMname, String.valueOf(RAMprice)},
                {"6.Видеокарта: " + Videocardname, String.valueOf(Videocardprice)},
                {"7.SSD диск: " + SSDname, String.valueOf(SSDprice)},
                {"8.Корпус: " + Corpusname, String.valueOf(Corpusprice)},
                {"9.Монитор: " + Monitorname, String.valueOf(Monitorprice)},
                {"10.Звуковая карта: " + Volumecardname, String.valueOf(Volumecardprice)},
                {"11.Микрофон: " + Microfonname, String.valueOf(Microfonprice)},
                {"12.Акуст.системы: " + Colonkiname, String.valueOf(Colonkiprice)},
                {"13.Клавиатура: " + Keyboardname, String.valueOf(Keyboardprice)},
                {"14.Мышь: " + Mousename, String.valueOf(Mouseprice)},
                {"15.Коврик: " + Covrikname, String.valueOf(Covrikprice)},
                {"16.Принтер: " + Printername, String.valueOf(Printerprice)},
                {"17.Сканер: " + Scanername, String.valueOf(Scanerprice)},
                {"18.Блок питания: " + BPname, String.valueOf(BPprice)},
                {"19.И.Б.П: " + Pitaniename, String.valueOf(Pitanieprice)},
                {"20.Сетевая карта: " + Networkcardname, String.valueOf(Networkcardprice)},
                {"21.Модем: " + Modemname, String.valueOf(Modemprice)},
                {"22.Доп.кабели: " + Dopcabeliname, String.valueOf(Dopcabeliprice)},
                {"23.ПО: " + Softname, String.valueOf(Softprice)},
                {"24.DVD: " + DVDname, String.valueOf(DVDprice)},
                {"25.Прочее: " + Etcname, String.valueOf(Etcprice)}
        };
        table.addCell(new Paragraph(tableHeader[0]));
        table.addCell(new Paragraph(tableHeader[1]));
        for(int i = 0; i < 25; i++){
            for(int j = 0; j < 2; j++){
                table.addCell(new Paragraph(itemArray[i][j]));
                System.out.println(itemArray[i][j]);
            }
        }
        document.add(table);

        addTextToDocument(document, "\n", font);
        addTextToDocument(document, "Сумма руб." + Summrub, font);
        addTextToDocument(document, "\t", font);
        addTextToDocument(document, "Количество" + Colvo, font);
        addTextToDocument(document, "\t", font);
        addTextToDocument(document, "Итого руб." + Itogorub, font);



        // Форматируем дату
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String currentDateStr = dateFormat.format(currentDate);

        addTextToDocument(document, "Дата выписки: " + currentDateStr, font);
        addTextToDocument(document, "\n\n\n\n\n\n", font); // Пустые строки для подписи и печати

        addTextToDocument(document, "___________________________", font); // Линия подписи
        addTextToDocument(document, "Подпись", font);
        document.close();
    }

    public static void openPdf(String fileName) {

        try {

            if ((new File("OrderRaschet.pdf")).exists()) {

                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler OrderRaschet.pdf");
                p.waitFor();
                System.out.println("Done");

            } else {

                System.out.println("File is not exists");

            }



        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    private static void addTextToDocument(Document document, String text, Font font) throws DocumentException {
        Paragraph paragraph = new Paragraph(text, font);
        document.add(paragraph);
        document.add(new Paragraph("\n"));  // Добавляем пустую строку после каждого параграфа
    }

}
