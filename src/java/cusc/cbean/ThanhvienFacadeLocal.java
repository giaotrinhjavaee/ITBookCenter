/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Thanhvien;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface ThanhvienFacadeLocal {

    void create(Thanhvien thanhvien);

    void edit(Thanhvien thanhvien);

    void remove(Thanhvien thanhvien);

    Thanhvien find(Object id);

    List<Thanhvien> findAll();

    List<Thanhvien> findRange(int[] range);

    int count();
    
}
