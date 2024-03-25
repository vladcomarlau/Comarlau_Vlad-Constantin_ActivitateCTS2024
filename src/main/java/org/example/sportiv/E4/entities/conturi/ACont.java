package org.example.sportiv.E4.entities.conturi;

import java.util.ArrayList;

public abstract class ACont implements Cloneable{
    private int id;
    protected String numeDetinator;
    protected String tipCont;
    protected ArrayList<String> listaBileteCumparate;
    public void adaugareBilet(String codBilet) {
        this.listaBileteCumparate.add(codBilet);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeDetinator() {
        return numeDetinator;
    }

    public void setNumeDetinator(String numeDetinator) {
        this.numeDetinator = numeDetinator;
    }

    public ArrayList<String> getListaBileteCumparate() {
        return listaBileteCumparate;
    }

    @Override
    public String toString() {
        return "ACont{" +
                "id='" + id + '\'' +
                ", numeDetinator='" + numeDetinator + '\'' +
                ", tipCont='" + tipCont + '\'' +
                ", listaBileteCumparate=" + listaBileteCumparate +
                '}';
    }

    @Override
    public ACont clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (ACont) clone;
    }
}
