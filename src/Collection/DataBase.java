package Collection;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private final Map<String, Employee> map = new HashMap<>();

    public void create(Employee record){
        map.put(record.id, record);
    }

    public Employee read(String id) {
        return map.get(id);
    }

    public void update(Employee record){
        map.put(record.id, record);
    }

    public void delete(Employee record){
        map.remove(record.id);
    }

    public void delete(String id){
        map.remove(id);
    }
}

class Employee{
    String id;
    String firstName;
    String lastName;
    String birthDay;
    public Employee(String id, String firstName ,String lastName ,String birthDay) {
        this.id = id;
        this. firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }
}