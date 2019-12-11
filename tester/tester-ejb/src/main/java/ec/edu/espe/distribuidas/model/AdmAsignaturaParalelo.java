/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 7:38:40 PM
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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * Clase AdmAsignaturaParalelo. 
 * 
 * @author Fernando Rodríguez
 */

@Entity
@Table(name = "ADM_ASIGNATURA_PARALELO", catalog = "", schema = "")
public class AdmAsignaturaParalelo implements Serializable {
    
    
    @EmbeddedId
    private AsignaturaParaleloPK pk; 
    
    
    @Column(name = "ALUMNOS", nullable = false, length = 2)
    private Integer alumnos;
    
    @Column(name = "ESTADO", nullable = false, precision = 10, scale = 7)
    private String estado;
    
    @JoinColumn(name="COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
    @ManyToOne(optional = false)
    private AdmSede admSede; 
    
    @PrimaryKeyJoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
    @ManyToOne
    private AdmAsignatura asignatura;

    @OneToMany(mappedBy = "paralelo")
    private List<AdmAsignaturaParalHorario> horarios;


    public AdmAsignaturaParalelo() {
    }

    public AdmAsignaturaParalelo(AsignaturaParaleloPK pk) {
        this.pk = pk;
    }

    public AsignaturaParaleloPK getPk() {
        return pk;
    }

    public void setPk(AsignaturaParaleloPK pk) {
        this.pk = pk;
    }

    public Integer getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Integer alumnos) {
        this.alumnos = alumnos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AdmSede getAdmSede() {
        return admSede;
    }

    public void setAdmSede(AdmSede admSede) {
        this.admSede = admSede;
    }
     
    

}
