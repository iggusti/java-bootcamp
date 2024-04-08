package com.tabeldata.bootcamp.springdi;

import com.tabeldata.bootcamp.springdi.bean.KelasA;
import com.tabeldata.bootcamp.springdi.bean.KelasB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

        KelasB kelasA = context.getBean(KelasB.class);
        System.out.println(kelasA.getKelasC().getKelasD().getKelasE().getUmur());
    }

}
