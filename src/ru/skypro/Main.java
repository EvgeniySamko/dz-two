package ru.skypro;

import org.w3c.dom.ls.LSOutput;
class Variables{
    byte a = 85;
    short b = 300;
    int c = 1000;
    long d = 100000000L;
    float e = 2.56f;
    double f = 35.4;
};

public class Main {
    public static void main(String[] args) {

        float BoxerOne = 78.2f;
        float BoxerTwo = 82.7f;

        float TotalWeight = (BoxerOne + BoxerTwo);


        System.out.println("Вес боксеров "+TotalWeight+" КГ");

        byte Banana = 5;
        int Milk = 200;                          // В миллилитрах
        byte IceCream = 2;
        byte Egg = 4;

        int BananaWeight = 80;            //Вес в граммах за одну единицу
        int MilkWeight = 105;             //Вес за 100 грамм
        int IceCreamWeight = 100;         //Вес в граммах за одну единицу
        int EggWeight = 70;               //Вес в граммах за одну единицу

        int BananaWeightGeneral = Banana * BananaWeight;
        int MilkWeightGeneral = (Milk / 100)*MilkWeight;
        int IceCreamWeightGeneral = IceCream*IceCreamWeight;
        int EggWeightGeneral = Egg*EggWeight;

        int TotalWeightProducts = BananaWeightGeneral+MilkWeightGeneral+IceCreamWeightGeneral+EggWeightGeneral;


        System.out.println("Общий вес продуктов " +TotalWeightProducts+ " Грамм");

        float weightInKg = TotalWeightProducts / 1000.0f;


        System.out.println("Общий вес продуктов " +weightInKg+ " КГ");


       int LoseWeight = 7;

       int GramsDay1 = 250;
       int GramsDay2 = 500;

       int LoseWeightGram = LoseWeight*1000;

       int WeightLossDays1 = LoseWeightGram/GramsDay1;
       int WeightLossDays2 = LoseWeightGram/GramsDay2;

        System.out.println(" Дней для похудения " +WeightLossDays1 );
        System.out.println(" Дней для похудения " +WeightLossDays2 );


        int YearsWork = 3;
        int UpZp = 10;

        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;

        float PercentMasha = Masha*UpZp/100f;
        float PercentDenis = Denis*UpZp/100f;
        float PercentChristina = Christina*UpZp/100f;

        float MashaZp = Masha+PercentMasha;
        float DenisZp = Denis+PercentDenis;
        float ChristinaZp = Christina+PercentChristina;

        System.out.println(" Маша теперь получает " +MashaZp+ " Годовой доход вырос на " +PercentMasha );
        System.out.println(" Денис теперь получает " +DenisZp+ " Годовой доход вырос на " +PercentDenis );
        System.out.println(" Кристина теперь получает " +ChristinaZp+ " Годовой доход вырос на " +PercentChristina );


    }
}








