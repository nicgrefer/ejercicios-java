package com.practica3.controlador;

import com.practica3.modelo.Employees;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

public class CSVajustes {

    public static List<Employees> leerEmpleadosDesdeCSV(File archivo) {
        List<Employees> empleados = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 4) {
                    int id = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    String apellido = datos[2];
                    int departamento = Integer.parseInt(datos[3]);
                    empleados.add(new Employees(id, nombre, apellido, departamento));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return empleados;
    }

    public static List<Employees> añadirDatos(File base, File añado) {
        List<Employees> listaBase = leerEmpleadosDesdeCSV(base);
        List<Employees> listaAñado = leerEmpleadosDesdeCSV(añado);

        return null;
    }

    public static void ordenarListaEmpleados(List<Employees> empleados, String criterio) {
        if (empleados == null || empleados.isEmpty()) return;

        switch (criterio) {
            case "ID":
                empleados.sort(Comparator.comparingInt(Employees::getId));
                break;
            case "Apellido":
                empleados.sort(Comparator.comparing(Employees::getApellido));
                break;
            case "Departamento":
                empleados.sort(Comparator.comparingInt(Employees::getDepart));
                break;
        }
    }
}
