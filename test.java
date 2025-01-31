import java.util.*;

public class file{
    public static void main(String[] args) {
        List<Students> students = List.of(
            new Students(22, "Alex" ),
            new Students(45, "John Wick")
        );
    }
}

record Students(int id , String name ){

} 
