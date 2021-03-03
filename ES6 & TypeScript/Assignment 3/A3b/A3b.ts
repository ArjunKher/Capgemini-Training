let totalBalance2 = 0;

class Account2 {
  Id: string;
  Name: string;
  Balance: number;
  constructor(id: string, name: string, balance: number) {
    this.Id = id;
    this.Name = name;
    this.Balance = balance;
  }
  getBalance() {
    return this.Balance;
  }
}

class SavingAccount2 extends Account2 {
  Interest: number;
  Cash_credit: number;
  constructor(id: string, name: string, interest: number, cash_credit: number) {
    super(id, name, cash_credit);
    this.Interest = interest;
    this.Cash_credit = cash_credit;
    totalBalance2 += cash_credit;
  }
}
class CurrentAccount2 extends Account2 {
  Interest: number;
  Cash_credit: number;
  constructor(id: string, name: string, interest: number, cash_credit: number) {
    super(id, name, cash_credit);
    this.Interest = interest;
    this.Cash_credit = cash_credit;
    totalBalance2 += cash_credit;
  }
}

let mySAccount1_2 = new SavingAccount2("1", "Alpha", 10, 1000);
let mySAccount2_2 = new SavingAccount2("2", "Beta", 10, 2000);
let myCAccount1_2 = new CurrentAccount2("3", "Charlie", 10, 3000);

function getTotalBalance2() {
  console.log(totalBalance2);
}

getTotalBalance2();
