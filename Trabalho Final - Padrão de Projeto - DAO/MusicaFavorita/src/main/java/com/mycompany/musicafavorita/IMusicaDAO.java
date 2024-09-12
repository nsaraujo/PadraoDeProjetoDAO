/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicafavorita;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55649
 */
/*public class IMusicaDAO implements MusicaDAO {
    private Connection connection;

    public IMusicaDAO() {
        connection = DatabaseConnection.getConnection();
    }

    @Override
    public void addMusic(Musica music) {
        String sql = "INSERT INTO music (title, artist, save_count) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, music.getTitle());
            stmt.setString(2, music.getArtist());
            stmt.setInt(3, music.getSaveCount());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Musica getMusicByTitle(String title) {
        String sql = "SELECT * FROM music WHERE title = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, title);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Musica music = new Musica(rs.getString("title"), rs.getString("artist"));
                music.incrementSaveCount();
                return music;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Musica> getAllMusic() {
        List<Musica> musicList = new ArrayList<>();
        String sql = "SELECT * FROM music";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Musica music = new Musica(rs.getString("title"), rs.getString("artist"));
                music.incrementSaveCount();
                musicList.add(music);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return musicList;
    }

    @Override
    public void incrementSaveCount(String title) {
        String sql = "UPDATE music SET save_count = save_count + 1 WHERE title = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, title);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


*/