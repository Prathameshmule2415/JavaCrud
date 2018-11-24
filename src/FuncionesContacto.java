
import java.util.ArrayList;


public class FuncionesContacto {
    CapturaDatos cap;
    ArrayList<Contacto> contactoLista = new ArrayList();
    public void agregarContacto(){
        Contacto con = new Contacto();
        cap = new CapturaDatos();
        System.out.println("Elijiste: Agregar Contacto\n");
        System.out.print("Ingresa el id : ");
        con.setIdContacto(cap.getInt());
        
        System.out.print("Ingresa el nombre: ");
        con.setNombre(cap.getString());
        
        System.out.print("Ingresa apePat: ");
        con.setApePat(cap.getString());
        
        System.out.print("Ingresa apeMat: ");
        con.setApeMat(cap.getString());
        
        System.out.print("Ingresa fecha de Nacimiento: ");
        con.setFechaNac(cap.getInfo());
        
        System.out.print("Ingresa RFC: ");
        con.setRFC(cap.getInfo());
        
        System.out.print("Ingresa Salario: ");
        con.setSalario(cap.getFloat());
        
        contactoLista.add(con);
        System.out.println("Informacion agregada ... ");
       
        
    }
    
    public void buscarContacto(){
        int idBuscar;
        cap = new CapturaDatos();
        Contacto con = new Contacto();
        System.out.println("Elijiste: Buscar Contacto\n");
        listarPrev();
        System.out.println("Ingresa el id del contacto que quieres buscar");
        System.out.print("-> ");
        idBuscar = cap.getInt();
        for(Contacto c: contactoLista){
            if (c.getIdContacto()==idBuscar){
                System.out.println("Info del contacto econtrado:\n");
                System.out.println("Id: "+c.getIdContacto());
                System.out.println("Nombre: "+c.getNombre());
                System.out.println("apePat: "+c.getApePat());
                System.out.println("apeMat: "+c.getApeMat());
                System.out.println("RFC: "+c.getRFC());
                System.out.println("Salario: "+c.getSalario());
            }
            else{
                System.out.println("Contacto no Existe");
            }
        }
        

        
    }
    
    public void modificarContacto(){
        int indexModificar;
        cap = new CapturaDatos();
        System.out.println("Elijiste: Modificar Contacto\n");
        listarPrev();
        System.out.println("ingresa el numero del contacto que quieres modificar");
        System.out.print("-> ");
        indexModificar = cap.getInt()-1;
        if(indexModificar < 0)
            indexModificar =0;
        
        
        
        System.out.print("Ingresa el nuevo id : ");
        contactoLista.get(indexModificar).setIdContacto(cap.getInt());
        
        System.out.print("Ingresa el nuevo nombre: ");
        contactoLista.get(indexModificar).setNombre(cap.getString());
        
        System.out.print("Ingresa nuevo apePat: ");
        contactoLista.get(indexModificar).setApePat(cap.getString());
        
        System.out.print("Ingresa nuevo apeMat: ");
        contactoLista.get(indexModificar).setApeMat(cap.getString());
        
        System.out.print("Ingresa nueva fecha de Nacimiento: ");
        contactoLista.get(indexModificar).setFechaNac(cap.getInfo());
        
        System.out.print("Ingresa nuevo RFC: ");
        contactoLista.get(indexModificar).setRFC(cap.getInfo());
        
        System.out.print("Ingresa nuevo Salario: ");
        contactoLista.get(indexModificar).setSalario(cap.getFloat());
        
        System.out.println("Informacion modificada...");
        
    }
    
    public void eliminarContacto(){
        int indexEliminar;
        cap = new CapturaDatos();
        System.out.println("Elijiste: Eliminar Contacto\n");
        listarPrev();
        System.out.println("ingresa el numero del contacto que quieres eliminar");
        System.out.print("-> ");
        indexEliminar = cap.getInt()-1;
        if(indexEliminar <0)
            indexEliminar=0;
        contactoLista.remove(indexEliminar);
        System.out.println("Contacto eliminado");
        listarPrev();
    }
    
    public void listarContacto(){
        System.out.println("Elijiste: Listar Contactos\n");
        int y =0;
          if(contactoLista.isEmpty())
            System.out.println("No hay registros");
        for(Contacto x: contactoLista){
            
            System.out.println("Contacto "+(y+1)+":");
            System.out.println("\tId: "+contactoLista.get(y).getIdContacto());
            System.out.println("\tNombre: "+contactoLista.get(y).getNombre());
            System.out.println("\tapePat: "+contactoLista.get(y).getApePat());
            System.out.println("\tapeMat: "+contactoLista.get(y).getApeMat());
            System.out.println("\tFecha de nacimiento: "+contactoLista.get(y).getFechaNac());
            System.out.println("\tRFC:"+contactoLista.get(y).getRFC());
            System.out.println("\tsalario: "+contactoLista.get(y).getSalario());
            y++;
        }
    }
    
    public void listarPrev(){
        int y =0;
        if(contactoLista.isEmpty())
            System.out.println("No hay registros");
        for(Contacto x: contactoLista){
            System.out.println("Contacto "+(y+1)+":");
            System.out.println("\tId: "+contactoLista.get(y).getIdContacto());
            System.out.println("\tNombre: "+contactoLista.get(y).getNombre());
            y++;
        }
    }
}
