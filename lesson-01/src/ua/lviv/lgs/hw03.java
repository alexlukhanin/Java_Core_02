package ua.lviv.lgs;

public class hw03 {

	public static void main(String[] args) {

		short[] array1 = { 10, 15, 25, -416, 0, 24, -80, 51, 14, 1 };

		findMinMaxOfArray(array1);
	}

	static void findMinMaxOfArray(short[] array) {

		short min = array[0];
		short max = min; // ���������� �������� ������� �������� ������ ���� ������.... min ��� ��
							// �������� �������� ������.
//	��������� �� �������� ������ ����������� ������ ����� ������� �� �� �������� �����, ���� ��� ����������. 	

		for (short i = 1; i < array.length; i++) { // ��������� ��� ��������� � 2-�� �������� (������ [1])
			if (array[i] > max) {
				max = array[i];
			}

			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println("Minimal number of array is " + min);
		System.out.println("Maximal number of array is " + max);

	}

}
