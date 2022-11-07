package co.com.censo.poblacion.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "municipio")
public class Municipio {

    @Id
    @Column(name = "id_municipio", nullable = false)
    private Long id_municipio;
    @Column(name = "nombre_municipio")
    private String nombre_municipio;
    @Column(name = "codigo_departamento")
    private Long codigo_departamento;
}
