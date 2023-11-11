package kr.or.kosa.daily;

import java.util.Scanner;

//n개의 바구니, m번 반복
//바구니 번호는 1~n
//i번째~j번째 바구니 역순

public class Ex_11_06_basket_reverse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		int[] basket = new int[n];
		
		for(int i=0;i<basket.length;i++) {
			basket[i] = i+1;
			//System.out.printf("basket[%s]=%d\n",i,basket[i]);
		}
		
		for (int k = 0; k < m; k++) {
            
			int i = in.nextInt();
            int j = in.nextInt();

            // 바구니 역순
            while (i<j) {
                int temp = basket[i - 1];
                basket[i - 1] = basket[j - 1];
                basket[j - 1] = temp;
                i++;
                j--;
            }

            for (int h = 0; h < n; h++) {
                System.out.print(basket[h]+" ");
            }
        }

		
	}

}
