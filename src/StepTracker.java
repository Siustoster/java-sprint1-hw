import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay=10000;
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
    void changeStepGoal(){
        System.out.println("Введите новую цель (шагов в день):");
        int newGoalSteps = scanner.nextInt();
        if ( newGoalSteps<=0)
        {
            System.out.println("Некорректное количество шагов");
            return;
        }
        goalByStepsPerDay = newGoalSteps;
        System.out.println("Идем к цели "+goalByStepsPerDay+" шагов!");
    }

}
