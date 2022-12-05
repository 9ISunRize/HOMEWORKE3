public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println( "Задача 1 " );
        byte a = 127;
        System.out.println( "Значение переменной а с типом  byte равно " + a);
        short b = 32767;
        System.out.println( "Значение переменной b с типом short равно " + b);
        int c = 286545633;
        System.out.println( "Значение переменной c c типом int равно " + c);
        float e = 20.8f+10;
        System.out.println( "Значение переменной e c типом float равно " + e);
        double f = 1.2E+308;
        System.out.println( "Значение переменной f c типом double равно " + f);


        System.out.println( "Задача 2 " );// Задача 2
        float g = 27.12f;
        System.out.println(g);
        long h =  987678965549l;
        System.out.println(h);
        byte i = 2;
        System.out.println(i);
        short j = 786;
        System.out.println(j);
        boolean k = false;
        System.out.println(k);
        short l = 569;
        System.out.println(l);
        short m = -159;
        System.out.println(m);
        int n = 27897;
        System.out.println(n);
        byte o = 67;
        System.out.println(o);


        System.out.println( "Задача 3 " );// Задача 3
        byte Lyudmila = 23;
        byte Anna= 27;
        byte Catherine = 30;
        short sheetsOfPaper = 480;
        int totalStudents = Lyudmila + Anna + Catherine;
        int sheetsPerStudent = sheetsOfPaper / totalStudents;
        System.out.println( "На каждого ученика рассчитано " + sheetsPerStudent+ " листов бумаги" );


        System.out.println( "Задача 4 " );// Задача 4
        byte efficiencyTwoMin = 16;
        int efficiencyMin = efficiencyTwoMin / 2;
        System.out.println("За 1 минуту машина произвела бутылок " + efficiencyTwoMin+ " штук" );
        int efficiencyTwentyMin = efficiencyMin * 20;
        System.out.println("За 20 минут машина произвела бутылок " +efficiencyTwentyMin + " штук" );
        int efficiencyDay = efficiencyMin * 1440;
        System.out.println("За сутки машина произвела бутылок " +efficiencyDay + " штук" );
        int efficiencyTreeDay = efficiencyDay * 3 ;
        System.out.println("За 3 суток машина произвела бутылок " +efficiencyTreeDay + " штук" );
        int efficiencyMonth  = efficiencyDay * 31;
        System.out.println("За месяц машина произвела бутылок " +efficiencyMonth + " штук" );


        System.out.println( "Задача 5 " );// Задача 5
        byte allCans = 120;
        int whitePerClass = 2;
        int brownForСlass = 4;
        int totalPerClass = whitePerClass + brownForСlass;
        int numberOfClasses = allCans / totalPerClass;
        int white = whitePerClass * numberOfClasses;
        int brown = brownForСlass * numberOfClasses;
        System.out.println("В школе, где " +numberOfClasses+" классов, нужно " +white+" банок белой краски и "+brown+" банок коричневой краски");


        System.out.println( "Задача 6 " );// Задача 6
        short bananas = 80*5;
        short milk = 105*2;
        short iceCreamSundae = 100*2;
        short rawEggs = 70*4;
        int weight = (bananas+milk+iceCreamSundae+rawEggs)/1000;
        System.out.println("Вес завтрака " + weight + " кг");


        System.out.println( "Задача 7 " );// Задача 7
        short needToReset = 7000;
        short resetsPerDay1 = 250;
        short resetsPerDay2 = 500;
        int day1 = needToReset / resetsPerDay1;
        System.out.println( day1+ " дней в среднем понадобится, чтобы добиться результата похудения");
        int day2 = needToReset/ resetsPerDay2;
        System.out.println( day2+ " дней в среднем понадобится, чтобы добиться результата похудения");


        System.out.println( "Задача 8 " );// Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int yearMasha = masha*12;
        int yearDenis = denis*12;
        int yearKristina = kristina*12;
        int promotionsMasha = masha /100*110;
        int promotionsDenis = denis /100*110;
        int promotionsKristina = kristina /100*110;
        int yearMashaNew = promotionsMasha*12;
        int yearDenisNew = promotionsDenis*12;
        int yearKristinaNew = promotionsKristina*12;
        int differenceM =  yearMashaNew-yearMasha;
        int differenceD = yearKristinaNew-yearDenis;
        int differenceK = yearDenisNew-yearKristina;
        System.out.println( "Маша теперь получает "+promotionsMasha+" рублей. Годовой доход вырос на "+differenceM+" рублей");
        System.out.println( "Маша теперь получает "+promotionsDenis+" рублей. Годовой доход вырос на "+differenceD+" рублей");
        System.out.println( "Маша теперь получает "+promotionsKristina+" рублей. Годовой доход вырос на "+differenceK+" рублей");

    }
}