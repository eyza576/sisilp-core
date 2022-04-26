package ilp.edu.pe.sisgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Docente extends Persona{

    @Column(name = "iddocente",length = 10 ,nullable = false)
    private  Long iddocente;

    @Column(name = "horas-asignadas",length = 100, nullable = false)
    private  String horasasignadas;

    public Docente(Long iddocente, String horasasignadas) {
        this.iddocente = iddocente;
        this.horasasignadas = horasasignadas;
    }

    public Docente(Long idpersona, Long iddocente, String horasasignadas) {
        super(idpersona);
        this.iddocente = iddocente;
        this.horasasignadas = horasasignadas;
    }

    public Docente(String nombre, String apellido, int edad, String dni, Date fechanacimiento, String genero, Long iddocente, String horasasignadas) {
        super(nombre, apellido, edad, dni, fechanacimiento, genero);
        this.iddocente = iddocente;
        this.horasasignadas = horasasignadas;
    }

    public Long getIddocente() {
        return iddocente;
    }

    public void setIddocente(Long iddocente) {
        this.iddocente = iddocente;
    }

    public String getHorasasignadas() {
        return horasasignadas;
    }

    public void setHorasasignadas(String horasasignadas) {
        this.horasasignadas = horasasignadas;
    }
}
