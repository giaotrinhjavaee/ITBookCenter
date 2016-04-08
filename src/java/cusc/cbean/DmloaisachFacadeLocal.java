/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Dmloaisach;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface DmloaisachFacadeLocal {

    void create(Dmloaisach dmloaisach);

    void edit(Dmloaisach dmloaisach);

    void remove(Dmloaisach dmloaisach);

    Dmloaisach find(Object id);

    List<Dmloaisach> findAll();

    List<Dmloaisach> findRange(int[] range);

    int count();
    
}
