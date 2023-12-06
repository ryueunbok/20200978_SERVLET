```
┌───────────────────────────────────────────────┐
                                       _       
     __ _  ___   ___  _ __ _ __ ___   (_) ___  
    / _` |/ _ \ / _ \| '__| '_ ` _ \  | |/ _ \ 
   | (_| | (_) | (_) | |  | | | | | |_| | (_) |
    \__, |\___/ \___/|_|  |_| |_| |_(_)_|\___/ 
    |___/                                      
			     🌩 𝘼𝙣𝙮𝙤𝙣𝙚 𝙘𝙖𝙣 𝙙𝙚𝙫𝙚𝙡𝙤𝙥!
└───────────────────────────────────────────────┘
```

# goormIDE
Welcome to goormIDE!

goormIDE is a powerful cloud IDE service to maximize productivity for developers and teams.  
**DEVELOP WITH EXCELLENCE**  

`Happy coding! The goormIDE team`


## 🔧 Tip & Guide

* Command feature
	* You can simply run your script using the shortcut icons on the top right.
	* Check out `PROJECT > Common/Build/Run/Test/Find Command` in the top menu.
	
* Get URL and Port
	* Click `PROJECT > URL/PORT` in top menu bar.
	* You can get default URL/Port and add URL/Port in the top menu.

* Useful shortcut
	
| Shortcuts name     | Command (Mac) | Command (Window) |
| ------------------ | :-----------: | :--------------: |
| Copy in Terminal   | ⌘ + C         | Ctrl + Shift + C |
| Paste in Terminal  | ⌘ + V         | Ctrl + Shift + V |
| Search File        | ⌥ + ⇧ + F     | Alt + Shift + F  |
| Terminal Toggle    | ⌥ + ⇧ + B     | Alt + Shift + B  |
| New Terminal       | ⌥ + ⇧ + T     | Alt + Shift + T  |
| Code Formatting    | ⌥ + ⇧ + P     | Alt + Shift + P  |
| Show All Shortcuts | ⌘ + H         | Ctrl + H         |

## 💬 Support & Documentation

