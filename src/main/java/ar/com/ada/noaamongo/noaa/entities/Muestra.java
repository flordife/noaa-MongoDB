package ar.com.ada.noaamongo.noaa.entities;

import java.util.Date;

public class Muestra {

    private Date horarioMuestra;

    private String matriculaEmbarcacion;

    private double longitud;

    private double latitud;

    private double alturaNivelDelMar;

    public Date getHorarioMuestra() {
        return horarioMuestra;
    }

    public void setHorarioMuestra(Date horarioMuestra) {
        this.horarioMuestra = horarioMuestra;
    }

    public String getMatriculaEmbarcacion() {
        return matriculaEmbarcacion;
    }

    public void setMatriculaEmbarcacion(String matriculaEmbarcacion) {
        this.matriculaEmbarcacion = matriculaEmbarcacion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getAlturaNivelDelMar() {
        return alturaNivelDelMar;
    }

    public void setAlturaNivelDelMar(double alturaNivelDelMar) {
        this.alturaNivelDelMar = alturaNivelDelMar;
    }
}
