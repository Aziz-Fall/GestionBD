package fr.uvsq.dao;

import fr.uvsq.modelDAO.Cours;

import java.sql.Connection;
import java.util.ArrayList;

public class CoursDAO extends DA0<Cours>{

    public CoursDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(Cours obj) {
        return false;
    }

    @Override
    public Cours read(int id) {
        return null;
    }

    @Override
    public boolean delete(Cours obj) {
        return false;
    }

    @Override
    public Cours find(int id) {
        return null;
    }

    @Override
    public ArrayList<Cours> getList() {
        return null;
    }

}
