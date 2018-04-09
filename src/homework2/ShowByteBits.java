import java.util.Scanner;
public class ShowByteBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte bv = sc.nextByte();
        System.out.printf("%d", (bv & 0x80) >> 7);
        System.out.printf("%d", (bv & 0x40) >> 6);
        System.out.printf("%d", (bv & 0x20) >> 5);
        System.out.printf("%d", (bv & 0x10) >> 4);
        System.out.printf("%d", (bv & 0x08) >> 3);
        System.out.printf("%d", (bv & 0x04) >> 2);
        System.out.printf("%d", (bv & 0x02) >> 1);
        System.out.printf("%d", (bv & 0x01));
    }
}
