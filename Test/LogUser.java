package Test;

import java.util.Date;
import java.util.Objects;

public class LogUser {

    private String name;
    private Date date;

    public LogUser(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogUser logUser = (LogUser) o;
        return Objects.equals(name, logUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
