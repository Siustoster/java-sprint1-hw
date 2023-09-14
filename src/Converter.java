public class Converter {
    static final double kmInOneStep = 0.00075;
    static final double kkalInOneStep = 0.05;
    double convertToKm(int steps)
    {

        return steps*kmInOneStep; //Для ревьювера: я ведь могу использовать по желанию другой тип, что бы точнее считать?
    }
    double convertStepsToKilocalories(int steps)
    {
        return steps*kkalInOneStep;
    }
}
