package fr.uvsq.dao;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DA0<T> {

    protected Connection mConnection = null;

    public DA0(Connection connection){
        mConnection = connection;
    }

    /**
     * Insérer un objet dans la Table T
     * @param obj
     * @return boolean
     */
    public abstract boolean create(T obj);

    /**
     * Recupere une entrée dans la table T
     * @param id
     * @return T
     */
    public abstract T read(int id);

    /**
     * Supprime une entrée dans T
     * @param obj
     * @return
     */
    public abstract boolean delete(T obj);

    /**
     * Cherche une entrée qui pour identifiant id
     * dans la table T
     * @param id
     * @return
     */
    public abstract T find(int id);

    /**
     * Selectionne tous les entrées de la table T
     * @return ArrayList<T>
     */
    public abstract ArrayList<T> getList();

}
