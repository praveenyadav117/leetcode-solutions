/**
 * @param {number[]} nums
 * @return {string}
 */
var largestNumber = function(nums) {
    
    nums.sort((a, b) => `${b}${a}` - `${a}${b}`);
    if(nums[0]===0) return '0';
   return nums.join('');
// if(!nums || nums.length === 0) {
//         return '0';
//     }
let numberr = [...nums]
let sortedArr= numberr.map(String).sort((a,b)=>(b+a)-(a+b))
if(nums[0]==0) return "0";
return sortedArr.join("");

}