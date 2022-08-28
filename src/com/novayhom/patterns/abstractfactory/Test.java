package com.novayhom.patterns.abstractfactory;

public class Test {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
        Dao dao = daf.creaDao("dept");
        dao.save();
    }
}
