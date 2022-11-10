public class MyClass {
    
    
    public static int linearSearch(int[] arr, int key){ 
        
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        
        return -1;
        
    }
    
    public static int binarySearch(int[] arr, int key, int l, int r){ 
        
        if(r>=l){
            int mid = l + (r-l)/2;  //2 + 1 = 3
            if(arr[mid] == key){
                return mid;
            }
            
            if(arr[mid]>key){
               return binarySearch(arr,key,l,mid-1);
            }
            
            if(arr[mid]<key){
               return binarySearch(arr,key,mid+1,r);
            }
        }
        
        return -1;
        
    }
    
    public static void main(String args[]) {
      int[] a1= {10,20,30,50,70,90};    
        int key = 50;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key)); 
        System.out.println(key+" is found at index: "+binarySearch(a1, key,0,a1.length-1));
    }
}
