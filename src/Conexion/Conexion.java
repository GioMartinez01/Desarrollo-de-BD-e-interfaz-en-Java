/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio
 */
/*
nombre del programa ; PROYECTOJAVA
fecha de creación : 30/09/2020
MATERIA : TALLER DE BASE DE DATOS  HORA : 13-15
	realizado por : GIOVANNI MARTINEZ ESPINOZA 15221924
DESCRIPCIÓN
EN ESTE PROGRAMA ES EL GESTOR DE LAS CLASES  ALTAS, LISTAR, MODIFICADORES Y BAJA
ASI COMO EL MENU QUE VERA EL USUARIO
VAMOS A PEDIR LOS DATOS PARA EL FUNCIONAMIENTO DEL PROGRAMA
EN EL SIGUIENTE PROGRAMA SE RESUELVE EL PROBLEMA QUE SE SOLICITO PARA UN MENU  DE TODO SOBRE LISTAR ASI COMO ELIMINAR

La conexion fue exitosa!  
Conexion Exitosa! 
************MENU**************
1.-ALTAS 
2.-BAJAS 
3.-MODIFICACIONES 
4.-LISTA INDIVIDUAL 
5.-LISTA GLOBAL 
0.-SALIR
ESCRIBA UNA DE LAS OPCIONES: 

****ALTAS*****
 * El siguiente programa va agregar un registro a una tabla que seleccione el usuario.
 * se pediran los datos en el menu y depués dependiendo del metodo se van a insertar y guardaran.

**********ALTAS**********
1.-CLIENTE 
2.-VEHICULO 
3.-POLIZA 
4.-PERSONA AUTORIZADA 
5.-SINIESTRO 
6.-SALIR
ESCRIBA UNA DE LAS OPCIONES: 2

***********VEHICULO************
INGRESE NUM DE SERIE DEL VEHICULO: 
asdf123456789
INGRESE MARCA DEL VEHICULO: 
NISSAN
INGRESE TIPO DEL VEHICULO: 
GTX
INGRESE MODELO DEL VEHICULO: 
2020
INGRESE OCUPANTES DEL VEHICULO: 
5
INGRESE SERVICIO DEL VEHICULO:(Particular) 
PARTICULAR
INGRESE USO DEL VEHICULO:(Privado O Publico) 
PRIVADO
INGRESE PLACAS DEL VEHICULO: 
MAR1234
SE AGREGO DATO CORRECTAMENTE


****lISTAR*****
* El siguiente programa va a listar  un registro o una tabla completa que se encuentra en nustra base de datos
* lo que necesita para listar un solo resgistro es un id 
* para listar la tabla completa solo necesita que el usuario indique que desea listar
************MENU**************
1.-ALTAS 
2.-BAJAS 
3.-MODIFICACIONES 
4.-LISTA INDIVIDUAL 
5.-LISTA GLOBAL 
0.-SALIR
ESCRIBA UNA DE LAS OPCIONES: 4

***************LISTA INDIVIDUAL***************
1.-CLIENTE 
2.-VEHICULO 
3.-POLIZA 
4.-PERSONA AUTORIZADA 
5.-SINIESTRO 
6.-SALIR
ESCRIBA UNA DE LAS OPCIONES: 2

****************VEHICULO****************

1.-Numero de serie
2.- PLACAS
1
DATO A BUSCAR:
Asdf123456789
Asdf123456789,NISSAN,GTX,2020,5,PARTICULAR,PRIVADO,MAR1234

************MENU**************
1.-ALTAS 
2.-BAJAS 
3.-MODIFICACIONES 
4.-LISTA INDIVIDUAL 
5.-LISTA GLOBAL 
0.-SALIR
ESCRIBA UNA DE LAS OPCIONES: 5

***************LISTA GLOBAL***************
1.-CLIENTE 
2.-VEHICULO 
3.-POLIZA 
4.-PERSONA AUTORIZADA 
5.-SINIESTRO
2
***********VEHICULO**********
Dfg136548lopikjh789,FERRARI,CARRERA GT,2017,5,PARTICULAR,PRIVADO,LOP45123,
1523kiujhy5896325y,CHEVROLET,CAMARO ZL1,2018,5,PARTICULAR,PRIVADO,OPI78541,
Opikj1253698547uyh,FORD,MUSTAN,2017,5,PARTICULAR,PUBLICO,UJY78596,
Juyh78965236lopk52,NISSAN,GT-R,2019,5,PARTICULAR,PRIVADO,TYH85964,
Oplik541263589lopk,AUDI,A3,2019,5,PARTICULAR,PUBLICO,TGY85478,
Asdf123456789,NISSAN,GTX,2020,5,PARTICULAR,PRIVADO,MAR1234,




****MODIFICADORES*****
* El siguiente programa va a modificar un registro de la tabla que seleccione el usuario a modificar
* cada metodo que se encuentra en esta clase es un metodo por cada tabla que existe en nuestra  base de datos
* necesitaremos un id para encontrar el resitro y despues modificarlo.

*************MODIFICADORES*************
1.-CLIENTE 
2.-VEHICULO 
3.-POLIZA 
4.-PERSONA AUTORIZADA 
5.-SINIESTRO 
6.-SALIR
ESCRIBA UNA DE LAS OPCIONES: 2

***********VEHICULO************
NUMERO DE SEREIA DEL VEHICULO A MODIFICAR: 
Asdf123456789

CAMPO A MODIFICAR: 
1.-MARCA 
2.-TIPO 
3.-MODELO,
4.-OCUPANTES 
5.-SERVICIO = PARTICULAR 
6.-USO = Privado o Publico)
1
INGRESE EL DATO: 
FERRARI

***********VEHICULO**********
Dfg136548lopikjh789,FERRARI,CARRERA GT,2017,5,PARTICULAR,PRIVADO,LOP45123,
1523kiujhy5896325y,CHEVROLET,CAMARO ZL1,2018,5,PARTICULAR,PRIVADO,OPI78541,
Opikj1253698547uyh,FORD,MUSTAN,2017,5,PARTICULAR,PUBLICO,UJY78596,
Juyh78965236lopk52,NISSAN,GT-R,2019,5,PARTICULAR,PRIVADO,TYH85964,
Oplik541263589lopk,AUDI,A3,2019,5,PARTICULAR,PUBLICO,TGY85478,
Asdf123456789,FERRARI,GTX,2020,5,PARTICULAR,PRIVADO,MAR1234,



****BAJAS*****
* El siguiente programa va eliminar un registro dependiendo de la tabla que selecione el usuario
* existe un metodo por tabla que va necesitar de  un id para buscar  el registro y despues eliminarlo

************BAJAS*************
1.-CLIENTE 
2.-VEHICULO 
3.-POLIZA 
4.-PERSONA AUTORIZADA 
5.-SINIESTRO 
6.-SALIR
ESCRIBA UNA DE LAS OPCIONES: 2

*************VEHICULO************
NUMERO DE SERIE DEL VEHICULO A LIMINAR: 
Asdf123456789
REGISTRO ELIMINADO

***********VEHICULO**********
Dfg136548lopikjh789,FERRARI,CARRERA GT,2017,5,PARTICULAR,PRIVADO,LOP45123,
1523kiujhy5896325y,CHEVROLET,CAMARO ZL1,2018,5,PARTICULAR,PRIVADO,OPI78541,
Opikj1253698547uyh,FORD,MUSTAN,2017,5,PARTICULAR,PUBLICO,UJY78596,
Juyh78965236lopk52,NISSAN,GT-R,2019,5,PARTICULAR,PRIVADO,TYH85964,
Oplik541263589lopk,AUDI,A3,2019,5,PARTICULAR,PUBLICO,TGY85478,





*/

