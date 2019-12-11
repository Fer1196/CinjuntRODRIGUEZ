/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 8:50:13 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.model;

import java.util.Objects;
import javax.persistence.Column;

/**
 *
 * Clase AdmAsignatParalHorarioPK. 
 * 
 * @author Fernando Rodríguez
 */
class AdmAsignatParalHorarioPK {

    @Column(name = "COD_ASIGNATURA", nullable = false)
    private Integer codAsignatura;

    @Column(name = "PARALELO", nullable = false, length = 1)
    private String paralelo;

    @Column(name = "COD_AULA", nullable = false)
    private Integer codAula;

    @Column(name = "DIA", nullable = false, length = 3)
    private String dia;

    public AdmAsignatParalHorarioPK() {
    }

    public AdmAsignatParalHorarioPK(Integer codAsignatura, String paralelo, Integer codAula, String dia) {
        this.codAsignatura = codAsignatura;
        this.paralelo = paralelo;
        this.codAula = codAula;
        this.dia = dia;
    }

    public Integer getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(Integer codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public Integer getCodAula() {
        return codAula;
    }

    public void setCodAula(Integer codAula) {
        this.codAula = codAula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.codAsignatura);
        hash = 73 * hash + Objects.hashCode(this.paralelo);
        hash = 73 * hash + Objects.hashCode(this.codAula);
        hash = 73 * hash + Objects.hashCode(this.dia);
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
        final AdmAsignatParalHorarioPK other = (AdmAsignatParalHorarioPK) obj;
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.codAsignatura, other.codAsignatura)) {
            return false;
        }
        if (!Objects.equals(this.codAula, other.codAula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalHorarioPK{" + "codAsignatura=" + codAsignatura + ", paralelo=" + paralelo + ", codAula=" + codAula + ", dia=" + dia + '}';
    }

}
