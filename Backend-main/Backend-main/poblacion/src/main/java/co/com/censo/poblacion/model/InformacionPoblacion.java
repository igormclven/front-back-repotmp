package co.com.censo.poblacion.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "informacionpoblacion")
@NoArgsConstructor
public class InformacionPoblacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_registro;

    @Column(name = "codigo_municipio", nullable = false, unique = true)
    private Long codigo_municipio;

    @Column(name = "fecha")
    private String fecha;


    @Column(name = "poblacion_h_urb")
    private Long poblacion_hombres_urb;

    @Column(name = "poblacion_m_urb")
    private Long poblacion_mujeres_urb;

    @Column(name = "poblacion_h_rural")
    private Long poblacion_hombres_rural;

    @Column(name = "poblacion_m_rural")
    private Long poblacion_mujeres_rural;

    public InformacionPoblacion(Long id_registro, Long codigo_municipio, Long poblacion_h_urb, Long poblacion_m_urb,
                                Long poblacion_h_rural, Long poblacion_m_rural, Long p_rural, Long p_urb,
                                Long poblacion_total, double porcentaje_urbana, double porcentaje_rural) {
        this.id_registro = id_registro;
        this.codigo_municipio = codigo_municipio;
        this.poblacion_hombres_urb = poblacion_h_urb;
        this.poblacion_mujeres_urb = poblacion_h_urb;
        this.poblacion_hombres_rural = poblacion_h_rural;
        this.poblacion_mujeres_rural = poblacion_h_rural;
    }

    public Long getId_registro() {
        return id_registro;
    }

    public void setId_registro(Long id_registro) {
        this.id_registro = id_registro;
    }

    public Long getCodigo_municipio() {
        return codigo_municipio;
    }

    public void setCodigo_municipio(Long codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getPoblacion_h_urb() {
        return poblacion_hombres_urb;
    }

    public void setPoblacion_h_urb(Long poblacion_h_urb) {
        this.poblacion_hombres_urb = poblacion_h_urb;
    }

    public Long getPoblacion_m_urb() {
        return poblacion_mujeres_urb;
    }

    public void setPoblacion_m_urb(Long poblacion_m_urb) {
        this.poblacion_mujeres_urb = poblacion_m_urb;
    }

    public Long getPoblacion_h_rural() {
        return poblacion_hombres_rural;
    }

    public void setPoblacion_h_rural(Long poblacion_h_rural) {
        this.poblacion_hombres_rural = poblacion_h_rural;
    }

    public Long getPoblacion_m_rural() {
        return poblacion_mujeres_rural;
    }

    public void setPoblacion_m_rural(Long poblacion_m_rural) {
        this.poblacion_mujeres_rural = poblacion_m_rural;
    }
}
