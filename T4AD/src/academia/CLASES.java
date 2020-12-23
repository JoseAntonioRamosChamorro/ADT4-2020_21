package academia;


public class CLASES extends com.matisse.reflect.MtObject {


	private static final long serialVersionUID = 1L;

    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("academia.CLASES"));

    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    public CLASES(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    protected CLASES(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(CLASES.class);
    }

    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, CLASES.class);
    }

    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(CLASES.class);
    }

    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, CLASES.class);
    }

    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    private static int nombreCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("nombre",CID));

    public static com.matisse.reflect.MtAttribute getNombreAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(nombreCID);
    }

    public final String getNombre() {
        return getString(getNombreAttribute(getMtDatabase()));
    }

    public final void setNombre(String val) {
        setString(getNombreAttribute(getMtDatabase()), val);
    }

    public final void removeNombre() {
        removeValue(getNombreAttribute(getMtDatabase()));
    }

    public final boolean isNombreNull() {
        return isNull(getNombreAttribute(getMtDatabase()));
    }

    public final boolean isNombreDefaultValue() {
        return isDefaultValue(getNombreAttribute(getMtDatabase()));
    }

    private static int aulaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("aula",CID));

    public static com.matisse.reflect.MtAttribute getAulaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(aulaCID);
    }

    public final int getAula() {
        return getInteger(getAulaAttribute(getMtDatabase()));
    }

    public final void setAula(int val) {
        setInteger(getAulaAttribute(getMtDatabase()), val);
    }

    public final void removeAula() {
        removeValue(getAulaAttribute(getMtDatabase()));
    }

    public final boolean isAulaNull() {
        return isNull(getAulaAttribute(getMtDatabase()));
    }

    public final boolean isAulaDefaultValue() {
        return isDefaultValue(getAulaAttribute(getMtDatabase()));
    }

    private static int duracionCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("duracion",CID));

    public static com.matisse.reflect.MtAttribute getDuracionAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(duracionCID);
    }

    public final int getDuracion() {
        return getInteger(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>duracion</code> attribute value.
     * @param val the new value
     *
     * @see #getDuracion
     * @see #removeDuracion
     */
    public final void setDuracion(int val) {
        setInteger(getDuracionAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>duracion</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final void removeDuracion() {
        removeValue(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final boolean isDuracionNull() {
        return isNull(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final boolean isDuracionDefaultValue() {
        return isDefaultValue(getDuracionAttribute(getMtDatabase()));
    }


    /* Attribute 'horaInicio' */

    /** Attribute <code>horaInicio</code> cache ID */
    private static int horaInicioCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("horaInicio",CID));

    /**
     * Gets the <code>horaInicio</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getHoraInicioAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(horaInicioCID);
    }


    /**
     * Gets the <code>horaInicio</code> attribute value.
     * @return the value
     *
     * @see #setHoraInicio
     * @see #removeHoraInicio
     */
    public final int getHoraInicio() {
        return getInteger(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>horaInicio</code> attribute value.
     * @param val the new value
     *
     * @see #getHoraInicio
     * @see #removeHoraInicio
     */
    public final void setHoraInicio(int val) {
        setInteger(getHoraInicioAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>horaInicio</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final void removeHoraInicio() {
        removeValue(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final boolean isHoraInicioNull() {
        return isNull(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final boolean isHoraInicioDefaultValue() {
        return isDefaultValue(getHoraInicioAttribute(getMtDatabase()));
    }


    /*
     * Relationship access methods
     */

    /* Relationship 'impartidas_por' */

    /** Relationship <code>impartidas_por</code> cache ID */
    private static int impartidas_porCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtRelationship.Loader("impartidas_por",CID));

    /**
     * Gets the <code>impartidas_por</code> relationship descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a relationship descriptor object
     */
    public static com.matisse.reflect.MtRelationship getImpartidas_porRelationship(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtRelationship)db.getCachedObject(impartidas_porCID);
    }

    /**
     * Gets the <code>impartidas_por</code> relationship's successors.
     * @return an array of objects
     *
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     */
    public final academia.PROFESORES[] getImpartidas_por() {
        return (academia.PROFESORES[])getSuccessors(getImpartidas_porRelationship(getMtDatabase()), academia.PROFESORES.class);
    }

    /**
     * Counts the <code>impartidas_por</code> relationship's successors.
     * @return the number of successors
     *
     * @see #getImpartidas_por
     * @see #impartidas_porIterator
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     */
    public final int getImpartidas_porSize() {
        return getSuccessorSize(getImpartidas_porRelationship(getMtDatabase()));
    }

    /**
     * Opens an iterator on the <code>impartidas_por</code> relationship's successors.
     * @param <E> a MtObject class     * @return an object iterator
     *
     * @see #getImpartidas_por
     * @see #getImpartidas_porSize
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     */
    public final <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> impartidas_porIterator() {
        return this.<E>successorIterator(getImpartidas_porRelationship(getMtDatabase()), academia.PROFESORES.class);
    }

    /**
     * Sets the <code>impartidas_por</code> relationship's successors.
     * @param succs an array of objects
     *
     * @see #getImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     * @see #removeImpartidas_por
     */
    public final void setImpartidas_por(academia.PROFESORES[] succs) {
        setSuccessors(getImpartidas_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Inserts one object at the beginning of the existing <code>impartidas_por</code> successors list.
     * @param succ the object to add
     *
     * @see #getImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     */
    public final void prependImpartidas_por(academia.PROFESORES succ) {
        prependSuccessor(getImpartidas_porRelationship(getMtDatabase()), succ);
    }

    /**
     * Adds one object to the end of the existing <code>impartidas_por</code> successors list.
     * @param succ the object to add
     *
     * @see #getImpartidas_por
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     */
    public final void appendImpartidas_por(academia.PROFESORES succ) {
        appendSuccessor(getImpartidas_porRelationship(getMtDatabase()), succ);
    }
    /** Adds multiple objects to the end of the existing <code>impartidas_por</code> successors list.
     * @param succs an array of objects to add
     *
     * @see #getImpartidas_por
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     */
    public final void appendImpartidas_por(academia.PROFESORES[] succs) {
        addSuccessors(getImpartidas_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes objects from the <code>impartidas_por</code> successors list.
     * @param succs an array of objects to remove
     *
     * @see #getImpartidas_por
     * @see #setImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     */
    public void removeImpartidas_por(academia.PROFESORES[] succs) {
        removeSuccessors(getImpartidas_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes one object from the <code>impartidas_por</code> successors list.
     * @param succ the object to remove
     *
     * @see #getImpartidas_por
     * @see #setImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     */
    public void removeImpartidas_por(academia.PROFESORES succ) {
        removeSuccessor(getImpartidas_porRelationship(getMtDatabase()), succ);
    }

    /**
     * Removes all <code>impartidas_por</code> successors.  When the minimum cardinality
     * is 1, a new successor must be set before commit.
     */
    public final void clearImpartidas_por() {
        clearSuccessors(getImpartidas_porRelationship(getMtDatabase()));
    }

    public CLASES(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    public java.lang.String toString() {
        return super.toString() + "[CLASES]";
    }
}
