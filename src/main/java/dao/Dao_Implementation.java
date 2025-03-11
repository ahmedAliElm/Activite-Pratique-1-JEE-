package dao;

public class Dao_Implementation implements IDao {

    @Override
    public double getData() {

        double temp = 23;

        System.out.println("Version BD");

        return temp;
    }
}

