package com.novayhom.patterns.abstractfactory;

public class XmlDaoFactory extends DaoAbstractFactory {
    @Override
    public Dao creaDao(String type) {
        Dao p = null;
        switch (type) {
            case "emp":
                p = new XMLEmpDao();
                break;
            case "dept":
                p = new XMLDeptDao();
                break;
        }
        return p;
    }
}
