package fr.uvsq.modelDAO;

/**
 * Cette class représente une entité Cours.
 * @Author Aziz
 * @Version 0.0.1
 */
public class Cours {
    private String mNom;
    private int mId;
    private int mNbCours;
    private int mNbTD;
    private int mNbTP;
    private TypeCours mTypeCours;

    public Cours(){
        mNom = "";
        mId = -1;
        mNbCours = 0;
        mNbTD = 0;
        mNbTP = 0;
        mTypeCours = TypeCours.INCONNU;
    }

    public Cours(String nom, int id, int nbCours, int nbTD, int nbTP, TypeCours typeCours){
        mId = id;
        mNbCours = nbCours;
        mNbTD = nbTD;
        mNbTP = nbTP;
        mTypeCours = typeCours;
    }

    /**
     * Recupérer l'attribue mNom
     * @return String
     */
    public String getNom() {
        return mNom;
    }

    /**
     * Modifier L'attribue mNom
     * @param nom
     */
    public void setNom(String nom) {
        mNom = nom;
    }

    /**
     * Recupérer l'attribue mId
     * @return int
     */
    public int getId() {
        return mId;
    }

    /**
     * Modifier L'attribue mNbId
     * @param id
     */
    public void setId(int id) {
        mId = id;
    }

    /**
     * Modifier L'attribue mNbCours
     * @return int
     */
    public int getNbCours() {
        return mNbCours;
    }

    /**
     * Modifier L'attribue mNbCours
     * @param nbCours
     */
    public void setNbCours(int nbCours) {
        mNbCours = nbCours;
    }

    /**
     * Recupérer l'attribue mNbTD
     * @return int
     */
    public int getNbTD() {
        return mNbTD;
    }

    /**
     * Modifier L'attribue mNbTD
     * @param nbTD
     */
    public void setNbTD(int nbTD) {
        mNbTD = nbTD;
    }

    /**
     * Recupérer l'attribue mNbTP
     * @return int
     */
    public int getNbTP() {
        return mNbTP;
    }

    /**
     * Modifier L'attribue mNbTP
     * @param nbTP
     */
    public void setNbTP(int nbTP) {
        mNbTP = nbTP;
    }

    /**
     * Recupérer l'attribue mTypeCours
     * @return TypeCours
     */
    public TypeCours getTypeCours() {
        return mTypeCours;
    }

    /**
     * Modifier L'attribue mTypeCours
     * @param typeCours
     */
    public void setTypeCours(TypeCours typeCours) {
        mTypeCours = typeCours;
    }
}
