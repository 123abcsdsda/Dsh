package src.com.dsh;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String get(){
        return this.getClass().getResource("").getPath().substring(0, this.getClass().getResource("").getPath().indexOf("com"));
    }
}
