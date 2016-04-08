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
@Table(name = "thanhvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thanhvien.findAll", query = "SELECT t FROM Thanhvien t"),
    @NamedQuery(name = "Thanhvien.findByEmail", query = "SELECT t FROM Thanhvien t WHERE t.email = :email"),
    @NamedQuery(name = "Thanhvien.findByMatkhau", query = "SELECT t FROM Thanhvien t WHERE t.matkhau = :matkhau"),
    @NamedQuery(name = "Thanhvien.findByHovaten", query = "SELECT t FROM Thanhvien t WHERE t.hovaten = :hovaten"),
    @NamedQuery(name = "Thanhvien.findByDiemthuong", query = "SELECT t FROM Thanhvien t WHERE t.diemthuong = :diemthuong"),
    @NamedQuery(name = "Thanhvien.findByGioitinh", query = "SELECT t FROM Thanhvien t WHERE t.gioitinh = :gioitinh"),
    @NamedQuery(name = "Thanhvien.findByNgaysinh", query = "SELECT t FROM Thanhvien t WHERE t.ngaysinh = :ngaysinh"),
    @NamedQuery(name = "Thanhvien.findByTrangthaixacnhan", query = "SELECT t FROM Thanhvien t WHERE t.trangthaixacnhan = :trangthaixacnhan"),
    @NamedQuery(name = "Thanhvien.findByNhanemail", query = "SELECT t FROM Thanhvien t WHERE t.nhanemail = :nhanemail"),
    @NamedQuery(name = "Thanhvien.findByDiachi", query = "SELECT t FROM Thanhvien t WHERE t.diachi = :diachi"),
    @NamedQuery(name = "Thanhvien.findByDienthoai", query = "SELECT t FROM Thanhvien t WHERE t.dienthoai = :dienthoai")})
public class Thanhvien implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "matkhau")
    private String matkhau;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "hovaten")
    private String hovaten;
    @Column(name = "diemthuong")
    private Integer diemthuong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gioitinh")
    private boolean gioitinh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ngaysinh")
    private String ngaysinh;
    @Column(name = "trangthaixacnhan")
    private Boolean trangthaixacnhan;
    @Column(name = "nhanemail")
    private Boolean nhanemail;
    @Size(max = 500)
    @Column(name = "diachi")
    private String diachi;
    @Size(max = 10)
    @Column(name = "dienthoai")
    private String dienthoai;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emailTHANHVIEN")
    private Collection<Hoadon> hoadonCollection;
    @OneToMany(mappedBy = "emailTHANHVIEN")
    private Collection<Nhanxet> nhanxetCollection;

    public Thanhvien() {
    }

    public Thanhvien(String email) {
        this.email = email;
    }

    public Thanhvien(String email, String matkhau, String hovaten, boolean gioitinh, String ngaysinh) {
        this.email = email;
        this.matkhau = matkhau;
        this.hovaten = hovaten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getDiemthuong() {
        return diemthuong;
    }

    public void setDiemthuong(Integer diemthuong) {
        this.diemthuong = diemthuong;
    }

    public boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Boolean getTrangthaixacnhan() {
        return trangthaixacnhan;
    }

    public void setTrangthaixacnhan(Boolean trangthaixacnhan) {
        this.trangthaixacnhan = trangthaixacnhan;
    }

    public Boolean getNhanemail() {
        return nhanemail;
    }

    public void setNhanemail(Boolean nhanemail) {
        this.nhanemail = nhanemail;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    @XmlTransient
    public Collection<Hoadon> getHoadonCollection() {
        return hoadonCollection;
    }

    public void setHoadonCollection(Collection<Hoadon> hoadonCollection) {
        this.hoadonCollection = hoadonCollection;
    }

    @XmlTransient
    public Collection<Nhanxet> getNhanxetCollection() {
        return nhanxetCollection;
    }

    public void setNhanxetCollection(Collection<Nhanxet> nhanxetCollection) {
        this.nhanxetCollection = nhanxetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Thanhvien)) {
            return false;
        }
        Thanhvien other = (Thanhvien) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cusc.ebean.Thanhvien[ email=" + email + " ]";
    }
    
}
