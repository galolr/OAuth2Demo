package demo.entity;

/**
 * Created by gersomlopez on 7/22/14.
 */
public class Dummy {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dummy(){}


    public Dummy(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
