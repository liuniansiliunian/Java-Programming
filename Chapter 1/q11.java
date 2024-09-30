package exercise;


public class q11 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60; // 一年中的总秒数

        // 计算每年的出生、死亡和移民人数
        double birthsPerYear = secondsPerYear / 7.0;
        double deathsPerYear = secondsPerYear / 13.0;
        double immigrantsPerYear = secondsPerYear / 45.0;

        // 计算每年的净增长人数
        double populationChange = birthsPerYear - deathsPerYear + immigrantsPerYear;

        // 预测未来五年的人口
        for (int year = 1; year <= 5; year++) {
            double projectedPopulation = currentPopulation +(double) (year * populationChange);
            System.out.printf("Year %d: %.0f\n", year, projectedPopulation);
        }
    }
}
