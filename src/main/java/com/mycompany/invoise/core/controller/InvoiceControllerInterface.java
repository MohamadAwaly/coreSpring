package com.mycompany.invoise.core.controller;

import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

@Controller
public interface InvoiceControllerInterface {
    void createInvoice();
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
