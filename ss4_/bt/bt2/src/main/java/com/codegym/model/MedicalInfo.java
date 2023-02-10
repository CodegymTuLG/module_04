package com.codegym.model;

public class MedicalInfo {
    private String Name;
    private String birthYear;
    private boolean sex;
    private String country;
    private String cardId;
    private String transport;
    private boolean sot;
    private boolean ho;
    private boolean khotho;
    private boolean dauhong;

    public MedicalInfo() {
    }

    public MedicalInfo(String name, String birthYear, boolean sex, String country, String cardId, String transport, boolean sot, boolean ho, boolean khotho, boolean dauhong) {
        Name = name;
        this.birthYear = birthYear;
        this.sex = sex;
        this.country = country;
        this.cardId = cardId;
        this.transport = transport;
        this.sot = sot;
        this.ho = ho;
        this.khotho = khotho;
        this.dauhong = dauhong;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public boolean isSot() {
        return sot;
    }

    public void setSot(boolean sot) {
        this.sot = sot;
    }

    public boolean isHo() {
        return ho;
    }

    public void setHo(boolean ho) {
        this.ho = ho;
    }

    public boolean isKhotho() {
        return khotho;
    }

    public void setKhotho(boolean khotho) {
        this.khotho = khotho;
    }

    public boolean isDauhong() {
        return dauhong;
    }

    public void setDauhong(boolean dauhong) {
        this.dauhong = dauhong;
    }
}
