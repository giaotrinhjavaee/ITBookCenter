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
@Table(name = "dmsach")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dmsach.findAll", query = "SELECT d FROM Dmsach d"),
    @NamedQuery(name = "Dmsach.findById", query = "SELECT d FROM Dmsach d WHERE d.id = :id"),
    @NamedQuery(name = "Dmsach.findByTuasach", query = "SELECT d FROM Dmsach d WHERE d.tuasach = :tuasach"),
    @NamedQuery(name = "Dmsach.findByGiabia", query = "SELECT d FROM Dmsach d WHERE d.giabia = :giabia"),
    @NamedQuery(name = "Dmsach.findByAnhbia", query = "SELECT d FROM Dmsach d WHERE d.anhbia = :anhbia"),
    @NamedQuery(name = "Dmsach.findByMotatomtat", query = "SELECT d FROM Dmsach d WHERE d.motatomtat = :motatomtat"),
    @NamedQuery(name = "Dmsach.findBySotrang", query = "SELECT d FROM Dmsach d WHERE d.sotrang = :sotrang"),
    @NamedQuery(name = "Dmsach.findByTrongluonggram", query = "SELECT d FROM Dmsach d WHERE d.trongluonggram = :trongluonggram"),
    @NamedQuery(name = "Dmsach.findByNgayxuatban", query = "SELECT d FROM Dmsach d WHERE d.ngayxuatban = :ngayxuatban"),
    @NamedQuery(name = "Dmsach.findByKichthuoccm", query = "SELECT d FROM Dmsach d WHERE d.kichthuoccm = :kichthuoccm")})
public class Dmsach implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "tuasach")
    private String tuasach;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "giabia")
    private Double giabia;
    @Size(max = 500)
    @Column(name = "anhbia")
    private String anhbia;
    @Size(max = 500)
    @Column(name = "motatomtat")
    private String motatomtat;
    @Column(name = "sotrang")
    private Integer sotrang;
    @Column(name = "trongluonggram")
    private Integer trongluonggram;
    @Size(max = 10)
    @Column(name = "ngayxuatban")
    private String ngayxuatban;
    @Size(max = 5)
    @Column(name = "kichthuoccm")
    private String kichthuoccm;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSACH")
    private Collection<Hoadonchitiet> hoadonchitietCollection;
    @OneToMany(mappedBy = "idDMSACH")
    private Collection<Nhanxet> nhanxetCollection;
    @JoinColumn(name = "idTACGIA", referencedColumnName = "id")
    @ManyToOne
    private Tacgia idTACGIA;
    @JoinColumn(name = "idNHAXUATBAN", referencedColumnName = "id")
    @ManyToOne
    private Dmnhaxuatban idNHAXUATBAN;
    @JoinColumn(name = "idDMLOAISACH", referencedColumnName = "id")
    @ManyToOne
    private Dmloaisach idDMLOAISACH;

    public Dmsach() {
    }

    public Dmsach(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTuasach() {
        return tuasach;
    }

    public void setTuasach(String tuasach) {
        this.tuasach = tuasach;
    }

    public Double getGiabia() {
        return giabia;
    }

    public void setGiabia(Double giabia) {
        this.giabia = giabia;
    }

    public String getAnhbia() {
        return anhbia;
    }

    public void setAnhbia(String anhbia) {
        this.anhbia = anhbia;
    }

    public String getMotatomtat() {
        return motatomtat;
    }

    public void setMotatomtat(String motatomtat) {
        this.motatomtat = motatomtat;
    }

    public Integer getSotrang() {
        return sotrang;
    }

    public void setSotrang(Integer sotrang) {
        this.sotrang = sotrang;
    }

    public Integer getTrongluonggram() {
        return trongluonggram;
    }

    public void setTrongluonggram(Integer trongluonggram) {
        this.trongluonggram = trongluonggram;
    }

    public String getNgayxuatban() {
        return ngayxuatban;
    }

    public void setNgayxuatban(String ngayxuatban) {
        this.ngayxuatban = ngayxuatban;
    }

    public String getKichthuoccm() {
        return kichthuoccm;
    }

    public void setKichthuoccm(String kichthuoccm) {
        this.kichthuoccm = kichthuoccm;
    }

    @XmlTransient
    public Collection<Hoadonchitiet> getHoadonchitietCollection() {
        return hoadonchitietCollection;
    }

    public void setHoadonchitietCollection(Collection<Hoadonchitiet> hoadonchitietCollection) {
        this.hoadonchitietCollection = hoadonchitietCollection;
    }

    @XmlTransient
    public Collection<Nhanxet> getNhanxetCollection() {
        return nhanxetCollection;
    }

    public void setNhanxetCollection(Collection<Nhanxet> nhanxetCollection) {
        this.nhanxetCollection = nhanxetCollection;
    }

    public Tacgia getIdTACGIA() {
        return idTACGIA;
    }

    public void setIdTACGIA(Tacgia idTACGIA) {
        this.idTACGIA = idTACGIA;
    }

    public Dmnhaxuatban getIdNHAXUATBAN() {
        return idNHAXUATBAN;
    }

    public void setIdNHAXUATBAN(Dmnhaxuatban idNHAXUATBAN) {
        this.idNHAXUATBAN = idNHAXUATBAN;
    }

    public Dmloaisach getIdDMLOAISACH() {
        return idDMLOAISACH;
    }

    public void setIdDMLOAISACH(Dmloaisach idDMLOAISACH) {
        this.idDMLOAISACH = idDMLOAISACH;
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
        if (!(object instanceof Dmsach)) {
            return false;
        }
        Dmsach other = (Dmsach) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cusc.ebean.Dmsach[ id=" + id + " ]";
    }
    
}
