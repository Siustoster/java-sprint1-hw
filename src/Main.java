import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if(i==0)
            {
                System.out.println(("Завершаем работу"));
                return;
            }
            else if(i==1)
            {
                stepTracker.addNewNumberStepsPerDay();
            }
            else if(i==2)
            {
                stepTracker.changeStepGoal();
            }
            else if(i==3)
            {
                System.out.println("Выполняем команду 3");
            }
            else {
                System.out.println("Неизвестная команда");
            }
            }
        }

    public static void printMenu()
    {
        System.out.println("Выберите действие");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("0 - Выход");

    }
}
