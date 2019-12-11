/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 9:12:18 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.services;

import ec.edu.espe.distribuidas.dao.AdmAsignaturaDAO;
import ec.edu.espe.distribuidas.model.AdmAsignatura;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * Clase AdmAulaService. 
 * 
 * @author Fernando Rodríguez
 */

@Stateless
@LocalBean
public class AdmAulaService {
    
    @EJB
    private AdmAsignaturaDAO admAsignaturaDAO;
    
    public List<AdmAsignatura> obtenerPorEstado(Integer codigo) {
        return this.admAsignaturaDAO.findByCreditos(codigo);
    }
    
    

}
