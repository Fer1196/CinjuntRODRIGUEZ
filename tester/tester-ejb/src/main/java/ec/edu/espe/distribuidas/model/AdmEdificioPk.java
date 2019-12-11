/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: tester-ejb
 * 
 * Creado: Dec 10, 2019 - 7:52:38 PM
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * Clase AdmEdificioPk. 
 * 
 * @author Fernando Rodríguez
 */

@Embeddable
public class AdmEdificioPk {
    
    @Column(name="COD_SEDE", nullable = false)
    private String codigoSede; 
    
    @Column(name="COD_EDIFICIO", nullable = false)
    private String codigoEdificio; 


}
