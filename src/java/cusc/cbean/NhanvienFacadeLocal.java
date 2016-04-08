/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.cbean;

import cusc.ebean.Nhanvien;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface NhanvienFacadeLocal {

    void create(Nhanvien nhanvien);

    void edit(Nhanvien nhanvien);

    void remove(Nhanvien nhanvien);

    Nhanvien find(Object id);

    List<Nhanvien> findAll();

    List<Nhanvien> findRange(int[] range);

    int count();
    
}
