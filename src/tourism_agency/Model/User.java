package tourism_agency.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tourism_agency.Helper.DBConnector;
import tourism_agency.Helper.Helper;

public class User {

    public static   int id ;
    private   String name;
    private   String username;
    private   String password;
    private  String type;

    public User(){}

    public User(String name, String username, String password, String type) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public static boolean add(String name, String username, String password,String type) {

        String query = "INSERT INTO user (name,username,password,type) VALUES (?,?,?,?)";
        User findUser = User.getFetch(username);
        if (findUser != null){
            Helper.showMsg("This username has already in use !");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,name);
            pr.setString(2,username);
            pr.setString(3,password);
            pr.setString(4,type);

            int response = pr.executeUpdate();
            if (response==-1){
                Helper.showMsg("error");
            }
            return response !=-1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return true;

    }

    public static User getFetch(String username,String password){
        User obj = null;
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(sql);
            pr.setString(1,username);
            pr.setString(2,password);
            ResultSet rs = pr.executeQuery();
            if (rs.next()){
                switch (rs.getString("type")){
                    case "admin":
                        obj = new Admin();
                        break;
                    default:
                        obj = new User();
                }
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setType(rs.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  obj;
    }
    public static User getFetch(String username){
        User obj = null;
        String sql = "SELECT * FROM user WHERE username = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(sql);
            pr.setString(1,username);
            ResultSet rs = pr.executeQuery();
            if (rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setType(rs.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  obj;
    }
    public static ArrayList<User> getList(){
        ArrayList<User> userList = new ArrayList<>();
        String query = "SELECT * FROM user";
        User obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setType(rs.getString("type"));
                userList.add(obj);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

}
