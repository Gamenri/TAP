package RFC;

public class Registro {
    private String
            Nombres,
            Apellido1,
            Apellido2;
    private int
            DD,
            MM,
            AAAA;
    private String RFC;

    public Registro() {
        RFC = "";
    }

    public Registro(String nombres, String apellido1, String apellido2, int DD, int MM, int AAAA) {
        Nombres = nombres;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
        this.DD = DD;
        this.MM = MM;
        this.AAAA = AAAA;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres.toUpperCase();
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1.toUpperCase();
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2.toUpperCase();
    }

    public int getDD() {
        return DD;
    }

    public void setDD(int DD) {
        this.DD = DD;
    }

    public int getMM() {
        return MM;
    }

    public void setMM(int MM) {
        this.MM = MM;
    }

    public int getAAAA() {
        return AAAA;
    }

    public void setAAAA(int AAAA) {
        this.AAAA = AAAA;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String CalcularRFC(){
        RFC = "";
        RFC += Apellido1.charAt(0);
        RFC += Apellido1.toUpperCase().charAt(1);
        RFC += Apellido2.charAt(0);
        RFC += Nombres.charAt(0);
        RFC += String.valueOf(AAAA).charAt(String.valueOf(AAAA).length()-2);
        RFC += String.valueOf(AAAA).charAt(String.valueOf(AAAA).length()-1);
        if (MM < 10) {
            RFC += "0";
            RFC += MM;
        } else {
            RFC += String.valueOf(MM);
        }
        if (DD < 10) {
            RFC += "0";
            RFC += DD;
        } else {
            RFC += String.valueOf(DD);
        }
        RFC += "1H0";
        return RFC;
    }
}
