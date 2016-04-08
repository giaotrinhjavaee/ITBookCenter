/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Tacgia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface TacgiaFacadeLocal {

    void create(Tacgia tacgia);

    void edit(Tacgia tacgia);

    void remove(Tacgia tacgia);

    Tacgia find(Object id);

    List<Tacgia> findAll();

    List<Tacgia> findRange(int[] range);

    int count();
    
}
