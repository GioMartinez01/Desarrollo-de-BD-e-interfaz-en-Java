/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author gio
 *nombre del programa ; PROYECTOJAVA
fecha de creación : 30/09/2020
MATERIA : TALLER DE BASE DE DATOS  HORA : 13-15
	realizado por : GIOVANNI MARTINEZ ESPINOZA 
        * El siguiente programa va eliminar un registro dependiendo de la tabla que selecione el usuario
        * existe un metodo por tabla que va necesitar de  un id para buscar  el registro y despues eliminarlo
*/
import java.sql.*;

public class Bajas extends Conexion{
    ResultSet pr= null; 
    /*
        el siguiente metodo va eliminar un cliente de nuestra base de datos
    */
    public void cliente(String C1) throws SQLException
    {   try{
        try (Statement st = con.createStatement()) {
            st.executeUpdate("DELETE FROM SINIESTROS WHERE CLE_RFC = '" + C1 + "'" );
            st.executeUpdate("DELETE FROM PERSONAS_AUTORIZADAS WHERE CLE_RFC = '" + C1 + "'" );
            st.executeUpdate("DELETE FROM POLIZAS WHERE CLE_RFC = '" + C1 + "'" );
            st.executeUpdate("DELETE FROM CLIENTES WHERE RFC = '" + C1 + "'" );
            System.out.println("REGISTRO ELIMINADO");
        }
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
    /*
    
        el siguiente metodo va eliminar un siniestro de nuestra base de datos
    */
    public void siniestro(String S1,String S2,String S3) throws SQLException
    {   try{
        try (Statement st = con.createStatement()) {
            st.executeUpdate("DELETE FROM SINIESTRO WHERE NUM_SIN = '" + S1 + "' AND " + S2 + " = '" + S3 +"'" );
            System.out.println("REGISTRO ELIMINADO");
        }
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
    /*
        el siguiente metodo va a eliminar una persona autorizada de nuestra base da datos
    */
    public void persona_autorizada(String PA1) throws SQLException
    {   try{
        try (Statement st = con.createStatement()) {
            st.executeQuery("DELETE FROM SINIESTROS WHERE PEA_CUR = '" + PA1 + "'" );
            st.executeUpdate("DELETE FROM PERSONAS_AUTORIZADAS WHERE CURP = '" + PA1 +"'" );
            System.out.println("REGISTRO ELIMINADO");
        }
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
    /*
        el siguiente metodo va  a eliminar a una poliza  de nuestra tabla poliza 
    */
    public void poliza (String P1) throws SQLException
    {   try{
        try (Statement st = con.createStatement()) {
            st.executeQuery("DELETE FROM SINIESTRO WHERE POZ_NUM = '" + P1 + "'" );
            st.executeQuery("DELETE FROM PERSONAS_AUTORIZADAS WHERE POZ_NUM = '" + P1 + "'" );
            st.executeQuery("DELETE FROM POLIZAS WHERE NUM_POLIZA = '" + P1 + "'" );
            System.out.println("REGISTRO ELIMINADO");
        }
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
    /*
        el siguiente metodo va a eliminar un vehiculo de nuestra base de datos
    */
    public void vehiculo (String d1) throws SQLException
    {
        Statement s = con.createStatement();
        String aux = "";
        try{
        try (Statement st = con.createStatement()) {
            
        pr = s.executeQuery ("SELECT * from POLIZAS where VEC_NUM = '" + d1 + "'");

        while (pr.next()) 
       { 
          // se muestran los campos de cada registro
            aux = pr.getString(1);
            System.out.println(aux);
            pr.getObject(2);
            pr.getObject(3);
            pr.getObject(4);
            pr.getObject(5); 
            pr.getObject(6);
       }
        pr.close();
            st.executeQuery("DELETE FROM SINIESTRO WHERE POZ_NUM = '" + aux + "'" );
            st.executeQuery("DELETE FROM SINIESTRO WHERE POZ_NUM = '" + aux  + "'" );
            st.executeQuery("DELETE FROM POLIZAS WHERE VEC_NUM= '" + d1 + "'" );
            st.executeQuery("DELETE FROM VEHICULOS WHERE NUM_SERIE = '" + d1 + "'" );
            System.out.println("DATO ELIMINADO");
        }
        }catch(SQLException e){ System.out.print(e.getSQLState());}
    }
}
