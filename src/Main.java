public class Main {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 100000;
        long d = 1000000L;
        float e = 10.10f;
        double f = 10.10101010;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        float numberFloat = 27.12f;
        long numberLong = 987578965549L;
        double numberDouble = 2.786;
        // или переенная short = 2786 если в задание имелось целое занчение
        int numberInt = 569;
        short numberShort = -159;
        long numberLong2 = 27897L;
        byte numberByte = 67;

        byte teacherLudmila = 23;
        byte teacherAnna = 27;
        byte teacherKata = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (teacherAnna + teacherKata + teacherLudmila) + " листов бумаги");

        int factoryBottle = 16;
        System.out.println("За 20 минут машина произвела " + factoryBottle*10 + " штук бутылок");
        System.out.println("За одни сутки машина произвела " + factoryBottle*10*3*24 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + factoryBottle*10*3*24*3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + factoryBottle*10*3*24*3*10 + " штук бутылок");
        // при условие что в месяце 30 дней

        byte allJar = 120;
        byte whiteJar = 2;
        byte brownJar = 4;
        System.out.println("В школе, где " + allJar / (whiteJar + brownJar) + " классов, нужно " + allJar / (whiteJar + brownJar)*2 + " банок белой краски и " + allJar / (whiteJar + brownJar)*4 + " банок коричневой краски");

        float banana = 80f;
        float milk = 105f;
        float iceCream = 100f;
        float egg = 70f;
        System.out.println((banana*5 + milk*2 + iceCream*2 + egg*4)/1000 + " кг");

        short kg = 7000;
        short gm250 = 250;
        short gm500 = 500;
        System.out.println(kg /gm250 + " нужно дней для сброса 7кг, при ежедневной потери 250 грамм");
        System.out.println(kg /gm500 + " нужно дней для сброса 7кг, при ежедневной потери 500 грамм");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        System.out.println("Маша теперь получает " + (salaryMasha + (salaryMasha / 10)) +" рублей. Годовой доход вырос на " + (salaryMasha + (salaryMasha / 10)*12) + " рублей");
        System.out.println("Денис теперь получает " + (salaryDenis + (salaryDenis / 10)) +" рублей. Годовой доход вырос на " + (salaryDenis + (salaryDenis / 10)*12) + " рублей");
        System.out.println("Маша теперь получает " + (salaryKristina + (salaryKristina / 10)) +" рублей. Годовой доход вырос на " + ((salaryKristina + (salaryKristina / 10)*12) + " рублей"));
    }
 }