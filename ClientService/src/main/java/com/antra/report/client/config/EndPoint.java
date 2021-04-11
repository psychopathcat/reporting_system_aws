package com.antra.report.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EndPoint {
    @Value("http://localhost:6001")
    private String excelService;
    @Value("http://localhost:8002")
    private String pdfService;

    public String getExcelService() {
        return excelService;
    }

    public String getPdfService() {
        return pdfService;
    }
}
