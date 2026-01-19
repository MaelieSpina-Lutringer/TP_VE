package fr.btsciel;

import java.sql.*;

public class GestionDesVE {

    private Connection connexion;

    public GestionDesVE() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/1BDD",
                    "root",
                    "root"
            );
            System.out.println("Connexion à la base établie !");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC introuvable", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erreur de connexion SQL", e);
        }
    }

    private void checkConnection() {
        if (connexion == null) {
            throw new RuntimeException("Connexion non initialisée !");
        }
    }

    public void afficherToutesLesVoitures() throws SQLException {
        checkConnection();
        String sql = "SELECT * FROM voiture_electrique";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("marque") + " | " +
                                rs.getString("modele") + " | " +
                                rs.getInt("vente")
                );
            }
        }
    }

    public void classementParVentes() throws SQLException {
        checkConnection();
        String sql = "SELECT * FROM voiture_electrique ORDER BY vente DESC";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getString("marque") + " " +
                                rs.getString("modele") + " : " +
                                rs.getInt("vente")
                );
            }
        }
    }

    public void modelesParLettre(char lettre) throws SQLException {
        checkConnection();
        String sql = "SELECT modele FROM voiture_electrique WHERE modele LIKE ?";
        try (PreparedStatement pst = connexion.prepareStatement(sql)) {
            pst.setString(1, lettre + "%");
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString("modele"));
                }
            }
        }
    }

    public void voituresPlusDe10000Ventes() throws SQLException {
        checkConnection();
        String sql = "SELECT * FROM voiture_electrique WHERE vente > 10000";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getString("marque") + " " +
                                rs.getString("modele")
                );
            }
        }
    }

    public void triParMarqueEtModele() throws SQLException {
        checkConnection();
        String sql = "SELECT * FROM voiture_electrique ORDER BY marque, modele";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getString("marque") + " " +
                                rs.getString("modele")
                );
            }
        }
    }

    public void nombreTotalVentes() throws SQLException {
        checkConnection();
        String sql = "SELECT SUM(vente) AS total FROM voiture_electrique";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                System.out.println("Total des ventes : " + rs.getInt("total"));
            }
        }
    }

    public void nombreTotalLignes() throws SQLException {
        checkConnection();
        String sql = "SELECT COUNT(*) AS nb FROM voiture_electrique";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                System.out.println("Nombre de lignes : " + rs.getInt("nb"));
            }
        }
    }

    public void ventesEntre10000Et15000() throws SQLException {
        checkConnection();
        String sql = "SELECT * FROM voiture_electrique WHERE vente BETWEEN 10000 AND 15000";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getString("marque") + " " +
                                rs.getString("modele")
                );
            }
        }
    }

    public void marquesContenantLettre(char lettre) throws SQLException {
        checkConnection();
        String sql = "SELECT DISTINCT marque FROM voiture_electrique WHERE marque LIKE ?";
        try (PreparedStatement pst = connexion.prepareStatement(sql)) {
            pst.setString(1, "%" + lettre + "%");
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString("marque"));
                }
            }
        }
    }

    public void listeMarquesSansDoublons() throws SQLException {
        checkConnection();
        String sql = "SELECT DISTINCT marque FROM voiture_electrique";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString("marque"));
            }
        }
    }

    public void voitureLaPlusVendue() throws SQLException {
        checkConnection();
        String sql = "SELECT * FROM voiture_electrique ORDER BY vente DESC LIMIT 1";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                System.out.println(
                        rs.getString("marque") + " " +
                                rs.getString("modele") + " : " +
                                rs.getInt("vente")
                );
            }
        }
    }

    public void top3Ventes() throws SQLException {
        checkConnection();
        String sql = "SELECT * FROM voiture_electrique ORDER BY vente DESC LIMIT 3";
        try (PreparedStatement pst = connexion.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getString("marque") + " " +
                                rs.getString("modele") + " : " +
                                rs.getInt("vente")
                );
            }
        }
    }
}
