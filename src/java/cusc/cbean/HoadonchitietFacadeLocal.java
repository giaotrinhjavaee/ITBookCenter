/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Hoadonchitiet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface HoadonchitietFacadeLocal {

    void create(Hoadonchitiet hoadonchitiet);

    void edit(Hoadonchitiet hoadonchitiet);

    void remove(Hoadonchitiet hoadonchitiet);

    Hoadonchitiet find(Object id);

    List<Hoadonchitiet> findAll();

    List<Hoadonchitiet> findRange(int[] range);

    int count();
    
}
