public class YongfuTask_review_task5 {
	public static double countSmaller(double[] number1) {
		final int ELEMENTS = 100;
		double sum = 0;


		// number1 = new double[ELEMENTS];
		for (int i = 0; i < 100; i++) {
			sum = sum + number1[i];
		}
		System.out.println(sum);
		double average = sum/ELEMENTS;

		int count = 0;
	    for(int i =0; i<100; i++) {
		  if (number1[i] < average) {
		    count += 1;
		    	}
		    }
	     return count;
	}

	public static void main(String[] args) {
		final int ELEMENTS = 100;
		double[] numbers = new double[ELEMENTS];
		int sum = 0;

	    for(int i =0; i<100; i++) {
			numbers[i] = Math.random() * 100;
			// System.out.println(numbers[i]);
	    	}

	     System.out.println(countSmaller(numbers));
	}


}
