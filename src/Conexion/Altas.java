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
        * El siguiente programa va agregar un registro a una tabla que seleccione el usuario.
        * se pediran los datos en el menu y depués dependiendo del metodo se van a insertar y guardaran.
 */

import java.sql.*;
public class Altas extends Conexion{
    //METODO PARA DAR DE ALTA UN CLIENTE QUE TIENE NECESITA 7 DATOS QUE SE VAN A INGRESAR GRACIAS AL MENU QUE SE ENCUETRA
    // EB LA CLASE CONEXION
    public void cliente(String C1,String C2,String C3,String C4,String C5,String C6,
            String C7) throws SQLException
    {   try{
        try (Statement st = con.createStatement()) {// SE CREA EL STATEMENT Y TAMBIEN SE HACE LA ALTA DE UN CLIENTE
            st.executeUpdate("INSERT INTO CLIENTES VALUES ('" + C1 + "' , '" + C2 + "' , '" +
                    C3 + "' , '" + C4 + "' , '" + C5 + "' , '" + C6 + "' , '"+
                    C7 + "')");
            System.out.println("SE AGREGO DATO CORRECTAMENTE");//SI SE AGREGA CORRECTAMENTE
        }
        }catch(SQLException e){ System.out.print(e.getSQLState()+ "ERROR");}
    }
    /*
        EL SIGUIENTE METODO ES PARA DAR  DE ALTA UN VEHICULO SE NECESITAN 8 DATOS QUE NOS BRINDARA EL MENU GRACIAS A LA CLASE CONEXION
    */
    public void vehiculo(String V1,String V2,String V3,String V4,String V5,String V6,String V7, String V8) throws SQLException
    {   try{
        try (Statement st = con.createStatement()) {// SE CREA EL STATEMENT Y TAMBIEN SE HACE LA ALTA DE UN VEHICULO
            st.executeUpdate("INSERT INTO VEHICULOS VALUES ('" + V1 + "' , '" + V2 + "' , '" +
                    V3 + "' , '" + V4 + "' , '" + V5 + "' , '" + V6 + "' , '"+
                    V7 + "' , '" + V8 + "')");
            System.out.println("SE AGREGO DATO CORRECTAMENTE");
        }
        }catch(SQLException e){ System.out.print(e.getSQLState()+ "ERROR");}
    }
    /*
        EL siguiente metodo es para dar  de alta una poliza se ncesitan 8 datos que el menu nos brinda y se encuentra en la clase conexion
    */
    public void poliza(String P1,String P2,String P3,String P4,String P5,String P6,String P7,String P8) throws SQLException
    {   try{
        try (Statement st = con.createStatement()) {//SE CREA EL STATEMENT Y TAMBIEN SE HACE LA ALTA DE UN POLIZA
            st.executeUpdate("INSERT INTO POLIZAS VALUES ('" + P1 + "' , '" + P2 + "' , '" +
                    P3 + "' , '" + P4 + "' , '" + P5 + "' , '" + P6 + "' , '"+P7+"' , '"+P8 +"')");
            System.out.println("SE AGREGO DATO CORRECTAMENTE");
        }
        }catch(SQLException e){ System.out.print(e.getSQLState()+ "ERROR");}
    }
    /*
        El siguiente metodo es para  dar de alta a una persona autorizada que necesita 4 datos que el menu nos brinda y se encuentra en la clase
        conexion
    */
   public void persona_autorizada(String PA1,String PA2,String PA3,String PA4) throws SQLException
    {   try{
        try (Statement st = con.createStatement()) {//SE CREA EL STATEMENT Y TAMBIEN SE HACE LA ALTA DE UNA PERSONA AUTORIZADA
            st.executeUpdate("INSERT INTO PERSONAS_AUTORIZADAS VALUES ('" + PA1 + "' , '" + PA2 + "' , '" +
                    PA3+"' , '"+PA4 + "')");
            System.out.println("SE AGREGO DATO CORRECTAMENTE");
        }
        }catch(SQLException e){ System.out.print(e.getSQLState()+ "ERROR");}
    }
   /*
        El siguiente metodo es para dar  de alta a un siniestro que necesita 9 datos que nos brinda el menu que se encuentra en la clase 
        conexion
   */
   public void siniestro(String S1,String S2,String S3,String S4,String S5,String S6,String S7,String S8,String S9) throws SQLException
    {   try{
            Statement st = con.createStatement();//SE CREA EL STATEMENT Y TAMBIEN SE HACE LA ALTA DE UN SINIESTRO
            st.executeUpdate("INSERT INTO SINIESTROS VALUES ('" + S1 + "' , '" + S2 + "' , '" +
                     S3 + "' , '" + S4 + "' , '" + S5 + "' , '" + S6 + "' , '" + S7 + "' , '" + S8 + "' , '"+S9 +"')");
            System.out.println("SE AGREGO DATO CORRECTAMENTE");
            st.close();
        }catch(SQLException e){ System.out.print(e.getSQLState()+ "ERROR");}
    }
}
