package Productos.main;

import Productos.view.Almacen;

public class Main {
    public static void main(String[] args) {
        try{
        Almacen almacen = new Almacen(null, true);
        almacen.setVisible(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}