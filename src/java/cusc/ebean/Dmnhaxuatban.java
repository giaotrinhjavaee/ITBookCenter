/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.ebean;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Le Thi Minh Loan
 */
@Entity
@Table(name = "dmnhaxuatban")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dmnhaxuatban.findAll", query = "SELECT d FROM Dmnhaxuatban d"),
    @NamedQuery(name = "Dmnhaxuatban.findById", query = "SELECT d FROM Dmnhaxuatban d WHERE d.id = :id"),
    @NamedQuery(name = "Dmnhaxuatban.findByTen", query = "SELECT d FROM Dmnhaxuatban d WHERE d.ten = :ten"),
    @NamedQuery(name = "Dmnhaxuatban.findByDiachi", query = "SELECT d FROM Dmnhaxuatban d WHERE d.diachi = :diachi")})
public class Dmnhaxuatban implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "ten")
    private String ten;
    @Size(max = 500)
    @Column(name = "diachi")
    private String diachi;
    @OneToMany(mappedBy = "idNHAXUATBAN")
    private Collection<Dmsach> dmsachCollection;

    public Dmnhaxuatban() {
    }

    public Dmnhaxuatban(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @XmlTransient
    public Collection<Dmsach> getDmsachCollection() {
        return dmsachCollection;
    }

    public void setDmsachCollection(Collection<Dmsach> dmsachCollection) {
        this.dmsachCollection = dmsachCollection;
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
        if (!(object instanceof Dmnhaxuatban)) {
            return false;
        }
        Dmnhaxuatban other = (Dmnhaxuatban) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cusc.ebean.Dmnhaxuatban[ id=" + id + " ]";
    }
    
}
