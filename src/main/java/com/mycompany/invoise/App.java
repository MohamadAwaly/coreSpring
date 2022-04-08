package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerDouchette;
import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.controller.InvoiceControllerWeb;
import com.mycompany.invoise.controller.InvoicecontrollerKeyboard;
import com.mycompany.invoise.repository.InvoiceRepositoryMemory;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.repository.InvoiceRepositoryDataBase;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.InvoiceServiceNumber;
import com.mycompany.invoise.service.InvoiceServicePrefix;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dans quelle est la classe du controlleur ? ");
        String controlleurClass = sc.nextLine();
        System.out.println("Dans quelle est la class du service ?");
        String serviceClass = sc.nextLine();
        System.out.println("Dans quelle est la class du repository ?");
        String repositoryClass = sc.nextLine();

        InvoiceControllerInterface invoiceControllerInterface = null;
        InvoiceServiceInterface invoiceServiceInterface = null;
        InvoiceRepositoryInterface invoiceRepositoryInterface = null;

        try {
            invoiceControllerInterface = (InvoiceControllerInterface) Class.forName(controlleurClass).getDeclaredConstructor().newInstance();
            invoiceServiceInterface = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            invoiceRepositoryInterface = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        invoiceControllerInterface.setInvoiceService(invoiceServiceInterface);
        invoiceServiceInterface.setInvoiceRepository(invoiceRepositoryInterface);

        invoiceControllerInterface.createInvoice();


    }
}