Visit [https://ide.goorm.io](https://ide.goorm.io) to support and learn more about using goormIDE.  
To watch some usage guides, visit [https://help.goorm.io/en/goormide](https://help.goorm.io/en/goormide)







=================================================<2주차>===================================================

================================================부트스트랩==================================================
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>	<%-- JSP 주석 처리 --%>
	<nav class="navbar navbar-expand  navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./index.jsp">Home</a>
			</div>
		</div>
	</nav>
	 <%-- CLASS는 스타일 적용시에 사용 되는 이름, 중첩 가능 --%>


===================================한글깨짐현상 코드 삽입으로 해결=============================================
<%@ page contentType="text/html; charset=utf-8"%>


=============================================날짜 출력 자바코드=============================================
<%
	Date day = new java.util.Date();
	String am_pm;
	int hour = day.getHours();
	int minute = day.getMinutes();
	int second = day.getSeconds();
	if (hour / 12 == 0) {
		am_pm = "AM";
	} else {
		am_pm = "PM";
		hour = hour - 12;
	}
	String CT = hour + ":" + minute + ":" + second + " " + am_pm;
	out.println("현재 접속  시각: " + CT + "\n");
%>

======================================자바 관련 라이브러리 사용(import문)==========================================
<%@ page import="java.util.Date"%>

jsp태그는 2가지로 분류
1. 선언문, 표현문, 스크립트릿 = 액션 태그
2. 페이지 지시문 = 디렉티브 태그



=================================================<3주차>===================================================
페이지 모듈화 하기전 index.text파일에 백업
include 지시문은 디렉티브 태그의 한 종류이다.

index.jsp파일에 추가한다. 그 후 모듈화 하기
<%@ include file="top_menu.jsp" %>
<%@ include file="body_main.jsp" %>	
<%@ include file="footer.jsp" %>

top_menu.jsp
body_main.jsp
footer.jsp

==================================================================================부트스트랩 업데이트=======================================================================================
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


==================================================배너 만들기==============================================
무료 이미지 사이트에서 이미지 다운받아온다
image폴더 생성하고 그 안에 넣어준다 => "Royal Canin banner.jpg" 

index.jsp파일에 코드 추가한다.
<%@ include file="top_banner.jsp" %>

top_banner.jsp파일 생성하고 모듈화하기


===================================================메뉴 만들기==============================================
top_menu.jsp파일을 생성한다.

아래 코그 추가한다. 메뉴는 드롭다운 메뉴이다.
<%@ page contentType="text/html; charset=utf-8"%>
<nav class="navbar navbar-expand  navbar-white bg-white">
	<div class="dropdown">
  		<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    		카테고리
  		</button>
    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
        <a class="dropdown-item" href="#">CPU</a>
        생략….       
     </div>
	</div>


=====================================================로고 만들기================================================
https://textanim.com/ 에서 로고 만들기 
image폴더에 넣어준다 => "Meow area logo.gif"

아래 코그 추가한다.
<div>
        <img src="image\로고 이미지이름.확장자" class="img-fluid" alt="main_image">
    </div>
    
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="./index.jsp">메뉴바 : 홈페이지</a>
            <a class="navbar-brand" href="./index.jsp">로그인</a>
            <a class="navbar-brand" href="./index.jsp">회원가입</a>
            <a class="navbar-brand" href="./index.jsp">고객센터</a>
		</div>
	</div>
</nav>


================================================오버레이 배경 만들기===============================================
image폴더에 넣어준다 => "main2.jpg"
body_main.jsp파일을 수정한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%! String greeting = "냥이 공간에 온것을 환영한다냥";
	String tagline = "하단 페이지 : 확인";%>
	<div class="jumbotron">
		생략…
	</div>

 <div class="card bg-dark text-white">
    <img src="image/main2.jpg" class="main-img" alt="...">
    <div class="main-img-overlay">
    <h5 class="main-title">메인 이미지</h5>
    <p class="main-text">출처 : pixabay</p>
  </div>
  </div>
  
  
  =====================================================본문 하단 리스트 만들기===================================================
  body_main.jsp파일을 수정한다.
  
  <div class="list-group">
      <a href="#" class="list-group-item list-group-item-action active" aria-current="true">로얄캐닌 시리즈</a>
      <a href="#" class="list-group-item list-group-item-action">위스카스 시리즈</a>
      <a href="#" class="list-group-item list-group-item-action">쉬바 시리즈</a>
      <a href="#" class="list-group-item list-group-item-action">동원 시리즈</a>
    </div>


=============================================================하단 상태창 편집====================================================
footer.jsp 파일을 수정한다.

<%@ page contentType="text/html; charset=utf-8"%>	
	<footer class="container">
	<p>&copy; 쇼핑몰 대표 : 이름, 고유번호 : 학번, 연락처 : 이메일 주소<br> 
            
        <%
            생략….
        %>
        </p>
	</footer>
        

=================================================================팝업창 만들기=====================================================
액션태그-forward(페이지 흐름 제어)

popup 폴더를 생성하고 안에 popup1.jsp 파일을 생성한다.

<%@ page contentType="text/html; charset=utf-8"%>
<html>
    <head>
        <body>
            <h4>
            현재 페이지는 팝업 페이지다냥.
            <br><br>
            파일명은 popup1.jsp 
            <br><br> 
            홈페이지 메인 화면 로딩 후 자동으로 열린다냥.
            </h4>
            <jsp:forward page="popup1.jsp" />
        </body>
    </head>
</html>


index.jsp 헤더 <head>태그 사이 자바 스크립트를 추가한다.

<script>
	window.open("popup/popup1.jsp", "popup", "width=365, height = 250, left = 0, top=0")
</script>

=================================================================2중팝업창 만들기=====================================================
popup 폴더 안에 popup2.jsp 파일을 생성한다.

<%@ page contentType="text/html; charset=utf-8"%>
<html>
    <head>
        <body>
       	 	<h4>
            현재 페이지는 포워딩된 후 팝업 페이지다냥.
            <br><br>
            파일명은 popup2.jsp 
            <br><br> 
            홈페이지 메인 화면 로딩 후 자동으로 열린다냥.
            </h4>
        </body>
    </head>
</html>

popup1.jsp를 수정한다.

<%@ page contentType="text/html; charset=utf-8"%>
<html>
    <head>
        <body>
            <h4>
            현재 페이지는 팝업 페이지다냥.
            <br><br>
            파일명은 popup1.jsp 
            <br><br> 
            홈페이지 메인 화면 로딩 후 자동으로 열린다냥.
            </h4>
            <jsp:forward page="popup2.jsp" />
        </body>
    </head>
</html>


===========================================================버퍼 처리==================================================
index.jsp파일에 코드 수정한다.

<html>
<head>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date"%>
<%@ page buffer="1kb" autoFlush="true"%>

생략….
 현재 페이지 버퍼 용량 : <%= out.getBufferSize() %> <br>
 남은 페이지 버퍼 용량 : <%= out.getRemaining() %>
</body>
</html>


============================================================3주차 연습문제================================================
날짜 출력 소스 분리하기

WEB-INF 폴더에 src에 example 폴더 하위에 ShopTime 클래스 생성한다.

ShopTime.java 코드 추가한다.

package example;
import java.util.Date; // 날짜 관련 정보 얻기

public class ShopTime {
    public String timenow() {
       Date day = new java.util.Date();
        String am_pm;
        int hour = day.getHours(); // 시간
        int minute = day.getMinutes(); // 분
        int second = day.getSeconds(); // 초
        if (hour / 12 == 0) {
            am_pm = "AM"; // 오전 판단
        } else {
            am_pm = "PM"; // 오후 판단
            hour = hour - 12;
        }
        String CT = hour + ":" + minute + ":" + second + " " + am_pm; // 출력 문자열 조합
        return CT; // 문자열 리턴
    }
}


footer.jsp파일 수정한다.

<%@ page contentType="text/html; charset=utf-8"%>
	    <footer class="container">
		    <p> <br>&copy; 사이트 대표 : 류은복<br>
                고유번호 : 20200978<br>
                연락처 : dmsqhr0628@sungkyul.ac.kr<br>
    <%
    	  ShopTime time = new ShopTime();
    %>    
    오늘 날짜와 시간 : <%=time.timenow() %>
    </p>
        </footer>


=================================================<5주차>===================================================
WEB-INF 폴더에 src폴더 하위에 dto패키지를 생성한다. 그 안에 Product.java 상품(정의)클래스를 생성한다.
자바 빈즈는 내부 멤버변수 접근을 위해 set, get 메소드를 구현한다.

Product.java폴더 안에 코드 삽입한다.

package dto;
import java.io.Serializable; // 직렬화 클래스 연동

public class Product implements Serializable { // 인터페이스 선언

	private static final long serialVersionUID = -4274700572038677000L;

	private String productId;	//상품 아이디
	private String pname;		//상품명
	private Integer unitPrice; //상품 가격
	private String description; //상품 설명
	private String manufacturer;//제조사
	private String category; 	//분류
	private long unitsInStock; //재고수 
	private String condition; 	//신상품 or 중고품 or 재생품
    
    public Product() {
		super();
	}

	public Product(String productId, String pname, Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}

	public String getProductId() {
		return productId;
	}

	public String getPname() {
		return pname;
	}
    +===========> 상품에 필요한 가격, 상세내용, 재고 수 등 필요한 정보 추가한다.


=============================================================상품 저장==================================================================
WEB-INF 폴더에 src폴더 하위에 dao패키지를 생성한다. 그 안에 ProductRepository.java 상품(저장)클래스를 생성한다.
상품 클래스 구성과 일치하는 상품 정보를 입력한다.

package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
    private static ProductRepository instance = new ProductRepository();

    public static ProductRepository getInstance(){
	            return instance;
   }

	public ProductRepository() {
		Product RoyalCanin = new Product("P1234", "로얄캐닌 그레이비 키튼 파우치", 18900);
		RoyalCanin.setDescription("85g, 12개, 습식사료");
		RoyalCanin.setCategory("Food");
		RoyalCanin.setManufacturer("Royal Canin");
		RoyalCanin.setUnitsInStock(1000);
		RoyalCanin.setCondition("New");
        RoyalCanin.setFilename("P1234.jpg");
        
    +=========================>상품 추가한다.
    

===============================================================상품 출력=========================================================
패키지 연동과 자바 빈 클래스 설정한다.

body_main.jsp 를 수정하여 상품목록을 출력한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<%! String greeting = "냥이 공간에 온것을 환영한다냥";%>
        String tagline = "하단 페이지 : 확인";%>
        
    <div class="container">
	<div class="jumbotron">
		<div class="container">
			<h3 class="display-4">
				<%=greeting%>
            </h3>
		</div>
	</div>
<%
	ArrayList<Product> listOfProducts = productDAO.getAllProducts(); // 리스트에 상품 전체 정보를 얻어온다.
%> 
	<div class="container">
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>원
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>
    

자바빈즈 액션태그 서로 동일하다.
<jsp:useBean id=＂productDAO＂ class=＂dao.ProductRepository＂ scope=＂session＂ />
<%  ProductRepository  test=new  ProductRepository();%>


=====================================================5주차 연습문제================================================
Product.java 상품(정의)파일과 ProductRepository.java 상품(저장)파일에 상품 9개 추가

image폴더 product폴더 안에 추가한 상품 p1231~p1239까지 이미지 저장


=================================================<6주차>=====================================================

==================================================상품 세부 정보 출력하기===============================================
ProductRepository.java파일을 수정한다.

링크 클릭을 통해 요청된 상품 id를 리턴하는 새로운 메소드를 추가

public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
}


body_main.jsp파일에 아래 코드 추가한다.(마우스로 링크를 클릭하면 새로운 페이지가 뜨는 기능 구현)
<p><a href="product_detail.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상품 상세 정보 &raquo;</a>



product_detail.jsp파일을 생성한 후 아래 코드 추가한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="java.util.Date"%>
<%@ page import="example.*" %>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>상품 상세 정보</title>
</head>

<body>
    	<%@ include file="top_banner.jsp" %>
	<%@ include file="top_menu.jsp" %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 상세 정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		Product product = productDAO.getProductById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><b>상품 코드 : </b><span class="badge badge-danger"> <%=product.getProductId()%></span>
				<p><b>제조사</b> : <%=product.getManufacturer()%>
				<p><b>분류</b> : <%=product.getCategory()%>
				<p><b>재고 수</b> : <%=product.getUnitsInStock()%>
				<h4><%=product.getUnitPrice()%>원</h4>
                
    <div class="card bg-dark text-white">
                    <img src="image/product/<%=product.getProductId()%>.jpg" class="card-img" alt="...">
                    <div class="card-img-overlay">
                    <h5 class="card-title">상품 이미지 원본</h5>
                    <p class="card-text">출처 : 구글 검색</p>
                    </div>
                </div>
	<p><a href="#" class="btn btn-info"> 상품 주문 &raquo;</a> <a href="index.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
		</div>
		</div>
		<hr>
	</div>
    <%@ include file="footer.jsp" %>
</body>
</html>


=================================================에러페이지 지정하기==================================================
product_detail.jsp파일에 아래코를 추가한다.
<%@ page errorPage = "exception/product_not_found.jsp" %>


exception폴더를 생성하고 product_not_found.jsp파일을 만든다.
product_detail.jsp 코드를 가져와 수정한다.

생략….
<title>상품 상세 정보</title>
</head>
<body>
    <%@ include file="../top_banner.jsp" %>
	<%@ include file="../top_menu.jsp" %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 정보 에러!! 홈페이지 관리자에게 문의해 주세요.</h1>
		</div>
	</div>
    <%@ include file="../footer.jsp" %>
</body>
</html>


================================================6주차 연습문제========================================================
전체 상품 상세페이지, 메인 페이지도 예외처리하기
exception폴더 하위에 main_server_downtime.jsp파일을 만든다.

web.xml 파일에 404 에러 코드 처리, <error-page> 태그 활용해서 작성한다.

<?xml version="1.0" encoding="UTF-8"?>
<web-app>
  <error-page>
  	<error-code>404</error-code>
  	<location>/exception/product_not_found.jsp</location>
  </error-page>
  <error-page>
  	<error-code>500</error-code>
  	<location>/exception/main_server_downtime.jsp</location>
  </error-page>
  
  
  index.jsp파일에 추가한다.
  <%@ page errorPage = "exception/main_server_downtime.jsp" %>
  
  
=================================================<7주차>=====================================================
  
==================================================상품 등록 페이지 만들기===================================================
Admin폴더를 생성하고 기존의 모든jsp파일을 복사한 후 _ad를 붙인다.
  
기존메인 화면 네비바를 수정한다.
top_menu.jsp파일에 네비 링크에 관리자 모드 링크를 추가한다. 
<a class="navbar-brand" href="admin/index_ad.jsp">관리자모드</a>


admin/top_menu_ad.jsp파일에 메뉴를 수정한다.

<a class="navbar-brand" href="./index.jsp">회원 보기/추가/수정/삭제</a>
<a class="navbar-brand" href="index_ad.jsp">상품 보기</a>
<a class="navbar-brand" href="product_add.jsp">등록</a>
<a class="navbar-brand" href="index_ad.jsp">수정/삭제</a>
<a class="navbar-brand" href="../index.jsp">일반모드</a>


=========================================================상품 등록===========================================================
admin폴더안에 product_add.jsp파일을 생성한 후 코드 작성한다.(관리자 전용이기 때문에)

<%@ page contentType="text/html;charset=utf-8"%>
<html>
<head>
 부트스트랩 링크 
<title>상품 등록</title>
</head>
<body>
	<jsp:include page="top_menu_ad.jsp" />	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 등록</h1>
		</div>
	</div>
	<div class="container">
		<form name="newProduct" action="./product_add_process.jsp" class="form-horizontal" method="post">
			<div class="form-group row">
				<label class="col-sm-2">상품 코드</label>
				<div class="col-sm-3">
					<input type="text" name="productId" class="form-control" >
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상품명</label>
				<div class="col-sm-3">
					<input type="text" name="name" class="form-control" >
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">가격</label>
				<div class="col-sm-3">
					<input type="text" name="unitPrice" class="form-control" >
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상세 정보</label>
				<div class="col-sm-5">
					<textarea name="description" cols="50" rows="2"
						class="form-control"></textarea>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">제조사</label>
				<div class="col-sm-3">
					<input type="text" name="manufacturer" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">분류</label>
				<div class="col-sm-3">
					<input type="text" name="category" class="form-control" >
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">재고 수</label>
				<div class="col-sm-3">
					<input type="text" name="unitsInStock" class="form-control" >
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상태</label>
				<div class="col-sm-5">
					<input type="radio" name="condition" value="New " > 신규 제품 
					<input type="radio" name="condition" value="Old" > 중고 제품 
					<input type="radio" name="condition" value="Refurbished" > 재생 제품
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10 ">
					<input type="submit" class="btn btn-primary" value="등록" >
				</div>
			</div>
		</form>
	</div>
</body>
</html>

==========================================================================================================================
admin폴더안에 product_add_process.jsp파일을 생성한 후 코드 작성한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%
	request.setCharacterEncoding("UTF-8");

	String productId = request.getParameter("productId");
	String name = request.getParameter("name");
	String unitPrice = request.getParameter("unitPrice");
	String description = request.getParameter("description");
	String manufacturer = request.getParameter("manufacturer");
	String category = request.getParameter("category");
	String unitsInStock = request.getParameter("unitsInStock");
	String condition = request.getParameter("condition");

	Integer price;

	if (unitPrice.isEmpty())
		price = 0;
	else
		price = Integer.valueOf(unitPrice);

	long stock;

	if (unitsInStock.isEmpty())
		stock = 0;
	else
		stock = Long.valueOf(unitsInStock);

	ProductRepository dao = ProductRepository.getInstance();

	Product newProduct = new Product();
	newProduct.setProductId(productId);
	newProduct.setPname(name);
	newProduct.setUnitPrice(price);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitsInStock(stock);
	newProduct.setCondition(condition);

	dao.addProduct(newProduct);

	response.sendRedirect("index_ad.jsp");
%>

==========================================================================================================================
ProductRepository.java파일을 수정한다.(데이터 추가를 위한 객체 변수 인스턴스를 사용)

생략….
   public class ProductRepository {
   private ArrayList<Product> listOfProducts = new ArrayList<Product>();
   private static ProductRepository instance = new ProductRepository();

   public static ProductRepository getInstance(){
	return instance;
   }

생략…..아래 코드는 최하단에

   public void addProduct(Product product) {
	listOfProducts.add(product);
   }
}

==========================================================================================================================
body_main_ad.jsp파일을 수정한다.

<%@ page import="dao.ProductRepository"%>

<%
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
%>

<img src="../image/product/<%=product.getProductId()%>.jpg" class="card-img" alt="...">

><a href="product_detail_ad.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상품 상세 정보 &raquo;</a>

===========================================================================================================================================
product_detail_ad.jsp 를 수정한다. (기존 상품 상세 페이지)
기존 빈즈 제거 후 import 방식으로 변경, 파일 및 경로 수정한다.

<%@ page import="dao.ProductRepository"%>

<%@ include file="top_menu_ad.jsp" %>

ProductRepository dao = ProductRepository.getInstance();
Product product = dao.getProductById(id); 


==========================================================등록 페이지 이미지 업로드==============================================================
Product.java, ProductRepository.java파일을 수정한다.

Product.java

생략….

 private String filename; 	// 파일 이름 변수
 
생략….

public void setFilename(String filename) { // 파일 이름 설정
	this.filename = filename;
}

 public String getFilename() { // 파일 이름 리턴
	return filename;
}

생략….

==============================================================================================================================================
ProductRepository.java

생략….

Product phone = new Product("P1234", "iPhone 6s", 800000);
생략….
phone.setFilename("P1234.png");

Product notebook = new Product("P1235", "LG PC 그램", 1500000);
생략….
notebook.setFilename("P1235.png");

Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
생략….
tablet.setFilename("P1236.png");
생략….

================================================================================================================================================
body_main.jsp파일을 수정한다.

<img src="image/product/<%=product.getFilename()%>" class="card-img" alt="...">


==========================================================파일 업로드를 위한 라이브러리 추가=====================================================================
http://www.java2s.com/Code/Jar/c/Downloadcosjar.htm 다운받은 후 lib폴더안에 드래그 앤 드랍한다.

기본 product_detail.jsp 를 수정한다. 

<img src="image/product/<%=product.getFilename()%>" class="card-img" alt="...">

==================================================================================================================================================
product_add.jsp파일을 수정한다.

<form name="newProduct" action="product_add_process.jsp" class="form-horizontal" method="post" enctype ="multipart/form-data">

<div class ="form-group row">
<label class ="col-sm-2">이미지</label>
    <div class ="col-sm-5">
      <input type="file" name="productImage" class="form-control">
    </div>
    </div>

===================================================================================================================================================
product_add_process.jsp파일을 수정한다.
라이브러리 사용을 위한 import 추가
파일 업로드에 필요한 각 변수 초기화, 서버 업로드 경로 로딩(image/product)

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.Enumeration" %>

<%
	request.setCharacterEncoding("UTF-8");

	String filename = "";
	String realFolder = request.getServletContext().getRealPath("image/product"); //웹 어플리케이션상의 절대 경로
	String encType = "utf-8"; //인코딩 타입
	int maxSize = 5 * 1024 * 1024; //최대 업로드될 파일의 크기5Mb

	DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy();
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, policy);

String productId = multi.getParameter("productid”);
	String name = multi.getParameter(“name”);
	String unitPrice = multi.getParameter(“unitPrice”);
	String description = multi.getParameter(“description”);
	String manufacturer = multi.getParameter(“manufacturer”);
	String category = multi.getParameter(“category”);
	String unitsInStock = multi.getParameter(“unitsInStock”);
	String condition = multi.getParameter(“condition”);

	Integer price;

	if (unitPrice.isEmpty())
		price = 0;
	else
		price = Integer.valueOf(unitPrice);

	long stock;

	if (unitsInStock.isEmpty())
		stock = 0;
	else
		stock = Long.valueOf(unitsInStock);


	Enumeration files = multi.getFileNames();
	String fname = (String) files.nextElement();
	String fileName = multi.getFilesystemName(fname);

	ProductRepository dao = ProductRepository.getInstance();

	Product newProduct = new Product();
	newProduct.setProductId(productId);
	newProduct.setPname(name);
	newProduct.setUnitPrice(price);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitsInStock(stock);
	newProduct.setCondition(condition);
	newProduct.setFilename(fileName);

	dao.addProduct(newProduct);

	response.sendRedirect("index_ad.jsp");
%>


=================================================<9주차>=====================================================
최상위에 js 폴더를 생성하고 안에 validation.js 파일을 생성한 후 코드 작성한다.

function CheckAddProduct() {

	var productId = document.getElementById("productId");
	var name = document.getElementById("name");
	var unitPrice = document.getElementById("unitPrice");
	var unitsInStock = document.getElementById("unitsInStock");
	
	// 상품아이디 체크
	if (!check(/^P[0-9]{4,11}$/, productId,
			"[상품 코드]\nP와 숫자를 조합하여 5~12자까지 입력하세요\n첫 글자는 반드시 P로 시작하세요"))
		return false;
	// 상품명 체크
	if (name.value.length < 4 || name.value.length > 12) {
		alert("[상품명]\n최소 4자에서 최대 50자까지 입력하세요");
		name.select();
		name.focus();
		return false;
	}
	// 상품 가격 체크
	if (unitPrice.value.length == 0 || isNaN(unitPrice.value)) {
		alert("[가격]\n숫자만 입력하세요");
		unitPrice.select();
		unitPrice.focus();
		return false;
	}

	if (unitPrice.value < 0) {
		alert("[가격]\n음수를 입력할 수 없습니다");
		unitPrice.select();
		unitPrice.focus();
		return false;
	} else if (!check(/^\d+(?:[.]?[\d]?[\d])?$/, unitPrice,
			"[가격]\n소수점 둘째 자리까지만 입력하세요"))
		return false;

	// 재고 수 체크
	if (isNaN(unitsInStock.value)) {
		alert("[재고 수]\n숫자만 입력하세요");
		unitsInStock.select();
		unitsInStock.focus();
		return false;
	}

	function check(regExp, e, msg) {

		if (regExp.test(e.value)) {
			return true;
		}
		alert(msg);
		e.select();
		e.focus();
		return false;
	}

	 document.newProduct.submit()
}

==========================================================================================================================
product_add.jsp파일을 수정한다.

<script type ="text/javascript" src ="../js/validation.js"></script>

<input type="text" id ="productId" name="productId" class="form-control" >
<input type="text" id ="name" name="name" class="form-control" >
<input type="text" id ="unitPrice" name="unitPrice" class="form-control" >

===========================================================================================================================
터미널 명령 입력
cd /goormService/tomcat7/conf/
ls -al(목록 확인)
cat tomcat-users.xml(파일 확인)
cp tomcat-users.xml tomcat-user_back.xml(원본 파일 백업)
vi tomcat-users.xml(주석 삭제 및 내용 수정)

<role rolename="tomcat"/>
<role rolename="role1"/>
<role rolename="admin"/>
<user username="tomcat" password="123123" roles="tomcat"/>
<user username="both" password="123123" roles="tomcat,role1"/>
<user username="role1" password="123123" roles="role1"/>
<user username="admin" password="123123" roles="admin"/>

wq 엔터 => 종료

============================================================================================================================
탐캣 서버 재시작

web.xml파일을 확인 후 수정한다.	

<web-app>
	<security-role>
		<description></description >
		<role-name>admin</role-name>
	</security-role>
	<security-constraint>
		<display-name>WebMarket Security_01</display-name>
		<web-resource-collection>
			<web-resource-name>WebMarket</web-resource-name>
			<description></description>
			<url-pattern>/admin/product_add.jsp</url-pattern>
		</web-resource-collection>
		<auth-constraint>
			<description>권한 관리자명</description>
			<role-name>admin</role-name>
		</auth-constraint>
	</security-constraint>

<login-config>
		<auth-method>FORM</auth-method>
		<form-login-config>
			<form-login-page>/login/login.jsp</form-login-page>
			<form-error-page>/login/login_failed.jsp</form-error-page>
		</form-login-config>
	</login-config>
</web-app>


===============================================================로그인 및 보안============================================================================
login폴더 생성 후 login.jsp파일 만들고 코드 추가한다.

<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
부트스트랩 링크
</head>
<body>
		<jsp:include page="../top_menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 등록 페이지 접근 - 로그인이 필요하다냥</h1>
		</div>
	</div>
	<div class="container" align="center">
		<div class="col-md-4 col-md-offset-4">
			<h3 class="form-signin-heading">로그인해달라냥</h3>
			<%
				String error = request.getParameter("error");
				if (error != null) {
					out.println("<div class='alert alert-danger'>");
					out.println("아이디와 비밀번호를 확인해 주세요");
					out.println("</div>");
				}
			%>

<form class="form-signin" action="j_security_check" method="post">
			<div class="form-group">
				<label for="inputUserName" class="sr-only">User Name</label> 
				<input type="text" class="form-control" placeholder="ID" name='j_username' required autofocus>
			</div>
			<div class="form-group">
				<label for="inputPassword" class="sr-only">Password</label> 
				<input  type="password" class="form-control" placeholder="Password" name='j_password' required>
			</div>
			<button class="btn btn btn-lg btn-success btn-block" type="submit">로그인</button>
		</form>
	</div>
</div>
</body>
</html>


========================================================로그인 실패와 로그아웃==========================================================
login_failed.jsp파일과 logout.jsp파일을 생성하고 작성한다.

login_failed.jsp 

<%
	response.sendRedirect("login.jsp?error=1");
%>


logout.jsp
<%@ page contentType="text/html; charset=utf-8"%>

<%
	session.invalidate(); // 현재 세션 객체 전체 삭제
	response.sendRedirect("../admin/product_add.jsp");
%>


admin폴더 안 product_detail.jsp파일에 로그아웃 버튼 추가
<a href="../login/logout.jsp" class="btn btn-sm btn-success pull-right">로그아웃</a>


===================================================================9주차 연습문제==================================================================================
해결 못함


=================================================<10주차>(코딩 완료했으나 구현 안됨)=====================================================
Product.java파일을 수정한다.

private int quantity;	//장바구니에 담은 개수

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

=========================================================================================================================
product_detail.jsp파일(상품 상세 페이지)을 수정한다.

<head>
부트스트랩 링크
<script type="text/javascript">
	function addToCart() {
		if (confirm("상품을 장바구니에 추가하겠냥?")) {
			document.addForm.submit();
		} else {		
			document.addForm.reset();
		}
	}
</script>

<title>상품 상세 정보다냥</title>

    <p><form name=“addForm” action=“../cart/product_cart_add.jsp?id=<%=product.getProductId()%>" method="post">
	        <a href="#" class="btn btn-info" onclick="addToCart()"> 상품 주문 &raquo;</a> 
	        <a href="./product_cart.jsp" class="btn btn-warning"> 장바구니 &raquo;</a>
	</form>

========================================================================================================================================
cart 폴더를 생성하고 product_cart_add.jsp파일을 생성한 후 코드 추가한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%
	String id = request.getParameter("id");
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("../index.jsp");
		return;
	}

	ProductRepository dao = ProductRepository.getInstance();

	Product product = dao.getProductById(id);
	if (product == null) {
		response.sendRedirect("../exception/product_not_found.jsp");
	}

	ArrayList<Product> goodsList = dao.getAllProducts();
	Product goods = new Product();
	for (int i = 0; i < goodsList.size(); i++) {
		goods = goodsList.get(i);
		if (goods.getProductId().equals(id)) { 			
			break;
		}
	}
    
    ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cartlist");
	if (list == null) { 
		list = new ArrayList<Product>();
		session.setAttribute("cartlist", list); // 세션 키, 값 설정
	}

	int cnt = 0;
	Product goodsQnt = new Product();
	for (int i = 0; i < list.size(); i++) {
		goodsQnt = list.get(i);
		if (goodsQnt.getProductId().equals(id)) {
			cnt++;
			int orderQuantity = goodsQnt.getQuantity() + 1;
			goodsQnt.setQuantity(orderQuantity);
		}
	}

	if (cnt == 0) { 
		goods.setQuantity(1);
		list.add(goods);
	}

	response.sendRedirect("product_cart.jsp?id=" + id); // 장바구니 화면 페이지로 이동
%>

=================================================================================================================================
cart폴더안에 product_cart.jsp파일(장바구니 화면 페이지)을 생성한 후 코드 추가한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="java.util.Date"%>
<%@ page import="dao.ProductRepository"%>
<html>
<head>

부트스트랩 링크
<%
	String cartId = session.getId(); // 세션 정보 얻기
%>
<title>장바구니</title>
</head>
<body>
	<jsp:include page="../top_menu.jsp" /> // 현재 탑 메뉴 이미지 출력 에러 : 일단 패스
	<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">장바구니</h1>
	</div>
	</div>
	<div class="container">
	<div class="row">
		<table width="100%">
			<tr>
				<td align="left"><a href="product_cart_remove_all.jsp?cartId=<%=cartId%>" class="btn btn-danger">삭제하기</a></td>
				<td align="right"><a href="#" class="btn btn-success">주문하기</a></td>
			</tr>
		</table>
        
        </div>
	<div style="padding-top: 50px">
		<table class="table table-hover">
			<tr>
				<th>상품</th>
				<th>가격</th>
				<th>수량</th>
				<th>소계</th>
				<th>비고</th>
			</tr>
			<%				
				int sum = 0;
				ArrayList<Product> cartList = (ArrayList<Product>) session.getAttribute("cartlist");
				if (cartList == null)
					cartList = new ArrayList<Product>();
					for (int i = 0; i < cartList.size(); i++) { // 상품리스트 하나씩 출력하기
					Product product = cartList.get(i);
					int total = product.getUnitPrice() * product.getQuantity();
					sum = sum + total;
			%>
			<tr>
				<td><%=product.getProductId()%> - <%=product.getPname()%></td>
				<td><%=product.getUnitPrice()%></td>
				<td><%=product.getQuantity()%></td>
				<td><%=total%></td>
				<td><a href="product_cart_remove.jsp?id=<%=product.getProductId()%>" class="badge badge-danger">삭제</a></td>
			</tr>
			<%
				}
			%>
			<tr>
				<th></th>
				<th></th>
				<th>총액</th>
				<th><%=sum%></th>
				<th></th>
			</tr>
		</table>
		<a href="../index.jsp" class="btn btn-secondary"> &laquo; 쇼핑 계속하기</a>
	</div>
	<hr>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>

=================================================================================================================================================
cart폴더안에 product_cart_remove.jsp파일(장바구니 삭제 페이지)을 생성한 후 코드 추가한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%
	String id = request.getParameter("id");
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("../product_detail.jsp");
		return;
	}

	ProductRepository dao = ProductRepository.getInstance();
	
	Product product = dao.getProductById(id);
	if (product == null) {
		response.sendRedirect("../exception/product_not_found.jsp");
	}

	ArrayList<Product> cartList = (ArrayList<Product>) session.getAttribute("cartlist");
	Product goodsQnt = new Product();
	for (int i = 0; i < cartList.size(); i++) { // 상품리스트 하나씩 출력하기
		goodsQnt = cartList.get(i);
		if (goodsQnt.getProductId().equals(id)) {
			cartList.remove(goodsQnt);
		}
	}

	response.sendRedirect("product_cart.jsp");
%>

================================================================================================================================
cart폴더안에 product_cart_remove_all.jsp파일(장바구니 삭제 페이지 - 전체)을 생성한 후 코드 추가한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%
	String id = request.getParameter("cartId");
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("product_cart.jsp");
		return;
	}

	session.invalidate(); // 세션 초기화
	
	response.sendRedirect("product_cart.jsp");
