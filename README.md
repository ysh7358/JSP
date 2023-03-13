# JSP

쿠키 동작 방식
	1) 쿠키 생성 : 웹 서버에서 쿠키를 생성하고 쿠키에 응답 데이터를 담아서 웹 브라우저에 전송한다.
	2) 쿠키 저장 : 웹 브라우저는 응답 데이터를 담고 있는 쿠키를 메모리나 파일로 저장한다.
	3) 쿠키 전송 : 웹 브라우저는 쿠키 요청이 있을 때마다 웹 서버에 전송한다, 웹 서버는 쿠키를 사용해서
		     필요한 작업을 수행할 수 있다.

1) 쿠키 생성 후 response 객체 담아준다.
	Cookie cookie = new Cookie("쿠키이름", "쿠키값");
	response.addCookie(cookie); //헤더에 저장

2) 쿠키 유무를 확인하고 쿠키의 값을 얻어온다.
	if(request.getHeader("Cookie") != null){
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie: cookies){
			cookie.getName();
			cookie.getValue();
		}
	}
  
  JSP(Java Server Page)
	HTML을 중심으로 자바와 같이 연동하여 사용하는 웹 언어이다.
	HTML코드 안에 JAVA코드를 작성할 수 있는 언어이다.

서버
	사용자의 요청에 맞는 서비스를 제공해주는 것

	- 요청(request)	: 클라이언트 ---> 서버
	- 응답(response)	: 서버 ---> 클라이언트

웹(Web)
	페이지 요청과 응답이 일어나는 장소.
	인터넷에 연결된 컴퓨터들을 통해 사람들이 정보를 공유할 수 있는 정보공간.

웹 서버(http) - 아파치
	사용자의 요청이 정적 데이터인지 동적 데이터인지 판단한다.
	정적 데이터일 경우 이미 준비된 HTML문서를 그대로 응답해주며,
	동적 데이터라면 웹 컨테이너에 요청을 보낸다.

웹 컨테이너(서블릿 컨테이너)
	동적 데이터일 경우 JSP, 서블릿으로 연산 및 제어 그리고 DB까지 접근한다.
	DB에 접근하는 연산을 복잡한 연산이라고 하며, JAVA로 처리한다.
	동적 데이터가 정제된 데이터(정적 데이터)로 완성되면 이를 웹 서버로 응답해준다.

WAS(Web Application Server) - 톰캣
	동적 데이터를 처리할 서블릿을 메모리에 할당하며, web.xml을 참조한 뒤 알맞는 서블릿에 대한
	Thread를 생성한다. 서블릿 요청과 서블릿 응답 객체 생성 후 서블릿에 전달하면,
	연산 종료 후 메모리에서 해제시킨다.

서블릿(Servlet)
	Java 코드 안에 HTML 코드를 작성할 수 있는 Java 프로그램이다.
	Thread에 의해 서블릿에 있는 service() 메소드가 호출된다.
	전송 방식 요청에 맞게 doGet() 또는 doPost() 등의 메소드를 호출한다.
==============================================================
[계산기 만들기 실습]
1. calc.jsp, Oper.java(서블릿), Calc.java(클래스) 생성
2. calc.jsp에서 input태그로 수식 통채로를 입력받고 action은 Oper서블릿으로 설정해준다.
3. Calc.java 클래스에서 사칙연산 메소드를 정의하고 모두 두 정수를 전달받은 후 int로 리턴해준다.
4. 나눗셈 메소드에서는 분모가 0일 경우를 처리하지 않고 Oper.java 서블릿에서 나눗셈 메소드 사용 시 예외를 처리한다.
5. Oper.java 서블릿에서 전달받은 수식을 분석한 후 사칙연산 연산자에 맞게 Calc.java의 메소드를 호출하여 결과를 응답한다.
	※ request.getParameter("태그의 name 속성 값")으로 전달받은 값을 가져올 수 있다.
	※ 연산자를 split()으로 분리할 때에는 split("\\" + 연산자)로 사용해야 분리된다.
	※ 잘못 입력했을 때와 0으로 나눌 때 모두 예외처리를 사용하여 알맞는 메세지를 출력해준다.
6. Oper.java 서블릿에서 calc.jsp로 돌아갈 때에는 calc.jsp가 아닌 calc로 이동할 수 있도록 web.xml에서 servlet을 설정한다.

