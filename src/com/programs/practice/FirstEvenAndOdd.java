package com.programs.practice;

public class FirstEvenAndOdd {
	public static void main(String[] args) {
		int[] ar= {67,232,543,123,122,66};
		arrange(ar);
	}

	 static void arrange(int[] ar) {
		int[] rs=new int[ar.length];
		int even[]=new int[ar.length];
		int odd[]=new int[ar.length];
		int m=0,n=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				even[m++]=ar[i];
			}
			else {
				odd[n++]=ar[i];
			}
		}
		for(int i=0;i<ar.length;i++) {
			if(i<m) {
				rs[i]=even[i];
			}
		
		}
		int k=0;
		for(int i=m;i<ar.length;i++) {
		
				rs[i]=odd[k++];
			
		
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(rs[i]);
		}
		
		
	}

}
