### 개요 


[Youtube 링크](https://www.youtube.com/watch?v=RP_f5dMoHFc)

- 왠지 그 부분은 Rest 스럽지 않다? 이건 좀 REST API가 아닌 거 같은데?

- REST가 뭐라 말하기 정말 어려움 

- 그런데 무슨 말이야?

### 역사를 따라가보자 

- 시작은 Web 

Q: 어떻게 인터넷에서 정보를 공유할 것인가?

A: 정보들을 하이퍼텍스트로 연결한다.

  - 표현 형식 : HTML, 식별자 : URI, 전송 방법 : HTTP

- 로이 필딩이 HTTP 프로토콜을 고치게 되면? 기존 웹과의 호환성을 피하기 어렵다고 생각 

- 웹을 망가뜨리지 않고 HTTP를 성장시킬 수 있을까? 

  - HTTP Object Model을 발표 

  - 4년 뒤, 1998년에 REST를 발표 

  - 2년 후, 2000년에 박사 논문으로 REST을 발표 

### 한편... API가 만들어지기 시작 

- XML-RPC (1998) - MS가 원격으로 단일 시스템의 메소드를 호출할 수 있는 프로토콜 제작 => SOAP으로 변경

- 2000년도 2월 => Salesforce API를 최초 공개 

  - 당시 SOAP를 사용해 API를 제작 

  - Salesforce API는 장사가 잘 안 됨 

- 4년 후 flickr API는 2004.8

  - REST를 이용해 간단하게 제작 => SOAP보다 같은 일을 해도 훨씬 짧음 

- 그럼 사람들은 어떤 느낌을?

  - SOAP은 복잡 => REST로 인기가 급상승 

- REST가 이김 

- 그런데, 2008년에 CMS를 위한 표준인 CMIS(2008)에 생산 

  - CMIS에 REST는 없다고 로이 필딩이 말함

- 2016년에 MS가 REST API 가이드라인 만듬 

  - 사람들이 보기에 되게 합리적인줄 

  - 이것도 로이 필딩이 REST API라고 하지 않음 

- REST API는 hypertext-driven?, REST API를 위한 최고의 버저닝 전략은 버저닝을 안 하는 것??

  - 왜 이러한 차이가 오는 걸까?

- REST API : REST 아키텍처 스타일을 따르는 API

### 그러면 REST는?

- 분산 하이퍼미디어 시스템을 위한 아키텍처 스타일

- 아키텍처 스타일 => 제약조건들의 집합 

- 이 제약조건들을 모두 지켜야 REST를 따른다고 하는 것 

### REST는 아키텍처 스타일이며 스타일들의 집합이기도 함 

- 여러 가지의 아키텍처 스타일로 이루어져 있는 것 

### 오늘날 REST API를 굴리는 것들이 왜 대체로 잘 지키는가?

- HTTP만 잘 따라도 대체적으로 잘 지키고 있기 때문 

  - Client-server, stateless, cache, layered System

- Code on Demand => 서버에서 코드를 클라이언트로 보내 실행시킬 수 있어야 한다는 것 

  - JS를 얘기하는 것 

### 하지만! Uniform Interface를 잘 만족하지 못함 

- 하나의 스타일이기 때문 

- 4가지 제약조건을 가짐!

1. identifiation of resources

  - 리소스가 URI로 식별되면 됨

2. manipulation of resources through representations

  - 표현 전송을 통해 리소스를 조작해야 함 

  - 리소스를 만들거나, 업데이트, 삭제 시, http 메소드에 실어 보내 해야한다는 것 

3. `self-descriptive messages`

4. `hypermedia as the engine of application state(HATEOAS)`

- 3,4 두 가지는 지키지 못하고 있음 

- 거의 예외없이 지키지 못하고 있어 

### Self-descriptive message

- 메시지는 스스로를 설명해야 함 

  - GET / HTTP/1.1

    - 뭔가 빠진 게 있음 

    - 목적지가 빠짐 

  - GET / HTTP/1.1 HOST: www.example.org

    - 목적지를 추가하면 이제 self-descriptive

- 응답 메시지에 있어, Content-Type이 추가되어야 함 

  - 응답의 대괄호, 중괄호, 문자열 의미를 이해할 수 있어, 파싱이 가능해짐 

  - 하지만, op, path와 같은 key들의 의미를 이해할 수 없음 

- Content-Type을 Application/json-patch+json으로 한다면?

  - 그제서야 이해할 수 있음 

- 결국 self-descriptive라는 것은 메시지 내용을 보았을 때, 온전히 해석이 다 가능해야 하는 것 

- 대부분, 그냥 미디어 타입이 json이라 되어 있지, 어떻게 해석해야 하는지는 알 수가 없음 

### HATEOAS - 애플리케이션의 상태는 Hyperlink를 이용해 전이되어야 한다 

- HTML은 HATEOAS를 만족함 

- 하이퍼링크를 통해 사이트가 이동함 

- JSON도 link라는 헤더를 통해 다른 리소스를 가리킬 수 있는 기능 제공 

### 왜 Uniform Interface를 만족해야 하는가?

- 독립적 진화를 위해

- 서버와 클라이언트가 각각 독립적으로 진화하기 위함 

- `서버의 기능이 변경되어도 클라이언트를 업데이트할 필요가 없음`

- 이것이 바로 REST를 만들게 된 계기 

  - Web의 깨짐 없이 HTTP의 개선을?

- 잘 지켜지고 있는 사례 => 웹 

  - 웹 페이지들은 잘 만족함 

  - 웹 페이지를 변경했다고 웹 브라우저를 업데이트할 필요 없음 

  - 웹 브라우저를 업데이트했다고 웹 페이지를 변경할 필요도 없음 

  - HTTP 명세가 변경되어도 웹은 잘 동작 

  - HTML 명세가 변경되어도 웹은 잘 동작

- 서버가 기능이 변경되어 있는 경우, 클라이언트가 호환성을 끝까지 유지할 수 없음 

  - 웹에서는 이런일이 잘 없음 

  - 웹 사이트 바뀌었다고, 브라우저는 더 이상 안 돼 => 그런일 없음
   
    - 모바일 앱 클라이언트, 서버가 REST 아키텍처 스타일을 따르고 있지 않다

- 어떻게 했을까?

  - W3C Working groups => HTML를 만듬

  - IETF Working groups => HTTP를 만듬 

  - 웹 브라우저 개발자들 

  - 웹 서버 개발자들

- HTML 5 첫 초안에서 권고안 나오는데까지 6년

- HTTP/1.1 명세 개정판 작업하는데 7년

  - 열심히 토론을 해서 문서를 다듬기만 함 

  - 왜??

  - 하위 호환성을 깨뜨리면 안 되기 때문이야

### 상호운용성에 대한 집착 

- Referer 오타지만 안 고침

- charset 잘못 지은 이름이지만 안 고침

  - 원래 encoding이라 해야 하지만...

- HTTP 상태 코드 415까지 했다가

  - 수많은 서버 구현체들이 HTTP가 아님에도 416을 구현해버림 

  - 416은 HTTP 상태 코드에서 영구 결번임 ㅋㅋㅋㅋ

- 이렇게까지 하는 이유는?

  - 잘못 만들어진 구현체하고의 상호운영성을 만족해주어야 하기 때문 

  - HTTP/0.9 지원을 아직도 함 

  - 한 번 빼봤더니, 일부 proxy에서 오동작하는 것이 발견되어 포기함 

  - 웹을 깨뜨릴 수 없기 때문 