GET 방식과 POST 방식

- GET
	주소에 데이터를 추가하여 전달하는 방식.
	보통 쿼리 문자열(query string)에 포함되어 전송되므로, 길이에 제한이 있으며
	주소에 데이터가 보이므로 보안상 취약점이 존재한다.
	중요한 데이터 혹은 길이가 긴 데이터는 POST 방식을 사용하여 요청하는 것이 좋지만
	GET 방식이 POST 방식보다 상대적으로 빠른 전송방식이다.

-POST
	데이터를 별도로 첨부(Header에 첨부)하여 전달하는 방식. (인코딩 방식 맞춰줘야함)
	브라우저 히스토리에도 남지 않고 데이터는 쿼리 문자열과는 별도로 전송된다.
	따라서 데이터의 길이에 제한도 없으며, GET 방식보다 보안성이 높다.
	하지만 GET 방식 보다 상대적으로 느리다.

DBCP(DataBase Connection Pool)
	사용자 요청이 있을 때 마다 DB연결을 한다면 코드가 복잡해지며,
	많은 요청이 있을 때 연결 속도가 저하될 수 있다.
	따라서 미리 Connection을 만들어 두고, 필요 시 저장된 공간에서
	가져다 쓴 후 반환하는 기법이다.

JNDI(Java Naming and Directory Interface)
	디렉터리 서비스에서 제공하는 데이터 및 객체를 발견하고 참고하기 위한 자바 API이며,
	외부에 있는 객체를 가져오기 위한 기술이다.

MyBatis Framework
	소스코드 안에 SQL문을 작성하면 코드가 길어지고 섞여 있어서 유지보수 및 분업이 쉽지 않다.
	MyBatis는 기존 JDBC 방식과는 달리 SQL문을 XML파일에 작성함으로써 코드가 줄어들고,
	SQL문 수정이 편해진다. 또한 DBCP를 사용하여 커넥션을 여러 개 생성하기 떄문에 JDBC만
	사용하는 것보다는 작업효율과 가독성이 좋아진다.

EL문과 JSTL : 페이지 가독성 상승
	자바 구문을 라이브러리 형태로 만들어 놓고 필요할 때 마다 태그로 꺼내쓰는 기술이다.
	JSP 페이지 내에서 자바코드와 HTML코드가 섞여 있으면 가독성이 떨어지고 복잡해진다.
	EL문과 JSTL문을 사용하면 HTML 태그로만 구성된 일관된 소스코드를 볼 수 있다는 장점이 있다.

- EL(Expression Language)
	값을 간결하고 간편하게 출력할 수 있도록 해주는 기술

	자바				EL
	<%=name%>			${name}
	<%=member.getName()%>		${member.getName()}

	값을 찾을 때에는 작은 Scope에서 큰 Scope로 찾는다.
	page > request > session > application

	원하는 Scope의 변수를 찾을 때 아래와 같이 사용한다.
	${param.name} : 전달받은 데이터 중 쿼리스트링으로 작성된 데이터에서 name을 찾는다.
	${requestScope.name} : request 객체에 담긴 데이터 중 name을 찾는다.
	${sessionScope.name} : session 객체에 담긴 데이터 중 name을 찾는다.

EL 연산자
	%, mod
	&&, and
	||, or
	>, lt
	<, gt
	>=, le
	<=, ge
	==, eq
	!=, ne
	empty : 값이 비어있으면 true, 값이 있으면 false
	!, not

JSTL(Jsp Standard Tag Library)
	연산자나 조건문, 반복문 등을 편하게 처리할 수 있으며, JSP 페이지 내에서 자바코드를 사용하지 않고
	로직을 구현할 수 있도록 효율적인 방법을 제공한다.

	자바				JSTL
	<%for(자료형 변수명: 반복자) {}%>	<c:forEach var="" items="${반복자}"></c:forEach>
	<%for(초기식;조건식;증감식){}%>	<c:forEach var="" begin="" end=""></c:forEach>

core 태그의 종류 <c:></c:>
	<c:set> : 변수 선언
	<c:out> : 변수 출력(사용)
	<c:if> : if문
	<c:choose> : switch문(else if문)
	<c:when> : case문
	<c:otherwise> : default(else 문)
	<c:forEach> : for문
