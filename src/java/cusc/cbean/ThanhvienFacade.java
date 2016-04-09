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

    public List findTatcaThanhvien() {
        Query query = em.createNamedQuery("Thanhvien.findAll",Thanhvien.class);
        List thanhvien = query.getResultList();
        return thanhvien;
    }

}
