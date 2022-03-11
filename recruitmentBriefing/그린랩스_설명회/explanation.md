### 


[2번째 페이지](./explanation2.md)

[3번째 페이지](./explanation3.md)

### 그린랩스 채용 설명회 Highlight 정리

- 코드 리뷰가 비효율적인 이유 

    - 트레이드 오프가 불분명한 대안 

        - '부모 클래스로 공통 코드를 추출하면 좋지 않을까요???'

    - 끝나지 않는 토론으로 이어지며, 시간이 낭비되는 지점 

- 코드 리뷰가 효율적이려면??

    - 명백한 실수, 개선점 지적 

        - `null 체크가 빠졌습니다`

    - 사실에 기반한 지적 

        - 공식적인 리액트 안티패턴입니다

- 명백한 지적을 만드는 함수형 원칙들 

    1. 순수 함수가 그렇지 않은 함수보다 낫다 

    2. 부수 효과는 국소적이어야 한다 

    3. 1개의 자료구조에 동작하는 100개의 함수가, 10개의 자료구조에 동작하는 10개의 함수보다 낫다?

- 함수형 원칙들이 개입하는 사례

    1. OOP: 상태 변수를 최소화하세요
        => FP: 변수 쓰지 마세요 

        - 라고 리뷰를 하심 

    2. OOP: 루프 안에서 변수를 선언하세요   
        => FP: 루프문도 쓰지 마세요.
    
    3. OOP: 상속 보다는 위임을 고려하세요 
        => FP: 클래스도 쓰지 말아라??

- 그렇다고 언어까지 바꿔야 하나요?

    - 기존에 알던 것을 전부 버려가면서 Rescript를 써야 하는가??

### 

1. 성능 지뢰를 피할 수 있습니다. 

```javascript
// A
let adults = [];
for(let i = 0; i < people.length ; i++){
    if(people[i].age >= 19){
        adutls.push(people[i].name);
    }
}
```

```javascript
// B
people.reduce((acc,p)=>{
    (p.age >= 19) ? [...acc, p.name] : acc, []
});
```

- 아래 코드는 성능에 문제가 있음 

- 왜? 

    - [...acc, p.name]

    - ...acc에 적용된 spread 연산자가 매번 배열을 복사하기 때문 

    - 결과적으로, reduce의 시간 복잡도가 `O(N^2)`

- 프로덕션에서 더 큰 데이터 입력이 들어온다면?

    - 매 루프에서 GC가 발생 

    - 함수형은 느리다는 오해의 주범 

### Rescript 선택 이유 

1. Array와 Object에 스프레드 불가능 

    - 오로지 List에만 O(1) 스프레드 가능 

2. 내장된 불변 자료구조

3. JS보다 효율적인 레코드 복사 

```javascript
// record update example

// record update
let tenFields = { ... tenFields, a: 2};

// JS spread syntax
let tenFieldsJS: tenFields = [%bs.raw "{...tenFieldsJs, a: 2}"];

// JS Object.assign
let tenFieldsJs: tendFields = [%raw 
"Object.assign({}, tenFieldsJs, {a: 2})"];
```

### 레코드 스프레드가 150배 빠른 이유?

- JS 객체는 OOP 기능들을 포함하고 있기 때문 
    
    - cf. 스프레드 폴리필, Object.assign 폴리필 

    - `앞으로도 결코 빨라질 수 없음`

    - 반면 rescript는.... 

        - 클래스 대신 `명시적 타입(nominal type)`으로 구현 단순화

2. 원칙에 위배되는 코드가 못생겨짐 

```javascript
// A
let total = 0;
for(let i = 0; i < items.length ; i++){
    total += items[i].price;
}

// B : A와 동일한 동작 
let total = items.map(i => i.price)
                .reduce((a,b)=> a+b,0);
```

- 사실 이건 둘 다 특별한 문제가 없음??

- 취향이 다른 사람들이 감수하면서 써야 하는 것이 있음 

- 반면 rescript에선...

```rescript
// 앞선 A와 동일한 표현
let total = ref(0)
for(i in 0 to 10) {
    total := total.contents + Array.getUnsafe(items, i).price
}
total.contents
```

- 위 코드에서 ref, getUnsafe, := 가 코드 스멜이라고 하심 

### 극단적인 원칙으로 인한 변화

- 높아지는 리뷰의 생산성 

- 점차 `선언적(=객관적)`으로 바뀌는 코드 

    - 효율적인 리뷰를 만드는 또 다른 원인

- 서비스 안정성 UP

    - sentry에 집계되는 오류 중, 리스크립트 오류는 1% 미만 

    - 특징 중 하나는, 잡히는 대다수의 런타임 error는 90%이상은 타입 에러 

    - 유독 JS에서만 발생하는 Type error

[다음 페이지](./explanation2.md)