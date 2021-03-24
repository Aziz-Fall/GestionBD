package fr.uvsq.factoryDAO;

import fr.uvsq.Connection.BDConnection;
import fr.uvsq.dao.CoursDAO;
import fr.uvsq.dao.DA0;

import java.sql.Connection;

/**
 * Cette permet d'intancier des Classes.
 */
public class FactoryDAO {

    /**
     * Récupére la connection depuis la classe BDConnection.
     */
    public final static Connection sConnection = BDConnection.getConnection();

    /**
     * Cette retourne une instance de la classe CoursDAO
     * @return DAO
     */
    public static DA0 getCoursDAO(){
        return new CoursDAO(sConnection);
    }
}
