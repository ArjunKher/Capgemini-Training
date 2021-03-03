"use strict";
let x = 10;
let y = 20;
const promise1 = () => {
    return new Promise((resolve, reject) => {
        resolve(x);
    });
};
const promise2 = () => {
    return new Promise((resolve, reject) => {
        resolve(x);
    });
};
console.log(promise1());
console.log(promise2());
Promise.all([promise1(), promise2()]).then((results) => {
    const total = results.reduce((p, c) => p + c);
    console.log(`Results: ${results}`);
    console.log(`Total: ${total}`);
});
