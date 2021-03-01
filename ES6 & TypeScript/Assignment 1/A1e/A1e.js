"use strict";
//a
function add(a, b) {
    return a + b;
}
console.log(add(2, 2));
//b
function userFriends(username, ...names) {
    return username + "'s friends are : " + names.join(", ");
}
var friends = ["Bravo", "Charlie", "Delta", "Echo"];
console.log(userFriends("Alpha", ...friends));
//c
function printCapitalNames(a, b, c, d, e) {
    console.log(a.toUpperCase());
    console.log(b.toUpperCase());
    console.log(c.toUpperCase());
    console.log(d.toUpperCase());
    console.log(e.toUpperCase());
}
let myNames = [
    "Alpha",
    "Bravo",
    "Charlie",
    "Delta",
    "Echo",
];
printCapitalNames(...myNames);
