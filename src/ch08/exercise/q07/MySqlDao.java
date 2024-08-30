package ch08.exercise.q07;

public class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("select from MySql");
    }

    @Override
    public void insert() {
        System.out.println("insert to MySql");
    }

    @Override
    public void update() {
        System.out.println("update MySql");
    }

    @Override
    public void delete() {
        System.out.println("delete from MySql");
    }
}
