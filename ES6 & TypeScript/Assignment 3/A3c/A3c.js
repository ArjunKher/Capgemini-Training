"use strict";
let circle = {
    print: () => {
        return "This is a Circle";
    },
};
let employee = {
    print: () => {
        return "This is an Employee";
    },
};
function printAll(obj, obj2) {
    console.log(obj.print());
    console.log(obj2.print());
}
printAll(circle, employee);
