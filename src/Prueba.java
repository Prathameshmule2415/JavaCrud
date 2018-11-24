
public class Prueba {
     static CapturaDatos cap;
    public static void main(String[] args) throws Exception{
        
        menu();
      
       
       
    }
    public static void menu (){
        int opc;
        FuncionesContacto funC = new FuncionesContacto();
        do{
        cap = new CapturaDatos();
        System.out.println("1.Agregar Contacto");
        System.out.println("2.Buscar Contacto");
        System.out.println("3.Modificar Contacto");
        System.out.println("4.Eliminar Contacto");
        System.out.println("5.Listar Contactos");
        System.out.println("6.Salir");
        System.out.println("Seleccione una opcion");
        System.out.print("-> ");
        opc = cap.getInt();
        
        switch(opc){
            case 1:
                funC.agregarContacto();
                break;
            case 2:
                funC.buscarContacto();
                break;
            case 3:
                funC.modificarContacto();
                break;
            case 4:
                funC.eliminarContacto();
                break;
            case 5:
                funC.listarContacto();
                break;
            case 6:
                System.out.println("Fin de programa");
                break;
        }
            if(opc == 6 )
                break;
            System.out.println("Presione 1 para regresar al menu");
            System.out.print("->");
        }while(cap.getInt() == 1);
    }
}
