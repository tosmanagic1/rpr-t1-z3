package ba.unsa.etf.rpr;

public class Sat {
    private  int sekunde;
    private  int sati;
    private  int minute;

    public Sat(int sati, int minute, int sekunde) {
        this.setSati(sati);
        this.setMinute(minute);
        this.setSekunde(sekunde);
    }
    void   Postavi(int sati, int minute, int sekunde) {
        this.setSati(sati);
        this.setMinute(minute);
        this.setSekunde(sekunde);
    }
    public  void Sljedeci() {
        setSekunde(getSekunde() + 1);
        if (getSekunde() == 60) {
            setSekunde(0);
            setMinute(getMinute() + 1);
        }
        if (getMinute() == 60) {
            setMinute(0);
            setSati(getSati() + 1);
        }
        if (getSati() == 24) setSati(0);
    }
    public  void Prethodni() {
        setSekunde(getSekunde() - 1);
        if (getSekunde() == -1) {
            setSekunde(59);
            setMinute(getMinute() - 1);
        }
        if (getMinute() == -1) {
            setMinute(59);
            setSati(getSati() - 1);
        }
        if (getSati() == -1) setSati(23);
    }

    public void PomjeriZa(int pomak) {
        if (pomak > 0) for (int i = 0; i < pomak; i++) Sljedeci();
        else for (int i = 0; i < -pomak; i++) Prethodni();
    }
    public  void Ispisi() {
        System.out.printf("%d:%d:%d\n", getSati(), getMinute(), getSekunde());
    }


    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }


}