//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;
public class GroceryStoreProgram {
    public static void main(String[] args) {

        //Meyve fiyatları için değişkenleri oluşturduk.
        //Burada meyvelerin fiyatları sabit değişkenlerdir.(örn:PI=3.14)
        //Sabitler için screaming snake case şeklinde yazıldı. > örn: HELLO_WORLD

        double PEAR_PRICE = 2.14;
        double APPLE_PRICE = 3.67;
        double TOMATOES_PRICE = 1.11;
        double BANANA_PRICE = 0.95;
        double AUBERGINE_PRICE = 5.00;

        //Meyveler için değişkenler oluşturduk.
        double pear,apple,tomatoes,banana,aubergine;

        //Toplam tutarı hesaplayacağımız değişkeni tanımlıyoruz.
        double total;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);


        //Kullanıcıdan hangi meyveyi kaç kilo aldığını soruyoruz.
        System.out.print("How many kilograms a pear ?: ");
        pear = input.nextDouble();
        System.out.print("How many kilograms a apple ?: ");
        apple = input.nextDouble();
        System.out.print("How many kilograms a tomatoes ?: ");
        tomatoes = input.nextDouble();
        System.out.print("How many kilograms a banana ?: ");
        banana = input.nextDouble();
        System.out.print("How many kilograms a aubergine ?: ");
        aubergine = input.nextDouble();

        //Toplam tutarı hesaplayıp. Bunu total değişkenine atıyoruz.
        total = (( pear * PEAR_PRICE) + (apple * APPLE_PRICE) + (tomatoes * TOMATOES_PRICE) + (banana * BANANA_PRICE) + (aubergine * AUBERGINE_PRICE));

        //yukarıdaki gibi sabit değişken olarak yapmadan bu şekilde de toplam tutar bulunabilir.
        //total = (2.14*pear)+(3.67*apple)+(1.11*tomatoes)+(0.95*banana)+(5.00*aubergine);

        //Toplam tutarı ekrana yazdırıyoruz.
        System.out.println("The Total Amount: " + total + " " + "TL");

    }
}