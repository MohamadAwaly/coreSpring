package com.mycompany.invoise.controller;

import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

@Controller
public interface InvoiceControllerInterface {
    void createInvoice();
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
