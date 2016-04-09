package cusc.mbean;

import cusc.cbean.ThanhvienFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import cusc.ebean.Thanhvien;

@ManagedBean
@RequestScoped
public class ThanhVienBean {
    @EJB
    ThanhvienFacadeLocal thanhvien;
    public ThanhVienBean() {
    }
    public List<Thanhvien> dmThanhVien(){
        return thanhvien.findAll();
    }   
}
