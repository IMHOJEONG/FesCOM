### 이러한 노력들이 없다면?

- 일상 다반사로 지원하지 않는다는 창을 보게 됨 

- 요새는 보기 힘듬 

- 수많은 분들이 피땀 흘려 노력해 달성한 부분 

### Rest가 웹의 독립적 진화에 도움을 주었나?

- HTTP에 지속적으로 영향을 줌 

- Host 헤더 추가 

- 길이 제한을 다루는 방법이 명시 (414 URI Too Long 등)

- URI에서 리소스의 정의가 추상적으로 변경됨: `식별하고자 하는 무언가`

- 기타 HTTP, URI에 많은 영향을 줌 

- HTTP/1.1 명세에는 REST에 대한 언급이 들어감 

- 로이 필딩이 자기가 옳다고 생각한 대로 만듬 

  - HTTP, URI 명세 저자 중 한명 

### 그럼 REST는 성공했는가?

- 웹은 독립적으로 성장하고 있음 => 성공

### REST API는??

- REST API는 REST 아키텍처 스타일을 따라야 함 

- API 대부분이 잘 안 따르고 있어 

- REST API도 저 제약조건들을 다 지켜야 하는 건가?

  - 로이 필딩이 말했음 => 다 지켜야 한다고 

- REST는 SOAP(복잡, 규칙, 어려움)보다 나은 줄 

  - REST도 어려움 

- 원격 API가 꼭 REST API여야 하는가?

  - 로이 필딩 : 시스템 전체를 통제할 수 있다 or 진화에 관심이 없다면 => REST에 시간을 낭비하지마 

### 그럼 어떻게 해야 하는가?

- 1. REST API 구현 후 REST API라고 하자 

- 2. rEST API 구현을 포기하고 HTTP API라고 부름

- 3. REST API가 아니지만 REST API라 부름 (현재 상태)

- 로이 필딩이 : 제약 조건을 따르던지, 다른 단어를 쓰라고 함 

- 도전 ㄱㄱ 1번 ㄱㄱ

### 왜 API는 REST가 잘 안되는가?

- 웹 페이지는 결국 사람이 보지만, HTTP API는 기계가 해석함 

- 그러다 보니, 미디어 타입이 다름 

  - 웹 페이지 => HTML

  - JSON, XML => 기계가 이해할 수 있는 포맷

- HTML과 JSON

  - HTML : Hyperlink - 잘 됨, Self-descriptive - HTML 명세 

  - JSON : Hyperlink - 정의 X, Self-descrptive - 불완전(문법만 정의됨, 값들이 어떠한 의미를 가져야 하는 게 정의X)

  - 문법 해석은 가능하지만, 의미를 해석하려면 별도로 문서가(API 문서 등) 필요함 

### Self-descriptive, HATEOAS가 독립적 진화에 어떻게 도움이 될까?

- Self-descriptive : 확장 가능한 커뮤니케이션 

  - 서버나 클라이언트가 변경되더라도 오고가는 메시지는 언제나 self-descriptive 하므로 언제나 해석이 가능함 

- HATEOAS : 애플리케이션 상태 전이의 late binding

  - 어디서 어디로 전이가 가능한지 미리 결정되지 않음 

  - 어떤 상태로 전이가 완료되고 나서야 그 다음 전이될 수 있는 상태가 결정됨 

  - 링크는 동적으로 변경될 수 있다 

### 그럼 REST API로 고쳐보자

- Self-descriptive 

  - 방법1: Media type 

    - 1. 미디어 타입을 정의

    - 2. 미디어 타입 문서를 작성한다. 이 문서에 "id"가 뭐고 "title"이 뭔지 의미를 정의한다 

    - 3. IANA에 미디어 타입을 등록한다. 이 때 만든 문서를 미디어 타입의 명세로 등록한다. 

    - 4. 이제 이 메시지를 보는 사람은 명세를 찾아갈 수 있으므로 이 메시지의 의미를 온전히 해석할 수 있음 

   - 단점 : 매번 media type을 정의해야 함


  - 방법2: Profile

    - 1. "id"가 뭐고, "title"이 뭔지 의미를 정의한 명세를 작성한다 

    - 2. Link 헤더에 profile relation으로 해당 명세를 링크한다 

    - 3. 이제 메시지를 보는 사람은 명세를 찾아갈 수 있으므로 이 문서의 의미를 온전히 해석할 수 있음 

    - 단점:

      1. 클라이언트가 Link 헤더와 profile을 이해해야 함 

      2. Content negotiation을 할 수 없다 



```json
Content-Type: application/vnd.tods+json


Link: <https://example.org/docs/todos>; rel="profile"
```

- HATEOAS

  - 방법1: data로 

    - data에 다양한 방법으로 하이퍼링크를 표현한다 

    - JSON으로 하이퍼링크를 표현하는 방법을 정의한 명세들을 활용한다 

    - 단점 : 기존 API를 많이 고쳐야한다 (침투적)

  
  - 방법2: HTTP 헤더로 

    - Link, Location 등의 헤더로 링크를 표현한다

  - data, 헤더 모두 활용하면 좋음 
   
- Hyperlink는 반드시 uri여야 하는 건 아닌가?

  - 다 괜찮음 

- Media Type 등록은 필수인가

  - NO

  - 의도한 저자가 이해할 수 있다면 상관없음 

- Media Type을 IANA에 등록하기 

  - 누구나 쉽게 사용할 수 있게 된다 

  - 이름 충돌을 피할 수 있다 

  - 등록이 별로 어렵지 않다(고 주장함)

### 정리 

- 오늘날 대부분의 REST API는 사실 REST를 따르지 않고 있음 

- REST 제약 조건 중 특히 Self-descriptive, HATEOAS를 잘 만족하지 못한다. 

- REST는 긴 시간에 걸쳐 진화하는 웹 Application을 위한 것

- REST를 따를 것인지는 API를 설계하는 이들이 스스로 판단해 결정해야 함 

- REST를 따르겠다면, Self-descriptive, HATEOAS를 만족시켜야 함 

  - Self-descriptive는 custom media type or profile link relation 등으로 만족시킬 수 있음 

  - HATEOAS는 HTTP 헤더나 본문에 링크를 담아 만족시킬 수 있음


