public class Main
{
static class Pair{
	     int min;
	     int max;
	     
	     public String toString(){
	         return "Min = "+this.min +" Max = "+this.max;
	     }
	}
	
	public static Pair getMinMax(int[] arr){
	    Pair minmax = new Pair();
	    System.out.println("length of array is "+arr.length);
	    if(arr.length==1){
	        System.out.println("array length is 1");
	        minmax.min = arr[0];
	        minmax.max = arr[0];
	        return minmax;
	    }else if(arr.length==2){
	        System.out.println("array length is 2");
	        if(arr[0]>arr[1]){
	            minmax.max = arr[0];
	            minmax.min = arr[1];
	            return minmax;
	        }else{
	            minmax.max = arr[1];
	            minmax.min = arr[0];
	            return minmax;
	        }
	    }else{
	        System.out.println("array length is greater than 2");
	        minmax.min = arr[0];
	        minmax.max = arr[0];
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]>=minmax.max){
	                minmax.max = arr[i];
	            }else if(arr[i]<=minmax.min){
	                minmax.min = arr[i];
	            }
	        }
	        return minmax;
	    }
	    
	}
	public static void main(String[] args){
	    int[] arr = {3};
	    System.out.println(getMinMax(arr));
	}
}
