public class SongJava {
    
    public static void main(String[] args) throws InterruptedException {
        printLyrics();
    }

    public static void printLyrics() throws InterruptedException {

        String[] lyrics = {
            "meri Banoge Kya meri Rahoge Kya",
            "Puchhe Dil mera Tumse Yahi",
            "Meri Banoge Kya meri Rahoge Kya",
            "Ab toh addat laga Hai Tera.."
        };

        double[] delays = {1.0, 0.8, 1.1, 1.2}; // delays for each line

        System.out.println("Meri Banoge Kya....\n");

        for (int i = 0; i < lyrics.length; i++) {
            for (char c : lyrics[i].toCharArray()) {
                System.out.print(c);
                Thread.sleep(100); // typing effect
            }
            System.out.println();
            Thread.sleep((long)(delays[i] * 1000)); // delay after each line
        }
    }
}