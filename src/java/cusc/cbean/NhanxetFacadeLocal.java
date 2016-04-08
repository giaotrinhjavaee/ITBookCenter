/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Nhanxet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface NhanxetFacadeLocal {

    void create(Nhanxet nhanxet);

    void edit(Nhanxet nhanxet);

    void remove(Nhanxet nhanxet);

    Nhanxet find(Object id);

    List<Nhanxet> findAll();

    List<Nhanxet> findRange(int[] range);

    int count();
    
}
