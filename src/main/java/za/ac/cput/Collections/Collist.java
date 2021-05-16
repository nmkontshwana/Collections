package za.ac.cput.Collections;

public class Collist {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String id, name;


    @Override
    public String toString() {
        return "Collist{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

