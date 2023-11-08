package tourism_agency.Model;

public class RoomTableDto {

    public int id;
    public  String name;
    public  String city;
    public  String region;
    public  String pension;
    public  String season_type;
    public  int adult_price;
    public  int child_price;

    public RoomTableDto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public String getSeason_type() {
        return season_type;
    }

    public void setSeason_type(String season_type) {
        this.season_type = season_type;
    }

    public int getAdult_price() {
        return adult_price;
    }

    public void setAdult_price(int adult_price) {
        this.adult_price = adult_price;
    }

    public int getChild_price() {
        return child_price;
    }

    public void setChild_price(int child_price) {
        this.child_price = child_price;
    }
}