%>


===================================================================10주차 연습문제==================================================================================
footer.jsp에 직접 클래스 연동 추가한다.

<%@ page import="java.util.Date"%>

cart 용 image 폴더와 파일을 새로 생성, 또는 경로를 직접 수정한다.
cart폴더에 imafe파일 복사한다.

=================================================<11주차>(코딩 완료했으나 구현 안됨)=====================================================

============================================================주문 처리 페이지=====================================================
(기존 장바구니 페이지)product_cart.jsp파일을 수정한다.

<td align="right"><a href="../order/order_info.jsp?cartId=<%= cartId %>" class="btn btn-success">주문하기</a></td>

==============================================================================================================================
order폴더를 만들고 order_info.jsp파일을 생성한 후 코드 입력한다.

<%@ page contentType="text/html; charset=utf-8"%>

<html>
<head>
부트스트랩 링크
<title>배송 정보</title>
</head>
<body>
	<jsp:include page="../top_menu.jsp" />
	<div class="jumbotron">
	   <div class="container">
		<h1 class="display-3">배송 정보</h1>
	   </div>
	</div>
	<div class="container">
	   <form action="order_info_process.jsp" class="form-horizontal" method="post">
	     <input type="hidden" name="cartId" value="<%=request.getParameter("cartId")%>" />
	     <div class="form-group row">
	       <label class="col-sm-2">성명</label>
	          <div class="col-sm-3">
	      	<input name="name" type="text" class="form-control" />
	          </div>
	    </div>

