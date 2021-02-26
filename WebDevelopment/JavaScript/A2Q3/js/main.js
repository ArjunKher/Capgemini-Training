function isEven(value){
  if(value%2==0){
    return true;
  }
  return false;
}
function test(arr,func){
  for(var i=0;i<arr.length;i++){
    if(func(arr[i])){
      return arr[i];
    }
  }
}
const find = (values,fun)=>test(values,fun);
console.log(find([1, 3, 5, 4, 2], isEven));
