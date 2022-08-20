package Studies;

import java.io.*;
import java.util.*;
import java.security.*;
//хеширование строки в формат MD5
public class Test58 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(input.nextLine().getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();
    }
}