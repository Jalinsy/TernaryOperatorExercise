public class TernaryOperatorExercise {
	public static void main(String[] args) {
		 
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;
		//先得到 n1 和 n2 中最大数，保存到max1
		//然后再求出max1 和 n3中的最大数，保存到max2
		
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数是" + max2);
		
		//使用一条语句实现,推荐使用上面的方法
//		int max = (n1 > n2 ? n1 :n2) > n3 ?
//				             (n1 > n2 ? n1 : n2) : n3;
//		System.out.println("最大数是" + max);
	}
}