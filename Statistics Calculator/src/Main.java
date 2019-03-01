public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatCalc statCalc = new StatCalc();

		statCalc.enter(5.0);
		statCalc.enter(7.0);
		statCalc.enter(12.0);
		statCalc.enter(23.0);
		statCalc.enter(3.0);
		statCalc.enter(2.0);
		statCalc.enter(8.0);
		statCalc.enter(14.0);
		statCalc.enter(10.0);
		statCalc.enter(5.0);
		statCalc.enter(9.0);
		statCalc.enter(13.0);

		System.out.println("The total number of values in the data are:\n" + statCalc.getCount());
		System.out.println("\nThe sum of the numbers in the data are:\n" + statCalc.getSum());
		System.out.println("\nThe mean of the values in the data is:\n" + statCalc.getMean());
		System.out.println("\nThe standard deviation of the data values is:\n" + statCalc.getStandardDeviation());
	}

}
