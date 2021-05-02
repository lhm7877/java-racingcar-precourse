# 자동차 경주 게임
## 기능 정리
- 자동차 이름을 입력받는다.
    - 이름이 5자 이하인가?
- 시도할 횟수(Round)를 입력받는다.
- Round 마다 0~9 사이의 random 값을 구한다.
    - 값이 4이상이면 전진
    - 값이 3이하이면 상태 유지
- 모든 Round 종료 후 우승자를 출력한다.
    - 우승자는 1명 이상이다.
  
### 테스트 메소드명 규칙
- MethodName_StateUnderTest_ExpectedBehavior