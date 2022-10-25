# SpringMVC
Spring MVC 패턴 학습용 프로젝트입니다.

### MemberController 핸들러

##### ✔️ 필요한 정보
- 이메일주소: Email
- 이름: name
- 전화번호: phone

### CoffeeController 핸들러
##### ✔️ 필요한 정보
- 커피이름: coffeeName
- 가격: price

### OrdersController 핸들러
##### ✔️ 필요한 정보
- memberId
- coffeeId

<br>
<br>

----------------------------
## 유효성 검증
#### 유효성 검증을 위한 의존 라이브러리 추가
>DTO 클래스에 유효성 검증을 적용하기 위해서 build.gradle 파일에 라이브러리를 추가해야 합니다.

~~~ java
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-validation'
	}
~~~