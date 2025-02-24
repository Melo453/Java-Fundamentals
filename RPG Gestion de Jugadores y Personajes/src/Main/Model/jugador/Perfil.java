package Main.Model.jugador;

import java.util.Date;
import java.util.Set;

public class Perfil {
    private int idPerfil;
    private Date fechaCreacion;
    private Set<String> logros;

    public Perfil() {
    }

    public Perfil(int idPerfil, Date fechaCreacion, Set<String> logros) {
        this.idPerfil = idPerfil;
        this.fechaCreacion = fechaCreacion;
        this.logros = logros;
    }

    public int idPerfil() {
        return idPerfil;
    }

    public Perfil setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
        return this;
    }

    public Date fechaCreacion() {
        return fechaCreacion;
    }

    public Perfil setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
        return this;
    }

    public Set<String> logros() {
        return logros;
    }

    public Perfil setLogros(Set<String> logros) {
        this.logros = logros;
        return this;
    }
}
