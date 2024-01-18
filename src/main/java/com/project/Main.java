package com.project;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Main {

   public static void main(String[] args) {
      
      String basePath = System.getProperty("user.dir") + "/data/";

      // Crear la carpeta 'data' si no existeix
      File dir = new File(basePath);
      if (!dir.exists()){
         if(!dir.mkdirs()) {
               System.out.println("Error en la creació de la carpeta 'data'");
         }
      }

      Manager.createSessionFactory();

      System.out.println(Manager.collectionToString(Cart.class, Manager.listCollection(Cart.class)));
      System.out.println(Manager.collectionToString(Item.class, Manager.listCollection(Item.class)));

      Manager.close();
   }
}