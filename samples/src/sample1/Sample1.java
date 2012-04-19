package sample1;

import java.io.File;

/**
 * A simple sample that ignores an {@link java.io.IOException}.
 */
public class Sample1 {
    /**
     * Performs an operation that throws an {@link java.io.IOException}.
     */
    public void performIOOperation() {
        File file = File.createTempFile("temp", ".tmp");

        try {
            System.out.println("Can read? " + file.canRead());
        } finally {
            file.delete();
        }
    }
}