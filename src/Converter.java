import static jdk.nashorn.internal.objects.NativeMath.round;

public class Converter {
    double convertToKm(int steps)
    {
        return round(steps*0.00075,2); //Для ревьювера: я ведь могу использовать по желанию другой тип, что бы точнее считать?
    }
    double convertSpetsToKilocalories(int steps)
    {
        return round(steps*0.05,2);
    }
}
