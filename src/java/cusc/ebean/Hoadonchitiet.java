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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Le Thi Minh Loan
 */
@Entity
@Table(name = "hoadonchitiet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoadonchitiet.findAll", query = "SELECT h FROM Hoadonchitiet h"),
    @NamedQuery(name = "Hoadonchitiet.findById", query = "SELECT h FROM Hoadonchitiet h WHERE h.id = :id"),
    @NamedQuery(name = "Hoadonchitiet.findBySoluong", query = "SELECT h FROM Hoadonchitiet h WHERE h.soluong = :soluong")})
public class Hoadonchitiet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "soluong")
    private Integer soluong;
    @JoinColumn(name = "idHOADON", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Hoadon idHOADON;
    @JoinColumn(name = "idSACH", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Dmsach idSACH;

    public Hoadonchitiet() {
    }

    public Hoadonchitiet(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Hoadon getIdHOADON() {
        return idHOADON;
    }

    public void setIdHOADON(Hoadon idHOADON) {
        this.idHOADON = idHOADON;
    }

    public Dmsach getIdSACH() {
        return idSACH;
    }

    public void setIdSACH(Dmsach idSACH) {
        this.idSACH = idSACH;
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
        if (!(object instanceof Hoadonchitiet)) {
            return false;
        }
        Hoadonchitiet other = (Hoadonchitiet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cusc.ebean.Hoadonchitiet[ id=" + id + " ]";
    }
    
}
