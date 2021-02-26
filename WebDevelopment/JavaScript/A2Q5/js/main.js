/*
Make a “pure” recursive version of find. That is, don’t use any explicit loops (e.g. for loops or the
forEach method), and don’t use any local variables (e.g., var x = ...) inside the functions. Hint:
remember the slice method of arrays.
function isEven(num) { return(num%2 == 0); }
isEven(3) --> false
isEven(4) --> true
find([1, 3, 5, 4, 2], isEven); --> 4
*/
/*
function addNumRecursively(nums){
    return (nums.length > 1) ? (nums[0]  + addNumRecursively(nums.slice(1))) : nums[0];
}
*/
function isEven(val){
  return (val%2 == 0);
}
function process(arr,f1){
  /*while(arr.length>0){
    if(func(arr.slice(0,1))){
      return arr[0];
    }
    arr.shift();
  }*/
  return f1(arr.slice(0,1))?arr[0]:process(arr.shift(),f1);
}
const find = (arr,f1)=>process(arr,f1);
console.log(find([1, 3, 5, 4, 2], isEven));
