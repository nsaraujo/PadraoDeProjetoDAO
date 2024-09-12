/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicafavorita;

/**
 *
 * @author 55649
 */
import java.util.List;

public interface MusicaDAO {
    void addMusic(Musica music);
    Musica getMusicByTitle(String title);
    List<Musica> getAllMusic();
    void incrementSaveCount(String title);
}
