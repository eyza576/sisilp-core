package ilp.edu.pe.sisgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Administrativo  extends Persona{
    @Column(name = "idadministrativo",length = 10 ,nullable = false)
    private  Long idadministrativo;

    @Column(name = "cargo",length = 100, nullable = false)
    private  String cargo;

    public Administrativo(Long idadministrativo, String cargo) {
        this.idadministrativo = idadministrativo;
        this.cargo = cargo;
    }

    public Administrativo(Long idpersona, Long idadministrativo, String cargo) {
        super(idpersona);
        this.idadministrativo = idadministrativo;
        this.cargo = cargo;
    }

    public Administrativo(String nombre, String apellido, int edad, String dni, Date fechanacimiento, String genero, Long idadministrativo, String cargo) {
        super(nombre, apellido, edad, dni, fechanacimiento, genero);
        this.idadministrativo = idadministrativo;
        this.cargo = cargo;
    }

    public Long getIdadministrativo() {
        return idadministrativo;
    }

    public void setIdadministrativo(Long idadministrativo) {
        this.idadministrativo = idadministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