<div class="form-group row">
	<label class="col-sm-2">배송일</label>
	<div class="col-sm-3">
		<input name="shippingDate" type="text" class="form-control" />(yyyy/mm/dd)
	</div>
	  </div>
	 <div class="form-group row">
	   <label class="col-sm-2">국가명</label>
	     <div class="col-sm-3">
		<input name="country" type="text" class="form-control" />
	    </div>
	 </div>
	<div class="form-group row">
	   <label class="col-sm-2">우편번호</label>
	     <div class="col-sm-3">
	 	<input name="zipCode" type="text" class="form-control" />
	    </div>
	</div>

    <div class="form-group row">
	   <label class="col-sm-2">주소</label>
	     <div class="col-sm-5">
		<input name="addressName" type="text" class="form-control" />
	     </div>
	</div>
	<div class="form-group row">
	   <div class="col-sm-offset-2 col-sm-10 ">
	     <a href="../cart/product_cart.jsp?cartId=<%=request.getParameter("cartId")%>" class="btn btn-secondary" role="button"> 이전 </a> 
		<input type="submit" class="btn btn-primary" value="등록" />
		<a href=“order_cancelled.jsp" class="btn btn-secondary" role="button"> 취소 </a>
	   </div>
	</div>
  </form>
  </div>
</body>
</html>

