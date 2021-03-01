"use strict";
class MyClass {
    constructor(curr) {
        this.previousNo = fibo(curr - 1);
        this.currentNo = curr;
    }
    next() {
        return fibo(this.currentNo + 1);
    }
}
var fibo = function (n) {
    var a = 0, b = 1, f = 1;
    for (var i = 2; i <= n; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    return f;
};
let myClass = new MyClass(6);
console.log(myClass.next());
