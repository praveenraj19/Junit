public class Calculator {
	public int evaluate (String expression){
		int sum = 0;
		for(String summand : expression.split("\\+"))
		//for (String summand : expression.replaceAll("-","+-").split("\\+")){
			sum += Integer.valueOf(summand);
		return sum;
	}
}

