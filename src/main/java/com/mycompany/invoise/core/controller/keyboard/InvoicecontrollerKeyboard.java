package com.mycompany.invoise.core.controller.keyboard;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;

import java.util.Scanner;
//@Controller
public class InvoicecontrollerKeyboard implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public String createInvoice(Invoice invoice){
        System.out.println("what is the customer name");
        invoice = new Invoice();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        invoice.setCustomerName(name);
        invoiceService.createInvoice(invoice);
        return null;
    }
}
