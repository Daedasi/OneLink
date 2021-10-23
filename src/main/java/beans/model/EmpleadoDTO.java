
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class EmpleadoDTO {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    
    private Area area;
    private SubArea subarea;
    

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int idEmpleado, String nombre, String apellido, TipoDocumento tipoDocumento, Area area, SubArea subarea) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        
        this.area = area;
        this.subarea = subarea;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public SubArea getSubarea() {
        return subarea;
    }

    public void setSubarea(SubArea subarea) {
        this.subarea = subarea;
    }
    
    

}
