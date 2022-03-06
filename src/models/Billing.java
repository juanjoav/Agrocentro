/*
 * Copyright (c) 19/2/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

package models;

import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import models.Products.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

//aqui se hace el pdf
public class Billing {

    private Client client;
    private String date;
    private static int number = 0;
    private ArrayList<Product> products;
    private String imageRoute;

    Document document;
    FileOutputStream file;
    Paragraph title;

    public Billing(Client client, String date, ArrayList<Product> products, String imageRoute) {
        this.client = client;
        this.date = date;
        this.products = products;
        ++number;
        this.imageRoute = imageRoute;

        document = new Document();
        title = new Paragraph("Factura de venta");
    }

    public void buildInvoice(){
        try {
            file = new FileOutputStream("Factura" + client.getName() + ".pdf");
            PdfWriter.getInstance(document, file);
            document.open();
            title.setAlignment(1);
            document.add(title);

            document.add(loadImage());

            document.add(new Paragraph("N° factura" + number));
            document.add(new Paragraph("Comprador"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("nombre: " + client.getName()));
            document.add(new Paragraph("apellido: " + client.getLastName()));

            document.add(Chunk.NEWLINE);


            document.add(buildTable());

            document.add(Chunk.NEWLINE);

            document.add(new Paragraph("Fecha: " + date));

            document.close();
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        }
    }

    private Image loadImage(){
        Image image = null;
        try {
            image = Image.getInstance(imageRoute);
            image.scaleAbsolute(150, 100);
            image.setAbsolutePosition(415, 750);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (BadElementException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    private PdfPTable buildTable(){

        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100);

        PdfPCell productName = new PdfPCell(new Phrase("Producto"));
        productName.setBackgroundColor(BaseColor.ORANGE);

        PdfPCell productPrice = new PdfPCell(new Phrase( "Precio"));
        productName.setBackgroundColor(BaseColor.ORANGE);

        PdfPCell productExpiration = new PdfPCell(new Phrase( "Expiracion"));
        productName.setBackgroundColor(BaseColor.ORANGE);

        PdfPCell productType = new PdfPCell(new Phrase( "Producto para"));
        productName.setBackgroundColor(BaseColor.ORANGE);

        table.addCell(productName);
        table.addCell(productPrice);
        table.addCell(productExpiration);
        table.addCell(productType);

        for (Product p: products) {
            table.addCell(p.getName());
            table.addCell("" + p.getPrice());
            table.addCell("NO SUPPORTED");
            table.addCell(p.getProductType());
        }

        return table;
    }
}
