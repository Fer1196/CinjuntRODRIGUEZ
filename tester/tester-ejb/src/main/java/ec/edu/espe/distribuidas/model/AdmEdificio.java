/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 7:38:00 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * Clase AdmEdificio. 
 * 
 * @author Fernando Rodríguez
 */

@Entity
@Table(name = "ADM_EDIFICIO", catalog = "", schema = "")
public class AdmEdificio implements Serializable{
    
    @EmbeddedId
    private AdmEdificioPk pk; 
   
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "LATITUD", nullable = false, precision = 10, scale = 7)
    private BigDecimal laitud;
    
    @Column(name = "LONGITUD", nullable = false, precision = 10, scale = 7)
    private BigDecimal longitud;
    


    @PrimaryKeyJoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE")
    @ManyToOne
    private AdmSede sede;

    @OneToMany(mappedBy = "edificio")
    private List<AdmAula> aulas;

    public AdmEdificio() {
    }

    public AdmEdificio(AdmEdificioPk pk) {
        this.pk = pk;
    }

    public AdmEdificioPk getPk() {
        return pk;
    }

    public void setPk(AdmEdificioPk pk) {
        this.pk = pk;
    }


    
    

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getLaitud() {
        return laitud;
    }

    public void setLaitud(BigDecimal laitud) {
        this.laitud = laitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.pk);
        hash = 53 * hash + Objects.hashCode(this.sede);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdmEdificio other = (AdmEdificio) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        if (!Objects.equals(this.sede, other.sede)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "AdmEdificio{" + "pk=" + pk + ", admSede=" + ", nombre=" + nombre + ", laitud=" + laitud + ", longitud=" + longitud + '}';
    }
    
    
    
    
    
    
    
    

}
