package org.geekhub.snippets.lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * More at <a href='https://www.geeksforgeeks.org/understanding-outofmemoryerror-exception-java/'>Understanding OutOfMemoryError Exception</a>.
 */
public class OutOfMemoryErrorExample {

    /**
     * Run with `java -Xmx100m -XX:+UseParallelGC`.
     *
     * @param args program args
     */
    public static void main(String[] args) {
        Map m = new HashMap();
        m = System.getProperties();
        Random r = new Random();
        while (true) {
            m.put(r.nextInt(), "randomValue");
        }
    }
}
