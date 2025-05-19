/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDAO;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LABINFO-PC13
 */
@Entity
@Table(name = "jogos")
@NamedQueries({
    @NamedQuery(name = "JogosDAO.findAll", query = "SELECT j FROM JogosDAO j"),
    @NamedQuery(name = "JogosDAO.findById", query = "SELECT j FROM JogosDAO j WHERE j.id = :id"),
    @NamedQuery(name = "JogosDAO.findByTitulo", query = "SELECT j FROM JogosDAO j WHERE j.titulo = :titulo"),
    @NamedQuery(name = "JogosDAO.findByCapa", query = "SELECT j FROM JogosDAO j WHERE j.capa = :capa"),
    @NamedQuery(name = "JogosDAO.findByGenero", query = "SELECT j FROM JogosDAO j WHERE j.genero = :genero"),
    @NamedQuery(name = "JogosDAO.findByPreco", query = "SELECT j FROM JogosDAO j WHERE j.preco = :preco"),
    @NamedQuery(name = "JogosDAO.findByAnoLancamento", query = "SELECT j FROM JogosDAO j WHERE j.anoLancamento = :anoLancamento"),
    @NamedQuery(name = "JogosDAO.findByNota", query = "SELECT j FROM JogosDAO j WHERE j.nota = :nota"),
    @NamedQuery(name = "JogosDAO.findByBanner", query = "SELECT j FROM JogosDAO j WHERE j.banner = :banner"),
    @NamedQuery(name = "JogosDAO.findByImgDemonstracao1", query = "SELECT j FROM JogosDAO j WHERE j.imgDemonstracao1 = :imgDemonstracao1"),
    @NamedQuery(name = "JogosDAO.findByImgDemonstracao2", query = "SELECT j FROM JogosDAO j WHERE j.imgDemonstracao2 = :imgDemonstracao2"),
    @NamedQuery(name = "JogosDAO.findByImgDemonstracao3", query = "SELECT j FROM JogosDAO j WHERE j.imgDemonstracao3 = :imgDemonstracao3"),
    @NamedQuery(name = "JogosDAO.findByPlataforma", query = "SELECT j FROM JogosDAO j WHERE j.plataforma = :plataforma")})
public class JogosDAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "capa")
    private String capa;
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "preco")
    private BigDecimal preco;
    @Basic(optional = false)
    @Column(name = "anoLancamento")
    private int anoLancamento;
    @Basic(optional = false)
    @Column(name = "nota")
    private int nota;
    @Basic(optional = false)
    @Column(name = "banner")
    private String banner;
    @Basic(optional = false)
    @Column(name = "img_demonstracao1")
    private String imgDemonstracao1;
    @Basic(optional = false)
    @Column(name = "img_demonstracao2")
    private String imgDemonstracao2;
    @Basic(optional = false)
    @Column(name = "img_demonstracao3")
    private String imgDemonstracao3;
    @Column(name = "plataforma")
    private String plataforma;

    public JogosDAO() {
    }

    public JogosDAO(Integer id) {
        this.id = id;
    }

    public JogosDAO(Integer id, String titulo, String capa, String genero, BigDecimal preco, int anoLancamento, int nota, String banner, String imgDemonstracao1, String imgDemonstracao2, String imgDemonstracao3) {
        this.id = id;
        this.titulo = titulo;
        this.capa = capa;
        this.genero = genero;
        this.preco = preco;
        this.anoLancamento = anoLancamento;
        this.nota = nota;
        this.banner = banner;
        this.imgDemonstracao1 = imgDemonstracao1;
        this.imgDemonstracao2 = imgDemonstracao2;
        this.imgDemonstracao3 = imgDemonstracao3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getImgDemonstracao1() {
        return imgDemonstracao1;
    }

    public void setImgDemonstracao1(String imgDemonstracao1) {
        this.imgDemonstracao1 = imgDemonstracao1;
    }

    public String getImgDemonstracao2() {
        return imgDemonstracao2;
    }

    public void setImgDemonstracao2(String imgDemonstracao2) {
        this.imgDemonstracao2 = imgDemonstracao2;
    }

    public String getImgDemonstracao3() {
        return imgDemonstracao3;
    }

    public void setImgDemonstracao3(String imgDemonstracao3) {
        this.imgDemonstracao3 = imgDemonstracao3;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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
        if (!(object instanceof JogosDAO)) {
            return false;
        }
        JogosDAO other = (JogosDAO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModelDAO.JogosDAO[ id=" + id + " ]";
    }
    
}
