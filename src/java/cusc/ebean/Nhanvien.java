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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Le Thi Minh Loan
 */
@Entity
@Table(name = "nhanvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhanvien.findAll", query = "SELECT n FROM Nhanvien n"),
    @NamedQuery(name = "Nhanvien.findByTaikhoan", query = "SELECT n FROM Nhanvien n WHERE n.taikhoan = :taikhoan"),
    @NamedQuery(name = "Nhanvien.findByMatkhau", query = "SELECT n FROM Nhanvien n WHERE n.matkhau = :matkhau"),
    @NamedQuery(name = "Nhanvien.findByHovaten", query = "SELECT n FROM Nhanvien n WHERE n.hovaten = :hovaten"),
    @NamedQuery(name = "Nhanvien.findByNgaysinh", query = "SELECT n FROM Nhanvien n WHERE n.ngaysinh = :ngaysinh"),
    @NamedQuery(name = "Nhanvien.findByDiachi", query = "SELECT n FROM Nhanvien n WHERE n.diachi = :diachi")})
public class Nhanvien implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "taikhoan")
    private String taikhoan;
    @Size(max = 50)
    @Column(name = "matkhau")
    private String matkhau;
    @Size(max = 255)
    @Column(name = "hovaten")
    private String hovaten;
    @Size(max = 10)
    @Column(name = "ngaysinh")
    private String ngaysinh;
    @Size(max = 500)
    @Column(name = "diachi")
    private String diachi;
    @OneToMany(mappedBy = "taikhoanNHANVIEN")
    private Collection<Hoadon> hoadonCollection;

    public Nhanvien() {
    }

    public Nhanvien(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @XmlTransient
    public Collection<Hoadon> getHoadonCollection() {
        return hoadonCollection;
    }

    public void setHoadonCollection(Collection<Hoadon> hoadonCollection) {
        this.hoadonCollection = hoadonCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taikhoan != null ? taikhoan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nhanvien)) {
            return false;
        }
        Nhanvien other = (Nhanvien) object;
        if ((this.taikhoan == null && other.taikhoan != null) || (this.taikhoan != null && !this.taikhoan.equals(other.taikhoan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cusc.ebean.Nhanvien[ taikhoan=" + taikhoan + " ]";
    }
    
}
