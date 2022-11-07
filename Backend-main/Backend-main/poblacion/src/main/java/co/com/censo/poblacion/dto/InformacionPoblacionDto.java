package co.com.censo.poblacion.dto;

import lombok.Data;

@Data
public class InformacionPoblacionDto {
    private Long id_registro;
    private String fecha;
    private Long codigo_municipio;
    private Long poblacion_urbana;
    private Long poblacion_rural;
    private Long total_poblacion;
    private double porcentaje_urbana;
    private double porcentaje_rural;
    private String categoria_municipio;
    private Long poblacion_hombres_rural;
    private Long poblacion_mujeres_rural;
    private Long poblacion_hombres_urb;
    private Long poblacion_mujeres_urb;

    public Long getId_registro() {
        return id_registro;
    }

    public void setId_registro(Long id_registro) {
        this.id_registro = id_registro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getCodigo_municipio() {
        return codigo_municipio;
    }

    public void setCodigo_municipio(Long codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
    }

    public Long getPoblacion_urbana() {
        return poblacion_urbana;
    }

    public void setPoblacion_urbana(Long poblacion_urbana) {
        this.poblacion_urbana = poblacion_urbana;
    }

    public Long getPoblacion_rural() {
        return poblacion_rural;
    }

    public void setPoblacion_rural(Long poblacion_rural) {
        this.poblacion_rural = poblacion_rural;
    }

    public Long getTotal_poblacion() {
        return total_poblacion;
    }

    public void setTotal_poblacion(Long total_poblacion) {
        this.total_poblacion = total_poblacion;
    }

    public double getPorcentaje_urbana() {
        return porcentaje_urbana;
    }

    public void setPorcentaje_urbana(double porcentaje_urbana) {
        this.porcentaje_urbana = porcentaje_urbana;
    }

    public double getPorcentaje_rural() {
        return porcentaje_rural;
    }

    public void setPorcentaje_rural(double porcentaje_rural) {
        this.porcentaje_rural = porcentaje_rural;
    }

    public String getCategoria_municipio() {
        return categoria_municipio;
    }

    public void setCategoria_municipio(String categoria_municipio) {
        this.categoria_municipio = categoria_municipio;
    }

    public Long getPoblacion_hombres_rural() {
        return poblacion_hombres_rural;
    }

    public void setPoblacion_hombres_rural(Long poblacion_hombres_rural) {
        this.poblacion_hombres_rural = poblacion_hombres_rural;
    }

    public Long getPoblacion_mujeres_rural() {
        return poblacion_mujeres_rural;
    }

    public void setPoblacion_mujeres_rural(Long poblacion_mujeres_rural) {
        this.poblacion_mujeres_rural = poblacion_mujeres_rural;
    }

    public Long getPoblacion_hombres_urb() {
        return poblacion_hombres_urb;
    }

    public void setPoblacion_hombres_urb(Long poblacion_hombres_urb) {
        this.poblacion_hombres_urb = poblacion_hombres_urb;
    }

    public Long getPoblacion_mujeres_urb() {
        return poblacion_mujeres_urb;
    }

    public void setPoblacion_mujeres_urb(Long poblacion_mujeres_urb) {
        this.poblacion_mujeres_urb = poblacion_mujeres_urb;
    }
}
