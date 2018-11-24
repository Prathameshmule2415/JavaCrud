import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class CapturaDatos

{
	public String getString() 
        { 
          InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(isr);
          String dato ="";
          try{
              dato = br.readLine();
              char[] listaNombre = dato.toCharArray();
                for(char x : listaNombre){
                    if(Character.isDigit(x)){
                        throw new Exception();
                    } 
                }
                return dato;
          }catch(Exception ex){
              System.out.println(ex);
          }
          return null;
	}
        
        public int getInt(){
         InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(isr);
          String dato ="";
          try{
              dato = br.readLine();
              char[] listaNombre = dato.toCharArray();
                for(char x : listaNombre){
                    if(!Character.isDigit(x)){
                        throw new Exception();
                    } 
                }
                return Integer.parseInt(dato);
          }catch(Exception ex){
              System.out.println(ex);
          }
           return -1;
        }
        
       public String getInfo(){
          InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(isr);
          String dato = "";
          try{
              dato = br.readLine();
          }catch(IOException e){
              System.out.println(e);
          }
           return dato;
          
       }
       
       public float getFloat(){
          InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(isr);
          String dato ="";
          try{
              dato = br.readLine();
              char[] listaNombre = dato.toCharArray();
                for(char x : listaNombre){
                    if(!Character.isDigit(x)){
                        if(listaNombre[x]=='.')
                            continue;
                        throw new Exception();
                    } 
                }
                return Float.parseFloat(dato);
          }catch(Exception ex){
              System.out.println(ex);
          }
           return -1;
       }
       
     
}