------------------------------------------------------------------------------------------------------------------
[jsp 방식]
	a.jsp --> b.jsp --> c.jsp

	각 페이지마다 필요 시 자바 코드가 작성되며, DB와 연결하는 코드도 jsp파일 안에서
	모두 작성된다. 분리되어 있지 않기 때문에 규모가 작은 프로젝트에 어울리는 방식이며,
	코드가 확장될 수록 가독성이 떨어지고 분업과 유지보수가 좋지 않다.

MVC
 [model1 방식]
	a.jsp --> b.jsp --> c.jsp
		↓
		DAO.java

	b.jsp에서 dao를 호출함으로써 자바코드가 섞이게 된다. 선언은 JAVA 페이지에 구현이 되어 있기 때문에
	jsp 내의 JAVA 코드 양이 줄어들지만 결국 사용은 jsp 페이지에서 하기 때문에
	Controller(DAO 메소드를 사용하고 어디 페이지로 이동할 지)와 View가 섞이게 된다.
	페이지가 확장될 수록 유지보수가 좋지 않다. 하지만 설계는 쉽다.

[model2 방식]
	a.jsp	-->	web.xml	-->	Front-Controller.java	------------>	c.jsp
						↓
					Controller.java
					    ↓
					DAO.java
					 ↓
					DB

	a.jsp에서 다음 페이지를 이동하기 전 필요한 비지니스 로직을 완벽하게 분리하여 관리한다.
	사용자가 정의한 확장자(.me, .bo, ...)를 페이지 이동 주소(URL)에 작성하게 되면
	web.xml에 가서 경로를 찾는다. web.xml에 파일 경로를 하나씩 모두 만들게 되면
	코드가 길어지기 때문에 *.me와 같이 그룹화시킨 확장자로 요청을 하나의 경로로 보내주도록
	설정해 놓는다.
	이 경로를 알맞는 Front-Controller.java 경로로 설정해 놓는다.
	Front-Controller에서는 들어온 요청에서 .me앞의 요청 명으로 어떤 로직을 수행할 지를
	판단하도록 분기처리를 한다.
	비지니스 로직을 Front-Controller에서 작업하게 되면 마찬가지로 코드가 길어지고
	유지보수 및 재사용이 어렵기 때문에 요청별 Controller를 만들어서 req와 resp를 받을
	메소드를 선언하여 구현한다. 따라서 Controller안에 선언된 메소드는 모든 Controller에
	구현해야 하기 때문에 인터페이스를 선언하여 추상메소드 형태로 선언해 놓고
	각 Controller에 지정하여 구현하도록 한다.
	메소드 내부에서의 DB연산 작업들은 모두 DAO로 분리하여 사용한다.
	내부 작업이 모두 완료되면 페이지를 이동할 것인지, 어떤 방식으로 할 것인지, 그리고 어디로
	이동할 것인지를 결정해서 리턴해야 한다. 이에 관련된 필드를 클래스로 만들어 놓은 후
	Controller안에 선언한 메소드의 리턴타입으로 지정하여 Front-Controller에 리턴해준다.
	Front-Controller에서는 해당 Controller 메소드의 리턴 값에 담긴 결과에 맞게 처리한 후
	View로 이동하게 된다.

	- redirect(request객체 초기화)
		클라이언트가 요청했을 때 이전의 값이 남아있지 않도록 하기 위해 사용한다.
		회원가입, 글 작성, 결제 등

	- forward(request객체 유지)
		클라이언트가 request객체를 통해 응답페이지로 값을 전달해야 할 경우 혹은
		단순 조회를 요청할 경우 사용된다.
		목록, 검색 등
![ajax](https://user-images.githubusercontent.com/114047541/224606222-4e7a5e2f-ef7b-4bc4-94fa-c056452ba2ac.png)
![mvc_ajax](https://user-images.githubusercontent.com/114047541/224606239-f5ae8268-4cee-4c0a-ba97-a150d7846c30.png)
![mvc_form](https://user-images.githubusercontent.com/114047541/224606246-6684b80a-fd3a-471d-a8d5-05ab10252bc6.png)
![MyBatisFramework](https://user-images.githubusercontent.com/114047541/224606252-839a1744-2475-4cc0-8b1e-8bb144b394dc.png)
![was](https://user-images.githubusercontent.com/114047541/224606259-8ebf7b43-8c2c-4b68-af0a-ed8856da539a.png)

