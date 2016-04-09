package cusc.cbean;

import cusc.ebean.Thanhvien;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ThanhvienFacade extends AbstractFacade<Thanhvien> implements ThanhvienFacadeLocal {

    @PersistenceContext(unitName = "ITBookCenterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ThanhvienFacade() {
        super(Thanhvien.class);
    }

    //Get All Thanh Vien
    @Override
    public List findTatcaThanhvien() {
        Query query = em.createNamedQuery("Thanhvien.findAll",Thanhvien.class);
        List thanhvien = query.getResultList();
        return thanhvien;
    }
    
    //Find dia chi by email
    @Override
    public List findDiaChibyEmail(String email){
        Query qthanhvien=em.createQuery("SELECT diachi FROM Thanhvien t WHERE t.email = :email",Thanhvien.class);
        qthanhvien.setParameter("email", email);
        List dsthanhvien=qthanhvien.getResultList();
        return dsthanhvien;
    }

    @Override
    public Thanhvien findThanhVienbyEmail(String pemail){
        Query query=em.createNamedQuery("Thanhvien.findByEmail",Thanhvien.class);
        query.setParameter("email", pemail);
        Thanhvien thanhvien=(Thanhvien)query.getSingleResult();
        return thanhvien;        
    }    
}
