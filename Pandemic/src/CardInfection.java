import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class CardInfection {
    int pandemicLevel = 5; //SKAL ÆNDRES TIL INPUT FRA BRUGER
    ArrayList<String> CardInfections = new ArrayList<>();
    ArrayList<String> CardInfectionsShuffler = new ArrayList<>();

    public void startNewGame() {
        newGameCardShuffle();
    }

    public void newGameCardShuffle() {
        deleteSQLinfections(); //clear columns for new input
        readInfectionsFromFile(); //get infection cities from .txt and put in List
        putPandemicCardInArray();
        readFromArrayPutInSQL(); //loop List and put in SQL DB
        cardToArrayAndShuffleBack(); //take used card, put in list and shuffle then put back in SQL
        countCardRowSQL();
    }

    public void putPandemicCardInArray() {

        for (int i = 0; i < pandemicLevel; i++) {
            CardInfections.add("PANDEMIC");
        }
    }


    public void cardToArrayAndShuffleBack() { //SKAL SÆTTES OP TIL BRUGTE KORT OG IKKE HELE SQL-LISTEN evt. alternativt 2 arraylister
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bttest", "root", "xxx");
            String query = "SELECT teamname FROM teamshuffle";
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                String teamname = rs.getString(1);
                CardInfectionsShuffler.add(teamname);
            }
            PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO teamtable (teamid, teamname) values (?, ?)");
            for (int i = 0; i < CardInfections.size(); i++) {
                int max = 48 + pandemicLevel - i;
                int min = 0;
                int b = (int) (Math.random() * (max - min));
                preparedStatement.setInt(1, i + 1);
                preparedStatement.setString(2, CardInfectionsShuffler.get(b));
                preparedStatement.executeUpdate();
                CardInfectionsShuffler.remove(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void readFromArrayPutInSQL() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bttest", "root", "xxx");
            PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO teamshuffle (teamid, teamname) values (?, ?)");
            for (int i = 0; i < CardInfections.size(); i++) {
                preparedStatement.setInt(1, i + 1);
                preparedStatement.setString(2, CardInfections.get(i));
                preparedStatement.executeUpdate();
            }
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void readInfectionsFromFile() {
        String cityInfected;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/infectedcity.txt"));
            while ((cityInfected = br.readLine()) != null) {
                CardInfections.add(cityInfected);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    public void deleteSQLinfections() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bttest", "root", "xxx");
            String deleteCardInfection = "TRUNCATE teamshuffle"; //Delete all

            Statement statement = connect.createStatement();
            statement.executeUpdate(deleteCardInfection);

            String deleteCardInfectionShuffler = "TRUNCATE teamtable"; //Delete all
            statement.executeUpdate(deleteCardInfectionShuffler);

            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void countCardRowSQL() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bttest", "root", "xxx");
            Statement statement = connect.createStatement();
            String rowCount = "SELECT COUNT(*) FROM teamshuffle";
            String query = "select count(*) from teamshuffle"; //get the number of rows
            ResultSet rs = statement.executeQuery(query); //
            rs.next();
            int count = rs.getInt(1);
            System.out.println("Number of cards : " + count);
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
