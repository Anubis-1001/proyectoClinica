package com.uniquindio.software.clinica.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AgregarPacientesTest {


    @Test
    @Sql("classpath:dataset.sql")
    public void agregarPacientes() {
        System.out.println("pacientes agregados");
    }
}