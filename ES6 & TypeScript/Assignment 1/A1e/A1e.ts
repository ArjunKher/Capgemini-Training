//a
function add(a: number, b: number) {
  return a + b;
}
console.log(add(2, 2));

//b
function userFriends(username: string, ...names: string[]) {
  return username + "'s friends are : " + names.join(", ");
}

var friends = ["Bravo", "Charlie", "Delta", "Echo"];

console.log(userFriends("Alpha", ...friends));

//c
function printCapitalNames(
  a: string,
  b: string,
  c: string,
  d: string,
  e: string
): void {
  console.log(a.toUpperCase());
  console.log(b.toUpperCase());
  console.log(c.toUpperCase());
  console.log(d.toUpperCase());
  console.log(e.toUpperCase());
}

let myNames: [string, string, string, string, string] = [
  "Alpha",
  "Bravo",
  "Charlie",
  "Delta",
  "Echo",
];

printCapitalNames(...myNames);
