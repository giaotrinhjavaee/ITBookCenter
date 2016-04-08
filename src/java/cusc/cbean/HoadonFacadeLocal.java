/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Hoadon;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface HoadonFacadeLocal {

    void create(Hoadon hoadon);

    void edit(Hoadon hoadon);

    void remove(Hoadon hoadon);

    Hoadon find(Object id);

    List<Hoadon> findAll();

    List<Hoadon> findRange(int[] range);

    int count();
    
}
