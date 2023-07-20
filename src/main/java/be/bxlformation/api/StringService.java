package be.bxlformation.api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StringService {

    private final List<String> strings= new ArrayList<>(
            List.of("michou",
            "toto",
            "louise")
    );
    public String toUppercase(String input) {
        return input.toUpperCase();
    }
    public String get(int index){
        return strings.get(index);
    }

    public void add(int index,String element){
        strings.add(index,element);
    }
}
