/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author gio
 * nombre del programa ; PROYECTOJAVA
fecha de creación : 30/09/2020
MATERIA : TALLER DE BASE DE DATOS  HORA : 13-15
	realizado por : GIOVANNI MARTINEZ ESPINOZA
        * El siguiente programa va a listar  un registro o una tabla completa que se encuentra en nustra base de datos
        * lo que necesita para listar un solo resgistro es un id 
        * para listar la tabla completa solo necesita que el usuario indique que desea listar
 */
import java.sql.*;

public class Listar extends Conexion{
    
    ResultSet rf= null; 
    /*
        En el siguiente metodo se va listar un cliente de manera indivual
    */
    public void cliente (String C1,String C2) throws SQLException
    {   
        Statement s = con.createStatement();
        rf = s.executeQuery ("SELECT * from CLIENTES where "
                + C1 + " = '"+ C2 +"'");

        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.print(rf.getObject(3)+",");
             System.out.print(rf.getObject(4)+",");
             System.out.print(rf.getObject(5)+","); 
             System.out.print(rf.getObject(6)+",");
             System.out.println(rf.getObject(7)+",");

       }
        rf.close();
    }
    /*
        En el siguiente metodo se va listar un vehiculo de manera indivual
    */
    public void vehiculo (String V1,String V2) throws SQLException
    {   
        Statement s = con.createStatement();
        rf = s.executeQuery ("SELECT * from VEHICULOS where "
                + V1 + " = '"+ V2 +"'");
   

        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.print(rf.getObject(3)+",");
             System.out.print(rf.getObject(4)+",");
             System.out.print(rf.getObject(5)+","); 
             System.out.print(rf.getObject(6)+",");
             System.out.print(rf.getObject(7)+",");
             System.out.println(rf.getObject(8)+",");
       }
        rf.close();
    }
    /*
        En el siguiente metodo se va listar una poliza de manera indivual
    */
    public void poliza (String P1,String P2) throws SQLException
    {   
        Statement s = con.createStatement();
        rf = s.executeQuery ("SELECT * from POLIZAS where "
                + P1 + " = '"+ P2 +"'");
   

        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.print(rf.getObject(3)+",");
             System.out.print(rf.getObject(4)+",");
             System.out.print(rf.getObject(5)+","); 
             System.out.print(rf.getObject(6)+","); 
             System.out.print(rf.getObject(7)+","); 
             System.out.println(rf.getObject(8)+",");

       }
        rf.close();
    }
    /*
        En el siguiente metodo se va listar una persona autorizada de manera indivual
    */
    public void persona_autorizada (String PA1,String PA2) throws SQLException
    {   
        Statement s = con.createStatement();
        rf = s.executeQuery ("SELECT * from PERSONAS_AUTORIZADAS where "
                + PA1 + " = '"+ PA2 +"'");
   

        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.println(rf.getObject(3)+",");
             System.out.println(rf.getObject(4)+",");
       }
        rf.close();
    }
    /*
        En el siguiente metodo se va listar un siniestro de manera indivual
    */
    public void siniestro (String S1, String S2) throws SQLException
    {   
        Statement s = con.createStatement();
         rf = s.executeQuery ("SELECT * FROM SINIESTROS WHERE "+
                S1 +" = '"+ S2 + "'" );

        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.print(rf.getObject(3)+",");
             System.out.print(rf.getObject(4)+",");
             System.out.print(rf.getObject(5)+","); 
             System.out.print(rf.getObject(6)+",");
             System.out.print(rf.getObject(7)+",");
             System.out.print(rf.getObject(8)+",");
             System.out.println(rf.getObject(9)+",");

       }
        rf.close();
    }
    /*
        En el siguiente metodo se va listar toda la tabla cliente
    */
    public void global_clientes () throws SQLException
    {   
        Statement s = con.createStatement();
        rf = s.executeQuery ("SELECT * from CLIENTES ");
        System.out.println("***********CLIENTE***********");
        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.print(rf.getObject(3)+",");
             System.out.print(rf.getObject(4)+",");
             System.out.print(rf.getObject(5)+","); 
             System.out.print(rf.getObject(6)+",");
             System.out.println(rf.getObject(7)+",");

       }
        rf.close();
    }
    /*
        En el siguiente metodo se va listar toda la tabla vehiculos
    */
    public void global_Vehiculos () throws SQLException
    { 
        Statement s = con.createStatement();
        System.out.println("***********VEHICULO**********");
        rf = s.executeQuery ("SELECT * from VEHICULOS ");
 
        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.print(rf.getObject(3)+",");
             System.out.print(rf.getObject(4)+",");
             System.out.print(rf.getObject(5)+","); 
             System.out.print(rf.getObject(6)+",");
             System.out.print(rf.getObject(7)+",");
             System.out.println(rf.getObject(8)+",");
       }
        rf.close();   
    }
    /*
        En el siguiente metodo se va listar toda la tabla polizas
    */
    public void global_Polizas () throws SQLException    
    { 
       Statement s = con.createStatement();
       System.out.println("*****************POLIZA****************");
       rf = s.executeQuery ("SELECT * from POLIZAS ");

        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.print(rf.getObject(3)+",");
             System.out.print(rf.getObject(4)+",");
             System.out.print(rf.getObject(5)+","); 
             System.out.println(rf.getObject(6)+",");

       }
        rf.close();   
    }  
    /*
        En el siguiente metodo se va listar toda la tabla Personas autorizadas
    */
    public void global_P_A () throws SQLException
    { 
        Statement s = con.createStatement();
        System.out.println("******************PERSONA AUTORIZADA**************");
        rf = s.executeQuery ("SELECT * from PERSONAS_AUTORIZADAS ");

        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
            System.out.print(rf.getObject(1)+",");
            System.out.print(rf.getObject(2)+",");
            System.out.print(rf.getObject(3)+",");
            System.out.println(rf.getObject(4)+",");
       }
        rf.close();
    }
    /*
        En el siguiente metodo se va listar toda la tabla siniestro.
    */
    public void global_Siniestro() throws SQLException    
    { 
       Statement s = con.createStatement();
       System.out.println("**************SINIESTRO***************");
       rf = s.executeQuery ("SELECT * from SINIESTROS ");
        while (rf.next()) 
       { 
          // se muestran los campos de cada registro
             System.out.print(rf.getObject(1)+",");
             System.out.print(rf.getObject(2)+",");
             System.out.print(rf.getObject(3)+",");
             System.out.print(rf.getObject(4)+",");
             System.out.print(rf.getObject(5)+","); 
             System.out.print(rf.getObject(6)+",");
             System.out.print(rf.getObject(7)+","); 
             System.out.println(rf.getObject(8)+",");

       }
        rf.close();
    }
    

}
    