=======================================================================================================================================================
order폴더안에 order_info_process.jsp파일을 생성한 후 코드 입력한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.net.URLEncoder"%>
<%
	request.setCharacterEncoding("UTF-8"); // 표준 인코딩 설정 : 한글 깨짐 방지

	Cookie cartId = new Cookie("Shipping_cartId", URLEncoder.encode(request.getParameter("cartId"), "utf-8")); // 표준 코드 형태로 변환
	Cookie name = new Cookie("Shipping_name", URLEncoder.encode(request.getParameter("name"), "utf-8"));
	Cookie shippingDate = new Cookie("Shipping_shippingDate", URLEncoder.encode(request.getParameter("shippingDate"), "utf-8"));
	Cookie country = new Cookie("Shipping_country",	URLEncoder.encode(request.getParameter("country"), "utf-8"));
	Cookie zipCode = new Cookie("Shipping_zipCode",	URLEncoder.encode(request.getParameter("zipCode"), "utf-8"));
	Cookie addressName = new Cookie("Shipping_addressName", URLEncoder.encode(request.getParameter("addressName"), "utf-8"));

	cartId.setMaxAge(24 * 60 * 60); // 초 단위
	name.setMaxAge(24 * 60 * 60);
	zipCode.setMaxAge( 24 * 60 * 60);
	country.setMaxAge(24 * 60 * 60);
	addressName.setMaxAge(24 * 60 * 60);

	response.addCookie(cartId); // 생성된 쿠키 추가
	response.addCookie(name);
	response.addCookie(shippingDate);
	response.addCookie(country);
	response.addCookie(zipCode);
	response.addCookie(addressName);

	response.sendRedirect("order_confirm.jsp");
