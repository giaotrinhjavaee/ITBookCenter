/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.ebean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Le Thi Minh Loan
 */
@Entity
@Table(name = "nhanxet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhanxet.findAll", query = "SELECT n FROM Nhanxet n"),
    @NamedQuery(name = "Nhanxet.findById", query = "SELECT n FROM Nhanxet n WHERE n.id = :id"),
    @NamedQuery(name = "Nhanxet.findByNoidung", query = "SELECT n FROM Nhanxet n WHERE n.noidung = :noidung")})
public class Nhanxet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 500)
    @Column(name = "noidung")
    private String noidung;
    @JoinColumn(name = "emailTHANHVIEN", referencedColumnName = "email")
    @ManyToOne
    private Thanhvien emailTHANHVIEN;
    @JoinColumn(name = "idDMSACH", referencedColumnName = "id")
    @ManyToOne
    private Dmsach idDMSACH;

    public Nhanxet() {
    }

    public Nhanxet(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public Thanhvien getEmailTHANHVIEN() {
        return emailTHANHVIEN;
    }

    public void setEmailTHANHVIEN(Thanhvien emailTHANHVIEN) {
        this.emailTHANHVIEN = emailTHANHVIEN;
    }

    public Dmsach getIdDMSACH() {
        return idDMSACH;
    }

    public void setIdDMSACH(Dmsach idDMSACH) {
        this.idDMSACH = idDMSACH;
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
        if (!(object instanceof Nhanxet)) {
            return false;
        }
        Nhanxet other = (Nhanxet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cusc.ebean.Nhanxet[ id=" + id + " ]";
    }
    
}
