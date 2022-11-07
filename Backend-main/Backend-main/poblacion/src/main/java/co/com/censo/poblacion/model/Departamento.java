package co.com.censo.poblacion.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @Column(name = "id_departamento", nullable = false)
    private Long id_departamento;
    @Column(name = "nombre_departamento")
    private String nombre_departamento;

}
