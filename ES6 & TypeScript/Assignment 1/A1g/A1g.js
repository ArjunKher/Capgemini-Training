"use strict";
//a
let arr = [1, 2, 3, 4];
let [a, b, c, d] = arr;
console.log(c);
//b
let myOrg = {
    name: "The Org",
    address: {
        city: "The City",
        country: "India",
        pin: 101010,
    },
};
let { address: { pin }, } = myOrg;
console.log(pin);
