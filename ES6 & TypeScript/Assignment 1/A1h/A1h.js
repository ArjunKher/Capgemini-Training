"use strict";
let totalBalance = 0;
class Account {
  constructor(id, name, balance) {
    this.Id = id;
    this.Name = name;
    this.Balance = balance;
  }
  getBalance() {
    return this.Balance;
  }
}
class SavingAccount extends Account {
  constructor(id, name, interest, cash_credit) {
    super(id, name, cash_credit);
    this.Interest = interest;
    this.Cash_credit = cash_credit;
    totalBalance += cash_credit;
  }
}
class CurrentAccount extends Account {
  constructor(id, name, interest, cash_credit) {
    super(id, name, cash_credit);
    this.Interest = interest;
    this.Cash_credit = cash_credit;
    totalBalance += cash_credit;
  }
}
let mySAccount1 = new SavingAccount("1", "Alpha", 10, 1000);
let mySAccount2 = new SavingAccount("2", "Beta", 10, 2000);
let myCAccount1 = new CurrentAccount("3", "Charlie", 10, 3000);
function getTotalBalance() {
  console.log(totalBalance);
}
getTotalBalance();
