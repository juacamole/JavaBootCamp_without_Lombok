package Map;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;

public class Apotheke {
    Map<String, String> medication = new HashMap();

    private final int count = medication.size();

    public int getCount() {
        return count;
    }

    public void save(Map<String, String> medication) {
        this.medication = medication;
    }
    String find(String medicationName){

        return(medicationName);
    }
    void delete(String medicationName){
        medication.remove(medicationName);
    }
    }

