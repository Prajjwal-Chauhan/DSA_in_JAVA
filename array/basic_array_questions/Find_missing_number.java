// Expected time complexity O(n)
// expected space complexity O(1)
class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        int sum2 = n*(n+1)/2;
        
        return sum2 - sum;
    }
}
