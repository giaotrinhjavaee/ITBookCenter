/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Dmnhaxuatban;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface DmnhaxuatbanFacadeLocal {

    void create(Dmnhaxuatban dmnhaxuatban);

    void edit(Dmnhaxuatban dmnhaxuatban);

    void remove(Dmnhaxuatban dmnhaxuatban);

    Dmnhaxuatban find(Object id);

    List<Dmnhaxuatban> findAll();

    List<Dmnhaxuatban> findRange(int[] range);

    int count();
    
}
