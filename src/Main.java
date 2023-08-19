import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Burç Bulma Aracı ");

        int day, month;
        String burc = "";
        boolean isError = false;

        Scanner imp = new Scanner(System.in);
        System.out.print("Kaçıncı ayda doğdunuz : ");
        month = imp.nextInt();
        System.out.print("Ayın kaçında doğdunuz : ");
        day = imp.nextInt();
        if ((month < 13) && (month > 0)) {
            if (month == 1) {
                if ((day >= 1) && (day < 32)) {
                    if (day <= 21) {
                        burc = "Burcunuz : Oğlak ";
                    } else {
                        burc = "Burcunuz : Kova ";
                    }
                } else
                    isError = true;
            } else if (month == 2) {
                if (((day >= 1) && (day < 29))) {
                    if (day <= 19) {
                        burc = "Burcunuz : Kova ";
                    } else {
                        burc = "Burcunuz : Balık ";
                    }
                } else isError = true;

            } else if (month == 3) {
                if (((day >= 1) && (day < 32))) {
                    if (day <= 20) {
                        burc = "Burcunuz : Balık ";
                    } else {
                        burc = "Burcunuz : Koç ";
                    }
                } else isError = true;
            } else if (month == 4) {
                if (((day >= 1) && (day < 31))) {
                    if (day <= 20) {
                        burc = "Burcunuz : Koç ";
                    } else {
                        burc = "Burcunuz : Boğa ";
                    }
                } else isError = true;
            } else if (month == 5) {
                if (((day >= 1) && (day < 32))) {
                    if (day <= 21) {
                        burc = ("Burcunuz : Boğa ");
                    } else {
                        burc = "Burcunuz : İkizler ";
                    }
                } else isError = true;
            } else if (month == 6) {
                if (((day >= 1) && (day < 31))) {
                    if (day <= 22) {
                        burc = "Burcunuz : İkizler ";
                    } else {
                        burc = "Burcunuz : Yengeç ";
                    }
                } else isError = true;
            } else if (month == 7) {
                if (((day >= 1) && (day < 32))) {
                    if (day <= 22) {
                        burc = "Burcunuz : Yengeç ";
                    } else {
                        burc = "Burcunuz : Aslan ";
                    }
                } else isError = true;
            } else if (month == 8) {
                if ((day >= 1) && (day < 32)) {
                    if (day <= 22) {
                        burc = "Burcunuz : Aslan";
                    } else {
                        burc = "Burcunuz : Başak ";
                    }
                } else isError = true;
            } else if (month == 9) {
                if (((day >= 1) && (day < 31))) {
                    if (day <= 22) {
                        burc = "Burcunuz : Başak ";
                    } else {
                        burc = "Burcunuz : Terazi ";
                    }
                } else isError = true;
            } else if (month == 10) {
                if (((day >= 1) && (day < 32))) {
                    if (day <= 22) {
                        burc = "Burcunuz : Terazi ";
                    } else {
                        burc = "Burcunuz : Akrep ";
                    }
                } else isError = true;
            } else if (month == 11) {
                if (((day >= 1) && (day < 31))) {
                    if (day <= 21) {
                        burc = "Burcunuz : Akrep";
                    } else {
                        burc = "Burcunuz : Yay ";
                    }
                } else isError = true;
            } else {
                if (((day >= 1) && (day < 32))) {
                    if (day <= 21) {
                        burc = "Burcunuz : Yay ";
                    } else {
                        burc = "Burcunuz : Oğlak ";
                    }
                } else isError = true;
            }
        }else isError=true;
        if (isError) {
            System.out.print("Doğum tarihinizi yanlış girdiniz.Tekrar deneyiniz.");
        }else {
            System.out.print(burc);
        }
    }
}