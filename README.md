# CountOf-0and1-
Count of 1 and longest substring of 0

About the problem.
 The ans is divided into two parts
1. To count the total number of 1 
2. To count the total number of 0's in the substring means
it should be in sequence without breaking.

1. )Here, the number of '1's is counted by iterating through the string from index 0 to N. Within the loop, each element in the string is compared to '1' using `s.charAt(i)`. If any character matches '1', the count is incremented. This comparison helps to check each character of the string against the specified character, '1', and if a match occurs, it increments the count.

2.  We need to count the longest substring of '0's. Similar to counting '1's, we iterate through the string. However, in this case, if the sequence of '0's breaks, the `if` condition is used to detect the break. Then, `max = Math.max(max, count2);` is employed to maintain the maximum size temporarily. Afterward, `count2` is reset to 0 so that it can start counting the characters again from 0.

3.  Finally, we choose the maximum count between `count2` of '0's and the previously calculated `max`. This ensures that we have considered the longest consecutive sequence of '0's in the string. The maximum count1+sum is then printed as the output.
