function double(v){
  return v*2;
}
function square(v){
  return v*v;
}
function composedValue(square, double, val=5){
  return square(double(val));
};
console.log(composedValue(square,double,5));
console.log(composedValue(square,double,10));
////=========OR=========////
const compose =(f1,f2)=>value=>f1(f2(value));
var f1 = compose(square,double);
var f2 = compose(double,square);
