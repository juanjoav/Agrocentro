/*
 * Copyright (c) 19/2/2022.
 * Created by Juan Jose Ariza Velasco and Brayan Alfonso Collazos Ariza
 * All rights reserved
 */

package models;

import com.itextpdf.text.*;

import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//aqui se hace el pdf
public class Billing {

    String name;
    String apellido;
    String fecha;

    Document document;
    FileOutputStream file;
    Paragraph title;

    public Billing(String name, String apellido, String fecha) {
        this.name = name;
        this.apellido = apellido;
        this.fecha = fecha;

        document = new Document();
        title = new Paragraph("Factura");
    }

    public void buildInvoice(){
        try {
            file = new FileOutputStream(name + ".pdf");
            PdfWriter.getInstance(document, file);
            document.open();
            title.setAlignment(1);
            document.add(title);

            document.add(new Paragraph("nombre: " + name));
            document.add(new Paragraph("apellido: " + apellido));

            document.add(Chunk.NEWLINE);

            Paragraph text = new Paragraph("ESTO ES UN TEXT");
            text.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(text);
            document.add(Chunk.NEWLINE);

            document.add(new Paragraph("Fecha: " + fecha));

            document.close();
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
