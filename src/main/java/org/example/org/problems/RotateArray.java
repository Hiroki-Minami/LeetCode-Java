package org.example.org.problems;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        if(nums.length<k){k=-(nums.length-k);
        }
        if(nums.length<k){k=-(nums.length-k);
        }
        if(nums.length <= 1){return;}

        int[] ans=new int[nums.length];

        System.arraycopy(nums, nums.length-k, ans,
                0,k);
        System.arraycopy(nums,0, ans,
                k,nums.length-k);
        System.arraycopy(ans, 0, nums, 0, nums.length);
    }
}
