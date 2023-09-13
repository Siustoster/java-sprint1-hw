import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    StepTracker(Scanner scan){
        scanner = scan;
        for (int i=0; i< monthToData.length;i++)
        {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay()
    {
        System.out.println("Введите номер месяца:");
        int monthNum = scanner.nextInt();
        if((monthNum<1) || (monthNum>12))
        {
            System.out.println("Некорректный номер месяца");
            return;
        }
        System.out.println("Введите номер дня:");
        int dayNum = scanner.nextInt();
        if((dayNum<1) || (dayNum>30))
        {
            System.out.println("Некорректный номер дня");
            return;
        }
        System.out.println("Введите количество шагов:");
        int steps = scanner.nextInt();
        if(steps<0)
        {
            System.out.println("Некорректное количество шагов");
            return;
        }
        MonthData monthData = monthToData[monthNum-1];
        monthData.days[dayNum-1]=steps;
    }
}
