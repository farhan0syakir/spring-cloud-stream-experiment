package com.farhan.experiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.fn.supplier.file.FileSupplierConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(FileSupplierConfiguration.class)
public class FileSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileSourceApplication.class, args);
    }
}
