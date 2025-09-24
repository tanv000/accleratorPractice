/*
You are creating a CLI tool for greeting event attendees differently based on 
their age.
You will be given a number representing the attendee's age.
Your tasks:
1. Parse age from the input.
2. If age < 3, return "Hi, baby!"
3. If age < 18, return "Hello!"
4. If age < 100, return "Greetings!"
5. Else return "What an unusual age!"
6. Handle invalid input (non-numbers or negative values) by returning an error
message.

Sample Output:
--------------
case=1
input=2
output=Hi, baby!

case=2
input=10
output=Hello!

case=3
input=25
output=Greetings!

case=4
input=105
output=What an unusual age!

case=5
input=two
output=Error: Age must be a valid number
*/


const readline = require('readline');
const rl = readline.createInterface({
input: process.stdin,
output: process.stdout
});
// Implement ageGreeting(input)
const ageGreeting = (input) => {
// 1. Convert input to a number
// 2. Check if valid number and >= 0
// 3. Apply conditional checks for greeting ranges
// 4. Return appropriate greeting or error message

const n = Number(input)
if(!Number.isInteger(n) || n < 0)
{
    return "Error: Age must be a valid number";
}

if (n < 3)
{
    return "Hi, baby!";
}
else if(n < 18)
{
    return "Hello!";
}
else if(n < 100)
{
    return "Greetings!";
}
else{
    return "What an unusual age!";
}
};
rl.question('', (input) => {
console.log(ageGreeting(input));
rl.close();
});