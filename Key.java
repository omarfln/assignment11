package prob1;

import java.util.Objects;

public class Key {
    private String firstName;
    private String lastName;
    //private int hashCode;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        //this.hashCode = Objects.hash(firstName,lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return  Objects.equals(firstName, key.firstName) && Objects.equals(lastName, key.lastName);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + Objects.hashCode(firstName);
        hash = 31 * hash + Objects.hashCode(lastName);
        return  hash;
    }
}
