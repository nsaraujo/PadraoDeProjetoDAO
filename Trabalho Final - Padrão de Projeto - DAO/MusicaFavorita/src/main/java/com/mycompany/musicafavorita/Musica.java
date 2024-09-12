/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicafavorita;

/**
 *
 * @author 55649
 */
public class Musica {
    private String title;
    private String artist;
    private int saveCount;

    public Musica(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.saveCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSaveCount() {
        return saveCount;
    }

    public void incrementSaveCount() {
        this.saveCount++;
    }
}

