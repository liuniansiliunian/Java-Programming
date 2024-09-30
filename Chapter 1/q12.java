package exercise;

public class q12 {
        public static void main(String[] args) {
            double distanceMiles = 24;
            double timeHours = (1 + 40 / 60.0 + 35 / 3600.0); // 1小时40分钟35秒转换为小时
            double speedKmPerHour = (distanceMiles * 1.6) / timeHours; // 公里/小时
            System.out.println("Average Speed: " + speedKmPerHour);
        }
    }