%>

======================================================================================================================================================
order폴더안에 order_confirm.jsp 파일을 생성한 후 코드 입력한다.
추가된 쿠키 정보를 배열로부터 읽음(디코딩)

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.net.URLDecoder"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%
	request.setCharacterEncoding("UTF-8");
	String cartId = session.getId(); // 세션 id 얻기

	String shipping_cartId = "";
	String shipping_name = "";
	String shipping_shippingDate = "";
	String shipping_country = "";
	String shipping_zipCode = "";
	String shipping_addressName = "";
	
	Cookie[] cookies = request.getCookies(); // 쿠키 배열로부터 정보 얻기

	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) { // 길이만큼 쿠키 읽기
			Cookie thisCookie = cookies[i];
			String n = thisCookie.getName();
			if (n.equals("Shipping_cartId"))
				shipping_cartId = URLDecoder.decode((thisCookie.getValue()), "utf-8"); // 원본 형태 문자열로 반환
			if (n.equals("Shipping_name"))
				shipping_name = URLDecoder.decode((thisCookie.getValue()), "utf-8");
			if (n.equals("Shipping_shippingDate"))
				shipping_shippingDate = URLDecoder.decode((thisCookie.getValue()), "utf-8");
			if (n.equals("Shipping_country"))
				shipping_country = URLDecoder.decode((thisCookie.getValue()), "utf-8");
			if (n.equals("Shipping_zipCode"))
				shipping_zipCode = URLDecoder.decode((thisCookie.getValue()), "utf-8");
			if (n.equals("Shipping_addressName"))
				shipping_addressName = URLDecoder.decode((thisCookie.getValue()), "utf-8");
		}
	}
