package tourism_agency.Model;

import tourism_agency.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoomFeatures {

    public int id;
    public  int hotel_id;
    public String features;

    public static ArrayList<RoomFeatures> getRoomFeatures(int room_id){
        ArrayList<RoomFeatures> roomFeatures = new ArrayList<>();
        String query = "SELECT r.features FROM room_features AS r " +
                "INNER JOIN room " +
                "ON room.id = r.room_id " +
                "WHERE r.room_id = ? ";
        RoomFeatures feature;
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1,room_id);
            ResultSet rs = pr.executeQuery();
            while (rs.next()){
                feature = new RoomFeatures();
                feature.setFeatures(rs.getString("features"));
                roomFeatures.add(feature);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return roomFeatures;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
