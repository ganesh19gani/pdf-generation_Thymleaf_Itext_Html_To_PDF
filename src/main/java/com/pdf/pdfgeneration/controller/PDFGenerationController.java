package com.pdf.pdfgeneration.controller;

import com.pdf.pdfgeneration.mapper.DataMapper;
import com.pdf.pdfgeneration.model.Customer;
import com.pdf.pdfgeneration.service.DocumentGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.time.LocalDate;
@RestController
public class PDFGenerationController {

    @Autowired
    private DocumentGenerator documentGenerator;

    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @Autowired
    private DataMapper dataMapper;

    @GetMapping(value = "/generate/document")
    public String generateDocument() {

        Customer employeeList = new Customer();
        employeeList.setBranchName("Sarvagram");
        employeeList.setTodayDate(LocalDate.now());


        String finalHtml = null;

        Context dataContext = dataMapper.setData(employeeList);

        finalHtml = springTemplateEngine.process("template", dataContext);

        documentGenerator.htmlToPdf(finalHtml);

        return "Success";
    }
}
