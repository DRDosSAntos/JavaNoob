package jdbc;

import jdbc.author.Name;

public class Author {
    private String id;
    private String address;
    private Name name;

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
//                ", name=" + name +
                '}';
    }
}
