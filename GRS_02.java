import java.util.Scanner;
public class Bleach {
    public static void main (String [] args){
        Scanner inp = new Scanner (System.in);
        System.out.println("Rukia Kuchiki Bankai = 1");
        System.out.println("Byakuya Kuchiki Bankai = 2");
        System.out.println("Ichigo Kurosaki Bankai = 3");
        System.out.println("Tōshirō Hitsugaya Bankai = 4");
        System.out.println("Kyoraku Shunsui Bankai = 5");
        System.out.println("Genryusai Shigekuni Yamamoto Bankai = 6");
        System.out.println("Renji Abarai Bankai = 7");
        System.out.println("Sajin Komamura Bankai = 8");
        System.out.println("Mayuri Kurotsuchi Bankai = 9");
        System.out.println("Retsu Unohana Bankai = 10");
        System.out.print("Bankai: ");
        int bankai = inp.nextInt();
        if (bankai == 1){
            System.out.println("Hakkano Thogame\nCensure of the white haze");
        }
        else if (bankai == 2){
            System.out.println("Senbonzakura Kageyoshi\nVibrant Scape of a Thousand Cherry Blossoms");
        }
        else if (bankai == 3) {
            System.out.println("Tensa Zangetsu\nHeaven Chain Slaying Moon");
        }
        else if (bankai == 4) {
            System.out.println("Daiguren Hyorinmaru\nGreat Roaring Coldly Shining Moon");
        }
        else if (bankai == 5) {
            System.out.println("Katen Kyokotsu Karamatsu Shinju\nThe Love of Suicide");
        }
        else if (bankai == 6) {
            System.out.println("Zanka no Tachi\nLongsword of the Remnant Flame");
        }
        else if (bankai == 7) {
            System.out.println("Hihiō Zabimaru\nBaboon King Snake Tail");
        }
        else if (bankai == 8) {
            System.out.println("Kokujō Tengen Myō'ō\nHeavenly Punishment of Kokujō's King\nBlack Ropes of Ruination");
        }
        else if (bankai == 9) {
            System.out.println("Konjiki Ashisogi Jizō\nGold Animal killing Ksitigarbha");
        }
        else if (bankai == 10) {
            System.out.println("Minazuki\nAll Things' End");
        }
    }
}
