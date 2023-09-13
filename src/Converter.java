import static jdk.nashorn.internal.objects.NativeMath.round;

public class Converter {
    double convertToKm(int steps)
    {
        return steps*0.00075; //Для ревьювера: я ведь могу использовать по желанию другой тип, что бы точнее считать?
    }
    double convertStepsToKilocalories(int steps)
    {
        return steps*0.05;
    }
}
