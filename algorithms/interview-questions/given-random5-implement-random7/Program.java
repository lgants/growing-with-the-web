import java.util.Random;

public class Program {
    public static void main(String[] args) {
    }
    
    public static int random5() {
        return new Random().nextInt(5) + 1;
    }

    public static int random7() {
        int val = random5() * 5 + random5();
        return val > 21 ? random7() : val % 7 + 1;
    }
}
