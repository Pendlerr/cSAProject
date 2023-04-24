package cSAProject;
import java.util.Scanner;

public class CSAProject {

	public static void main(String[] args) {
		System.out.println("1、B 2、B 3、D 4、B 5、D");
		
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		showTriangle(n);

		String s=in.next();
		reverseString(s);
		
		int num=in.nextInt();
		isPalindrome(num);
		
		ShuiXianHua();
		
		arraysDemo();
	}
	
	
	public static void showTriangle(int n) {
		int i=1,j=0;
		for(;i<=n;i++) {
			for(j=(n-i);j>=1;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

    public static void reverseString(String s) {
    	char str[]=s.toCharArray();
    	String output;
    	int i;
    	char c;
    	for(i=0;i<(str.length)/2;i++) {
    		c=str[i];
    		str[i]=str[str.length-1-i];
    		str[str.length-1-i]=c;
    	}
    	output=String.valueOf(str);
    	System.out.println(output);
    	
    };

    public static void isPalindrome(int num) {
    	boolean flag=true;
    	char s[]=(String.valueOf(num)).toCharArray();
    	int i;
    	for(i=0;i<s.length/2;i++) {
    		if(s[i]!=s[s.length-1-i]) {
    			flag=false;
    		}
    	}
    	if(flag) {
        	System.out.println("是的");
    	}
    	else {
        	System.out.println("不是");
    	}
    }

    public static void ShuiXianHua() {
    	int i,g,s,b;
    	for(i=100;i<=999;i++) {
    		g=i%10;
    		s=i/10%10;
    		b=i/100;
    		if(g*g*g+s*s*s+b*b*b==i) {
    			System.out.print(i+" ");
    		}
    	}
    	System.out.println();
    }

    public static void arraysDemo() {
    	int arr[]= {4,6,2,1,8,7,3,5,9,0};
    	int i,max,min;
    	max=arr[0];
    	min=arr[0];
    	for(i=1;i<10;i++) {
    		if(arr[i]>max) {
    			max=arr[i];
    			continue;
    		}
    		if(arr[i]<min) {
    			min=arr[i];
    		}
    	}
		System.out.println("最大值为"+max+",最小值为"+min);
    }
}