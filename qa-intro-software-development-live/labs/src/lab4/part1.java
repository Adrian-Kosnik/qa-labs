package lab4;

public class part1 {

	public static int sumOfNums(int[] nums) {

		int sum = 0;

		for (int num : nums) {
			sum = sum + num;
		}

		System.out.println(sum);

		return sum;

	}

	public static int average(int[] nums) {

		int average = sumOfNums(nums) / nums.length;

		System.out.println(average);

		return average;

	}

	public static int minNum(int[] nums) {

		int minNum = nums[0];

		for (int num : nums) {
			if (num < minNum) {
				minNum = num;
			}
		}

		System.out.println(minNum);

		return minNum;

	}

	public static int maxNum(int[] nums) {

		int maxNum = nums[0];

		for (int num : nums) {
			if (num > maxNum) {
				maxNum = num;
			}
		}

		System.out.println(maxNum);

		return maxNum;

	}

	public static int indexOfZero(int[] nums) {

		int index = 0;

		for (int num : nums) {
			if (num == 0) {
				break;
			}
			index++;
		}

		System.out.println(index);

		return index;

	}
	
}
