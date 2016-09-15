package py.ande.sigedif;

/**
 * Created by asu05894 on 15/9/2016.
 */
public class DataBaseManager {
    public static final String TABLE_NAME="itinerario1";
    public static final String CN_NIS="nis";
    public static final String CN_X="cordX";
    public static final String CN_Y="coordY";
    public static final String CN_DATE="fechaen";
    public static final String CN_HOUR="horaen";
    public static final String CN_LAT="coordLAT";
    public static final String CN_LON="coordLON";
    public static final String CN_LATen="coordLATen";
    public static final String CN_LONen="coordLONen";

    public static final String CREATE_TABLE= " create table " +TABLE_NAME+ " ("
            + CN_NIS + " integer primary key, "
            + CN_X + " integer, "
            + CN_Y + " integer, "
            + CN_DATE + " date, "
            + CN_HOUR + " time, "
            + CN_LAT + " long, "
            + CN_LON + " long, "
            + CN_LATen + " long, "
            + CN_LONen + " long);";

}
