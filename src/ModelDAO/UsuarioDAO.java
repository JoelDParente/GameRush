/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LABINFO-PC13
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "UsuarioDAO.findAll", query = "SELECT u FROM UsuarioDAO u"),
    @NamedQuery(name = "UsuarioDAO.findById", query = "SELECT u FROM UsuarioDAO u WHERE u.id = :id"),
    @NamedQuery(name = "UsuarioDAO.findByUsername", query = "SELECT u FROM UsuarioDAO u WHERE u.username = :username"),
    @NamedQuery(name = "UsuarioDAO.findBySenha", query = "SELECT u FROM UsuarioDAO u WHERE u.senha = :senha"),
    @NamedQuery(name = "UsuarioDAO.findByNomeCompleto", query = "SELECT u FROM UsuarioDAO u WHERE u.nomeCompleto = :nomeCompleto"),
    @NamedQuery(name = "UsuarioDAO.findByEmail", query = "SELECT u FROM UsuarioDAO u WHERE u.email = :email"),
    @NamedQuery(name = "UsuarioDAO.findByCpf", query = "SELECT u FROM UsuarioDAO u WHERE u.cpf = :cpf"),
    @NamedQuery(name = "UsuarioDAO.findByTelefone", query = "SELECT u FROM UsuarioDAO u WHERE u.telefone = :telefone"),
    @NamedQuery(name = "UsuarioDAO.findBySenhaExtra", query = "SELECT u FROM UsuarioDAO u WHERE u.senhaExtra = :senhaExtra"),
    @NamedQuery(name = "UsuarioDAO.findByFotoPerfil", query = "SELECT u FROM UsuarioDAO u WHERE u.fotoPerfil = :fotoPerfil")})
public class UsuarioDAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "nome_completo")
    private String nomeCompleto;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "senha_extra")
    private String senhaExtra;
    @Basic(optional = false)
    @Column(name = "foto_perfil")
    private String fotoPerfil;

    public UsuarioDAO() {
    }

    public UsuarioDAO(Integer id) {
        this.id = id;
    }

    public UsuarioDAO(Integer id, String username, String senha, String nomeCompleto, String email, String cpf, String telefone, String senhaExtra, String fotoPerfil) {
        this.id = id;
        this.username = username;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senhaExtra = senhaExtra;
        this.fotoPerfil = fotoPerfil;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenhaExtra() {
        return senhaExtra;
    }

    public void setSenhaExtra(String senhaExtra) {
        this.senhaExtra = senhaExtra;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioDAO)) {
            return false;
        }
        UsuarioDAO other = (UsuarioDAO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModelDAO.UsuarioDAO[ id=" + id + " ]";
    }
    
}
