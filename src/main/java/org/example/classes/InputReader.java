package org.example.classes;

import java.util.Scanner;

/**
 * The type Input reader.
 */
public class InputReader {
    private Scanner scanner;

    /**
     * Instantiates a new Input reader.
     */
    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public String readLine() {
        return scanner.nextLine();
    }

    /**
     * Read int int.
     *
     * @return the int
     */
    public int readInt() {
        return scanner.nextInt();
    }

    /**
     * Read double double.
     *
     * @return the double
     */
    public double readDouble() {
        return scanner.nextDouble();
    }

    /**
     * Read boolean boolean.
     *
     * @return the boolean
     */
    public boolean readBoolean() {
        return scanner.nextBoolean();
    }

    /**
     * Close.
     */
    public void close() {
        scanner.close();
    }

}
