package com.mycompany.app;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Decebal Suiu
 */
public class PebbleTest {

    public static void main(String[] args) {
        PebbleEngine engine = new PebbleEngine();
        try {
            PebbleTemplate compiledTemplate = engine.getTemplate("test.peb");
            Writer writer = new StringWriter();

            CompanyService companyService = createCompanyService();
            Map<String, Object> context = new HashMap<>();
            context.put("companyService", companyService);
            compiledTemplate.evaluate(writer, context);

            String output = writer.toString();
            System.out.println(output);
        } catch (PebbleException | IOException e) {
            e.printStackTrace();
        }
    }

    private static CompanyService createCompanyService() {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company().setName("decisoft").setFiscalCode("1234"));

        return new CompanyServiceImpl(companies);
    }

}
