import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a birth day..:");
        int birthDay = scanner.nextInt();

        System.out.print("Enter a birth month..:");
        int birthMonth = scanner.nextInt();



        String horoscope = (birthMonth==12 && birthDay>=22 || birthMonth==1 && birthDay<=21) ? "Oğlak"
                : (birthMonth==1 && birthDay>=22 || birthMonth==2 && birthDay<=19) ? "Kova"
                : (birthMonth==2 && birthDay>=20 || birthMonth==3 && birthDay<=21) ? "Balık"
                : (birthMonth==3 && birthDay>=21 || birthMonth==4 && birthDay<=20) ? "Koç"
                : (birthMonth==4 && birthDay>=21 || birthMonth==5 && birthDay<=21) ? "Boğa"
                : (birthMonth==5 && birthDay>=21 || birthMonth==6 && birthDay<=21) ? "İkizler"
                : (birthMonth==6 && birthDay>=21 || birthMonth==7 && birthDay<=21) ? "Yengeç"
                : (birthMonth==7 && birthDay>=21 || birthMonth==8 && birthDay<=21) ? "Aslan"
                : (birthMonth==8 && birthDay>=21 || birthMonth==9 && birthDay<=21) ? "Başak"
                : (birthMonth==9 && birthDay>=21 || birthMonth==10 && birthDay<=21) ? "Terazi"
                : (birthMonth==10 && birthDay>=21 || birthMonth==11 && birthDay<=21) ? "Akrep"
                : "Yay";

        System.out.println("Your Horoscope ..:" + horoscope);
    }
}
