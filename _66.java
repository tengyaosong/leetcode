// Plus one
// Input digits = {1,2,3}
// output {1,2,4}
// add one to the integer 123 becomes 124
// add one to 199 becomes 200
// add one to 999 becomes 1000
public class _66 {
    public static int[] plusOne(int[] digits) {
        int len= digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]!=9){  // if we have the last value as not 9 the we will simlpy add 1 to that val
                digits[i]= digits[i]+1;
                return digits;  // we will now return our array, we will always return to this base case unless
                //its all 9's
            }
            else {
                digits[i]=0;  // else we have 9 at that index so as 9+1=10, so we will put 0 at that index
                //and continue with the loop
            }
        }
        int[] arr= new int[len + 1];
        if(digits[0]==0){  // to handle all nine we will just check is the first value 0 is it is then we
            //will make a new index having an extra index with value 1 and others as 9's for example: 9999->10000
            arr[0]=1;
            for(int i=0;i<len;i++){
                arr[i+1]=digits[i];
            }
        }
        return arr;
    }
    public static void main (String[] args) {
        int[] testdata = new int[]{9, 9, 9};
        int[] returndata = plusOne(testdata);
        for (int a: returndata) {
            System.out.println(a);
        }
    }
}
