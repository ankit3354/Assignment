const Sorting = (...arr) => {
  let res = arr.sort((a, b) => {
    return b - a;
  });
  return res;
};

let result = Sorting(4, 3, 5, 1, 5, 7, 9);

console.log(result);
