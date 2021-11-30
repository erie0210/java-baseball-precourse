- 게임시작
    - 컴퓨터가 랜덤한 수를 생성한다
      - [x]  `camp.nextstep.edu.missionutils의 Random` 을 사용한다
      - [x]  컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다
    - 플레이어가 수를 입력한다: 1부터 9까지 서로 다른 3자리 숫자를 입력받는다.
      - [x]  `camp.nextstep.edu.missionutils.Console의 readline` 을 사용한다
      - [x]  (예외) 0,1,2자리만 입력했을 경우 (엔터를 누르는 경우)
      - [x]  (예외) 4자리를 입력했을 경우 (재시작 엣지로 이어짐)
      - [x]  (예외) 숫자가 아닐 수 있다.
      - [x]  (예외) 길이가 3이어야 한다.
      - [x]  (예외) 0이 들어왔을 때 예외처리 한다.
      - [x]  중복되는 값이 없어야한다(Unique해야한다)
- 게임을 진행: 
  - 비교한다: 1~9까지 리스트를 만들고 각 자리에 위치정보를 넣어 비교한다.
    - [x]  정답을 맞출 때까지 과정을 반복한다
    - [x]  컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
  - 결과를 출력한다.
    - `같은 수가 같은 자리`에 있으면 `스트라이크`를 출력한다
    - `같은 수가 다른 자리`에 있으면 `볼`을 출력한다
    - `같은 수가 전혀 없으면` `포볼` 또는 `낫싱`을 출력한다
    - [x]  프로그래밍 실행 결과 예시와 동일하게 입력과 출력이 이루어져야 한다
- 재도전 또는 종료
  - 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
  - [x]  1,2 말고 다른 것 입력
  - 입력하지 않고 화면을 끄는 경우 (문제 없음)
  - 끝나기 전에 누르는 경우 (불가능)
  - 동시에 누르는 경우(불가능)
cf. 에러 처리한다
    - [x]  `IllegalArgumentException`을 발생시키며 어플을 종료한다.