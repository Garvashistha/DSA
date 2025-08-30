public class consicutiveness {
        public static void main(String[] args) {
            int[] binaryArray = {1, 1, 0, 1, 1, 1, 0, 1, 1}; // sample input

            int maxCount = 0;
            int currentCount = 0;

            for (int num : binaryArray) {
                if (num == 1) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                    }
                } else {
                    currentCount = 0; // reset count on 0
                }
            }

            System.out.println("Maximum number of consecutive 1s: " + maxCount);
        }
    }
