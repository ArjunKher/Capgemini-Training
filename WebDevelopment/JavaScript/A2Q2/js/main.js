function double(v){
  return v*2;
}
function square(v){
  return v*v;
}
const compose =(f1,f2)=>value=>f1(f2(value));
var f1 = compose(square,double);
var f2 = compose(double,square);
f1(5);
f1(10);
f2(5);
f2(10);
