/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 8:09:15 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * Clase AsignaturaParaleloPK. 
 * 
 * @author Fernando Rodríguez
 */

@Embeddable
class AsignaturaParaleloPK {
    
    @Column(name="COD_ASIGNATURA", nullable = false)
    private Integer codigoAsigantura; 
    
    @Column(name="PARALELO", nullable = false)
    private String paralelo; 

    public AsignaturaParaleloPK() {
    }

    public AsignaturaParaleloPK(Integer codigoAsigantura, String paralelo) {
        this.codigoAsigantura = codigoAsigantura;
        this.paralelo = paralelo;
    }

    public Integer getCodigoAsigantura() {
        return codigoAsigantura;
    }

    public void setCodigoAsigantura(Integer codigoAsigantura) {
        this.codigoAsigantura = codigoAsigantura;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.codigoAsigantura);
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
        final AsignaturaParaleloPK other = (AsignaturaParaleloPK) obj;
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        if (!Objects.equals(this.codigoAsigantura, other.codigoAsigantura)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AsignaturaParaleloPK{" + "codigoAsigantura=" + codigoAsigantura + ", paralelo=" + paralelo + '}';
    }
    
    
    

}
