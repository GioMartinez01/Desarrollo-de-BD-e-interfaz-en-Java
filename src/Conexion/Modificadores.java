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
	realizado por : GIOVANNI MARTINEZ ESPINOZA 15221924
        * El siguiente programa va a modificar un registro de la tabla que seleccione el usuario a modificar
        * cada metodo que se encuentra en esta clase es un metodo por cada tabla que existe en nuestra  base de datos
        * necesitaremos un id para encontrar el resitro y despues modificarlo.
 */



import java.sql.*;

import static Conexion.Conexion.con;

public class Modificadores extends Conexion{
    /*
        el sieguiente metodo va modicar un cliente, pediremos 3 datos.
    */
    public void cliente(String M1,String M2,String M3) throws SQLException
    {   try{
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE CLIENTES SET " + M2 + " = " + "'"+M3+"'"+
                 " WHERE RFC = " + "'" + M1 + "'");
            System.out.println("SE ACTUALIZO CORRECTAMENTE");
            st.close();
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
    /*
        el siguiente metodo va a modificar un vehiculo y va a pedir 3 datos 
    */
     public void vehiculo(String V1,String V2,String V3) throws SQLException
    {   try{
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE VEHICULOS SET " + V2 + " = " + "'"+V3+"'"+
                 " WHERE RFC = " + "'" + V1 + "'");
            System.out.println("SE ACTUALIZO CORRECTAMENTE");
            st.close();
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
     /*
        el siguiente metodo va a modificar a una persona autorizada 
     */
      public void persona_autorizada(String PA1,String PA2,String PA3) throws SQLException
    {   try{
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE PERSONAS_AUTORIZADAS SET " + PA2 + " = " + "'"+PA3+"'"+
                 " WHERE RFC = " + "'" + PA1 + "'");
            System.out.println("MODIFICO DATO CORRECTAMENTE");
            st.close();
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
      /*
        el siguiente metodo va a modificar a una poliza
      */
       public void poliza(String P1,String P2,String P3) throws SQLException
    {   try{
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE POLIZAS SET " + P2 + " = " + "'"+P3+"'"+
                 " WHERE RFC = " + "'" + P1 + "'");
            System.out.println("MODIFICO DATO CORRECTAMENTE");
            st.close();
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
       /*
        el siguiente metodo va modificar un siniestro y va  pedir 3 datos
       */
          public void siniestro (String S1,String S2,String S3) throws SQLException
    {   try{
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE SINIESTROS SET " + S2 + " = " + "'"+S3+"'"+
                 " WHERE RFC = " + "'" + S1 + "'");
            System.out.println("MODIFICO DATO CORRECTAMENTE");
            st.close();
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
}