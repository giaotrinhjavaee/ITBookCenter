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
@Table(name = "tacgia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tacgia.findAll", query = "SELECT t FROM Tacgia t"),
    @NamedQuery(name = "Tacgia.findById", query = "SELECT t FROM Tacgia t WHERE t.id = :id"),
    @NamedQuery(name = "Tacgia.findByHovaten", query = "SELECT t FROM Tacgia t WHERE t.hovaten = :hovaten"),
    @NamedQuery(name = "Tacgia.findByNgaysinh", query = "SELECT t FROM Tacgia t WHERE t.ngaysinh = :ngaysinh")})
public class Tacgia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "hovaten")
    private String hovaten;
    @Size(max = 10)
    @Column(name = "ngaysinh")
    private String ngaysinh;
    @OneToMany(mappedBy = "idTACGIA")
    private Collection<Dmsach> dmsachCollection;

    public Tacgia() {
    }

    public Tacgia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
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
        if (!(object instanceof Tacgia)) {
            return false;
        }
        Tacgia other = (Tacgia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cusc.ebean.Tacgia[ id=" + id + " ]";
    }
    
}
