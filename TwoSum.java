class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] sumOfTwo = new int[2];

        // Aside: Nested for-loop time complexity O(n**2) but at least it gets the job done
        // iterate via 'nums' up to but NOT include last elem ...
        for(int i = 0; i < nums.length - 1; ++i){
            // excluding selected index i, iterate through the rest of 'nums' ...
            for(int j = i + 1; j < nums.length; ++j){
                // if selected elem & current elem adds up to 'target' ... 
                if(nums[i] + nums[j] == target){
                    // re-initialize 'sumOfTwo' int ary w/ the particular indices
                    sumOfTwo[0] = i;
                    sumOfTwo[1] = j;
                }
            }
        }

        // return ary w/ desired outputs
        return(sumOfTwo);

        /* -------------------- */
        // // initialize an 'int' ary w/ len 2
        // int[] addendsAry = new int[2];

        // // 'leftPointer' starts from the leftmost index in 'nums'
        // int copyLeftPointer = 0;
        // // 'rightPointer' begins at the rightmost index in 'nums'
        // int copyRightPointer = nums.length - 1;

        // // 'Arrays.sort()' by default will change the underlying data similar to 'Collections.sort()' --- hence the '.clone()' from Arrays is being used to create a copy
        // // Note: Want to keep tabs on the OG index value since it is NOT ordered by default & DN want to change OG 'nums'
        // // Aside: '.clone()' creates a *shallow copy* aka changes to the copy will be reflected onto OG --- BUT ary of primitives (like int) are NOT affected, neither are Referenced-types (String, Integer, etc.) ...
        // // ... HOWEVER mutable objects are affected (ex. new StringBuilder('casa'))
        // int[] numsAryCopy = nums.clone();
        // Arrays.sort(numsAryCopy);

        // int copyLeftValue = 0;
        // int copyRightValue = 0;
        // // iterate via given 'numsAryCopy' int ary ...
        // for(int i = 0; i < numsAryCopy.length; ++i){
        //     // calculate the sum found at the 'copyLeftPointer' & 'copyRightPointer' indices ...
        //     int sumTwoIndices = numsAryCopy[copyLeftPointer] + numsAryCopy[copyRightPointer];

        //     // if the sum of the current selected 2 indices adds up to 'target' ...
        //     if(sumTwoIndices == target){
        //         // make note of the indices in 'addendsAry'
        //         // addendsAry[0] = leftPointer;
        //         // addendsAry[1] = rightPointer;

        //         /* make a note of the actual values found at the two pointers in the copy ary */
        //         copyLeftValue = numsAryCopy[copyLeftPointer];
        //         copyRightValue = numsAryCopy[copyRightPointer];
        //     }

        //     // otw if the sum is less than 'target' ...
        //     else if(sumTwoIndices < target){
        //         // increment 'copyLeftPointer' by 1 (shift to right)
        //         copyLeftPointer++;
        //     }

        //     // otw if sum is greater than 'target' ...
        //     else{ //} if(sumTwoIndices > target){
        //         // decrement 'copyRightPointer' by 1 (shift to left)
        //         copyRightPointer--;
        //     }
        // }

        // int leftPointer = -1;
        // int rightPointer = -1;
        // for(int j = 0; j < nums.length; ++j){
            
        //     if(nums[j] == copyLeftValue){
        //         if(leftPointer == -1){
        //             leftPointer = j;
        //         }
        //         // leftPointer = j;

        //         if(leftPointer != -1){
        //             if(nums[j] == copyRightValue){
        //                 rightPointer = j;
        //             }
        //         }
        //     }

        //     // else if(nums[j] == copyRightValue){
        //     //     rightPointer = j;
        //     // }
        // }

        // addendsAry[0] = leftPointer;
        // addendsAry[1] = rightPointer;
        // // returns ary of indices adding up to 'target'
        // return(addendsAry);

        /* ------------------------------------------ */

        // System.out.println(nums);
        // return(new int[5]);
        // initialize an ary of len 2 to later contain the indices which adds up to 'target'
        // int[] indexReturn = new int[2];
        // int indexOne = 0;
        // int indexTwo = 0;
        // for(int i = 1; i < nums.length; ++i){
        //     indexOne = nums[i-1];
        //     indexTwo = nums[i];
        //     if(indexOne + indexTwo == target){
        //         indexReturn[0] = i - 1;
        //         indexReturn[1] = i;
        //     }
        // }
        // return(indexReturn);
    }
}