/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 7:38:12 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase AdmAula. 
 * 
 * @author Fernando Rodríguez
 */

@Entity
@Table(name = "ADM_AULA", catalog = "", schema = "")

public class AdmAula implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_AULDA")
    private Integer codigo;
    
    @Column(name = "CODIGO_ALTERNO", nullable = false, length = 2)
    private String codigoAlterno;
    
    @Column(name = "PISO", nullable = false, length = 2)
    private Integer piso;
    
    @Column(name = "TIPO", nullable = false, length = 2)
    private String tipo;
    
    @Column(name = "CAPACIDAD", nullable = false, length = 3)
    private Integer capacidad;
    
            
    @JoinColumns({
        @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE")
        ,
        @JoinColumn(name = "COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO")
    })
    
    @ManyToOne
    private AdmEdificio edificio;

    @OneToMany(mappedBy = "aula")
    private List<AdmAsignaturaParalHorario> horarios;

    
    

    public AdmAula() {
    }

    public AdmAula(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodigoAlterno() {
        return codigoAlterno;
    }

    public void setCodigoAlterno(String codigoAlterno) {
        this.codigoAlterno = codigoAlterno;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public AdmEdificio getEdificio() {
        return edificio;
    }

    public void setEdificio(AdmEdificio edificio) {
        this.edificio = edificio;
    }

    public List<AdmAsignaturaParalHorario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<AdmAsignaturaParalHorario> horarios) {
        this.horarios = horarios;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.codigo);
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
        final AdmAula other = (AdmAula) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAula{" + "codigo=" + codigo + ", codigoAlterno=" + codigoAlterno + ", piso=" + piso + ", tipo=" + tipo + ", capacidad=" + capacidad + ", edificio=" + edificio + ", horarios=" + horarios + '}';
    }

    
}