%>

<html>
<head>
부트스트랩 링크
<title>주문 정보</title>
</head>
<body>
	<jsp:include page="../top_menu.jsp" />
	<div class="jumbotron">
	   <div class="container">
		<h1 class="display-3">주문 정보</h1>
	   </div>
	</div>

	<div class="container col-8 alert alert-info">
	   <div class="text-center ">
		<h1>영수증</h1>
	   </div>
	<div class="row justify-content-between">
		<div class="col-4" align="left">
			<strong>배송 주소</strong> <br> 성명 : <% out.println(shipping_name); %>	<br> 
			우편번호 : <% out.println(shipping_zipCode);%><br> 
			주소 : <% out.println(shipping_addressName);%>(<% out.println(shipping_country);%>) <br>
		</div>
		<div class="col-4" align="right">
			<p>	<em>배송일: <% out.println(shipping_shippingDate);%></em>
		</div>
	</div>

	<div>
		<table class="table table-hover">			
		<tr>
			<th class="text-center">도서</th>
			<th class="text-center">#</th>
			<th class="text-center">가격</th>
			<th class="text-center">소계</th>
		</tr>
		<%
			int sum = 0;
			ArrayList<Product> cartList = (ArrayList<Product>) session.getAttribute("cartlist");
			if (cartList == null)
				cartList = new ArrayList<Product>();
			for (int i = 0; i < cartList.size(); i++) { // 상품리스트 하나씩 출력하기
				Product product = cartList.get(i);
				int total = product.getUnitPrice() * product.getQuantity();
				sum = sum + total;
		%>

    <tr>
			<td class="text-center"><em><%=product.getPname()%> </em></td>
			<td class="text-center"><%=product.getQuantity()%></td>
			<td class="text-center"><%=product.getUnitPrice()%>원</td>
			<td class="text-center"><%=total%>원</td>
		</tr>
		<%
			}
		%>
		<tr>
			<td> </td>
			<td> </td>
			<td class="text-right">	<strong>총액: </strong></td>
			<td class="text-center text-danger"><strong><%=sum%> </strong></td>
		</tr>
		</table>
		
			<a href="order_info.jsp?cartId=<%=shipping_cartId%>"class="btn btn-secondary" role="button"> 이전 </a>
			<a href="order_end.jsp"  class="btn btn-success" role="button"> 주문 완료 </a>
			<a href="order_cancelled.jsp" class="btn btn-secondary“ role="button"> 취소 </a>			
	   </div>
	</div>	
