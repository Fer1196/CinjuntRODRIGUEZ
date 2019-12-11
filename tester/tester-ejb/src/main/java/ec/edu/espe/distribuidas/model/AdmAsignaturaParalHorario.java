/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 7:39:16 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Clase AdmAsignaturaParalHorario. 
 * 
 * @author Fernando Rodríguez
 */

@Entity
@Table(name = "ADM_ASIGNAT_PARAL_HORARIO", catalog = "", schema = "")
public class AdmAsignaturaParalHorario implements Serializable{
    
    
   @EmbeddedId
    protected AdmAsignatParalHorarioPK pk;

    @Column(name = "HORARIO_INICIO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioInicio;

    @Column(name = "HORARIO_FIN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioFin;

    @Column(name = "HORAS", nullable = false)
    private Integer horas;

    @PrimaryKeyJoinColumn(name = "COD_AULA", referencedColumnName = "COD_AULA")
    @ManyToOne
    private AdmAula aula;

    @PrimaryKeyJoinColumns({
        @PrimaryKeyJoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
        ,
        @PrimaryKeyJoinColumn(name = "PARALELO", referencedColumnName = "PARALELO")
    })
    @ManyToOne
    private AdmAsignaturaParalelo paralelo;

    public AdmAsignaturaParalHorario() {
    }

   
public AdmAsignaturaParalHorario(Integer codAsignatura, String paralelo, Integer codAula, String dia) {
        this.pk = new AdmAsignatParalHorarioPK(codAsignatura, paralelo, codAula, dia);
    }

    public AdmAsignatParalHorarioPK getPk() {
        return pk;
    }

    public void setPk(AdmAsignatParalHorarioPK pk) {
        this.pk = pk;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(Date horarioFin) {
        this.horarioFin = horarioFin;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public AdmAula getAula() {
        return aula;
    }

    public void setAula(AdmAula aula) {
        this.aula = aula;
    }

    public AdmAsignaturaParalelo getParalelo() {
        return paralelo;
    }

    public void setParalelo(AdmAsignaturaParalelo paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.pk);
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
        final AdmAsignaturaParalHorario other = (AdmAsignaturaParalHorario) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignaturaParalHorario{" + "pk=" + pk + ", horarioInicio=" + horarioInicio + ", horarioFin=" + horarioFin + ", horas=" + horas + ", aula=" + aula + ", paralelo=" + paralelo + '}';
    }


    
    

}
