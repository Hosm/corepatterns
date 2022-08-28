package com.novayhom.patterns.abstractfactory;

public class DaoFactoryProducer {
    public static DaoAbstractFactory produce(String factoryType) {
        DaoAbstractFactory daf = null;
        switch (factoryType) {
            case "xml":
                daf = new XmlDaoFactory();
                break;
            case "db":
                daf = new DbDaoFactory();
                break;
        }
        return daf;
    }
}
