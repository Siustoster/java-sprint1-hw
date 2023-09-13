public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth()
    {
        for(int i=0;i<days.length;i++)
        {
            System.out.println(i+1 + " день: "+ days[i]);
        }
    }
    int sumStepsFromMonth()
    {
        int summ=0;
        for(int i=0;i<days.length;i++)
        {
            summ+=days[i];
        }
        return summ;
    }
    int maxSteps()
    {
        int maxSteps = 0;
        for (int i=0;i<days.length;i++)
        {
            if(days[i]>maxSteps)
                maxSteps=days[i];
        }
        return maxSteps;
    }
    int bestSeries(int goalByStepsPerDay)
    {
        int currentSeries=0;
        int bestSeries=0;
        for (int i=0;i<days.length;i++)
        {
            if(days[i]>=goalByStepsPerDay)
                currentSeries++;
            else {
                bestSeries = currentSeries;
                currentSeries=0;
            }
        }
        return bestSeries;
    }

}
