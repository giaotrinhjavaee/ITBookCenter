/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Tacgia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Le Thi Minh Loan
 */
@Stateless
public class TacgiaFacade extends AbstractFacade<Tacgia> implements TacgiaFacadeLocal {
    @PersistenceContext(unitName = "ITBookCenterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TacgiaFacade() {
        super(Tacgia.class);
    }
    
}
