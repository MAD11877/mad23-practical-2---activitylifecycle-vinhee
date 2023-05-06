public class User {

    public String Name = "0";
    public String Description = "0";
    public int Id = 0;
    public Boolean Followed = true;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Boolean getFollowed() {
        return Followed;
    }

    public void setFollowed(Boolean followed) {
        Followed = followed;
    }
}
