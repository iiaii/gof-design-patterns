# #GoF디자인패턴/행동패턴/커맨드
[디자인패턴 커맨드 패턴 ( Command Pattern ) :: victolee](https://victorydntmd.tistory.com/295)
[Design Pattern 커맨드 패턴이란 - Heee’s Development Blog](https://gmlwjd9405.github.io/2018/07/07/command-pattern.html)

## 커맨드 (Command - 명령)

### 의도

요청 자체를 캡슐화하는 것이다. 이를 통해 요청이 서로 다른 사용자를 매개변수로 만들고, 요청을 대기시키거나 로깅하며, 되돌릴 수 있는 연산을 지원한다.


### 다른 이름

Action, Transaction


### 동기

항상 그렇지는 않지만, 요청받은 연산이 무엇이며, 이를 처리할 객체가 누구인지에 대한 아무런 정보 없이 임의의 객체에 메시지를 보내야 할 때가 간간이 있다. 예를 들어 사용자 인터페이스 툴킷은  버튼, 메뉴 같은 객체를 포함하는데, 이는 사용자의 메시지를 처리하게 된다. 그러나 사용자 인터페이스 툴킷은 버튼과 메뉴에서 요청을 처리할 수 없다. 툴킷을 사용하는 응용프로그램만이 어떤 객체를 통해서 어떤 일이 되어야 하는지 알기 때문이다. 사용자 인터페이스 툴킷 설계자의 입장에서는 어떤 객체가 이 요청을 처리할지를 알아낼 방법이 없다.

커맨드 패턴은 툴킷 객체가 요청 자체를 객체로 바꿈으로써 명시되지 않은 응용프로그램 객체의 요청을 처리할 수 있도록 지원하는 패턴이다. 이 객체는 다른 객체처럼 저장되거나 전달될 수도 있다. 이 패턴의 핵심은 연산을 실행하는 데 필요한 인터페이스를 선언해 놓는 Command 추상 클래스이다. 이 클래스에 들어가는 가장 기본적인 연산이 Execute()이다. Command 추상 클래스에서 상속받은 Command 서브클래스들은 수신 객체에 대한 참조자를 인스턴스 변수로 저장하며, 이 수신 객체에 정의된 요청을 호출하도록 Execute()를 구현하여 수신자 - 작동 쌍을 정의한다. 수신 객체는 자신에게 전달된 요청을 어떻게 처리해야 하는지 안다.

[image:2A076DA5-CD69-4BB2-AD4C-080BC8499239-85545-0001BC480C573A1C/커맨드1.jpeg]

이 Command 객체로 쉽게 구현할 수 있는 대표적인 예가 메뉴이다. 메뉴에서 각 선택 항목은 MenuItem 클래스의 한 인스턴스이다. 응용프로그램을 나타내는 Application 클래스는 이들 메뉴를 생성하고 메뉴 항목을 관리한다. 또한, 사용자가 연 Document 객체가 무엇인지 계속 추적한다.

응용프로그램은 각 MenuItem 객체를 Command의 어떤 서브클래스 인스턴스와 연결되도록 설정한다. 사용자가 MenuItem 인스턴스를 선택하면 MenuItem 인스턴스는 연결된 Command 서브클래스의 Execute() 연산을 호출한다. MenuItem 클래스는 Command 클래스를 상속받은 어떤 서브클래스가 사용하는지 모른다. 실제로는 Command의 서브클래스들이 요청을 처리해 줄 객체에 대한 정보가 있으며, 이들 객체에 하나 이상의 연산을 호출한다.

예를 들어, PasteCommand 클래스는 클립보드에 있는 내용을 문서로 붙이는 일을 담당한다. PasteCommand 클래스의 요청을 받아 수행하는 객체는 Document 객체이다. Execute() 연산은 처리할 Document 클래스에 정의된 Paste()를 호출하도록 구현하면 된다.

[image:32437FAE-2F5A-47F1-980C-58A2F85518EF-85545-0001BCB0D89FCC8D/커맨드2.jpeg]

그러나 OpenComand 클래스에 정의된 Execute() 연산은 좀 다르다. 사용자에게 열어야 하는 문서의 이름을 물어보고 해당하는 Document 객체를 생성한 다음, 이 객체를 응용프로그램에서 다루는 문서로 첨가하고 연다.

[image:3CBFCF10-902A-4D2F-9F6D-61D2694F64E3-85545-0001BCF06DEBC403/커맨드3.jpeg]

가끔은 MenuItem 객체가 일련의 명령어를 순차적으로 처리해야 할 때도 있다. 가령 일반 크기의 페이지를 가운데로 맞추고자 할 때 CenterDocumentCommand 객체와 NormalSizeCommand 객체를 이용하여 이를 처리할 수 잇다. 이를 위해 MacroCommand 클래스를 정의하여 여러 종류의 명령어를 처리할 수 있도록 한다. MacroCommand 클래스는 Command의 서브클래스이면서 일련의 명령어들을 처리하도록 한다. 그러므로 MacroCommand는 어떤 객체가 이 요청들을 처리해야 하는지에 대한 정보가 없다. 단지 일련의 명령어 처리 흐름이 있을 뿐, 무엇을 구체적으로 할지 정의하지 않기 때문이다.

[image:207B895A-E07D-4D99-8E27-AC8A5D64DDAA-85545-0001BD22FE2EF5AB/커맨드4.jpeg]

지금까지의 예를 하나씩 살펴보면, Command 패턴이 연산을 호출하는 객체와 이를 수행하는 객체를 분리하고 있음을 알 수 있다. 응용프로그램은 동일한 기능 처리에 메뉴를 사용할 수 있고, 푸시 버튼을 사용할 수도 있다. 단지 이들 인터페이스 요소가 Command를 상속하는 동일한 서브클래스를 공유함으로써 동일하게 처리되기 때문이다. 또 명령어를 동적으로 교체할 수도 있는데, 이것은 상황마다 다르게 메뉴를 구현해야 할 때 도움이 된다. 즉, 사용자 인터페이스는 동일한데, 선택시에 처리되는 방식을 달리하려면 Command를 상속하는 새로운 클래스만 정의하면 된다. 또한 스크립팅을 이용하면 명령어들을 구성할 수도 있다.


### 활용성

커맨드 패턴은 다음과 같은 일을 하고 싶을 때 사용한다.

- 수행할 동작을 객체로 매개변수화하고자 할 때. 절차지향 프로그램에서는 이를 콜백 함수, 즉 어딘가 등록되었다가 나중에 호출되는 함수를 사용해서 이러한 매개변수화를 표현할 수 있다. 커맨드 패턴은 콜백을 객체지향 방식으로 나타낸 것이다.
- 서로 다른 시간에 요청을 명시하고, 저장하며, 실행하고 싶을 때 Command 객체는 원래의 요청과 다른 생명주기가 있다. 요청을 받아 처리하는 객체가 주소 지정 방식과는 독립적으로 표현될 수 있다면, Command 객체를 다른 프로세스에게 넘겨주고 거기서 해당 처리를 진행하게 할 수 있다.
- 실행 취소 기능을 지원하고 싶을 때, Command의 Execute() 연산은 상태를 저장할 수 있는데, 이를 이용해서 지금까지 얻은 결과를 바꿀 수 있다. 이를 위해 Unexecute() 연산을 Command 클래스의 인터페이스에 추가한다. 실행된 명령어를 모두 기록해 두었다가 이 리스트를 역으로 탐색해서 다시 Unexecute()를 수행하게 한다. Execute()와 Unexecute() 연산의 반복 사용을 통해 수행과 취소를 무한 반복할 수 있다.
- 시스템이 고장 났을 때 재적용이 가능하도록 변경과정에 대한 로깅을 지원하고 싶을 때. Command 인터페이스를 확장해서 load()와 store() 연산을 정의하면 상태의 변화를 지속적(persistent) 저장소에 저장해 둘 수 있다. 시스템 장애가 발생했을 때 해당 저장소에서 저장된 명령어를 읽어 다시 Execute() 연산을 통해 재실행하면 된다.
- 기본적인 연산의 조합으로 만든 상위 수준 연산을 써서 시스템을 구조화하고 싶을 때. 정보 시스템의 일반적인 특성은 트랜잭션을 처리해야 한다는 것이다. 트랜잭션은 일련의 과정을 통해 데이터를 변경하는 것인데, Command 패턴은 이런 트랜잭션의 모델링을 가능하게 한다. Command 클래스는 일관된 인터페이스를 정의하는데, 이로써 모든 트랜잭션이 동일한 방식으로 호출된다. 새로운 트랜잭션을 만들면 상속으로 Command 클래스를 확장하면 되므로 시스템 확장도 어렵지 않다.


### 구조

[image:1AB49C40-CE43-4B38-8874-9A3B4DD41A4D-85545-0001BDB222E56691/커맨드5.jpeg]


### 참여자

- **Command** : 연산 수행에 필요한 인터페이스를 선언한다.
- **ConcreteCommand** (PasetCommand, OpenCommand) : Receiver 객체와 액션 간의 연결성을 정의한다. 또한 처리 객체에 정의된 연산을 호출하도록 Execute를 구현한다ㅏ. 앞에서 정의한 PasteCommand, OpenCommand를 예로 들 수 있다.
- **Client** (Application) : ConcreteCommand 객체를 생성하고 처리 객체로 정의한다.
- **Invoker** (MenuItem) : 명령어에 처리를 수행할 것을 요청한다.
- **Receiver** (Document, Application) : 요청에 관련된 연산 수행 방법을 알고 있다. 어떤 클래스도 요청 수신자로서 동작할 수 있다.


### 협력 방법

- 사용자는 ConcreteCommand 객체를 생성하고 이를 수신자로 지정한다.
- Invoker 클래스는 ConcreteCommand 객체를 저장한다.
- Invoker 클래스는 command에 정의된 Execute()를 호출하여 요청을 발생시킨다. 명령어가 취소 가능한 것이라면 ConcreteCommand는 이전에 Execute() 호출 전 상태의 취소 처리를 위해 저장한다.
- ConcreteCommand 객체는 요청을 실제 처리할 객체에 정의된 연산을 호출한다. (Command 객체로 요청 발생자가 요청 수신자에서 분리됨)


### 결과

1. Command는 연산을 호출하는 객체와 연산 수행 방법을 구현하는 객체를 분리한다.
2. Command는 일급 클래스(객체?)이다. 다른 객체와 같은 방식으로 조작되고 확장할 수 있다.
3. 명령 여러개를 복합해서 복합 명령을 만들 수 있다. 앞에서 MacroCommand 클래스를 예로 들었는데, 컴포지트(복합체) 패턴을 이용해서 여러 명령어를 구성할 수 있다.
4. 새로운 Command 객체를 추가하기 쉽다. 기존 클래스를 변경할 필요 없이 단지 새로운 명령어에 대응하는 클래스만 정의하면 된다.


### 구현

1. **명령이 얼마나 지능적이어야 하는가?** 명령어는 다양한 기능을 갖는데, 가장 대표적인 것이 처리 요청을 수행하는 액션과 이를 받는 객체 사이의 연결 관계를 정의하는 것이다. 또 수신 객체에 대한 어떤 요청의 전달 없이도 자신이 모든 것을 처리할 수 있기도 하다. 후자는 적당한 수신 객체가 존재하지 않을 때, 기존 클래스들과 독립성을 보장하는 명령어를 정의하고자 할 때 매우 유용한 기능이다. 예를 들어, 다른 응용프로그램 윈도우를 생성하는 명령어는 단지 윈도우를 객체로 생성하는 능력에 불가할지도 모른다. 그러므로 명령 패턴은 수신 객체를 동적으로 발견할 수 있는 능력을 지녀야 한다.

2. **취소(undo) 및 반복(redo) 연산 지원하기.** 명령어가 지금까지 수행해 온 것을 뒤집는 방법을 제공한다면 가능한 일이다. ConcreteCommand 클래스는 이러한 취소와 반복을 처리하기 위해서 추가적으로 상태 정보를 관리해야 한다. 추가적인 상태 정보는 다음과 같다.

- 실제 요청을 처리할 책임을 지는 수신 객체
- 수신 객체가 수행할 연산에 필요한 매개변수 정보
- 요청이 처리되어 변하기 전의 원래 값. 수신 객체는 명령어가 이전의 상태로 되돌아갈 수 있도록 하는 연산을 정의해야 한다.

한 단계의 수행 취소를 위해서는 방금 전에 수행한 명령어만 기록하면 된다. 그러나 여러 단계의 실행과 취소를 가능하게 하려면 수행한 명령어들의 이력 목록을 남겨야 하고, 최대한 지원할 수 있는 단계를 정의해두어야 한다. 이 이력 목록은 명령어의 수행 순서를 정의하며, 이 목록을 반대로 읽으면 수행한 결과를 취소하는 효과가 있다.

취소할 수 있는 객체를 이력 목록에 저장되기 전에 복사해 둘 때도 있다. MenuItem에서 온 첫 번째 요청을 수행하는 명령어 객체가 다음번에 또다시 다른 요청을 처리할 수도 있기 때문이다. 복사는 동일한 명령어이기는 하지만, 서로 다른 호출로 발생한 것임을 구별해야 한다.

예를 들어 DeleteCommand 클래스는 선택된 객체를 삭제하는 명령어인데, 저장할 때는 프로그램이 실행될 때마다 삭제된 객체의 집합을 저장해야 한다. 그러므로 DeleteCommand 객체는 실행 후 복사되어 이력 목록에 저장하면 된다. 명령어의 상태가 런타임에 변하지 않는다면 복사할 필요 없이 다시 실행되어야 하는 명령어에 대한 참조자만 이력 목록에서 저장하면 된다. 이때는 명령어 실행 전에 이력 목록에서 저장할 수 있고, 이렇게 되면 원형 객체처럼 역할을 수행한다. (프로토타입(원형) 패턴)

3. **취소를 진행하는 도중 오류가 누적되는 것 피하기.** 처리 내역의 이력을 관리할 때 문제가 될 수 있는 부분은 신뢰성을 보장하면서 처리된 의미들을 유지한채 수행/취소 처리가 되어야 한다는 것이다. 명령어를 처리하면서 자꾸 오류가 발생할 수 있는데, 이렇게 오류의 발생이 수행/취소를 거듭하여 누적되면 응용프로그램의 초기 상태에서 상당히 멀어진다. 그러므로 객체가 처리 결과를 취소했을 때 원래의 상태로 복귀했는지 확인하는 작업이 필요하다. 명령어가 다른 객체의 내부를 노출하지 않은 채 객체의 수행 결과에 대한 정보에 접근하여 확인할 수 있도록 메멘토 패턴을 적용할 수도 있다.


### 관련 패턴

MacroCommand를 구현하는데 컴포지트(복합체) 패턴을 사용할 수 있다. 취소를 처리할 때 객체의 상태를 관리하는데는 메멘토 패턴을 사용할 수 있다. 또 명령어가 처리되어 처리된 이력 목록에 저장되기 전에 명령어를 복사해야 한다면 프로토타입 패턴을 사용하면 된다.

