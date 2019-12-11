/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 8:19:22 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.dao;

import ec.edu.espe.distribuidas.model.AdmAsignatura;
import java.util.Date;
import java.util.List;

/**
 *
 * Clase AdmAsignaturaDAO. 
 * 
 * @author Fernando Rodríguez
 */
public class AdmAsignaturaDAO extends AbstractDAO<AdmAsignatura> {

    public AdmAsignaturaDAO() {
        super(AdmAsignatura.class);
    }
    
    /**
     * Metodo Finder que obtiene  un listado de AdmAsignatura
     * en base al #creditos
     * 
     * @param creditos numero de creditos por el cual se reaiizara la busqueda
     * 
     * @return listado de AdminAsignatura
     */
    public List<AdmAsignatura> findByCreditos(Integer creditos) {
        return this.finder(
                "SELECT co FROM ADM_ASIGNATURA co WHERE = ?1",
                new Object[]{
                    creditos,}
        );

    }
    
}
 
