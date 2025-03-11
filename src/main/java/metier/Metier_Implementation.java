package metier;

import dao.IDao;

public class Metier_Implementation implements IMetier {

    private IDao dao;

    public Metier_Implementation(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        return t;
    }
}

