interface Printable {
  print: () => string;
}

let circle: Printable = {
  print: (): string => {
    return "This is a Circle";
  },
};

let employee: Printable = {
  print: (): string => {
    return "This is an Employee";
  },
};

function printAll(obj: Printable, obj2: Printable) {
  console.log(obj.print());
  console.log(obj2.print());
}

printAll(circle, employee);
