/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.ebean;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "hoadon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoadon.findAll", query = "SELECT h FROM Hoadon h"),
    @NamedQuery(name = "Hoadon.findById", query = "SELECT h FROM Hoadon h WHERE h.id = :id"),
    @NamedQuery(name = "Hoadon.findByDiachinhanhang", query = "SELECT h FROM Hoadon h WHERE h.diachinhanhang = :diachinhanhang"),
    @NamedQuery(name = "Hoadon.findByDienthoainhanhang", query = "SELECT h FROM Hoadon h WHERE h.dienthoainhanhang = :dienthoainhanhang"),
    @NamedQuery(name = "Hoadon.findByHotennhanhang", query = "SELECT h FROM Hoadon h WHERE h.hotennhanhang = :hotennhanhang")})
public class Hoadon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 500)
    @Column(name = "diachinhanhang")
    private String diachinhanhang;
    @Size(max = 10)
    @Column(name = "dienthoainhanhang")
    private String dienthoainhanhang;
    @Size(max = 50)
    @Column(name = "hotennhanhang")
    private String hotennhanhang;
    @JoinColumn(name = "taikhoanNHANVIEN", referencedColumnName = "taikhoan")
    @ManyToOne
    private Nhanvien taikhoanNHANVIEN;
    @JoinColumn(name = "emailTHANHVIEN", referencedColumnName = "email")
    @ManyToOne(optional = false)
    private Thanhvien emailTHANHVIEN;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHOADON")
    private Collection<Hoadonchitiet> hoadonchitietCollection;

    public Hoadon() {
    }

    public Hoadon(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiachinhanhang() {
        return diachinhanhang;
    }

    public void setDiachinhanhang(String diachinhanhang) {
        this.diachinhanhang = diachinhanhang;
    }

    public String getDienthoainhanhang() {
        return dienthoainhanhang;
    }

    public void setDienthoainhanhang(String dienthoainhanhang) {
        this.dienthoainhanhang = dienthoainhanhang;
    }

    public String getHotennhanhang() {
        return hotennhanhang;
    }

    public void setHotennhanhang(String hotennhanhang) {
        this.hotennhanhang = hotennhanhang;
    }

    public Nhanvien getTaikhoanNHANVIEN() {
        return taikhoanNHANVIEN;
    }

    public void setTaikhoanNHANVIEN(Nhanvien taikhoanNHANVIEN) {
        this.taikhoanNHANVIEN = taikhoanNHANVIEN;
    }

    public Thanhvien getEmailTHANHVIEN() {
        return emailTHANHVIEN;
    }

    public void setEmailTHANHVIEN(Thanhvien emailTHANHVIEN) {
        this.emailTHANHVIEN = emailTHANHVIEN;
    }

    @XmlTransient
    public Collection<Hoadonchitiet> getHoadonchitietCollection() {
        return hoadonchitietCollection;
    }

    public void setHoadonchitietCollection(Collection<Hoadonchitiet> hoadonchitietCollection) {
        this.hoadonchitietCollection = hoadonchitietCollection;
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
        if (!(object instanceof Hoadon)) {
            return false;
        }
        Hoadon other = (Hoadon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cusc.ebean.Hoadon[ id=" + id + " ]";
    }
    
}
