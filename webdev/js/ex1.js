/*
You are building a CLI tool that determines whether a given number is prime.
You will be given a single integer as input.
Your tasks:
1. Parse the input and ensure it is a positive integer greater than 1.
2. Check whether the number is divisible by any number other than 1 and itself.
3. If divisible, return "<number> is not a prime number".
4. If not divisible, return "<number> is a prime number".
5. Handle invalid inputs like non-numeric values, negative numbers, or numbers
less than
2 with an error message.
Sample 1:
-------------
Input: 7
Output:7 is a prime number
Sample 2:
-------------
Input:10
Output: 10 is not a prime number
Sample 3:
-------------
Input: one
Output: Error: Please enter a valid integer greater than 1
*/
const readline = require('readline');
const rl = readline.createInterface({
input: process.stdin,
output: process.stdout
});

// Implement the function isPrimeCheck(input)
const isPrimeCheck = (input) => {
// 1. Convert input to a number and validate
// 2. Check divisibility starting from 2 up to sqrt(number)
// 3. If divisible, return "<number> is not a prime number"
// 4. Else return "<number> is a prime number"
const n = Number(input)
if(!Number.isInteger(n) || n < 2)
{
    return "Error: Please enter a valid integer greater than 1";
}

for(let i = 2; i <= Math.sqrt(n); i++)
{
    if(n%i === 0)
    {
       return `${n} is not a prime number`;
    }
}

return `${n} is a prime number`;

};

rl.question('', (input) => {
console.log(isPrimeCheck(input));
rl.close();
});
