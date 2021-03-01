"use strict";
let names = ["Alpha", "Bravo", "Charlie"];
let myArr = [];
const myFun = (arr) => {
    for (let i of arr) {
        let myObj = { name: i, length: i.length };
        myArr.push(myObj);
    }
    return myArr;
};
const temp = myFun(names);
console.log(temp);
