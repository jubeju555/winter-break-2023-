import java.util.Scanner;

class sockSize {
    public static void main(String[] args) {
        int shoeSize = 8;

        switch (shoeSize) {
            case 6:
            case 7:
                System.out.println("Size: extra small");
                break;
            case 8:
            case 9:
                System.out.println("Size: small");
                break;
            case 10:
            case 11:
                System.out.println("Size: medium");
                break;
            case 12:
            case 13:
            case 14:
                System.out.println("Size: large");
                break;
            default:
                System.out.println("Cannot determine size");
        }
    }
}
