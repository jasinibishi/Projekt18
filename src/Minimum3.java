
public class Minimum3 {
public static int findMin(int n1, int n2 , int n3) {
	int min;
	if (n1 < n2)
		min = n1;
	else
		min = n2;
	if (n2 < n3)
		min = n2;
	else
		min = n3;
	return min;
	}
public static void main (String[]args) {
	System.out.println("Minimum od trite broja e:" +findMin(15,10,5));
}
}
