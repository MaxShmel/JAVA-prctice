package Practice4.Task1;
import java.util.Scanner;

public class Seasons
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String A = "Зима. Холодное время года. Основные осадки: снег/ледяной дождь. Средняя тепература: -7. Основные праздники: Новый Год, Рождество.";
        System.out.println(A);

        enum Season {
            WINTER(-7, "Холодное"),
            SPRING(10, "Холодно-тёплое"),
            SUMMER(22, "Тёплое"),
            AUTUMN(8, "Тёпло-холодное");

            private double midTemp;
            private String description;
            private Season(double midTemp, String description)
            {
                this.midTemp = midTemp;
                this.description = description;
            }

            public double getMidTemp()
            {
                return midTemp;
            }

            public String getDescription()
            {
                return this.description +" время года";
            }

            public void listSeasons(Season seasonExample)
            {
                switch (seasonExample)
                {
                    case WINTER:
                    {
                        System.out.println("Я люблю зиму!");
                        System.out.println(Season.WINTER.getMidTemp());
                        System.out.println(Season.WINTER.getDescription());
                        break;
                    }
                    case SPRING:
                    {
                        System.out.println("Я люблю весну!");
                        System.out.println(Season.SPRING.getMidTemp());
                        System.out.println(Season.SPRING.getDescription());
                        break;
                    }
                    case SUMMER:
                    {
                        System.out.println("Я люблю лето!");
                        System.out.println(Season.SUMMER.getMidTemp());
                        System.out.println(Season.SUMMER.getDescription());
                        break;
                    }
                    case AUTUMN:
                    {
                        System.out.println("Я люблю осень!");
                        System.out.println(Season.AUTUMN.getMidTemp());
                        System.out.println(Season.AUTUMN.getDescription());
                        break;
                    }
                }
            }
        };

        Season testSeason = Season.SUMMER;

        switch (testSeason)
        {
            case WINTER:
            {
                System.out.println("Я люблю зиму!");
                System.out.println(Season.WINTER.getMidTemp());
                System.out.println(Season.WINTER.getDescription());
                break;
            }
            case SPRING:
            {
                System.out.println("Я люблю весну!");
                System.out.println(Season.SPRING.getMidTemp());
                System.out.println(Season.SPRING.getDescription());
                break;
            }
            case SUMMER:
            {
                System.out.println("Я люблю лето!");
                System.out.println(Season.SUMMER.getMidTemp());
                System.out.println(Season.SUMMER.getDescription());
                break;
            }
            case AUTUMN:
            {
                System.out.println("Я люблю осень!");
                System.out.println(Season.AUTUMN.getMidTemp());
                System.out.println(Season.AUTUMN.getDescription());
                break;
            }
        }

        Season[] season1;
        season1 = new Season[4];
        season1[0] = Season.WINTER;
        season1[1] = Season.SPRING;
        season1[2] = Season.SUMMER;
        season1[3] = Season.AUTUMN;

        for (int i = 0; i < 4; ++i)
        {
            switch (season1[i])
            {
                case WINTER:
                {
                    System.out.println("Я люблю зиму!");
                    System.out.println(Season.WINTER.getMidTemp());
                    System.out.println(Season.WINTER.getDescription());
                    break;
                }
                case SPRING:
                {
                    System.out.println("Я люблю весну!");
                    System.out.println(Season.SPRING.getMidTemp());
                    System.out.println(Season.SPRING.getDescription());
                    break;
                }
                case SUMMER:
                {
                    System.out.println("Я люблю лето!");
                    System.out.println(Season.SUMMER.getMidTemp());
                    System.out.println(Season.SUMMER.getDescription());
                    break;
                }
                case AUTUMN:
                {
                    System.out.println("Я люблю осень!");
                    System.out.println(Season.AUTUMN.getMidTemp());
                    System.out.println(Season.AUTUMN.getDescription());
                    break;
                }
            }
        }

    }
}
