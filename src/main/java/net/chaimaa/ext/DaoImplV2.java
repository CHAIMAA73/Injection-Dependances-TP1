package net.chaimaa.ext;

import net.chaimaa.dao.IDao;
import org.springframework.stereotype.Component;

//@Component("d")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs ....");
        double t =12 ;
        return t;
    }
}
