1. Transactional

@Transactional 을 이용해서서 하나라도 통과가 안 될시 다시 처음으로 돌아가게 했습니다.

2. 인증, 인가

Interceptor을 이용해서 controller에 요청이 도달하기전 사용자 접근을 필터링 했습니다.

3. N+1

Join Fetch를 이용하여 불필요한 Select 문을 가져오는것을 해결 했습니다.

4. DB접근 최소화

findById로 1개씩 가져오던것을 findAllById로 한번에 아이디들을 가져오게 했습니다.

1. 동적쿼리

userId와 itemId가 각각의 JPA로 호출되는 문제점을 QueryDSL 하나의 쿼리로 엮었습니다.

6. 필요부분 갱신

@DynamicINsert를 넣어 `Column 'status' cannot be null` 에러를 제거하고, null 값이 들어가게 했습니다.

7. 리펙토링

else구문을 switch로 변경했습니다

응답 타입을 ReservationRequestDto로 변경 했습니다.

상태값을 ReservationStatus으로 enum으로 관리

RentalLogService 19~21 주석화

1. 테스트코드

PasswordEncoderTest

비밀번호를 인코딩하고, 인코딩화된 비밀번호가 일치하는지 확인했습니다

ItemTest

Null이 아닌지 테스트를 했습니다