/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.HBES.clases;

/**
 *
 * @author Desarrollador
 */
public class Usuario {
    private long id;
    private String usuario;
    private String password;
    private CuentaEmpresa empresa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CuentaEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(CuentaEmpresa empresa) {
        this.empresa = empresa;
    }
    
    
}
