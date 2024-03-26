package org.example.banca.D9.repository;

public interface IFiliala {
    void stergeNod(IFiliala filiala) throws Exception;
    void adaugaNod(IFiliala filiala) throws Exception;
    IFiliala getNod(int index) throws Exception;
    void descriere(int level);
}
