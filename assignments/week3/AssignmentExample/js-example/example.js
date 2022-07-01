"use strict";

console.log("Hello World from file!") // example of semi-colon injection

// single line comment

/*

Block line comment

*/

console.log(globalVar);
// console.log(myVar); reference not found

helloLog(); // can call a function before its definition due to hoisting behavior
// meaning, the function is pulled to the top of the scope

function helloLog() {
    console.log('Hello from helloLog!');
}

helloLog();

function logMessage(message) {
    console.log(message);
}

logMessage('Hello from logMessage()!');

// declaring a variable
var globalVar; // global scope
// variable declaration are hoisted to the top

//assigning/initializing a variable
globalVar = 10;
console.log(globalVar);
globalVar = "I'm a String now.";
globalVar = true;

console.log(5 == 5); // true
console.log(5 == '5'); // true -> type coersion
console.log(5 === '5'); // compare both types and value use ===

if ('false') {
    console.log('Is true!');
} else {
    console.log('Is false!');
}

// console.log(NaN(true));
console.log(isNaN(5));
console.log(isNaN('String'));

console.log(typeof (NaN));
console.log(typeof (true));

function logMessageFromInput() {
    var message = '';
    message = document.getElementById('message').value;
    console.log(message);
}

function add(a, b) {
    return a + b;
}

var myFunc = function (x, y) {
    return x + y;
}
console.log(add(1, 2));
console.log(myFunc(1, 2));

// Immediatly invoked function expression
(function () { console.log('Hello from function()') })()

/* Objects and arrays */

var obj = {
    'id': 1,
    'username': 'kev',
    'password': 'pass',
    'usernamePass': function () {
        console.log('Username ' + this.username + ' password ' + this.password);
    }
};

console.log(obj.password);
obj.usernamePass();

obj.username = 'Lane';

var arr = [1, 'kev', true, null];
arr.forEach(x => console.log(x));

var global;

function scopeTest() {
    global = 'Hello';
    var functionVar;
    {
        var blockVar = 'block';
        let blockLet = 'blockLet';
    }
    // console.log(blockLet); // let is out of scope
    console.log(blockVar); // var does not support block scope
    console.log(global);
}

console.log(global); // undefined because the function hasn't been invoked yet

scopeTest(); // setting global = 'Hello'

console.log(global); // Hello

// console.log(functionVar); // throws error because not declared outside of function scope

var varVar = 'varvar';
var varVar = true; // can redeclare and reassign

let letVar = 'letVar';
// let letVar = true; // cannot redeclare
letVar = true; // can reassign

const constVar = 'constVar';
// const constVar = 'constVar';
// constVar = true; cannot reassign value

// x = 16; // by default uses var