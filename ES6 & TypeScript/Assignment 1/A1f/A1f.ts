let laptop = {
  model: 2021,
  desk_no: 1,
  name: "Alpha",
};

function getTicket() {
  console.log(
    `Mr ${laptop.name}, Your laptop model: ${laptop.model} is assigned to desk no ${laptop.desk_no}. Description : Screen is Broken.`
  );
}

getTicket();
