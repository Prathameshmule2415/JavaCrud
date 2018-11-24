
public class Contacto {
   private int idContacto;
   private String nombre;
   private String apePat;
   private String apeMat;
   private String fechaNac;
   private String RFC;
   private float salario;

    public Contacto(int idContacto, String nombre, String apePat, String apeMat, String fechaNac, String RFC, float salario) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.fechaNac = fechaNac;
        this.RFC = RFC;
        this.salario = salario;
    }

    public Contacto(){
        
    }
    /**
     * @return the idContacto
     */
    public int getIdContacto() {
        return idContacto;
    }

    /**
     * @param idContacto the idContacto to set
     */
    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apePat
     */
    public String getApePat() {
        return apePat;
    }

    /**
     * @param apePat the apePat to set
     */
    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    /**
     * @return the apeMat
     */
    public String getApeMat() {
        return apeMat;
    }

    /**
     * @param apeMat the apeMat to set
     */
    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    /**
     * @return the fechaNac
     */
    public String getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the RFC
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * @param RFC the RFC to set
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Contacto:" + "\nnombre= " + nombre + "\napePat= " + apePat + "\napeMat= " + apeMat + "\nfechaNac= " + fechaNac + "\nRFC= " + RFC + "\nsalario= " + salario ;
    }
  
}
