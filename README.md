## 숫자야구게임 기능 구현
> 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임

## 요구사항
1. 같은 수가 같은 자리에 있으면 해당 숫자와 스트라이크 문자를 붙여 출력 
2. 같은 수가 다른 자리에 있으면 해당 숫자와 볼 문자를 붙여 출력
3. 같은 수가 전혀 없으면 포볼 또는 낫싱 출력
4. 숫자를 전부 맞히면 게임을 종료
5. 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있음

## TODO 
1. 1~9 범위의 랜덤한 세자리 수를 구한다.
2. 사용자로부터 세자리 수를 입력 받는다.
  - 중복된 숫자가 존재하는지?
  - 1~9 사이의 숫자인지?
  - 3자리 인지?
3. 위치와 값이 동일하면 스트라이크
4. 값이 동일하면 볼
5. 값이 동일하지 않으면 낫싱

## 예시
1. 입력값이 123이고 컴퓨터가 제시한 값이 155 일 때 1스트라이크가 출력된다.
2. 입력값이 425이고 컴퓨터게 제시한 값이 456 일 때 1스트라이크 1볼이 출력된다.
3. 입력값이 135이고 컴퓨터게 제시한 값이 789 일 때 낫싱이 출력된다.
