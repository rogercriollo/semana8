package semana8;

public class CorrienteextendsCuenta {
    private int nroMaxCheques;
    private SecuencialCheque secuencialCh;

    public void Corriente(double saldo, String numero) {

        super(saldo, numero);
    }

    public int getNroMaxCheques() {

        return nroMaxCheques;
    }

    public void setNroMaxCheques(int nroMaxCheques) {

        this.nroMaxCheques = nroMaxCheques;
    }

    public SecuencialCheque getSecuencialCh() {

        return secuencialCh;
    }

    public void setSecuencialCh(SecuencialCheque secuencialCh) {

        this.secuencialCh = secuencialCh;
    }
}

