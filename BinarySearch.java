import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int low=0,high=n-1,k=0,mid;
		while(low<=high){
		    mid=(low+high)/2;
		    if(a[mid]==key){
		        k=mid;
		    }
		    else if(key<a[mid]){
		        high=mid-1;
		    }
		    else{
		        low=mid+1;
		    }
		}
		System.out.println(k);
		
	}
}