package com.pdf.pdfgeneration.mapper;

import com.pdf.pdfgeneration.model.Customer;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import java.util.HashMap;
import java.util.Map;

@Service
public class DataMapper {

    public Context setData(Customer empolyeeList) {

        Context context = new Context();

        Map<String, Object> data = new HashMap<>();

        data.put("customer", empolyeeList.getBranchName());
        data.put("date",empolyeeList.getTodayDate());

        context.setVariables(data);

        return context;
    }
}
