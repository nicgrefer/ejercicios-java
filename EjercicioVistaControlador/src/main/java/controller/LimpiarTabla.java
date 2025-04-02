
// src/main/java/controller/LimpiarTabla.java
package controller;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import model.Calificacion;

public class LimpiarTabla {
    public void limpiar(List<Calificacion> listaCalificaciones, DefaultTableModel modeloTabla) {
        listaCalificaciones.clear();
        modeloTabla.setRowCount(0);
    }
}
