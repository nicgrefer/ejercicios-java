
// src/main/java/controller/CargarCalificaciones.java
package controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Calificacion;

import javax.swing.table.DefaultTableModel;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class CargarCalificaciones {
    public void cargar(List<Calificacion> listaCalificaciones, DefaultTableModel modeloTabla) {
        try (InputStream fichero = getClass().getClassLoader().getResourceAsStream("calificaciones.json")) {
            if (fichero == null) {
                System.out.println("Error: No se encontró el archivo calificaciones.json");
                return;
            }

            String json;
            try (Scanner scanner = new Scanner(fichero, StandardCharsets.UTF_8.name())) {
                json = scanner.useDelimiter("\\A").next();
            }

            ObjectMapper objectMapper = new ObjectMapper();
            List<Calificacion> calificaciones = objectMapper.readValue(json, new TypeReference<List<Calificacion>>() {});

            listaCalificaciones.addAll(calificaciones);

            // Cargar datos en la tabla
            for (Calificacion c : calificaciones) {
                modeloTabla.addRow(new Object[]{c.alumno, c.asignatura, c.nota});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
