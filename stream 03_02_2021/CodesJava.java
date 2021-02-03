package codesjava;

import static codesjava.Funs.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CodesJava {

    public static void main(String[] args) throws Exception {
		
        List<String> lst = List.of("qq", "ww", "qqqqqqqq", "eee");

        System.out.println(
                new Potok<>(lst)
                        .filter(x -> x.length() > 5)
                        .map(x -> x.length())
                        .map(x -> Arrays.asList(x))
                        .reduce(new ArrayList<Integer>(), (x, y) ->{x.addAll(y);return x;})
        );
    }
}
