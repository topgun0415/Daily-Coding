/** @format */

// 클로저 : 클로저는 함수와 그 함수가 선언된 렉시컬 환경과의 조합이다.

// 렉시컬 스코프 : 자바스크립트 엔진은 함수를 어디서 호출했는지가 아니라 함수를 어디에 정의했는지에 따라 상위 스코프를 결정한다. 이를 렉시컬 스코프(정적  스코프)라 한다.

const x = 1;

function outerFunc() {
  const x = 10;

  innerFunc();
}

function innerFunc() {
  console.log(x);
}
outerFunc(); // 1

// 렉시컬 환경의 "외부 렉시컬 환경에 대한 참조"에 저장할 참조값, 즉 상위 스코프에 대한 참조는 함수 정의가 평가되는 시점에 함수가 정의된 환경(위치)에 의해 결정된다. 이것이 바로 렉시컬 스코프다.

// 함수 객체의 내부 슬롯 [[Environment]] : 함수가 정의된 환경과 호출되는 환경은 다를 수 있다. 따라서 렉시컬 스코프가 가능하려면 함수는 자신이 호출되는 환경과는 상관없이 자신이 정의된 환경, 즉 상위 스코프(함수 정의가 위치하는 스코프가 바로 상위 스코프다)를 기억해야한다. 이를 위해 함수는 자신의 내부 슬롯 [[Environment]]에 자신이 정의된 환경, 즉 상위 스코프의 참조를 저장한다.

const xx = 1;

function foo() {
  const xx = 10;

  // 상위 스코프는 함수 정의 환경에 따라 결정된다.
  // 함수 호출 위치와 상위 스코프는 아무런 관계가 없다.
  bar();
}

// 함수 함수 bar는 자신의 상위 스코프, 즉 전역 렉시컬 환경을 [[Environment]]에 저장하여 기억한다.
function bar() {
  console.log(xx);
}

foo(); // 1
bar(); // 1

// 클로져와 렉시컬 환경

const xxx = 1;

// 1
function outer() {
  const xxx = 10;
  const inner = function () {
    console.log(xxx); // 10
  };
  return inner;
}

// outer 함수를 호출하면 중첩 함수 inner를 반환한다.
// 그리고 outer 함수의 실행 컨텍스트는 실행 컨텍스트 스택에서 팝되어 제거된다.

// const innerFunc = outer();
innerFunc(); // 10

// 자바스크립트 모든 함수는 상위 스코프를 기억하므로 이론적으로 모든 함수는 클로저다. 그렇다고 모든 함수가 또 클로저는 아닌 것이 상위 스코프의 식별자를 참조하지 않는 것은 클로저가 아니기 때문이다.

function foo1() {
  const a = 1;

  // bar 함수는 클로저였지만 곧바로 소멸한다.
  // 이러한 함수는 일반적으로 클로저라고 하지 않는다.
  function bar1() {
    console.log(a);
  }
  bar1();
}
foo1();

// 위 예제의 중첩 함수 bar1는 상위 스코프의 식별자를 참조하고 있으므로 클로저다. 하지만 외부 함수 foo1의 외부로 중첩 함수 bar가 반환되지 않는다. 즉 외부 함수 foo1보다 bar1의 생명 주기가 짧은 경우 bar1 함수는 클로저였지만 외부 함수보다 일찍 소멸되기 때문에 생명 주기가 종료된 외부 함수의 식별자를 참조할 수 있다는 클로저의 본질에 부합하지 않는다.

function foo2() {
  const x2 = 1; // 자유변수라고 한다 (free variable)
  const y2 = 2;

  // 클로져
  // 중첩 함수 bar는 외부 함수보다 더 오래 유지되며 상위 스코프의 식별자를 참조한다.
  function bar2() {
    console.log(x2);
  }
  return bar2;
}
const bar2 = foo2(); // x2 = 1

// 위 예제에서는 중첩 함수bar2는 상위 스코프의 식별자를 참조하고 있으므로 클로저다. 그리고 외부 함수의 외부로 반환되어 외부 함수보다 더 오래 살아 남는다. 이처럼 외부 함수보다 중첩 함수가 더 오래 유지되는 경우 중첩 함수는 이미 생명 주기가 종료한 외부 함수의 변수를 참조할 수 있다. 이러한 중첩 함수를 클로저라고 부른다. 클로저는 중첩 함수가 상위 스코프의 식별자를 참조하고 있고 중첩 함수가 외부 함수보다 더 오래 유지되는 경우에 한정하는 것이 일반적이다.

// 클로저의 활용 : 클로저는 상태(state)를 안전하게 변경하고 유지하기 위해 사용한다. 다시 말해, 상태가 의도치 않게 변경되지 않도록 상태를 안전하게 은닉하고 특정 함수에게만 상태 변경을 허용하기 위해서 사용된다.

// 카운트 상태 변수
let num = 0;

// 카운트 상태 변경 함수
const increase = function () {
  // 카운트 상태를 1만큼 증가시킨다
  return ++num;
};

console.log(increase()); // 1
console.log(increase()); // 2
console.log(increase()); // 3

// 1. 카운트 상태(num 변수의 값)는 increase 함수가 호출되기 전까지 변경되지 않고 유지되어야 한다.
// 2. 이를 위해 카운트 상태(num 변수의 값)는 increase 함수만이 변경할 수 있어야 한다.

// * 위와 같은 예시는 num이 전역변수로 선언되었고, 만에 하나 누군가 num의 상태를 건들게 된다면 원하지 않는 값으로 이어지게 된다.

// 카운터 상태 변경 함수
const increase1 = function () {
  // 카운트 상태 변수
  let num = 0;
  // 카운트 상태를 1만큼 증가시킨다.
  return ++num;
};

// 이전 상태를 유지하지 못한다.
console.log(increase1()); // 1
console.log(increase1()); // 1
console.log(increase1()); // 1

// 위의 예시는 increase1 함수가 불러올때마다 nums 가 지속해서 값이 0으로 초기화되버린다.

const increase2 = (function () {
  // 카운트 상태 변수
  let num = 0;
  // 클로져
  return function () {
    // 카운터 상태를 1만큼 증가시킨다.
    return ++num;
  };
})();

console.log(increase2()); // 1
console.log(increase2()); // 2
console.log(increase2()); // 3

// 위 코드가 실행되면 즉시 실행함수가 호출되고 즉시 실행함수가 반환한 함수가 increase 변수에 할당된다. increase 변수에 할당된 함수는 자신이 정의된 위치에 의해 결정된 상위 스코프인 즉시 실행 함수의 렉시컬 환경을 기억하는 클로저다. 즉시 실행 함수는 호출된 이후 바로 사라지지만 반환한 클로저는 increase 변수에 할당되어 호출되므로 상위 스코프인 즉시 실행 함수의 렉시컬 환경을 기억하고 있다.
