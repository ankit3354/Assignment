const ReverseStr = (str) => {
  // converting string into array
  let rev = str
    .split(" ")
    // mapping on each word
    .map((word) =>
      // converting into array and then reversing it and then join together without space
      word.split("").reverse().join("")
    );
  // joining and giving space between it
  return rev.join(" ");
};

// string in another variable
const resultStr = ReverseStr("This is a sunny day");

console.log("This is a sunny day. Reversed  ->", resultStr);
