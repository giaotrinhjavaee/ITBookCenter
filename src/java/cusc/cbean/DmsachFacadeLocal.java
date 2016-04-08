/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Dmsach;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface DmsachFacadeLocal {

    void create(Dmsach dmsach);

    void edit(Dmsach dmsach);

    void remove(Dmsach dmsach);

    Dmsach find(Object id);

    List<Dmsach> findAll();

    List<Dmsach> findRange(int[] range);

    int count();
    
}