</body>
</html>

===================================================================================================================================
order폴더안에 order_end.jsp 파일을 생성한 후 코드 입력한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.net.URLDecoder"%>
<html>
<head>
부트스트랩 링크
<title>주문 완료</title>
</head>
<body>
	<%
		String shipping_cartId = "";
		String shipping_name = "";
		String shipping_shippingDate = "";
		String shipping_country = "";
		String shipping_zipCode = "";
		String shipping_addressName = "";		

		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie thisCookie = cookies[i];
				String n = thisCookie.getName();
				if (n.equals("Shipping_cartId"))
					shipping_cartId = URLDecoder.decode((thisCookie.getValue()), "utf-8");
				if (n.equals("Shipping_shippingDate"))
					shipping_shippingDate = URLDecoder.decode((thisCookie.getValue()), "utf-8");
			}
		}
	%>

    <jsp:include page="../top_menu.jsp" />
	<div class="jumbotron">
	   <div class="container">
		<h1 class="display-3">주문 완료</h1>
	   </div>
	</div>
	<div class="container">
	   <h2 class="alert alert-danger">주문해주셔서 감사합니다.</h2>
	   <p>주문은 <% out.println(shipping_shippingDate); %>에 배송될 예정입니다! !	
	   <p> 주문번호 : <% out.println(shipping_cartId); %>		
	</div>
	<div class="container">
	   <p><a href="../index.jsp" class="btn btn-secondary"> &laquo; 상품 목록</a>		
	</div>
</body>
</html>

<%
	session.invalidate();

	for (int i = 0; i < cookies.length; i++) {
		Cookie thisCookie = cookies[i];
		String n = thisCookie.getName();
		if (n.equals("Shipping_cartId"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_name"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_shippingDate"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_country"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_zipCode"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_addressName"))
			thisCookie.setMaxAge(0);
		
		response.addCookie(thisCookie);
	}
%>

=============================================================================================================================
order폴더안에 order_cancelled.jsp파일을 생성한 후 코드 입력한다.

<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>주문 취소다냥</title>
</head>
<body>
	<jsp:include page="../top_menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">주문 취소</h1>
		</div>
	</div>
	<div class="container">
		<h2 class="alert alert-danger">주문이 취소되었다냥</h2>
	</div>
	<div class="container">
		<p><a href="../index.jsp" class="btn btn-secondary"> &laquo; 상품 목록</a>		
	</div>	
</body>
</html>


===================================================================11주차 연습문제==================================================================================
해결 못함


=================================================<12주차>=====================================================
새 컨테이너 만들고 MYSQL체크 꼭 하기

터미널에서
sudo apt-get update => 최고 권한 주기
sudo apt-cache search mysql-server
apt-get install libmysql-java => 설치
cd /usr/share/java/ => 결로 이동
ls -al => 파일 목록 확인
cp mysql-connector-java-5.1.28.jar /goormService/tomcat7/lib/
cd /goormService/tomcat7/lib/

탐캣 재시작
============================================================================================================================
보안 기본 설정

Mysql 서비스 시작하기 => (구름 ide 접속 때 마다)
service mysql start

현재 서버의 mysql 버전 확인
mysql --version (버전 확인)

mysql 실행 파일 경로 이동
cd /usr/bin/
ls mysql_secure_installation

보안 설정 실행
mysql_secure_installation

패스워드(동일하게 2번 입력)
123123 (화면에 보이지 않음)

설정 완료 후 db 접속 테스트
mysql –uroot –p
패스워드 : 123123
============================================================================================================================
테이블 생성 및 데이터 삽입

show databases;
create database ggouppang_학번;
use ggouppang_학번

CREATE TABLE IF NOT EXISTS product(
    p_id VARCHAR(10) NOT NULL,
    p_name VARCHAR(20),
    p_unitPrice  INTEGER,
    p_description TEXT,
    p_category VARCHAR(20),
    p_manufacturer VARCHAR(20),
    p_unitsInStock LONG,
    p_condition VARCHAR(20),
    p_fileName  VARCHAR(20),
    PRIMARY KEY (p_id)
)default CHARSET=utf8;
desc product;

desc product; => 테이블 확인

drop table product; => 테이블 삭제

show tables; => DB속 테이블 전부 조회

Select * from product; =>테이블 조회
============================================================================================================================
conn_test.jsp파일을 생성한 후 코드를 작성한다.

<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import = "java.sql.*" %> 
<html> 
<head>
    <title>mysql 데이터베이스 접속 테스트</title>
</head>
<body>
<%
	Statement stm = null;
	ResultSet rs = null;
    Boolean conn_state = false;

	Class.forName("com.mysql.jdbc.Driver");
	String myUrl = "jdbc:mysql://localhost/데이터베이스 이름";
	Connection conn = DriverManager.getConnection(myUrl, "root", “패스워드");
	try {
        	stm = conn.createStatement();
            conn_state = true;
        	if(stm.execute("select * from product")) {
                	rs = stm.getResultSet();
        }

     while(rs.next()) {
                out.println(rs.getString("p_id"));
                out.println(rs.getString("p_name"));
                out.println(rs.getString("p_unitPrice"));
                out.println(rs.getString("p_description"));
                out.println(rs.getString("p_manufacturer"));
                out.write("<br><br>");
        }
        rs.close();
        stm.close();
}
catch(Exception e) {
        out.println("rs.next() ERROR");
}
conn.close();
%> 

<%
	if(conn_state == true){
%>
	데이터베이스에 연결되었습니다.
<%
    }else{
%>
	연결에 실패하였습니다.
<% 
    } 
%>
</body>
</html>


https://jsp-test-내그룸ide주소/conn_test.jsp => 내 사이트에서 확인학

db서버가 아예 시작이 안된다면
service mysql start
service mysql restart (재시작)


================================================================================================================================================
상품관리 페이지 해결 못함

===================================================================12주차 연습문제==================================================================================
해결 못함


=================================================<13주차>=====================================================
해결 못함

===================================================================13주차 연습문제==================================================================================
해결 못함

=================================================<14주차>=====================================================
해결 못함

===================================================================14주차 연습문제==================================================================================
해결 못함