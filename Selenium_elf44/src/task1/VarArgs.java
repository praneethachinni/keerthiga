package task1;

public class VarArgs {
	public double sub(double... ref) {
		double sum=0;
		for(double a:ref) {
			sum-=a;
		}
		return sum;
	}
	public static void main(String[] args) {
		VarArgs v=new VarArgs();
		System.out.println(v.sub(12.3,45.6));//-57.900000000000006
	}

}
