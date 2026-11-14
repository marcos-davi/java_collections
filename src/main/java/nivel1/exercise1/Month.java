package nivel1.exercise1;

import java.util.ArrayList;
import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Month month = (Month) obj;
        return name.equals(month.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