package Conexion;


import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    public String driver = "oracle.jdbc.driver.OracleDriver";//driver que usaremos
    public String url = "jdbc:oracle:thin:@Giodante:1522:XE";//la direccion de la conexion
    public String user = "SYSTEM";//usuario 
    public String password = "TEC";//contraseña
    public static Connection con;
    
    public Connection conectar()//metodo para establecer conexion con nuestra base de datos
    {
        try{
            Class.forName(driver); 
            System.out.println("La conexion fue exitosa!  ");//en caso que se haya extablecido
            try{
            return con = DriverManager.getConnection(this.url,this.user,this.password);
            }catch(Exception e)
            {
                System.err.println("ERROR conexion.");//cuando exista un error arrojara el mensaje
            }
        }catch(Exception e){
            System.err.println("ERROR driver.");//en caso que haya error en el driver 
        }
        return null;
    }
    public static void main(String[] args) {//metodo principal
        Scanner t = new Scanner(System.in);// scaner para leer 
        Conexion con = new Conexion();//establece la conexion 
        boolean eeee = false;//para uso de while
        int opciones;//para imgresar en el los casos de switch
        String R1,R2,R3,R4,R5,R6,R7,R8,R9;//variables que necesitaremos para insertar, delete, update
        R2="";
        R3="";
        R1="";
        R4="";
        Altas altas = new Altas();//generamos la extencion a la clase altas
        Modificadores mod = new Modificadores();//generamos la extencion para poder utlizar la clase modificadores
        Listar lista = new Listar();//extencion para poder utlizar la clase listar
        Bajas baja = new Bajas();//extencion para poder utlizar bajas 
        
        if (con.conectar() != null)//condicion if para saber si se establecion la conexion
        {
            System.out.println("Conexion Exitosa! ");
        }
        while(!eeee){//primer while para el Menu
            try {
                System.out.println("************MENU**************");
                
                System.out.println("1.-ALTAS \n2.-BAJAS \n3.-MODIFICACIONES \n4.-LISTA INDIVIDUAL \n5.-LISTA GLOBAL \n0.-SALIR");//todas las opciones
                System.out.println("ESCRIBA UNA DE LAS OPCIONES: ");
                opciones = Integer.parseInt(t.nextLine());
                switch(opciones)//Las opciones
                {
                    case 1://Altas
                        while(!eeee)
                        {
                            try {
                                System.out.println("**********ALTAS**********");
                                System.out.println("1.-CLIENTE \n2.-VEHICULO \n3.-POLIZA \n4.-PERSONA AUTORIZADA \n5.-SINIESTRO \n6.-SALIR");
                                System.out.println("ESCRIBA UNA DE LAS OPCIONES: ");
                                opciones = Integer.parseInt(t.nextLine());
                                switch (opciones) {//Opciones de altas
                                    case 1:
                                        System.out.println("***********CLIENTE**********");//pedimos los datos de cliente
                                        System.out.println("INGRESE RFC DEL CLIENTE: ");
                                        R1 = t.nextLine();
                                        System.out.println("INGRESE NOMBRE DEL CLIENTE: ");
                                        R2 = t.nextLine();
                                        System.out.println("INGRESE APELLIDO DEL CLIENTE: ");
                                        R3 = t.nextLine();
                                        System.out.println("INGRESE TELEFONO DEL CLIENTE: ");
                                        R4 = t.nextLine();
                                        System.out.println("INGRESE FECHA DE NACIMIENTO DEL CLIENTE: ");
                                        R5 = t.nextLine();
                                        System.out.println("INGRESE NUM DE LICENCIA DEL CLIENTE: ");
                                        R6 = t.nextLine();
                                        System.out.println("INGRESE DIRECCION DEL CLIENTE: ");
                                        R7 = t.nextLine();
                                        altas.cliente(R1, R2, R3, R4, R5, R6, R7);//ingresamos los datos de cliente
                                        break;
                                    case 2:
                                        System.out.println("***********VEHICULO************");//pedimos los datos de vehiculo
                                        System.out.println("INGRESE NUM DE SERIE DEL VEHICULO: ");
                                        R1 = t.nextLine();
                                        System.out.println("INGRESE MARCA DEL VEHICULO: ");
                                        R2 = t.nextLine();
                                        System.out.println("INGRESE TIPO DEL VEHICULO: ");
                                        R3 = t.nextLine();
                                        System.out.println("INGRESE MODELO DEL VEHICULO: ");
                                        R4 = t.nextLine();
                                        System.out.println("INGRESE OCUPANTES DEL VEHICULO: ");
                                        R5 = t.nextLine();
                                        System.out.println("INGRESE SERVICIO DEL VEHICULO:(Particular) ");
                                        R6 = t.nextLine();
                                        System.out.println("INGRESE USO DEL VEHICULO:(Privado O Publico ");
                                        R7 = t.nextLine();
                                        System.out.println("INGRESE PLACAS DEL VEHICULO: ");
                                        R8 = t.nextLine();
                                        altas.vehiculo(R1, R2, R3, R4, R5, R6, R7, R8);//ingresamos los datos de vehiculos
                                        break;
                                    case 3:
                                        System.out.println("***********POLIZA***********");//pedimos los datos de poliza
                                        System.out.println("INGRESE NUM DE POLIZA: ");
                                        R1 = t.nextLine();
                                        System.out.println("INGRESE TIPO DE SEGURO:(A todo riesgo,A Terceros,A Terceros ampliados) ");
                                        R2 = t.nextLine();
                                        System.out.println("INGRESE COBERTURA MAXIMA: ");
                                        R3 = t.nextLine();
                                        System.out.println("INGRESE ESTATUS:(Alta,Baja,Suspension) ");
                                        R4 = t.nextLine();
                                        System.out.println("INGRESE FECHA DE INICIO DEL SEGURO: ");
                                        R5 = t.nextLine();
                                        System.out.println("INGRESE FECHA DE VENCIMIENTO:  ");
                                        R6 = t.nextLine();
                                        System.out.println("INGRESE CLIENTE RFC: ");
                                        R7 = t.nextLine();
                                        System.out.println("INGRESE NUM DE SERIA DEL VEHICULO: ");
                                        R8 = t.nextLine();
                                        altas.poliza(R1, R2, R3, R4, R5, R6, R7, R8);//ingresamos los datos de poliza
                                        break;
                                    case 4:
                                        System.out.println("*************PERSONA AUTORIZADA***********");//pedimos los datos de persona autorizada
                                        System.out.println("INGRESE CURP: ");
                                        R1 = t.nextLine();
                                        System.out.println("INGRESE RELACION CON EL CLIENTE(Hijo,Padre,Esposa,Esposo,Madre): ");
                                        R2 = t.nextLine();
                                        System.out.println("INGRESE NUMERO DE POLIZA: ");
                                        R3 = t.nextLine();
                                        System.out.println("INGRESE RFC DEL CLIENTE: ");
                                        R4 = t.nextLine();
                                        altas.persona_autorizada(R1, R2, R3,R4);//ingresemos los datos de personas autorizadas
                                        break;
                                    case 5:
                                        System.out.println("************SINIESTRO************");//pedimos los datos de siniestro
                                        System.out.println("INGRESE NUMERO DE SINIESTRO: ");
                                        R1 = t.nextLine();
                                        System.out.println("INGRESE FECHA DE SINIESTRO: ");
                                        R2 = t.nextLine();
                                        System.out.println("INGRESE TALLER: ");
                                        R3 = t.nextLine();
                                        System.out.println("INGRESE IMPORTE: ");
                                        R4 = t.nextLine();
                                        System.out.println("INGRESE DATOS DE LA POLIZA: ");
                                        R5 = t.nextLine();
                                        System.out.println("INGRESE TIPO DE DAÑO:(Daño parcial,Daño total): ");
                                        R6 = t.nextLine();
                                        System.out.println("INGRESE NUMERO DE POLIZA: ");
                                        R7 = t.nextLine();
                                        System.out.println("INGRESE RFC DEL CLIENTE: ");
                                        R8 = t.nextLine();
                                        System.out.println("INGRESE CURP DE LA PERSONA AUTORIZADA: ");
                                        R9 = t.nextLine();
                                        altas.siniestro(R1, R2, R3, R4, R5, R6, R7,R8,R9);//ingresamos los datos de siniestros
                                        break;
                                    case 6:
                                        eeee = true;
                                        break;
                                    default:
                                        System.out.println("SOLO NUMEROS ENTRE 1 y 6");
                                        break;
                                }
                            } 
                            catch (SQLException ex) {//cachamos ex
                                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        eeee = false;
                        break;
                    case 2: //BAJAS
                        while(!eeee)
                        {
                            System.out.println("************BAJAS*************");
                            System.out.println("1.-CLIENTE \n2.-VEHICULO \n3.-POLIZA \n4.-PERSONA AUTORIZADA \n5.-SINIESTRO \n6.-SALIR");
                            System.out.println("ESCRIBA UNA DE LAS OPCIONES: ");
                            opciones = Integer.parseInt(t.nextLine());
                            switch (opciones) {//opcones de bajas
                                case 1:
                                    System.out.println("***********CLIENTE**********");//Baja cliente
                                    System.out.println("RFC DEL CLIENTE A LIMINAR: ");
                                    R1 = t.nextLine();
                                    baja.cliente(R1);
                                    break;
                                case 2:
                                    System.out.println("*************VEHICULO************");//Baja Vehiculo
                                    System.out.println("NUMERO DE SERIE DEL VEHICULO A LIMINAR: ");
                                    R1 = t.nextLine();
                                    baja.vehiculo(R1);
                                    break;
                                case 3:
                                    System.out.println("***********POLIZA***********");//Baja poliza
                                    System.out.println("NUMERO DE POLIZA A LIMINAR: ");
                                    R1 = t.nextLine();
                                    baja.poliza(R1);
                                    break;
                                case 4:
                                    System.out.println("************PERSONA AUTORIZADA************");//Baja personas autorizada 
                                    System.out.println("PERSONA AUTORIZADA A ELIMINAR: ");
                                    R1 = t.nextLine();
                                    baja.persona_autorizada(R1);
                                    break;
                                case 5:
                                    System.out.println("**************SINIESTRO*************");//Baja siniestro
                                    System.out.println("NUMERO DE SINIESTRO A ELIMINAR: ");
                                    R1 = t.nextLine();
                                    System.out.println("PERSONA AUTORIZADA O CLIENTE PER_CUR/CLI_RFC: ");
                                    R2 = t.nextLine();
                                    System.out.println("DATO: ");
                                    R3 = t.nextLine();
                                    baja.siniestro(R1, R2, R3);
                                    break;
                                case 6:
                                    eeee = true;
                                    break;
                                default:
                                    System.out.println("SOLO NUMEROS ENTRE 1 y 6");
                                    break;
                            }
                        }
                        eeee = false;
                        break;
                    case 3://modificaciones
                        while(!eeee)
                        {
                            try {
                                System.out.println("*************MODIFICADORES*************");
                                System.out.println("1.-CLIENTE \n2.-VEHICULO \n3.-POLIZA \n4.-PERSONA AUTORIZADA \n5.-SINIESTRO \n6.-SALIR");
                                System.out.println("ESCRIBA UNA DE LAS OPCIONES: ");
                                opciones = Integer.parseInt(t.nextLine());
                                switch (opciones) {//Opciones de modificadores
                                    case 1:
                                        System.out.println("************CLIENTE***********");//modificacion de clientes
                                        System.out.println("RFC DEL CLIENTE A MODIFICAR: ");//necesitamos el rfc para buscar el cliente a modificar
                                        R1 = t.nextLine();
                                        System.out.println("CAMPO A MODIFICAR: \n1.-NOMBRE \n2.-APELLIDO,"+
                                                "\n3.-TELEFONO \n4.-FECHA_NACIMIENTO \n5.-DIRECCION )");
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//opciones para modificar cliente
                                            case 1: R2 = "NOMBRE";
                                                break;
                                            case 2: R2 = "APELLIDO";
                                                break;
                                            case 3: R2 = "TELEFONO";
                                                break;
                                            case 4: R2 = "FECHA_NACIMIENTO";
                                                break;
                                            case 5: R2 = "DIRECCION";
                                                break;
                                        }
                                        System.out.println("INGRESE EL DATO: ");
                                        R3 = t.nextLine();
                                        mod.cliente(R1, R2, R3);
                                        break;
                                    case 2:
                                        System.out.println("***********VEHICULO************");//modificar vehiculos
                                        System.out.println("NUMERO DE SEREIA DEL VEHICULO A MODIFICAR: ");
                                        R1 = t.nextLine();//para buscar el vehiculo
                                        System.out.println("CAMPO A MODIFICAR: \n1.-MARCA \n2.-TIPO \n3.-MODELO,"+
                                                "\n4.-OCUPANTES \n5.-SERVICIO = PARTICULAR \n6.-USO = Privado o Publico)");
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//campos a modificar de vehiculo
                                            case 1: R2 = "MARCA";
                                                break;
                                            case 2:R2 = "TIPO";
                                                break;
                                            case 3:R2 = "MODELO";
                                                break;
                                            case 4:R2 = "OCUPANTES";
                                                break;
                                            case 5:R2 = "SERVICIO(Particular)";
                                                break;
                                            case 6:R2 = "USO(Privado o Publico)";
                                                break;
                                        }
                                        System.out.println("INGRESE EL DATO: ");
                                        R3 = t.nextLine();
                                        mod.vehiculo(R1, R2, R3);
                                        break;
                                    case 3:
                                        System.out.println("***********POLIZA**********");//modificar poliza
                                        System.out.println("NUMERO DE POLIZA A MODIFICAR: ");
                                        R1 = t.nextLine();//para buscar la poliza a modificar
                                        System.out.println("CAMPO A MODIFICAR: \n1.-TIPO_SEGURO(A todo riesgo) \n2.-COBERTURA_MAX "+
                                                "\n1.-ESTATUS(Alta Baja Suspension)");
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//campos a modificar
                                            case 1: R2 = "TIPO_SEGURO";
                                                break;
                                            case 2:R2 = "COBERTURA_MAX";
                                                break;
                                            case 3:R2 = "ESTATUS";
                                                break;
                                        }
                                        System.out.println("INGRESE EL DATO: ");
                                        R3 = t.nextLine();
                                        mod.poliza(R1, R2, R3);
                                        break;
                                    case 4:
                                        System.out.println("*************PERSONA AUTORIZADA************");//modificar personas autorizadas
                                        System.out.println("CURP DE LA PERSONA AUTORTIZADA A MODIFICAR: ");
                                        R1 = t.nextLine();//para buscar a la persona autorizada  a modificar 
                                        System.out.println("CAMPO A MODIFICAR: \n1.-RELACION_CLIENTE(Hijo Padre Madre Esposo Esposa)");
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//opciones a modificar de persona autorizada 
                                            case 1: R2 = "RELACION_CLIENTE";
                                                break;
                                        }
                                        System.out.println("INGRESE EL DATO: ");
                                        R3 = t.nextLine();
                                        mod.persona_autorizada(R1, R2, R3);
                                        break;
                                    case 5:
                                        System.out.println("**************SINIESTRO**************");//modificar siniestro
                                        System.out.println("NUMERO DE SINIERSTRO A MODIFICAR: ");
                                        R1 = t.nextLine();//opcion para buscar a un siniestro
                                        System.out.println("CAMPO A MODIFICAR: \n1.-FECHA \n2.-TALLER \n3.-IMPORTE \n4.-DATO_POLIZA");
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//opciones a modificar  de siniestro
                                            case 1: R2 = "FECHA";
                                                break;
                                            case 2:R2 = "TALLER";
                                                break;
                                            case 3:R2 = "IMPORTE";
                                                break;
                                            case 4:R2 = "DATO_POLIZA";
                                                break;
                                        }
                                        System.out.println("INGRESE EL DATO: ");
                                        R3 = t.nextLine();
                                        mod.siniestro(R1, R2, R3);
                                        break;
                                    case 6:
                                        eeee = true;
                                        break;
                                    default:
                                        System.out.println("SOLO NUMEROS ENTRE 1 y 6");
                                        break;
                                }
                            } 
                            catch (SQLException ex) {
                                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        eeee = false;
                        break;
                    case 4://LISTA INDIVIDUAL
                        while(!eeee)
                        {
                            try {
                                System.out.println("***************LISTA INDIVIDUAL***************");//vamos a listar en invidivual
                                System.out.println("1.-CLIENTE \n2.-VEHICULO \n3.-POLIZA \n4.-PERSONA AUTORIZADA \n5.-SINIESTRO \n6.-SALIR");
                                System.out.println("ESCRIBA UNA DE LAS OPCIONES: ");
                                opciones = Integer.parseInt(t.nextLine());
                                switch (opciones) {//opciones a listar
                                    case 1:
                                        System.out.println("*************CLIENTE*************+");//listar cliente
                                         System.out.println("CAMPO A EN LISTAR: \n1.-RFC \n2.- NOMBRE,"+
                                                "\n3.-APELLIDO \n4.-TELEFONO \n5.-NUMERO LICENCIA )");
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//opciones de cliente a listar
                                            case 1: R1= "RFC";
                                                break;
                                            case 2: R1= "NOMBRE";
                                                break;
                                            case 3: R1= "APELLIDO";;
                                                break;
                                            case 4: R1= "TELEFONO";
                                                break;
                                            case 5:R1 = "NUM_LICENCIA";
                                                break;
                                           
                                        } System.out.println("DATO A BUSCAR:");
                                        R2 = t.nextLine();
                                        lista.cliente(R1, R2);
                                        break;
                                    case 2:
                                        System.out.println("****************VEHICULO****************");//listar vehiculo
                                        System.out.println("\n1.-Numero de serie\n2.- PLACAS");
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//OPCIONES A LISTAR DE VEHICULO
                                            case 1: R1= "NUM_SERIE";
                                                break;
                                            case 2: R1= "PLACAS";
                                                break;
                                        }
                                        System.out.println("DATO A BUSCAR:");
                                        R2 = t.nextLine();
                                        lista.vehiculo(R1, R2);
                                        break;
                                    case 3:
                                        System.out.println("*************POLIZA**************");//LISTAR INDIVIDUAL POLIZA
                                        System.out.println("CAMPO A EN LISTAR: \n1.-Numero de poliza \n2.- RFC \n3.- NUMERO DE SERIE" );
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//OPCIONES A LISTAR DE DE POLIZA
                                            case 1: R1= "NUM_POLIZA";
                                                break;
                                            case 2: R1= "CLI_RFC";
                                                break;
                                             case 3: R1= "VEH_NUM";
                                                break;
                                        } 
                                        System.out.println("DATO A BUSCAR:");
                                        R2 = t.nextLine();
                                        lista.poliza(R1, R2);
                                        break;
                                    case 4:
                                        System.out.println("**************PERSONA AUTORIZADA***************");//LISTAR POLIZA 
                                        System.out.println("CAMPO A EN LISTAR: \n1.-CURP \n2.- NUMERO DE POLIZA \n3.- RFC CLIENTE" );
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//OPCIONES A LISTAR  DE POLIZA
                                            case 1: R1= "CURP";
                                                break;
                                            case 2: R1= "POL_NUM";
                                                break;
                                             case 3: R1= "CLI_RFC";
                                                break;
                                        } 
                                        System.out.println("DATO A BUSCAR:");
                                        R2 = t.nextLine();
                                        lista.persona_autorizada(R1, R2);
                                        break;
                                    case 5:
                                        System.out.println("*************SINIESTRO************");//LISTAR INDIVIDUAL  SINIESTRO
                                        System.out.println("CAMPO A EN LISTAR: \n1.-Numero de siniestro\n2.- Numero de poliza \n3.- RFC cliente \n4.- CURP persona autorizada " );
                                        opciones = Integer.parseInt(t.nextLine());
                                        switch (opciones){//OPCIONES A LISTAR  DE SINIESTRO
                                            case 1: R1= "NUM_SIN";
                                                break;
                                            case 2: R1= "POL_NUM";
                                                break;
                                             case 3: R1= "CLI_RFC";
                                                break;
                                                 case 4: R1= "PER_CUR";
                                                break;
                                        } System.out.println("DATO A BUSCAR:");
                                        R2 = t.nextLine();
                                        lista.siniestro(R1, R2);
                                        break;
                                    case 6:
                                        eeee = true;
                                        break;
                                    default:
                                        System.out.println("SOLO NUMEROS ENTRE 1 y 6");
                                        break;
                                }
                            } 
                        catch (SQLException ex) {
                                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        eeee = false;
                        break;
                    case 5:
                        System.out.println("***************LISTA GLOBAL***************");//LISTAR GLOBAL
                        System.out.println("1.-CLIENTE \n2.-VEHICULO \n3.-POLIZA \n4.-PERSONA AUTORIZADA \n5.-SINIESTRO");
                        opciones = Integer.parseInt(t.nextLine());
                        switch (opciones){//OPCIONES A LISTAR EN GLOBAL
                            case 1: 
                                lista.global_clientes();//LISTAR CLIENTES
                                break;
                            case 2: 
                                lista.global_Vehiculos();//LISTAR VEHICULO
                                break;
                            case 3:
                                lista.global_Polizas();//LISTAR POLIZA
                                break;
                            case 4:
                                lista.global_P_A();//LISTAR PERSONA AUTORIZADA 
                                break;
                            case 5:
                                lista.global_Siniestro();//LISTAR SINIESTRO
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("*************SALIR**************");
                        eeee=true;
                    break;
                    default:
                        System.out.println("SOLO NUMEROS ENTRE 0 y 5");
                        break;
                }
                }catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            
        
    }}

    