package ch08.exercise.q07;

public class OracleDao implements DataAccessObject {

    @Override
    public void select() {
        System.out.println("select from Oracle");
    }

    @Override
    public void insert() {
        System.out.println("insert from Oracle");
    }

    @Override
    public void update() {
        System.out.println("update Oracle");
    }

    @Override
    public void delete() {
        System.out.println("delete from Oracle");
    }
}
