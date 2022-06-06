public class Main {
    public static void main(String[] args) {
// Домашнее задание №1

        //Задача №1
        byte b=1;
        short s=20;
        int i=500;
        long l=12345L;
        float f=0.1f;
        double d=0.215;
        boolean boo=true;
        char ch=12;

        //Задача №2
        double boxer1=78.2;
        double boxer2=82.7;
        double sum=boxer1+boxer2;
        System.out.println("Общий вес " + sum + " кг");
        double delta=boxer2-boxer1;
        System.out.println("Разница в весе " + delta + " кг");

        //Задача №3
        int ban=5;
        float banW=80f;
        int milk=200;
        float milkW=105/100f;
        int ice=2;
        float iceW=100f;
        int egg=4;
        float eggW=70f;
        float summG=ban*banW + milk*milkW + ice*iceW + egg*eggW;
        float summKG=summG/1000;
        System.out.println("Вес составляет " + summG + " грамм, или " + summKG + " кг.");

        //Задача №4
        float weightLost=7f;
        float lost1=0.25f;
        float lost2=0.5f;
        float day1=weightLost/lost1;
        float day2=weightLost/lost2;
        float dayM=(day1+day2)/2;
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(dayM);

        //Задача №5
        int masha=67_760;
        int den=83_690;
        int kris=76_230;
        System.out.println("Маша теперь получает " + masha*1.1f + " рублей. " +
                "Годовой доход вырос на " + masha*0.1f*12 + " рублей.");
        System.out.println("Денис теперь получает " + den*1.1f + " рублей. " +
                "Годовой доход вырос на " + den*0.1f*12 + " рублей.");
        System.out.println("Кристина теперь получает " + kris*1.1f + " рублей. " +
                "Годовой доход вырос на " + kris*0.1f*12 + " рублей.");
    }
}