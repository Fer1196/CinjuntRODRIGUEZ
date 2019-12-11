/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 7:38:22 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase AdmAsignatura. 
 * 
 * @author Fernando Rodríguez
 */


@Entity
@Table(name = "ADM_ASIGNATURA", catalog = "", schema = "")
public class AdmAsignatura implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ASIGNATURA")
    private Integer pk;
    
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "DIRECCION", nullable = false, length = 2)
    private Integer creditos;
    
  
    @OneToMany(mappedBy = "asignatura", fetch = FetchType.LAZY)
    private List<AdmAsignaturaParalelo> paralelos;


    public AdmAsignatura() {
    }

    public AdmAsignatura(Integer pk) {
        this.pk = pk;
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    
    

    @Override
    public String toString() {
        return "AdmAsignatura{" + "pk=" + pk + ", nombre=" + nombre + ", creditos=" + creditos + '}';
    }
    
    
    
    
    

}
