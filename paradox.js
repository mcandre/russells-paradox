#!/usr/bin/env node

var a = [];
a.push(a);
console.log("A: ",  a);
console.log("A[0]: ", a[0]);
console.log("A[0][0]: ", a[0][0]);
console.log("A = ", JSON.stringify(a, null, 2));
console.log("#A: ", a.length);
