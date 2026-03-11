package dsa;

public class SelectionSort {

	public static void sort(int n[]) {

		for (int i = 0; i < n.length; i++) {
			int min = i;
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < n[min]) {
					min = j;

				}
			}
			int temp = n[i];
			n[i] = n[min];
			n[min] = temp;

		}

	}

	public static void display(int n[]) {
		System.out.println("Sorted array:");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int n[] = { 4, 6, 5, 2, 1, 3 };

		sort(n);
		display(n);
	}

}
