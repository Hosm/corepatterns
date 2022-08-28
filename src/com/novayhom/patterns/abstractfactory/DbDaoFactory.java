package com.novayhom.patterns.abstractfactory;

public class DbDaoFactory extends DaoAbstractFactory {
    @Override
    public Dao creaDao(String type) {
        Dao p = null;
        switch (type) {
            case "emp":
                p = new DBEmpDao();
                break;
            case "dept":
                p = new DBDeptDao();
                break;
        }
        return p;
    }
}
