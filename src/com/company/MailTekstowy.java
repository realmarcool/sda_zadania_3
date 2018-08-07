package com.company;

public class MailTekstowy extends Mail {
    private String trescMailaTxt;

    @Override
    public String toString() {
        return "MailTekstowy{" +
                "adres='" + adresMailaOdbiorcy + '\'' +
                ", temat='" + tematMaila + '\'' +
                ", tresc='" + trescMailaTxt + '\'' +

                '}';
    }

    public String getTrescMailaTxt() {
        return trescMailaTxt;
    }

    public void setTrescMailaTxt(String trescMailaTxt) {
        this.trescMailaTxt = trescMailaTxt;
    }
}
