"use strict";

const PRICE_LIST = { adult: 250, child: 150, senior: 200 };

// TODO-1: Implement getPrice(type) using switch and PRICE_LIST
function getPrice(type) {
  // TODO
  switch(type.trim().toLowerCase()){
    case "adult": return PRICE_LIST.adult;
    case "child": return PRICE_LIST.child;
    case "senior": return PRICE_LIST.senior;
    default: return "Invalid type";
  }
  
}

let cart = [];

const addTicket = function (type) {
  const price = getPrice(type);
  if (typeof price !== "number") {
    alert("Invalid ticket type. Use: adult, child, senior.");
    return false;
  }
  const t = String(type).trim().toLowerCase();
  cart.push({ type: t, price });
  return true;
};

function promptLoop() {
  cart = [];
  while (true) {
    const input = prompt('Enter ticket type ("adult", "child", "senior"). Cancel to finish:');
    if (input === null) break;
    if (!addTicket(input)) continue;
  }
}

// TODO-2: Implement totalCost() as an arrow function using reduce on cart
const totalCost = () => {
  // TODO

  // The reduce() method iterates over the cart array and accumulates a single value (the total price)
  // Syntax: array.reduce((accumulator, currentValue) => ..., initialValue)
  // - accumulator: stores the running total (starts with initialValue, here 0)
  // - currentValue: the current element in the array being processed (here each ticket object)
  // - initialValue: 0, because we are summing prices
  // For each ticket, we add its price to the running total
  return cart.reduce((total, ticket) => total + ticket.price, 0);
};

function printSummary() {
  if (cart.length === 0) {
    alert("No tickets booked.");
    return;
  }
  console.table(cart);
  const total = totalCost();
  alert(`Tickets booked: ${cart.length}\nTotal: ₹${total.toFixed(2)}`);
}

function main() {
  promptLoop();
  printSummary();
}

document.getElementById("start").addEventListener("click", main);
